package com.example.dal;

import org.springframework.data.repository.CrudRepository;
import com.example.model.SampleTable;

public interface SampleTableDao extends CrudRepository<SampleTable, Integer> {
	

}
