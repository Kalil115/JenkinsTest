package com.example;

import java.io.Serializable;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unit")
public class UnitResource {

	@GetMapping
	public String getUnitInfo() {
		return "Unit Testing";
	}
	
	@RequestMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public Unit getUnitJson() {
		return new Unit(1, "Jazz");
	}
}

class Unit implements Serializable {
	private Integer id;
	private String name;
	
	public Unit(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}