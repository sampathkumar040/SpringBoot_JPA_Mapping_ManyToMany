package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Courses;
import com.example.entity.Student;
import com.example.repo.CourseRepository;
import com.example.repo.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentCourseController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	
	@PostMapping("/save")
	public Student saveStudentWithCourses(@RequestBody Student student) {
		
		return studentRepository.save(student);
		
	}
	
	@GetMapping
	public List<Student> findAllStudent(){
		return studentRepository.findAll();
	}
	
	@GetMapping("/{studentId}")
	public Student findStudent(@PathVariable Long studentId) {
		return studentRepository.findById(studentId).orElse(null);
	}
	
	@GetMapping("/find/{name}  ")
	public List<Student> findStudentsContainingByName(String name){
		return studentRepository.findByNameContaining(name);
	}
	
	
	@GetMapping("/search/{price}")
	public List<Courses> findCourseLessThanPrice(@PathVariable double price){
		return courseRepository.findByFeeLessThan(price);
	}
	

}
