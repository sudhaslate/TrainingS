package interfaces;

// 1.An interface in Java is a blueprint of a class
//2.Interface contains final & static variable, also contain abstract method(method having def. not body)
//3.Methods in interface are public by default
//4.Interface supports functionality of multiple inheritance
//5.We can define interface with interface keyword
//6.A class extends another class, an interface extends another interface BUT class implements an interface
//7.We can create object reference for interface BUT we cannot instantiate interface

interface A{
    int a=30;  //by default varaible in interface are static and final
    void m1();  //abstract method-by default its public

}
public class Test implements A {
    public void m1() {
        System.out.println(a);
    }

    public static void main(String[] args) {
      /*  Test t = new Test();
        t.m1();*/
        A a=new Test();
        a.m1();
    }
}