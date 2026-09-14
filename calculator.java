import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        System.out.println("Enter the operation you want to perform (+,-,/,%,*):");
        char op= sc.next().charAt(0);
        
        if (num2==0 && op!='/'){
            System.out.println("Not defined.");
        }
        else if(op=='/'){
            System.out.println("The division is: "+(num1/num2));
        }
        else if(op=='*'){
            System.out.println("The Multiplication is: "+(num1*num2));
        }
        else if(op=='+'){
            System.out.println("The addition is: "+(num1+num2));
        }
        else if (op=='-') {
            System.out.println("The subtraction is: "+(num1-num2));
        }
        else if(op=='%'){
            System.out.println("The Modulus is: "+(num1%num2));
        }else{
            System.out.println("Invalid operator input!");
        }

        // switch (op) {
        //     case "+":
        //         System.out.println("The addition is: "+(num1+num2));
        //         break;

        //     case "-":
        //         System.out.println("The subtraction is: "+(num1-num2));
        //         break;

        //     case "*":
        //         System.out.println("The Multiplication is: "+(num1*num2));
        //         break;

        //     case "/":
        //         if (num2==0){
        //             System.out.println("Not defined.");
        //         }
        //         else{
        //             System.out.println("The division is: "+(num1/num2));
        //         }
        //         break;

        //     case "%":
        //         System.out.println("The Modulus is: "+(num1%num2));
        //         break;

        //     default:
        //         System.out.println("Invalid operator input!");
        //         break;
        // }

        sc.close();

    }
}
