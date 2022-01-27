package org.test1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class construction2 {
	
	
			
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<contruction> d=new LinkedHashSet<>();
		for(int i=0; i<2; i++) {
		Scanner s=new Scanner(System.in);
		System.out.println("Employee id");
		int empid=s.nextInt();
//		String name=s.next();
//		long phno=s.nextLong();
		System.out.println("gender");
		String gender=s.next();
//		int salary =s.nextInt();
		contruction b=new contruction();
		//b.setName(name);
		b.setEmpid(empid);
		//b.setPhno(phno);
		//b.setSalary(salary);
		b.setGender(gender);
		
		d.add(b);
		}
	
		System.out.println();
		for(contruction x:d) {
			System.out.println(x.getEmpid());
			System.out.println(x.getGender());
			
		}
	}
}
