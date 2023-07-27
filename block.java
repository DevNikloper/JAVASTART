    class Info {
    static int a;//STATIC VARIABLE created in heap during loading of class
    static int b;
    int m;// NON STATIC VARIABLE      we cannnot use non static members in static family
    int n;
    static{// STATIC BLOCK
        System.out.println("control in static block");
        a=10;
        b=20;
    }
    {//NONSTATIC BLOCK
        System.out.println("control in non static block");
        m=30;
        n=40;
    }
    static void disp1(){// STATIC MEHTOD
        System.out.println("value of static variable"+a+" "+b);
    }
    void disp2(){//NONSTATIC METHOD
        System.out.println("value of non static variable"+m+ " "+ n);
    }
    
}
public class block{
    public static void main(String[] args) {
        Info d=new Info();
        Info.disp1();// static method no object needed
        d.disp2();// non static method object needed

    }
}
