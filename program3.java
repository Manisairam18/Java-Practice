public class Main {
    public static void main(String[] args) {

        int x = 0;

        for (int i = 0; i < 9; i++) {

            if (i % 2 == 0)
                x += i;
            else if (i % 3 == 0)
                x == i;     // this does nothing (comparison only)
            else
                x *= i;
        }

        System.out.println(x);
    }
}

Output: 260
