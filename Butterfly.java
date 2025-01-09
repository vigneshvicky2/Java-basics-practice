public class Butterfly {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int n = 5;

        for (int i = 1; i <= n; i++) {
            System.out.println("* ".repeat(i) + "  ".repeat(2*(n - i))  + "* ".repeat(i));
        }

        for (int i = n-1; i >= 1; i--) {
            System.out.println("* ".repeat(i) + "  ".repeat(2*(n - i)) + "* ".repeat(i));
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; // Convert from nanoseconds to milliseconds
        System.out.println("Runtime: " + duration + " ms");
    }
}
