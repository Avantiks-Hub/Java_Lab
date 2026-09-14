import java.util.Scanner;
class Student{
    String name;
    int age;

    void Display_info(){
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
    }
}
public class classprac {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        Student s1= new Student();

        System.out.println("Enter student name: ");
        s1.name=sc.next();

        System.out.println("Enter student age:");
        s1.age=sc.nextInt();

        Student s2= new Student();

        System.out.println("Enter student name: ");
        s2.name=sc.next();

        System.out.println("Enter student age:");
        s2.age=sc.nextInt();

        s1.Display_info();
        s2.Display_info();

        sc.close();
    }
}
