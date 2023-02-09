package constructors;
//There are 2 types of constructors
//2.Parameterised
public class ConstructorDemo1 {
    int x; int y;
    ConstructorDemo1(int a, int b)
    { x=a; y=b;}
    void display(){
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        ConstructorDemo1 cm1 = new ConstructorDemo1(10,45);
        cm1.display();

    }
}

