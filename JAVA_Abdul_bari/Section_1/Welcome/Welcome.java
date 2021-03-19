import java.util.Scanner;

/**
 * Welcome
 */
public class Welcome {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        String name;
        System.out.println("May I know your Name :");
        name = s.next();
        s.close();
        System.out.println("Welcome 2 " + name);

    }
}