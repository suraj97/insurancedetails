package com.example.Flightdetails.model;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="insurance")
public class DatabaseFile implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	private String airlineName;
	private String source;
	private String destination;
	private String duration;
	private String details;
	@Lob
	private byte[] flightticketphoto;
	
	public DatabaseFile() {
		super();
	}

	public DatabaseFile(String airlineName, String source, String destination, String duration,String details,
			 byte[] flightticketphoto) {
		super();
		this.airlineName = airlineName;
		this.source = source;
		this.destination = destination;
		this.duration = duration;
		this.details= details;
		this.flightticketphoto = flightticketphoto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public byte[] getFlightticketphoto() {
		return flightticketphoto;
	}

	public void setFlightticketphoto(byte[] flightticketphoto) {
		this.flightticketphoto = flightticketphoto;
	}
	
	@Override
	public String toString() {
		return "DatabaseFile [id=" + id + ", airlineName=" + airlineName + ", source=" + source
				+ ", destination=" + destination + ", duration=" + duration + ",details=" + details + ", flightticketphoto=" + Arrays.toString(flightticketphoto) + "]";
	}
}
