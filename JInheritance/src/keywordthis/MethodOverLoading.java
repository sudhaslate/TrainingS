package keywordthis;
//change the definition
//can be achieved without inheritance
public class MethodOverLoading {
  void add(int a, int b){               //1 method with parameters as int, int
      System.out.println(a+b);
  }
    void add(int a, double b){         //2  method with parameters as int, double
        System.out.println(a+b);
    }
    void add(double a, double b){         //3 method with parameters as double, double
        System.out.println(a+b);
    }
    void add(int a, int b,int c){        //4 method with parameters as int, int, int
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        MethodOverLoading ml = new MethodOverLoading();     //object
        ml.add(10,23);
        ml.add(23,3.45);
        ml.add(8.9, 9.99);
        ml.add(2,34,45);
    }
}
