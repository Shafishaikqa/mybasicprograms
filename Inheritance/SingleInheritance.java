package Inheritance;
class A{
	public void a() 
	{
		System.out.println("I am Parent");
	}
}
class B extends A{
	public void b() {
		System.out.println("I am Child");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		B b1 = new B();
		b1.a();
	}
}
