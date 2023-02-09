package keywordthis;

public class ConstructorOverLoading {
        ConstructorOverLoading(int a, int b)
        {
            System.out.println(a+b);
        }
        ConstructorOverLoading(int a, double b)
        {
            System.out.println(a+b);
        }
        ConstructorOverLoading (double a, double b)
        {
            System.out.println(a+b);
        }
        ConstructorOverLoading(int a, int b,int c)
        {
            System.out.println(a+b+c);
        }
        public static void main(String[] args) {
            ConstructorOverLoading co = new ConstructorOverLoading(10,20,45);
            //here parameters change everytime--based on parameters method type will be executed(choosen)
        }
    }


