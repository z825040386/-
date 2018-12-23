package com.atguigu.Day27;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestEmployee2 {
	/*
	 * 案例1：针对员工的集合数据，有如下的一些需求，我们考虑如何完成？

	需求1：获取当前公司中员工年龄大于30的员工信息
	需求2：获取公司中工资大于 5000 的员工信息
	需求3：获取性别为男的员工信息

	需求4：员工编号在5到10之间的员工信息


	 */
		
		public static void main(String[] args) {
			List<Employee> list = EmployeeData.getEmployees();
			
			//需求1：获取当前公司中员工年龄大于30的员工信息
//			List<Employee> newEmployees = filterEmployee(list,e->e.getAge()>30);
			
			
			//需求2：获取公司中工资大于 5000 的员工信息
//			List<Employee> newEmployees = filterEmployee(list, e->e.getSalary()>5000);
			
//			需求3：获取性别为男的员工信息
			List<Employee> newEmployees = filterEmployee(list, e->e.getGender()=='男');
			
			
			
			
			
			
			for (Employee employee : newEmployees) {
				System.out.println(employee);
				
			}
			
		}

		public static List<Employee> filterEmployee(List<Employee> list,Predicate<Employee> filter){
			//创建一个新集合对象，用于保存过滤后的员工数据
			List<Employee> datas = new ArrayList<>();
			//遍历原始的集合，满足条件，添加到新集合datas中
			for (Employee employee : list) {
				if(filter.test(employee))
					datas.add(employee);
			}
			return datas;
		}
		
		
	}


