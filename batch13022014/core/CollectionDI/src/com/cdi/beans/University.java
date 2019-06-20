package com.cdi.beans;

import java.util.Map;
import java.util.Properties;

public class University {
	private Map<String, Course> hodToCourseMap;
	private Properties subjectTopper;

	public University(Map<String, Course> hodToCourseMap) {
		this.hodToCourseMap = hodToCourseMap;
	}

	public Properties getSubjectTopper() {
		return subjectTopper;
	}

	public void setSubjectTopper(Properties subjectTopper) {
		this.subjectTopper = subjectTopper;
	}

	@Override
	public String toString() {
		return "University [hodToCourseMap=" + hodToCourseMap
				+ ", subjectTopper=" + subjectTopper + "]";
	}

}
