import java.util.*;
public class zero {
    public static void main(String []args){
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of m");
        m=sc.nextInt();
        int a=0;
        int indx=0;
        int n=m;
        while(n!=0){
            int d=n%10;
            if(d!=0){
                a+=(int) (d*Math.pow(10,indx));
                indx++;
             
            }
            n=n/10;
        }
        System.out.println("the number is" + a);
        sc.close();

    }
    
}
