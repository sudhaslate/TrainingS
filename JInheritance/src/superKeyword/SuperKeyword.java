package superKeyword;
//super keyword can be used to refer to immediate parent class instance variable
//super can be used to invoke immediate parent class method
//super() can be used to invoke immediate parent class constructor
public class SuperKeyword {
    String color="white";
    void eating(){
        System.out.println("Eating....");
    }
    SuperKeyword(){   //super() can be used to invoke immediate parent class constructor
        System.out.println("Animal is created");
    }
}

class Dog extends SuperKeyword{
    String color="Black"; // super keyword can be used to refer to immediate parent class instance variable
    Dog(){
        super(); // super() can be used to invoke immediate parent class constructor
        System.out.println("Dog is created");

    }
    void displaycolor(){
        System.out.println(color);
        System.out.println(super.color);
    }
    void eating(){   //super can be used to invoke immediate parent class method
        System.out.println("Eating Bread......");
        super.eating();
    }

}
