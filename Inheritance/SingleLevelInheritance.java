package Inheritance;

interface Animal {
    public void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog Barks");
    }
}
class SingleLevelInheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
    }
}