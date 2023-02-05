package object;

public class Switch {
    public static void main(String[] args) {
        char gender = 'M';
        switch (gender){
            case 'M':
                System.out.println("Male");
            case 'F':
                System.out.println("Female");
            default:
                System.out.println("Unknown");
        }

    }



}
