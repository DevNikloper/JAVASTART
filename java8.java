import java.util.*;
public class java8{
    public static void main(String []args){
        int a[][]=new int [3][2];
        System.out.println("plz enter the elements of array");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for (int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }

        }
        System.out.println("displaying the elements of array");
        for (int num[]:a){
            for(int x:num){
                System.out.println(x);
            }

        }

    
}
}