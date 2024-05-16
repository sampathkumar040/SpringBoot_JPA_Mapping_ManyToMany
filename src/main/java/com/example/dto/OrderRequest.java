package com.example.dto;

import com.example.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderRequest {
	
	private Customer customer;

}
