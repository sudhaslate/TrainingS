package methods;
//Parameters and return value
public class MethodCase4 {
    int x=23; int y=77;
    int sum(int a, int b){ return (a+b);}
    public static void main(String[] args) {
        MethodCase4 mc4=new MethodCase4();
        System.out.println(mc4.sum(234,456));
    }
}
