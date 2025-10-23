package Inheritance;
class GrandParent{
	public void a() {
		System.out.println("I am GrandParent");
	}
}
class Parent1 extends GrandParent{
	public void b() {
		System.out.println("I am Parent");
	}
}
class Child extends Parent1{
	public void c() {
		System.out.println("I am Child");
	}
}
public class MultiLevel{
	public static void main(String[] args) {
		//Upcasting
		Parent1 c1 = (Parent1) new Child();
		c1.a();
		//Downcasting
		Child c2 = (Child) c1;
		c2.c();
	}
}
