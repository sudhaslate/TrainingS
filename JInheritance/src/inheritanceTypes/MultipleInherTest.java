package inheritanceTypes;

interface ABC{
    int x=200; void m1();
}
interface XYZ{
    int y=300; void m2();
}
interface EFG{
    int g=234; void m3();
}
public class MultipleInherTest implements ABC,XYZ,EFG{
    public void m1(){
        System.out.println(x);
    }
    public void m2(){
        System.out.println(y);
    }
    public void m3(){
        System.out.println(g);
    }
    public static void main(String[] args) {
        MultipleInherTest test= new MultipleInherTest();
        test.m1();
        test.m2();
        test.m3();

    }
}
