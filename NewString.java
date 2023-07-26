public class NewString {
    public static void main(String []args){
        //1st example
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());
        sb.append("s");
        System.out.println(sb.capacity());// (old+1)x2
        //2nd example
        StringBuffer s=new StringBuffer("NIKHIL");// we give text in string it adds up the capacity that is 22
        System.out.println(s.capacity());
        //3rd example
        StringBuffer b=new StringBuffer(100);// if we give integer it becomes its new capacity
        System.out.println(b.capacity());
        b.append("java");
        System.out.println(b);
        b.trimToSize();//capacity decreased that limited string
        System.out.println(b.capacity());
}
}