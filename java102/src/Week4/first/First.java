package Week4.first;

public class First {

   private String str;

    public First(String str){
        this.str = str;
    }

    private void showStr(){
        System.out.println(this.str);
    }

    void show(){
        this.showStr();
    }

    public void show2(){
        System.out.println(this.str);
    }
}
