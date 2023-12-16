import java.util.Scanner;

public class Que5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("put String = ");
        String s = sc.nextLine();
        
        String[] w = s.split("\\s+");

        StringBuilder rev = new StringBuilder();
        for (int i = w.length - 1; i >= 0; i--) {
            rev.append(w[i]).append(" ");
        }

        System.out.println("Reverse = " + rev.toString().trim());
    }
}
