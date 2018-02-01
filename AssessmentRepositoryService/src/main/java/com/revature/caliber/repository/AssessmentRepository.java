package com.revature.caliber.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.revature.caliber.model.SimpleAssessment;

@RepositoryRestResource(collectionResourceRel = "assessment", path = "assessment")
public interface AssessmentRepository extends JpaRepository<SimpleAssessment, Long> {	

	SimpleAssessment findByAssessmentId(@Param("assessmentId") Long assessmentId);
	List<SimpleAssessment> findDistinctByWeek(@Param("week") Short week);
	List<SimpleAssessment> findDistinctByBatchId(@Param("batchId") Integer batchId);
	List<SimpleAssessment> findByBatchIdAndWeek(@Param("batchId") Integer batchId, @Param("week") Short week);
}