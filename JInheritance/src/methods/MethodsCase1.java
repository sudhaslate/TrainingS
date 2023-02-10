package methods;
//  No Parameters and No Return Value
public class MethodsCase1 {

    int x=10; int y =54;
    void sum(){
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        MethodsCase1 mc = new MethodsCase1();
        mc.sum();
    }
}
