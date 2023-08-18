//Basic calculator

import java.util.Scanner;

public class type1problem6{
    public static void main(String [] args){
     double num1,num2;
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the numbers:");
     num1=sc.nextInt();
     num2=sc.nextInt();
     
     System.out.println("Enter the oparator(+,-,*,/):");
     char op=sc.next().charAt(0);
     double output = 0;
     
     switch(op){
         case '+':
             output=num1+num2;
             break;
             
         case '-':
             output=num1-num2;
             break;
        case '*':
            output=num1*num2;
            break;
        case '/':
            output=num1/num2;
            break;
        default:
        System.out.println("You enter wrong input");
     }
     System.out.println("The final result: ");
     System.out.println(num1 + " "+ op + " " + num2 + " = " + output);
    }
}
