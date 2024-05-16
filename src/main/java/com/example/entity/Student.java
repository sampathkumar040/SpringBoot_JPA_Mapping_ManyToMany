package com.example.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_table")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int age;
	private String dept;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_COURSE_TABLE", 
	joinColumns = {
			@JoinColumn(name = "student_id", referencedColumnName = "id")

	},
	inverseJoinColumns = { 
			@JoinColumn(name = "course_id", referencedColumnName = "id") 
	})
	private Set<Courses> courses;

	/*
	{
		"name": "raju",
		"age" : 33,
		"dept": "UI",
		"courses":[
		    {
		        "title": "Angular",
		        "abbreviation": "ng",
		        "modules":12,
		        "fee": 5000

		},
		{
		     "title": "java",
		        "abbreviation": "-javac",
		        "modules":22,
		        "fee": 7000

		}

		]

		}
	
	*//*

{
    "customer": {
        "name" : "sampath",
        "email": "sampathkumar040@gmail.com",
        "gender": "male",
        "products":[
        {
            "pid":201,
            "productName": "Mobile",
            "qty": 1,
            "price": 5000
        },
        {
            "pid":301,
            "productName": "Lpatop",
            "qty": 2,
            "price": 10000 
        }
        ]
    }
}
	
	
	
	
	*/
	
	
	
	
}
