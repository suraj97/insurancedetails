package com.example.Flightdetails.service;

import java.util.List;

import com.example.Flightdetails.model.DatabaseFile;
import com.example.Flightdetails.payload.UploadFile;

public interface DatabaseFileService {
	public DatabaseFile storeFlightDetails(UploadFile uploadFile);
	
	public List<DatabaseFile> downloadflightdetailsByairlineName(String airlineName);

	/*public List<DatabaseFile> downloadflightdetailsBydetails(String details);*/
}

