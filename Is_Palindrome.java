//Just a prgram to check if a no is palindrome or not
// palindrome no is a number which reads same from back and front eg - 12221
import java.util.*;

class Is_Palindrome {
   public static void main(String args[]) {
      String original, reverse = ""; // Objects of String class
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string/number to check if it is a palindrome");
      original = in.nextLine();
      int length = original.length();
      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + original.charAt(i);
      if (original.equals(reverse))
         System.out.println("Its palindrome.");
      else
         System.out.println("This isn't palindrome.");
   }
}
