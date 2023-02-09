package keywordthis;
public class MainMethodOverLoading {
    public void main(int x) {        //1
        System.out.println(x);
    }
    public void main(int x,int y){        //2
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        MainMethodOverLoading mml = new MainMethodOverLoading();

        mml.main(100);    //1
        mml.main(23,56);   //2
    }
}
