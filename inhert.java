class animal {
    public void eat(){
        System.out.println("animal eats everyday");
    }
}
class Tiger extends animal{
    //method eat is overridden
    //access specifier can never be decreased but can be increased visibility
    public void eat(){
        System.out.println("tiger hunts and eat");
    }
}
public class inhert{
    public static void main(String []args){
        Tiger t=new Tiger();
        t.eat();
    }

}


