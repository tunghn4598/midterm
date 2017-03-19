package com.cisc181.core;
import java.util.UUID;
import java.util.Date;

import com.cisc181.core.*;

public class Semester {
	
	
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	
	public UUID getSemesterID(){
		 return this.SemesterID;
    }
	public Date getStartDate(){
		return this.StartDate;
	}
	public Date getEndDate(){
		 return this.EndDate;
	}

}
