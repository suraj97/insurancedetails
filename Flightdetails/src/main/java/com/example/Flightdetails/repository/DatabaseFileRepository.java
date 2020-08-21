package com.example.Flightdetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
/*import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;*/
import org.springframework.stereotype.Repository;

import com.example.Flightdetails.model.DatabaseFile;

@Repository
public interface DatabaseFileRepository extends JpaRepository<DatabaseFile, String> {
	
	List<DatabaseFile> findByairlineName(String airlineName);

	/*List<DatabaseFile> findBydetails(String details);*/

}
