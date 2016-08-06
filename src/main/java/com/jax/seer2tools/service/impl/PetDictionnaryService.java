package com.jax.seer2tools.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jax.seer2tools.dao.PetDictionaryMapper;
import com.jax.seer2tools.entity.PetDictionary;
import com.jax.seer2tools.service.IPetDictionnaryService;
@Service
public class PetDictionnaryService implements IPetDictionnaryService {

	@Resource
	private PetDictionaryMapper pm;
	@Override
	public List<PetDictionary> queryPetByPage(int pageNum, int pageSize) {
		PageHelper ph = new PageHelper();
		ph.startPage(pageNum, pageSize);
		return pm.selectAll();
	}
	@Override
	public PetDictionary queryOneById(Short id) {
		return pm.selectByPrimaryKey(id);
	}

}