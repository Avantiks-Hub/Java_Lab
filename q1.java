import java.util.Scanner;
public class q1 {
    public static void main(String[] agrs){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        if (num%2==0 && num!=0){
            System.out.println("The number is even.");
        }
        else if(num==0){
            System.out.println("Number is neutral.");
        }
        else{
            System.out.println("Number is odd.");
        }
        sc.close();
    }
}
