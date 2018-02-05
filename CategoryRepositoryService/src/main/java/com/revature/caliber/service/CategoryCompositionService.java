package com.revature.caliber.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.caliber.model.Category;
import com.revature.caliber.model.SimpleCategory;
import com.revature.caliber.repository.CategoryRepository;


public class CategoryCompositionService {
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private CategoryCompositionMessagingService categoryCompositionMessagingService;
	
	//findOne
	public Category findOne(int categoryId) {
		SimpleCategory basis = categoryRepository.findOne(categoryId);
		Category result = composeCategory(basis);
		return result;
	}
	
	//findAll
	public List<Category> findAll(int categoryId) {
		List<SimpleCategory> basis = categoryRepository.findByCategoryIdOrderBySkillCategoryAsc(categoryId);
		List<Category> result = composeListOfCategory(basis);
		
		return result;
	}
	
	//findAllActive
	public List<Category> findAllForPanel(boolean active) {
		List<SimpleCategory> basis = categoryRepository.findByActiveOrderByCategoryIdAsc(active);
		List<Category> result = composeListOfCategory(basis);
		
		return result;
	}
	
	/*
	//save
	public ? save(PanelFeedback panelFeedback) {
		
	}
	
	//update
	public ? update(PanelFeedback panelFeedback) {
		
	}
	
	//delete
	public ? delete(Long panelFeedbackd) {
		
	}
	*/
	
	private List<Category> composeListOfCategory(List<SimpleCategory> src) {
		List<Category> dest = new LinkedList<Category>();
		
		for(SimpleCategory curr : src) {
			dest.add(new Category(curr));
		}
		
		return dest;
	}
	
	private Category composeCategory(SimpleCategory src) {
		Category dest = new Category(src);
		return dest;
	}
}