package StringQNA;
import java.util.*;

    class word {
    public static String rev(String name){
        String words[]=name.split("\\s");
        String revword="";
        for (String x:words){
            StringBuilder sb=new StringBuilder(x);
            sb.reverse();
            revword+=sb.toString()+" ";

        }
        return revword;
    }
}
public class Reverse{                                                                                                                                                                                                                                                                                                               
    public static void main(String[]args){
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        System.out.println(word.rev(x));
        sc.close();

    }
}

