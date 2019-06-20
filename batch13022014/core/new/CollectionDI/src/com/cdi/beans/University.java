package com.cdi.beans;

import java.util.Map;
import java.util.Properties;

public class University {
	private Map<String, Course> hodToCourseMap;
	private Properties subjectToppers;

	public University(Map<String, Course> hodToCourseMap) {
		this.hodToCourseMap = hodToCourseMap;
	}

	public void setSubjectToppers(Properties subjectToppers) {
		this.subjectToppers = subjectToppers;
	}

	@Override
	public String toString() {
		return "University [hodToCourseMap=" + hodToCourseMap
				+ ", subjectToppers=" + subjectToppers + "]";
	}

}
