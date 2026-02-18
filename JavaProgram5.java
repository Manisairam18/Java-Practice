public class Main {
    public static void main(String[] args) {

        int a = 4, b = 6;
        int x = 0;

        while (a-- > 0 || b-- > 0) {
            x += a + b;
        }

        System.out.println(x);
    }
}

Output : 24
