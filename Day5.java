public class Day5 {
    public static void main(String[] args) {
        //recursion
        public class Main {
        public static int sum(int k) {
            if (k > 0) {
            return k + sum(k - 1);
            } else {
            return 0;
            }
        }

        public static void main(String[] args) {
            int result = sum(10);
            System.out.println(result);
        }
        }

        public class Main {
        public static int sum(int start, int end) {
            if (end > start) {
            return end + sum(start, end - 1);
            } else {
            return end;
            }
        }

        public static void main(String[] args) {
            int result = sum(5, 10);
            System.out.println(result);
        }
        }

        public class Main {
            static void countdown(int n) {
                if (n > 0) {
                System.out.print(n + " ");
                countdown(n - 1);
                }
            }

            public static void main(String[] args) {
                countdown(5);
            }
            }

        public class Main {
        static int factorial(int n) {
            if (n > 1) {
            return n * factorial(n - 1);
            } else {
            return 1;
            }
        }

        public static void main(String[] args) {
            System.out.println("Factorial of 5 is " + factorial(5));
        }
        }

    }
}
