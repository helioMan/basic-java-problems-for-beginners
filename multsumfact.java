class multsumfact {

    public static void main(String[] args) {

        // multiplication
        int a = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + a + " = " + (i * a));
        }

        // sum of n numbers
        int n = 5;
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " whole" + " numbers " + "is " + sum);

        // factorial
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("The factorial of n numbers is " + fact);
    }
}
