package Polymorphism;
class A{
	public void a() {
		System.out.println("I am a");
	}
}
class B extends A{
	//Override
	static int a = 50;
	public void a() {
		System.out.println("I am B");
	
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		B b1 = new B();
		b1.a();
		System.out.println(B.a);

	}
}
