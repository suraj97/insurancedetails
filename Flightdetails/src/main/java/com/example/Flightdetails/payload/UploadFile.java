package com.example.Flightdetails.payload;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class UploadFile implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String airlineName;
	private String source;
	private String destination;
	private String duration;
	private String details;
	private MultipartFile file;
	
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "UploadFileRequest [airlineName=" + airlineName + ", source=" + source
				+ ", destination=" + destination + ", duration=" + duration + ", details=" + details + ", file=" + file
				+ "]";
	}
}

	