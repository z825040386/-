package com.atguigu.Day27;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
	//���ܣ���ȡһ��������Ա���ļ��϶���
	public static List<Employee> getEmployees(){
		List<Employee >  list = new ArrayList<>();
		list.add(new Employee(1,"����",29,'��',20000));
		list.add(new Employee(2,"�Ƿ�",39,'��',80000));
		list.add(new Employee(3,"����",29,'��',30000));
		list.add(new Employee(4,"������",19,'Ů',29000));
		list.add(new Employee(5,"����",18,'Ů',25000));
		list.add(new Employee(6,"����",17,'Ů',12000));
		list.add(new Employee(7,"����",20,'Ů',10000));
		list.add(new Employee(4,"������",19,'Ů',29000));
		list.add(new Employee(5,"����",18,'Ů',25000));
		list.add(new Employee(4,"������",19,'Ů',29000));
		return list;
	}

}

