package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Courses;

public interface CourseRepository  extends JpaRepository<Courses, Long>{
	
	
	List<Courses> findByFeeLessThan(double fee);

}
