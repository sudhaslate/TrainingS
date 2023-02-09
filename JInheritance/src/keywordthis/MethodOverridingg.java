package keywordthis;
//can change the body but definition should be same
//can be achieved only by inheritance
class Bank
{
    double rateOfInterest(){
        return 0;             //Body--can be changed
    }
}
class SBI extends Bank     //Bank is parent class and SBI is child class
{
    double rateOfInterest(){
        return 10.5;
    }
}
class ICICI extends Bank
{
    double rateOfInterest(){
        return 9.7;
    }
}
class Axis extends  Bank
{
    double rateOfInterest(){
        return 7.9;
    }
}
public class MethodOverridingg {
    public static void main(String[] args) {

    SBI sbi = new SBI();
    sbi.rateOfInterest();
        System.out.println(sbi.rateOfInterest());

        ICICI ic = new ICICI();
        ic.rateOfInterest();
        System.out.println(ic.rateOfInterest());

        Axis as = new Axis();
        as.rateOfInterest();
        System.out.println(as.rateOfInterest());
    }
}