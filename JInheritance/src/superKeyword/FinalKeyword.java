package superKeyword;

// 1.Variable: You cannot change the value of the variable
// 2.Method: method cannot be oerrid in the child classes
// 3.Class:

public class FinalKeyword {
    /*final*/ int speed=80;     //final variable,so we cannot change this variable
    public static void main(String[] args) {
        FinalKeyword fk = new FinalKeyword();
        fk.speed=78;     //compile time error
        System.out.println(fk.speed);
    }
}
