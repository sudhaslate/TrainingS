package object;
public class ConditionDemo {
    public static void main(String[] args) {

        int marks = 26;

        if (marks > 80) {
            System.out.println("Student Distinction");

        }  else if(marks>60) {

            System.out.println("First class");

        } else if(marks>35)  {

                System.out.println("Third class");
        } else {
            System.out.println("FAIL");
        }

    }
}
