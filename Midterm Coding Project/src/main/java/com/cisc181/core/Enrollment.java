package com.cisc181.core;

import java.util.UUID;
import com.cisc181.core.*;

public class Enrollment {
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	
	public UUID getSectionID(){
		return this.SectionID;
	}
	public UUID getStudentID(){
		return this.StudentID;
	}
	public UUID getEnrollmentID(){
		return this.EnrollmentID;
	}
	public double getGrade(){
		return this.Grade;
	}
	private Enrollment(){
	}
	public Enrollment(UUID StudnetID, UUID SectionID){
		UUID setEnrollmentID = EnrollmentID; 
		}
	private void setGradde(double grade){
		Grade = grade;
	}
}


