package com.atguigu.Day27;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestEmployee2 {
	/*
	 * ����1�����Ա���ļ������ݣ������µ�һЩ�������ǿ��������ɣ�

	����1����ȡ��ǰ��˾��Ա���������30��Ա����Ϣ
	����2����ȡ��˾�й��ʴ��� 5000 ��Ա����Ϣ
	����3����ȡ�Ա�Ϊ�е�Ա����Ϣ

	����4��Ա�������5��10֮���Ա����Ϣ


	 */
		
		public static void main(String[] args) {
			List<Employee> list = EmployeeData.getEmployees();
			
			//����1����ȡ��ǰ��˾��Ա���������30��Ա����Ϣ
//			List<Employee> newEmployees = filterEmployee(list,e->e.getAge()>30);
			
			
			//����2����ȡ��˾�й��ʴ��� 5000 ��Ա����Ϣ
//			List<Employee> newEmployees = filterEmployee(list, e->e.getSalary()>5000);
			
//			����3����ȡ�Ա�Ϊ�е�Ա����Ϣ
			List<Employee> newEmployees = filterEmployee(list, e->e.getGender()=='��');
			
			
			
			
			
			
			for (Employee employee : newEmployees) {
				System.out.println(employee);
				
			}
			
		}

		public static List<Employee> filterEmployee(List<Employee> list,Predicate<Employee> filter){
			//����һ���¼��϶������ڱ�����˺��Ա������
			List<Employee> datas = new ArrayList<>();
			//����ԭʼ�ļ��ϣ�������������ӵ��¼���datas��
			for (Employee employee : list) {
				if(filter.test(employee))
					datas.add(employee);
			}
			return datas;
		}
		
		
	}


