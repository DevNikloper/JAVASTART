public class inc {
    public static void main(String []args){
        int a=5;
        int b=10;
        //b= a++ + ++a + ++a + a++ +--a +a--;
        //System.out.println(a);
        //System.out.println(b);
        int res=(a<b)?a:b;
        System.out.println(res);
    }
}
