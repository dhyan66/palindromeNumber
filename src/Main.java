import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       System.out.println("Enter the number to be checked for palindrome condition");
       int number = kb.nextInt();
       if(isPalindrome(number)){
           System.out.println(number+" is a palindrome number");
       }
       else {
           System.out.println(number+" is not a palindrome number");
       }
    }
    public static boolean isPalindrome(int x) {
        String originalNum = Integer.toString(x);
        StringBuilder reversedNum = new StringBuilder();
        int length = originalNum.length();
        for (int i = length-1; i>=0;i--){
            reversedNum.append(originalNum.charAt(i));
        }
        return reversedNum.toString().equals(originalNum);

    }


}