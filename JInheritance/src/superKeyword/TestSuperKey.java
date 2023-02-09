package superKeyword;
public class TestSuperKey {
    public static void main(String[] args) {
        Dog d = new Dog(); //super keyword can be used to refer to immediate parent class instance variable
        d.displaycolor();   //Black
        d.eating(); // super can be used to invoke immediate parent class method
    }
}
