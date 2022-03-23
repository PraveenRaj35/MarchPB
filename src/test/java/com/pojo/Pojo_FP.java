package com.pojo;

public class Pojo_FP {
public static void main(String[] args) {
	Pojo_PS a = new Pojo_PS();
	 int year = a.getAge();
	 System.out.println("age:"+year);
	 a.setAge(35);
	 System.out.println("after setting ");
	 int year2 = a.getAge();
	System.out.println( year2); 
	 
	 
}



}
