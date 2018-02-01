package com.revature.caliber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;
import com.revature.caliber.model.SimpleNote;
import com.revature.caliber.repository.NoteRepository;

@Service
public class NoteRepositoryRequestDispatcher {
	@Autowired
	private NoteRepository noteRepository;
	
	public SimpleNote processSingleSimpleNoteRequest(JsonObject request) {
		SimpleNote result = null;
		String methodName = request.get("methodName").getAsString();
		
		if(methodName.equals("findOne")) {
			Integer noteId = request.get("noteId").getAsInt();
			result = noteRepository.findOne(noteId);
		}
		
		return result;
	}
	
	public List<SimpleNote> processListSimpleNoteRequest(JsonObject request) {
		List<SimpleNote> result = null;
		String methodName = request.get("methodName").getAsString();
		
		if(methodName.equals("findAll")) {
			result = noteRepository.findAll();
		}
		
		return result;
	}
}