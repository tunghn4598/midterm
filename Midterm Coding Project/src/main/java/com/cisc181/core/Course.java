package com.cisc181.core;

import java.util.UUID;
import java.lang.reflect.Method;

import com.cisc181.core.*;
import com.cisc181.eNums.eMajor;

public class Course {
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoint;
	private String eMajor;

	
	
    public UUID getCourseID(){
	    	return this.CourseID;
    }
    public String getCourseName(){
    	return this.CourseName;
    }
    public int getGradePoint(){
    	return this.GradePoint;
    }
	public String getMajor ()
    {
        return this.eMajor;
    }
    

}
