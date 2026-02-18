public class Main {
    public static void main(String[] args) {

        int n = 91;
        int xFactor = 4, yFactor = 3;

        int x = 0, sum = 0, r = 0;

        sum = n / xFactor;
        n = n / xFactor;

        do {
            r = n + x;
            sum = sum + r / yFactor;
            x = r % yFactor;
            n = r / yFactor;
        }
        while ((n + x) >= yFactor);

        System.out.println(sum);
    }
}

Output : 32
