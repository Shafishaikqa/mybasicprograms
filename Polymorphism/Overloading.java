package Polymorphism;
class X{
	public void x() {
		System.out.println("I am A");
	}
	public void x(int b) {
		System.out.println(b);
	}
	public void x(String b) {
		System.out.println(b);
	}
}
public class Overloading {
	public static void main(String[] args) {
		X o1 = new X();
		o1.x("ah");
	}
}
