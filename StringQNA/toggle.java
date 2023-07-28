package StringQNA;

public class toggle {
    public static String togglestr(String s){
        String str="";
        for(int i=0;i<s.length();i++){// travserse a string
            char ch=s.charAt(i);
            char ch1=' ';
            if(Character.isUpperCase(ch)==true){
                str=str+Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)==true){
                str=str+Character.toUpperCase(ch);

            }
            int d=Character.compare(ch,ch1);
            if(d==0){
                str=str+" ";
            }
        }
        return str;
    }
    public static void main(String[]args){
        String str="i aM RaHuL";
        System.out.println(togglestr(str));
    }
    
}
