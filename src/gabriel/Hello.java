package gabriel;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String type;
        Scanner scanner=  new Scanner(System.in);
        System.out.println("hello");

        type = scanner.nextLine();

        System.out.println(type);

        int x = 3;
        int y = 2;
        int  tot = x+y;

        System.out.println("tot is: " + tot);

    }
}
