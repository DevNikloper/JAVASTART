//constructors   it solves the problem of setters and getters
class student{
    private int age;
    private String name;

    student(String name,int age){// initializing at time of object creation
        this.age=age;
        this.name=name;
    }
    student(String name){//constructor overloading
        this.name=name;
        age=19;
    }
    student(int age){//constructor overloading
        this.age=age;
        name="RAHUL";
    }
    public void display(){
        System.out.println(age + name);
    }
}
public class consta {
    public static void main(String []args){
        student stu=new student("Nikhil",10); //parameterized constructor
        student stu1=new student("Nikhil");//accepting only name
        student stu2=new student(10);// accepting only age
        stu.display();
        stu1.display();
        stu2.display();


    }
    
    
}
