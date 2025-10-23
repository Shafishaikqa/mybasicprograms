//MultiPle Inheritance
package interface1;

		interface A
		{
		    public void method1();
		}
		interface B {
		    public void method2();
		}
		class C implements B,A{
		    public void method1(){
		        System.out.println("I am Method 1");
		    }

		    public void method2(){
		        System.out.println("I am Method 2");
		    }
		}
		class Main
		{
		    public static void main(String[] args)
		    {
		        C c1 = new C();
		        c1.method1();
		        c1.method2();
		    }
		
	}

