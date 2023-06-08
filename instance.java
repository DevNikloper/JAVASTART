public class  instance{
    int a=0;
    String name="Nikhil";
    public static void main(String []args){
        instance obj1=new instance();
        instance obj2=new instance();
        obj2.name="Rahul";
        System.out.println(obj2.name);
        System.out.println(obj2.a);
        System.out.println(obj1.a);
        System.out.println(obj1.name);

    }
}