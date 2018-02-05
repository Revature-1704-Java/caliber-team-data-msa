package com.revature.caliber.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;
import com.revature.caliber.model.Address;
import com.revature.caliber.model.Batch;
import com.revature.caliber.model.SimpleBatch;;

/**
 * Provides logic concerning trainer and trainee data. Application logic has no
 * business being in a DAO nor in a Controller. This is the ideal place for
 * calculations
 *
 * @author Patrick Walsh
 *
 */
@Service
public class BatchService {

	private static final Logger log = Logger.getLogger(BatchService.class);
	//private TrainerDAO trainerDAO;
	//private TraineeDAO traineeDAO;
	//private BatchDAO batchDAO;
	//private AddressDAO addressDAO;
	
	@Autowired
	private AmqpTemplate rabbitMqBatchDAO;
	
	JsonObject message = new JsonObject();	

	/*
	 *******************************************************
	 * BATCH SERVICES
	 *
	 *******************************************************
	 */

	/**
	 * Returns a list of commonly used locations. Allows user to select from
	 * locations, but also add new locations manually. Suggested UI component is the
	 * HTML5 <datalist>
	 *
	 * @return
	 */
	public List<Address> findCommonLocations() {
		//return addressDAO.findAll();
		message.add("findCommonLocations", null);
		return (List<Address>) rabbitMqBatchDAO.convertSendAndReceive("rabbit.exchange", "rabbit.queue", "FindCommonLocations");
	}

	/**
	 * ADD ANOTHER WEEK TO BATCH
	 *
	 * @param batchId
	 */
	public void addWeek(Integer batchId) {
		log.debug("Adding week to batch: " + batchId);
		//Batch batch = batchDAO.findOne(batchId);
		//if (batch == null)
		//	throw new IllegalArgumentException("Invalid batch");
		//int weeks = batch.getWeeks();
		//batch.setWeeks(++weeks);
		//batchDAO.update(batch);
		JsonObject message = new JsonObject();
		message.addProperty("method", "addWeek");
	}

	/**
	 * SAVE BATCH
	 *
	 * @param batch
	 */
	public void save(Batch batch) {
		log.debug("Saving batch: " + batch);
		//batchDAO.save(batch);
		JsonObject message = new JsonObject();
		message.addProperty("method", "save");
	}

	/**
	 * FIND ALL BATCHES
	 *
	 * @return
	 */
	public List<Batch> findAllBatches() {
		log.debug("Find all batches");
		//return batchDAO.findAll();
		JsonObject message = new JsonObject();
		message.addProperty("method", "findAllBatches");
		return (List<Batch>) rabbitMqBatchDAO.convertSendAndReceive("rabbit.exchange", "rabbit.queue", "findAllBatches");
	}

	/**
	 * FIND ALL CURRENT BATCHES
	 *
	 * @return
	 */
	public List<Batch> findAllCurrentBatches() {
		log.debug("Find all current batches");
		//return batchDAO.findAllCurrent();\
		return (List<Batch>) rabbitMqBatchDAO.convertSendAndReceive("rabbit.exchange", "rabbit.queue", "findAllCurrentBatches");
	}

	/**
	 * FIND ALL BATCHES BY TRAINER
	 *
	 * @param trainerId
	 * @return
	 */
	public List<Batch> findAllBatches(int trainerId) {
		log.debug("Find all batches for trainer: " + trainerId);
		//return batchDAO.findAllByTrainer(trainerId);
		return (List<Batch>) rabbitMqBatchDAO.convertSendAndReceive("rabbit.exchange", "rabbit.queue", "findAllBatches");
	}

	/**
	 * FIND ALL CURRENT BATCHES BY TRAINER
	 *
	 * @param trainerId
	 * @return
	 */
	public List<Batch> findAllCurrentBatches(int trainerId) {
		log.debug("Find all current batches for trainer: " + trainerId);
		//return batchDAO.findAllCurrent(trainerId);
		return (List<Batch>) rabbitMqBatchDAO.convertSendAndReceive("rabbit.exchange", "rabbit.queue", "findAllCurrentBatches");
	}

	/**
	 * FIND BATCH BY ID
	 *
	 * @param batchId
	 * @return
	 */
	public Batch findBatch(Integer batchId) {
		log.debug("Finding batch with id: " + batchId);
		//return batchDAO.findOne(batchId);
		return (Batch) rabbitMqBatchDAO.convertSendAndReceive("rabbit.exchange", "rabbit.queue", "findBatch");
	}

	/**
	 * UPDATE BATCH
	 *
	 * @param batch
	 */
	public void update(Batch batch) {
		log.debug("Update batch " + batch);
		//batchDAO.update(batch);
	}

	/**
	 * DELETE BATCH
	 *
	 * @param batch
	 */
	public void delete(Batch batch) {
		//Batch fullBatch = batchDAO.findOneWithDroppedTrainees(batch.getBatchId());
		//log.debug("Delete batch " + fullBatch);
		//batchDAO.delete(fullBatch);
	}

}