import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = 0, b = 0;

        for (int i = 0; i < 3; i++) {
            char p1 = s.next().toUpperCase().charAt(0);
            char p2 = s.next().toUpperCase().charAt(0);

            if (p1 == 'R' && p2 == 'P') b++;
            else if (p1 == 'P' && p2 == 'R') a++;
            else if (p1 == 'P' && p2 == 'S') b++;
            else if (p1 == 'S' && p2 == 'P') a++;
            else if (p1 == 'S' && p2 == 'R') b++;
            else if (p1 == 'R' && p2 == 'S') a++;
        }

        if (a > b) System.out.println("p1 wins!");
        else if (a < b) System.out.println("p2 wins!");
        else System.out.println("Tie!");
    }
}
