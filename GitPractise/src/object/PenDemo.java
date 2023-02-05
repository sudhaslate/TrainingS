package object;
public class PenDemo {
    public static void main(String[] args) {
        Pen anyName = new Pen();
     anyName.write();

        anyName.anyBehaviour();

        System.out.println(anyName.inkType);

        String anyLocalVar = anyName.inkType;
        System.out.println(anyLocalVar);

    }

    }

