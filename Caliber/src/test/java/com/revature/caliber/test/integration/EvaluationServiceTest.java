package com.revature.caliber.test.integration;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.caliber.CaliberTest;
import com.revature.caliber.beans.Batch;
import com.revature.caliber.beans.Grade;
import com.revature.caliber.beans.Note;
import com.revature.caliber.data.BatchDAO;
import com.revature.caliber.services.EvaluationService;

public class EvaluationServiceTest extends CaliberTest{

	private static final int TEST_BATCH_ID = 2150;
	private static final int TEST_ASSESSMENT_WEEK = 7;

	private static final Logger log = Logger.getLogger(EvaluationServiceTest.class);
	
	@Autowired
	EvaluationService evaluationService;
	@Autowired
	BatchDAO batchDAO;
	
	/**
	 * Test methods:
	 * 
	 * @see com.revature.caliber.services.EvaluationService#findGradesByWeek(Integer, Integer)
	 * 
	 */
	@Test
	public void findGradesByWeek(){
		log.trace("Test findGradesByWeek");
		
		//get test batch
		Batch batch = batchDAO.findOne(TEST_BATCH_ID);
		
		//get grades
		Map<Integer,List<Grade>> grades = 
				evaluationService.findGradesByWeek(batch.getBatchId(), TEST_ASSESSMENT_WEEK);
		
		//assert size of result as expected in test data
		assertEquals(13, grades.size());
		
		//iterate through map entries and assert it is of test week
		for (Map.Entry<Integer, List<Grade>> entry : grades.entrySet())
		{
		    List<Grade> weekGrades = entry.getValue();
		    for(Grade grade: weekGrades){
		    	assertEquals(TEST_ASSESSMENT_WEEK, grade.getAssessment().getWeek());
		    }
		}
	}
	
	/**
	 * Test methods:
	 * 
	 * @see com.revature.caliber.services.EvaluationService#findIndividualNotes(Integer, Integer)
	 */
	@Test
	public void findIndividualNotes(){
		log.trace("Test findIndividualNotes");
		
		int batchId = 2050;
		//find a batch by a known id
		Batch batch = batchDAO.findOne(batchId);
		int week = 6;
		//for that batch's BatchId, execute the function
		List<Note> notes = evaluationService.findIndividualNotes(batch.getBatchId(), week);
		//assert that for each week, the returned week is equal
		for(int i = 0; i<notes.size();i++){
			assertEquals(6,notes.get(i).getWeek());
		}
		//assert that the size of the sample set, is the size of the result set
		assertEquals(6, notes.size());
	}
}
