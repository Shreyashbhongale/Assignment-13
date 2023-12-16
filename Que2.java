import java.util.Scanner;

public class Que2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("put String = ");
        String o = sc.nextLine();

        System.out.println("put char want replace ");
        char ch = sc.next().charAt(0);

        System.out.println("replace with ");
        char nch = sc.next().charAt(0);

        String r = rep(o, ch, nch);
        System.out.println(r);
    }

    static String rep(String t, char ch, char nch) {
        StringBuilder n = new StringBuilder();
        for (char c : t.toCharArray()) {
            if (c == ch) {
                n.append(nch);
            } else {
                n.append(c);
            }
    }
        return n.toString();
}
    
}