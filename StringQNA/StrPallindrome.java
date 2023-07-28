package StringQNA;

public class StrPallindrome {
    public static void Pallindrome(String s){
        String rs="";
        for (int i=(s.length()-1);i>=0;i--){
            rs=rs+s.charAt(i);
        }
        
        if((s.toLowerCase()).equals(rs.toLowerCase())){
            System.out.println("pallindrome");
        }
        else{ 
         System.out.println("not pallindrome");
        }


        }
    public static void main(String []args){
        String s1="Radar";
        Pallindrome(s1);


    }

    }

    

