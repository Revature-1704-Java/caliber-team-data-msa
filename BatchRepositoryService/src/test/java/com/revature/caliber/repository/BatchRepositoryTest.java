package com.revature.caliber.repository;

import static org.junit.Assert.*;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.caliber.model.Batch;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BatchRepositoryTest {
	@Autowired
    private TestEntityManager entityManager;
	@Autowired
	private BatchRepository batchRepo;

	@Test
	public void testFindAllByTrainerId() {
		Batch b=new Batch("trainingName", 1, Date.from(Instant.now()), Date.from(Instant.now()), "location");
		int id = (int) entityManager.persistAndGetId(b);
		entityManager.flush();
		List<Batch> test = batchRepo.findAllByTrainerId(1);
		assertFalse("Test Batch Not Empty", test.size()==0);
	
	}

}
