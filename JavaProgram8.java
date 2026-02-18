public class Main {
    public static void main(String[] args) {

        int x = 0;

        for (int i = 0; i < 9; i++) {

            if (i % 2 == 0)
                x += i;
            else {
                if (i % 3 == 0)
                    x -= i;
                else
                    x *= i;
            }

            System.out.println(x);
        }
    }
}

Output: 
0
0
2
-1
3
15
21
147
155
