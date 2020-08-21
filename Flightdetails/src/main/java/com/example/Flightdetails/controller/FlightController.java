package com.example.Flightdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Flightdetails.model.DatabaseFile;
import com.example.Flightdetails.payload.UploadFile;
import com.example.Flightdetails.service.DatabaseFileService;

@Controller
public class FlightController {
	
	@Autowired
    private DatabaseFileService databaseFileService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
    public String home(ModelMap model){
		return "home"; 
    }
	@RequestMapping(value="/flightinsurance", method = RequestMethod.GET)
    public String redirecting(ModelMap model){
	  return "flightinsurance";
	}
	
	@RequestMapping(value="/uploadFile", method = RequestMethod.POST)
	public String uploadFile(ModelMap model, @ModelAttribute("user") UploadFile uploadFile) { 
		System.out.println("Entering - FileController.uploadFile(ModelMap, UploadFile) - uploadFile : "+uploadFile);
		DatabaseFile databaseFile = databaseFileService.storeFlightDetails(uploadFile);
        if(databaseFile != null){
			 model.put("uploadFileSuccess", "Airline Name - "+databaseFile.getAirlineName()+" details added successfully .");
			 return "welcome";
		}else{
			 model.put("uploadFileFailed", "Flight Details not able to upload");
			 return "redirect:/";
		}
    }
    @GetMapping("/downloadFile/{airlineName}")
    public String downloadflightdetailsByairlineName(ModelMap model, @PathVariable String airlineName) {
    	System.out.println("Entering - FileController.downloadflightDetails(String, HttpServletRequest) - airlineName::"+airlineName);
        List<DatabaseFile> databaseFile = databaseFileService.downloadflightdetailsByairlineName(airlineName);
        System.out.println("databaseFile - : "+databaseFile);
        model.put("databaseFile", databaseFile);
        return "viewdetails";
    }
   /* @GetMapping("/dashboard/{details}")
    public String downloadflightdetailsBydetails(ModelMap model, @PathVariable String details) {
    	System.out.println("Entering - FileController.downloadflightDetails(String, HttpServletRequest) - details::"+details);
        List<DatabaseFile> databaseFile = databaseFileService.downloadflightdetailsBydetails(details);
        System.out.println("databaseFile - : "+databaseFile);
        model.put("databaseFile", databaseFile);
        return "dashboard";*/
    }

