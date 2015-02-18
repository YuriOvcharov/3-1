/**
 * Created by student on 18.02.2015.
 */
public class main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int n;
            n = i + 1;
            if (((n % 5) == 0) && (n % 7) == 0) {
                System.out.println("ABBA");

            } else if (n % 5 == 0) {
                System.out.println("A");
            } else if ((n % 7) == 0) {
                System.out.println("B");
            } else {
                System.out.println(n);
            }


        }


    }
}
