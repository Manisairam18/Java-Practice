public class Main {

    static int countWays(int n, int max) {

        if (n == 0)
            return 1;

        int ways = 0;

        for (int i = Math.min(max, n); i >= 1; i--) {
            ways += countWays(n - i, i);
        }

        return ways;
    }

    public static void main(String[] args) {
        System.out.println(countWays(5, 6));
    }
}

Output : 7
