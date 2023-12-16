import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("put string = ");
        String i = sc.nextLine();
        boolean r = isValidPalindrome(i); 
        System.out.println("palindrome = " + r);

    }
    private static boolean isValidPalindrome(String str) {
        
        String a = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String b = new StringBuilder(a).reverse().toString();

        return a.equals(b);
    }
}