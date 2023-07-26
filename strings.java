public class strings {
    public static void main(String[]args){
        String s1=new String("pw");// in heap
        String s2=new String("pw");// in heap duplicates allowed
        String s3="pw";// in scp duplicates not allowed
        String s4="pw";
        System.out.println(s1==s2);// duplicate different address
        System.out.println(s3==s4);// no duplicate same address
        System.out.println(s1.equals(s3));// comparing the strings not the address
        //concat
        String s6=new String("pw");
        String s5=s6.concat("skill");
        System.out.println(s5+s6);


    }
    
}
