package com.example.bll;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dal.SampleTableDao;

import antlr.collections.List;
import com.example.model.SampleTable;

@Service(value = "sampletableService")
@Transactional

public class SampleTableService {
	@Autowired
	private SampleTableDao sampletableDao;
	
}
