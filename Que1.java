import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("put string = ");
        String input = sc.nextLine();
        String com = compressString(input);
        System.out.println("Compressed = " + com);
    }
    private static String compressString(String input) {
        StringBuilder c = new StringBuilder();
        int count = 1;
        for (int i = 0; i < input.length(); i++) { 
            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                c.append(input.charAt(i));
                if (count > 1) {
                    c.append(count);
                }
                count = 1;
            }
        }
        return c.toString();
    }
}