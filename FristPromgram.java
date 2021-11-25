package com.technojava1;

public class FristPromgram {

	public static void main(String[] args) {
	Shiva1 s1= new Shiva1();
	s1.run(2,"anshu");
	Shiva1 s3 = new Shiva1();
	s3.run(1,"jiegyanshu");
	Shiva1[] s2 =new Shiva1[2];
	s2[0]=s1;
	s2[1]=s3;
	
	}

}
class Shiva1 {
	int num;
	String name;
	public void run(int num,String name) {
		this.num=num;
		this.name =name;
		System.out.println(num+"  "+name);
	}
}
