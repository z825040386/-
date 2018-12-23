package com.atguigu.Day27;

import java.util.ArrayList;
import java.util.List;

/*
 * ����1�����Ա���ļ������ݣ������µ�һЩ�������ǿ��������ɣ�

����1����ȡ��ǰ��˾��Ա���������30��Ա����Ϣ
����2����ȡ��˾�й��ʴ��� 5000 ��Ա����Ϣ
����3����ȡ�Ա�Ϊ�е�Ա����Ϣ


��ͳ��ʽ����Ĳ��㣺�����Ժ���չ�Զ��ϲ�
 */
public class TestEmployee1 {
	
	public static void main(String[] args) {
		List<Employee> list = EmployeeData.getEmployees();
		
		//����1��
		List<Employee> employeeByAge = getEmployeeByAge(list);
		for (Employee employee : employeeByAge) {
			System.out.println(employee);
			
		}
		
	}

	//����1����ȡ��ǰ��˾��Ա���������30��Ա����Ϣ
	public static List<Employee> getEmployeeByAge(List<Employee> list){
		//����һ���¼��϶������ڱ�����˺��Ա������
		List<Employee> datas = new ArrayList<>();
		//����ԭʼ�ļ��ϣ�������������ӵ��¼���datas��
		for (Employee employee : list) {
			
			if(employee.getAge()>30)
				datas.add(employee);
		}
		return datas;
		
	}
	//����2����ȡ��˾�й��ʴ��� 5000 ��Ա����Ϣ
	public static List<Employee> getEmployeeBySalary(List<Employee> list){
		//����һ���¼��϶������ڱ�����˺��Ա������
		List<Employee> datas = new ArrayList<>();
		//����ԭʼ�ļ��ϣ�������������ӵ��¼���datas��
		for (Employee employee : list) {
			
			if(employee.getSalary()>5000)
				datas.add(employee);
		}
		return datas;
		
	}
	//����3����ȡ�Ա�Ϊ�е�Ա����Ϣ
	public static List<Employee> getEmployeeByGender(List<Employee> list){
		//����һ���¼��϶������ڱ�����˺��Ա������
		List<Employee> datas = new ArrayList<>();
		//����ԭʼ�ļ��ϣ�������������ӵ��¼���datas��
		for (Employee employee : list) {
			
			if(employee.getGender()=='��')
				datas.add(employee);
		}
		return datas;
		
	}
}
