public class Main {

    static int func(int n) {
        if (n <= 0)
            return 1;
        return n * func(n - 2);
    }

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 5; i > 0; i = func(i) % 2) {
            sum += i;
            if (sum > 15)
                break;
        }

        System.out.println(sum);
    }
}

Output: 16
