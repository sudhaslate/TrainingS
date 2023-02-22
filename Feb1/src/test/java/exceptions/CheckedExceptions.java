package exceptions;

public class CheckedExceptions {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("Program started");
        System.out.println("Program is in Progress");

      /* try {
           }
       catch(InterruptedException e)
       {
           }*/
        Thread.sleep(500);

        System.out.println("Program completed");
    }
}


