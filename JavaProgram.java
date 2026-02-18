public class Main {

    public static int compare(int a, int b, int iter) {
        if ((a + b + iter) % 2 == 0) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        int arr[] = {37, 67, 42, 16, 82, 93, 73, 45};
        int n = arr.length;
        int result = 0;

        for (int i = 0; i < n / 2; i++) {
            result = result + compare(arr[i], arr[n - 1 - i], i);
        }

        System.out.println(result);
    }
}

Output : 285
