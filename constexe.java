class Demo1{
    int a,b;
    public Demo1(){
        //super()
        System.out.println("parent claas constructor");
    }
    public Demo1(int x ,int y){
        //super()
        System.out.println("parameterized parent class constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1{
    int m,n;
    public Demo2(){
        //super()
        System.out.println("child class constructor");
    }
    public Demo2(int x, int y){
        //super()
        System.out.println("parameterized child class constructor");
        
    }
}
public class constexe{
      public static void main(String[]args){
        Demo2 d=new Demo2();
        Demo2 d2=new Demo2(10,20);

      }
}
