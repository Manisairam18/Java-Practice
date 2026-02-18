public class Main {

    static int mystery(int a, int b) {
        return (a == 0) ? b :
               (b == 0) ? a :
               (a > b) ? mystery(a % b, b) :
                         mystery(a, b % a);
    }

    public static void main(String[] args) {
        System.out.println(mystery(6, 4));
    }
}

Output: 2
