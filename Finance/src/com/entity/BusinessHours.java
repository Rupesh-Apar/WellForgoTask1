package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BusinessHours {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Double DayPfWeek;
	Double startTime;
	Double endTime;
	
	
	public BusinessHours(Double dayPfWeek, Double startTime, Double endTime) {
		super();
		DayPfWeek = dayPfWeek;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Double getDayPfWeek() {
		return DayPfWeek;
	}
	public void setDayPfWeek(Double dayPfWeek) {
		DayPfWeek = dayPfWeek;
	}
	public Double getStartTime() {
		return startTime;
	}
	public void setStartTime(Double startTime) {
		this.startTime = startTime;
	}
	public Double getEndTime() {
		return endTime;
	}
	public void setEndTime(Double endTime) {
		this.endTime = endTime;
	}
	
	
}
