package com.revature.caliber.test.unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.caliber.model.SimplePanelFeedback;
import com.revature.caliber.repository.PanelFeedbackRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PanelFeedbackRepositoryTest {

	@Autowired
	private PanelFeedbackRepository panelFeedBackRepository;
	@Autowired
    private TestEntityManager entityManager;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final Logger log = Logger.getLogger(PanelFeedbackRepositoryTest.class);
	private static final String PANEL_FEEDBACK_COUNT = "SELECT count(panel_feedback_id) FROM caliber_panel_feedback";
	private static final String PANEL_FEEDBACK_COUNT_ID = PANEL_FEEDBACK_COUNT + " WHERE panel_id = ";
	
	@Test
	public void testFindAll() {
		log.info("Getting all feedback using PanelFeedbackDAO getAll function");
		long num = jdbcTemplate.queryForObject(PANEL_FEEDBACK_COUNT, Long.class);
		assertNotNull(panelFeedBackRepository.findAll());
		assertEquals(panelFeedBackRepository.findAll().size(), num);
	}
	
	@Test
	public void findAllForPanelDAO() {
		int panelId = 40;
		int actual = panelFeedBackRepository.findAllForPanel(panelId).size();
		System.out.println("number: " +actual);
		int expected = jdbcTemplate.queryForObject(PANEL_FEEDBACK_COUNT_ID + panelId, Integer.class);

		assertEquals(expected, actual);

		panelId = -789;
		actual = panelFeedBackRepository.findAllForPanel(panelId).size();
		expected = jdbcTemplate.queryForObject(PANEL_FEEDBACK_COUNT_ID + panelId, Integer.class);
		assertEquals(expected, actual);
	}	
	
	@Test
	public void getFeedbackByIdDAO() {
		log.info("Finding feedback by panel id");
		long panelFId = 140;
		int expected = 70;
		assertEquals(panelFeedBackRepository.findOne(panelFId).getPanelId(), expected);
	}
	
	
	@Test
	public void nullGetPanelFeedbackByInt() {
		log.info("Attempting to get a panel that doesn't exist");
		SimplePanelFeedback feedback = panelFeedBackRepository.findOne((long) 99999999);
		assertNull(feedback);
	}
	
	@Test
	public void updateFeedbackDAO() {
		log.info("UpdateFeedbackDAO Test");
		String comment = "11111";
		long panelFId = 10;

		SimplePanelFeedback actual = panelFeedBackRepository.findOne(panelFId);

		actual.setComment(comment);
		panelFeedBackRepository.save(actual);
		assertEquals(panelFeedBackRepository.findOne(panelFId).getComment(), actual.getComment());
	}
}