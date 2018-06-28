package com.example.test.dal;

import org.springframework.data.repository.CrudRepository;
import com.example.test.model.SampleTable;

public interface SampleTableDao extends CrudRepository<SampleTable, Integer> {
	

}
