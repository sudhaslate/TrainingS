package methods;
// No Parameters but returns value
public class MethodsCase2 {
    int x = 19;    int y = 33;
    int sum() { return (x + y); }
    public static void main(String[] args) {
        MethodsCase2 mc2 = new MethodsCase2();
        int res = mc2.sum();
        {
            System.out.println(res);
            // or System.out.println(mc2.sum());
        }
    }
}
