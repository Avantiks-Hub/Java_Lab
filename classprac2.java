class Student{
    String name;
    int age;
    
    public Student(String name,int age){ 
        this.name=name;
        this.age=age;
    }

    // public Student(){
    //     this.name="Unknown";
    //     this.age=0;
    // }

    public Student(){
        this("Unknown",0);
    }
    void display(){
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
    }
}
public class classprac2 {
    public static void main(String[] agrs){
        Student s1=new Student("Sanesh",15);
        Student s2=new Student();
        s2.name="Avantik";
        s2.age=20;
        s1.display();
        s2.display();
    }
}
