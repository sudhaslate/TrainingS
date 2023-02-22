package exceptions;

public class ExceptionhandlingEx {
    public static void main(String[] args) {
        System.out.println("I love you");
        System.out.println("I hate you");
        int a = 200;
        System.out.println(a/4);


        /* try catch statement will execute only when there is Arithmetic exception
          one try can have multiple catch blocks
          In catch block if we don't know the exception just mention the word Exception and object 'e'
          try
          {statements;}
          catch(ArithmeticException e)
          {statements;}
          catch(NullPointException e)
          {statements;}
          catch(Exception e)
          {statements;}   */


      /* * try
        {
            System.out.println(a/0);//Throws exception -- Arithmetic exception
        }
        catch(ArithmeticException e)
        {
            System.out.println("I like going out");
        } */



        String s= null;
        // System.out.println(s.length());//Throws Null point exception

        String x="abc";
        //int i=Integer.parseInt(x); //Number format exception

        int arr[]=new int[5];
        // arr[10]=100;   //ArrayIndexOut of Bounds Exception

        System.out.println("I like to enjoy the weather");
    }
}

