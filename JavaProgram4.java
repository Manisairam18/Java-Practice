public class Main {

    public static void main(String[] args) {

        int x = 0;

        outer:
        for (int i = 0; i < 5; i++) {

            middle:
            for (int j = 0; j < 5; j++) {

                inner:
                for (int k = 0; k < 5; k++) {

                    if (i == j && j == k) {
                        x += 5;
                        continue middle;
                    }

                    if (k > j && j > i) {
                        x += 6;
                        break outer;
                    }

                    x++;
                }

                x += 5;
            }

            x += 9;
        }

        System.out.println(x);
    }
}

Output :13

P
