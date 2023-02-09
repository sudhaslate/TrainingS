package constructors;
//There are 2 types of constructors
// 1.Default
//2.Parameterised


// 1.Default

public class ConstructorDemo {
    int x; int y;
    ConstructorDemo(){
        x=10; y=20;
    }
    void display(){
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        ConstructorDemo cm = new ConstructorDemo();
        cm.display();

    }
}

