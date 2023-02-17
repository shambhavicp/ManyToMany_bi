package com.ty.many_many_bi.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	
	@Id
	private int cid;
	private String name;
	private String duration;
	
	@ManyToMany(mappedBy = "courses") 
	private List<Student> students;

	public int getId() {
		return cid;
	}

	public void setId(int id) {
		this.cid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [id=" + cid + ", name=" + name + ", duration=" + duration + ", students=" + students + "]";
	}
	

}
