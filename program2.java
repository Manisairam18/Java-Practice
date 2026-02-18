public class Main {
    public static void main(String[] args) {

        int a = 0;

        for (int i = 1; i <= 5; i++) {

            if ((i++ % 2 == 0) && (--i % 3 == 0)) {
                a += i * i;
                System.out.println("AB");
            }
            else if (++i % 3 == 0) {
                System.out.println("A");
                a += i + i;
            }
            else if (--i % 3 == 0) {
                System.out.println("B");
                a += i + 1;
            }
            else {
                System.out.println(i);
                a += i;
                a = i + i;
            }
        }

        System.out.println(a);
    }
}


Output : A
         4
         B
         15
