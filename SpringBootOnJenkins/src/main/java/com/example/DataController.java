package com.example;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	static HashMap<Integer, Data> hs = new HashMap<>();

	@RequestMapping("add/{id}/{name}")
	public void addData(Integer id, String name) {

	}
}

class Data {

	private int id;
	private String name;

	public Data(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Data() {

	}
	
	@Override
	public String toString( ) {
		return "Data [id = " + id + "name = + name + ]";
	}

}