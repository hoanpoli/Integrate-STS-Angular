package dal;

import org.springframework.data.repository.CrudRepository;
import model.SampleTable;

public interface SampleTableDao extends CrudRepository<SampleTable, Integer> {
	

}
