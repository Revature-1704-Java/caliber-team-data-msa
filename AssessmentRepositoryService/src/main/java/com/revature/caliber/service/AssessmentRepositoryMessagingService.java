package com.revature.caliber.service;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.revature.caliber.model.Assessment;
import com.revature.caliber.model.SimpleAssessment;

@Service
public class AssessmentRepositoryMessagingService {

	@Autowired
	private AssessmentRepositoryRequestDispatcher assessmentRepositoryRequestDispatcher;

	@RabbitListener(queues = "revature.caliber.repos.assessment")
	public SimpleAssessment receiveSingleSimpleAssessmentRequest(String message) {
		System.out.println(message);
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(message);
		JsonObject request = element.getAsJsonObject();

		return assessmentRepositoryRequestDispatcher.processSingleSimpleAssessmentRequest(request);
	}

	@RabbitListener(queues = "revature.caliber.repos.assessment.list")
	public List<SimpleAssessment> receiveListSimpleAssessmentRequest(String message) {
		System.out.println(message);
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(message);
		JsonObject request = element.getAsJsonObject();
		System.out.println(request);

		return assessmentRepositoryRequestDispatcher.processListSimpleAssessmentRequest(request);
	}
	
	@RabbitListener(queues = "revature.caliber.dto.assessment")
	public Assessment receiveAssessmentDTORequest(String message) {
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(message);
		JsonObject request = element.getAsJsonObject();
		
		return assessmentRepositoryRequestDispatcher.processAssessmentDTORequest(request);
	}
}
