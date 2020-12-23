package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class Database {
	public static List<Employee> getEmployee(){
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"jitu",1000));
		list.add(new Employee(1,"jitu",2000));
		list.add(new Employee(1,"jitu",3000));
		return list;
	}

}
