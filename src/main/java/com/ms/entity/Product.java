package com.ms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	private int code;
	private String name;
	private String brand;
	private int price;
}
