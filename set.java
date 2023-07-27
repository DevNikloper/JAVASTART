 class bug {
    private int age;
    private String name;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class set{
    public static void main(String[]args){
        bug obj=new bug();
        obj.setAge(10);
        obj.setName("Nikhil");
        int stuage=obj.getAge();
        System.out.println(stuage);

    }
}

