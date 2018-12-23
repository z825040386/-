package com.atguigu.Day27;

import java.util.ArrayList;
import java.util.List;

/*
 * 案例1：针对员工的集合数据，有如下的一些需求，我们考虑如何完成？

需求1：获取当前公司中员工年龄大于30的员工信息
需求2：获取公司中工资大于 5000 的员工信息
需求3：获取性别为男的员工信息


传统方式解决的不足：重用性和扩展性都较差
 */
public class TestEmployee1 {
	
	public static void main(String[] args) {
		List<Employee> list = EmployeeData.getEmployees();
		
		//需求1：
		List<Employee> employeeByAge = getEmployeeByAge(list);
		for (Employee employee : employeeByAge) {
			System.out.println(employee);
			
		}
		
	}

	//需求1：获取当前公司中员工年龄大于30的员工信息
	public static List<Employee> getEmployeeByAge(List<Employee> list){
		//创建一个新集合对象，用于保存过滤后的员工数据
		List<Employee> datas = new ArrayList<>();
		//遍历原始的集合，满足条件，添加到新集合datas中
		for (Employee employee : list) {
			
			if(employee.getAge()>30)
				datas.add(employee);
		}
		return datas;
		
	}
	//需求2：获取公司中工资大于 5000 的员工信息
	public static List<Employee> getEmployeeBySalary(List<Employee> list){
		//创建一个新集合对象，用于保存过滤后的员工数据
		List<Employee> datas = new ArrayList<>();
		//遍历原始的集合，满足条件，添加到新集合datas中
		for (Employee employee : list) {
			
			if(employee.getSalary()>5000)
				datas.add(employee);
		}
		return datas;
		
	}
	//需求3：获取性别为男的员工信息
	public static List<Employee> getEmployeeByGender(List<Employee> list){
		//创建一个新集合对象，用于保存过滤后的员工数据
		List<Employee> datas = new ArrayList<>();
		//遍历原始的集合，满足条件，添加到新集合datas中
		for (Employee employee : list) {
			
			if(employee.getGender()=='男')
				datas.add(employee);
		}
		return datas;
		
	}
}
