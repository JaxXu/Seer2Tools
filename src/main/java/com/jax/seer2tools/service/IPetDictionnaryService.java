package com.jax.seer2tools.service;

import java.util.List;
import java.util.Map;

import com.jax.seer2tools.entity.PetDictionary;

public interface IPetDictionnaryService {
	List<PetDictionary> queryPetByPage(int pageNum , int pageSize);
	List<PetDictionary> queryPetByPageAndName(int pageNum , int pageSize ,String defName);
	List<PetDictionary> queryPetByPageAndType(int pageNum , int pageSize ,String Type);
	List<PetDictionary> queryPetByPageAndTypeAndName(int pageNum , int pageSize ,Map<String, String> map);
	PetDictionary queryOneById(Short id);
}
