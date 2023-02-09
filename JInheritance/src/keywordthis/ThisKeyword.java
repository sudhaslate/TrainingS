package keywordthis;
public class ThisKeyword {
     int a,b;
        void getValues(int a, int b)
        {       this.a = a;
                this.b = b; }
        void printValues()
    {   System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        ThisKeyword th = new ThisKeyword();
        th.getValues(100,289);
        th.printValues();
    }
}
