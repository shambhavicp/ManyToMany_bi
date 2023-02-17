package com.ty.many_many_bi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.many_many_bi.dto.Course;
import com.ty.many_many_bi.dto.Student;

public class StudentCourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1=new Student();
		student1.setId(111);
		student1.setName("Raj");
		student1.setPhone(234567823);
		
		Student student2=new Student();
		student2.setId(211);
		student2.setName("Rajni");
		student2.setPhone(234357823);

		Student student3=new Student();
		student3.setId(311);
		student3.setName("Ram");
		student3.setPhone(222567823);
		
		Course course1=new Course();
		course1.setId(60001);
		course1.setName("java");
		course1.setDuration("2month");

		Course course2=new Course();
		course2.setId(50001);
		course2.setName("Advancedjava");
		course2.setDuration("1month");

		Course course3=new Course();
		course3.setId(70001);
		course3.setName("sql");
		course3.setDuration("1month");
		
		
		List<Student> list1=new ArrayList<Student>();
		list1.add(student1);
		list1.add(student2);
		list1.add(student3);
		
		List<Student> list2=new ArrayList<Student>();
		list2.add(student3);
		

		List<Course> courseList1=new ArrayList<Course>();
		courseList1.add(course1);
		courseList1.add(course2);
		courseList1.add(course3);
		
		List<Course> courseList2=new ArrayList<Course>();
		courseList2.add(course3);
		
		student1.setCourses(courseList1);
		student2.setCourses(courseList1);
		student3.setCourses(courseList2);
		
		course1.setStudents(list1);
		course2.setStudents(list1);
		course3.setStudents(list2);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		
		entityTransaction.commit();
	 	


	}

}
