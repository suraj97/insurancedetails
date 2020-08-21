package com.example.Flightdetails.serviceimpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.Flightdetails.exception.FileStorageException;
import com.example.Flightdetails.model.DatabaseFile;
import com.example.Flightdetails.payload.UploadFile;
import com.example.Flightdetails.repository.DatabaseFileRepository;
import com.example.Flightdetails.service.DatabaseFileService;

@Service
public class DatabaseFileServiceImpl implements DatabaseFileService {

	@Autowired
    private DatabaseFileRepository databaseFileRepository;
	
	public DatabaseFile storeFlightDetails(UploadFile uploadFile) {
		System.out.println("Entering - DatabaseFileServiceImpl.storeFlightDetails(UploadFile) - uploadFile : "+uploadFile);
		DatabaseFile databaseFile = null;
		byte[] flightticketPhoto;
		
		try {
			if(uploadFile != null && !uploadFile.getFile().isEmpty()){
				flightticketPhoto = uploadFile.getFile().getBytes();
				databaseFile = new DatabaseFile(uploadFile.getAirlineName(), uploadFile.getSource(), uploadFile.getDestination(), uploadFile.getDuration(), uploadFile.getDetails(),flightticketPhoto);
				return databaseFileRepository.save(databaseFile);
			}
		} catch (IOException ex) {
            throw new FileStorageException("Could not store Flight Details. Please try again!", ex);
        }
		return databaseFile;
	}
	public List<DatabaseFile> downloadflightdetailsByairlineName(String airlineName) {
		return databaseFileRepository.findByairlineName(airlineName);
	}
	/*public List<DatabaseFile> downloadflightdetailsBydetails(String details) {
		return databaseFileRepository.findBydetails(details);
	}*/
}
	
