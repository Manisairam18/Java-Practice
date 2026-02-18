public class Main {

    public static void main(String[] args) {

        int x = 0;   // required for compilation

        for (int i = 0; i < 5; i++) {
            try {
                if (i % 2 == 0)
                    throw new Exception();
                x += 3;
            } catch (Exception e) {
                x += 5;
                continue;
            } finally {
                x += 2;
            }
        }

        System.out.println(x);
    }
}


Output : 31
