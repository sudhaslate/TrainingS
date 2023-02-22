package exceptions;

public class ExceptionExamples {
    public static void main(String[] args) {
        System.out.println("I love you");
        System.out.println("I hate you");
        int a = 200;
            System.out.println(a/4);
          //  System.out.println(a/0);//Throws exception -- Arithmetic exception

            String s= null;
       // System.out.println(s.length());//Throws Null point exception

        String x="abc";
        //int i=Integer.parseInt(x); //Number format exception

     //   int arr[]=new int[5];
       // arr[10]=100;   //ArrayIndexOut of Bounds Exception

            System.out.println("I like going out");
            System.out.println("I like to enjoy the weather");
        }
    }

    /*this statement below will stop the exception and run rest of the programm
    try
{
    statements;
}
 catch(Exception Type)
{
    statements;
        }
        */