package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.SampleTable;
import com.example.dal.SampleTableDao;

@SpringBootApplication
@RestController
@RequestMapping("/sampletable")
public class SampleTableController {
	@Autowired
	private SampleTableDao dao;
	
	@GetMapping("")
	public ResponseEntity<?> getAllAccountOfOwner(){
		Iterable<SampleTable> res = dao.findAll() ;
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
}
