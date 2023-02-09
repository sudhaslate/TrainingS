package inheritanceTypes;

class A{              //A is parent class
    int a;
    void display(){
        System.out.println(a);
    }
}
class B extends A{        //B child class of A
    int b;   void print(){
        System.out.println(b);
    }
}

class C extends B{  //C is child of B (so attains all properties of cls A as well)-MULTILEVEL INHERITANCE
    int c; void show(){
        System.out.println(c);
    }
}
public class Single {
    public static void main(String[] args) {
       /* A obja = new A();
        obja.a=10;
        obja.display();


        B objb = new B();
        objb.a=101;         //A
        objb.b=123;        //B

        objb.display();     //A
        objb.print();*/    //B

        C objc = new C();
        objc.a=23;
        objc.b=34;
        objc.c=45;

        objc.display();
        objc.print();
        objc.show();
    }
}
