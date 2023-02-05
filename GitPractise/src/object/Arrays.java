package object;

public class Arrays {
    public static void main(String[] args) {

        /*int[] marks = new int[5];
        marks[0] = 20;
        marks[2] = 34;
        marks[1] = 56;
        marks[3] = 67;
        marks[4] = 87;
        System.out.println(marks[4]);
        for (int i = 0; i <= marks.length - 1; i++) {
            System.out.println(marks[i]);
        }*/

        //Enhanced for loop
//Ex:1
       /* int[] marks = new int[5];
        marks[0] = 20;
        marks[2] = 34;
        marks[1] = 56;
        marks[3] = 67;
        marks[4] = 87;
        for (int mark : marks){
            System.out.println(mark);
        }*/

        //Ex:2

        int[] marks = new int[5];
        marks[0] = 20;
        marks[2] = 34;
        marks[1] = 56;
        //marks[3] = 67;
        //marks[4] = 87;
        for(int mark: marks){
            System.out.println(mark);
        }
    }
}
