package Inheritance;

interface X{
    public void method1();
}
interface Y extends X{
    public void method2();
}
class Z implements Y{
    public void method1(){
        System.out.println("I am Method 1");
    }

    public void method2(){
        System.out.println("I am Method 2");
    }
}
class MultiLevelHeritance {
    public static void main(String[] args) {
        Z c1 = new Z();
        c1.method1();
        c1.method2();
    }
}