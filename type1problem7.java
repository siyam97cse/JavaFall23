//Create a program to determine if a given string is a palindrome.

import java.util.Scanner;
 
public class type1problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input= sc.nextLine();
        
        if(isPalindrome(input))
        {
            System.out.println(input+" is a palindrome string");
        }
        else
        {
            System.out.println(input+" is not a palindrome string");
        }
    }
 
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    } 
}
