package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

import com.cisc181.core.*;

public class Section {
	
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	
	 public UUID getCourseID(){
		 return this.CourseID;
 }
	 public UUID getSemesterID(){
		 return this.SemesterID;
 }
	 public UUID getSectionID(){
		 return this.SectionID;
	 }
	 public int getRoomID(){
		 return this.RoomID;
	 }

}
