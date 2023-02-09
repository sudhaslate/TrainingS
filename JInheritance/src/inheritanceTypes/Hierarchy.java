package inheritanceTypes;
class Parent{
    int a;
    void display(){
        System.out.println(a);
    }
}
class Child1 extends Parent{
    int x; void show(){
        System.out.println(x);
    }
}
class Child2 extends Parent{
    int y; void print(){
        System.out.println(y);
    }
}
public class Hierarchy {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.a=100;
        c1.x=89;
        c1.display();
        c1.show();

        Child2 c2= new Child2();
        c2.a=12;
        c2.y=23;
        c2.display();
        c2.print();

    }
}
