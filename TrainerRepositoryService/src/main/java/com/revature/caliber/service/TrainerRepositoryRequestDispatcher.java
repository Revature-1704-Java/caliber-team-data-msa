package com.revature.caliber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.revature.caliber.model.SimpleTrainee;
import com.revature.caliber.model.SimpleTrainer;
import com.revature.caliber.model.Trainer;
import com.revature.caliber.repository.TrainerRepository;

@Service
public class TrainerRepositoryRequestDispatcher {

	@Autowired
	private TrainerRepository trainerRepository;
	
	public SimpleTrainer processSingleSimpleTrainerRequest(JsonObject request) {
		SimpleTrainer result = null;
		Gson gson = new Gson();
		String methodName = request.get("methodName").getAsString();
		
		if(methodName.equals("findOne")) {
			Integer trainerId = request.get("trainerId").getAsInt();
			result = trainerRepository.findOne(trainerId);
		} else if(methodName.equals("delete")) {
			trainerRepository.delete(request.get("trainerId").getAsInt());
			result = null;
		}
		
		return result;
	}
	
	public List<SimpleTrainer> processListSimpleTrainerRequest(JsonObject request) {
		List<SimpleTrainer> result = null;
		String methodName = request.get("methodName").getAsString();
		
		if(methodName.equals("findAll")) {
			result = trainerRepository.findAll();
		}
		
		return result;
	}
}
