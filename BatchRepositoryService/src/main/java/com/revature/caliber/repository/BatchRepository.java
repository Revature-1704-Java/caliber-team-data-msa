package com.revature.caliber.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.revature.caliber.model.SimpleBatch;
@RepositoryRestResource(collectionResourceRel = "batch", path = "batch")
public interface BatchRepository extends JpaRepository<SimpleBatch, Integer>, BatchRepositoryCustom {
	/**
	 * Find all batches by TrainerId
	 * 
	 * @param trainerId
	 * @return
	 */
	List <SimpleBatch> findAllByTrainerId(@Param("trainerId") Integer trainerId);
	/**
	 * Find all batches start after certain date
	 * @param date
	 * @return
	 */
	List <SimpleBatch> findAllByStartDateAfter(@Param("date") Date date);
	/**
	 *  Find a batch by ResourceId
	 * @param resourceId
	 * @return
	 */
	SimpleBatch findOneByResourceId(@Param("resourceId") String resourceId);
}
