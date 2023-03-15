import java.util.*;

class quadratic {
    public static void main(String[] args) {
        int a, b, c;
        double r1;
        double r2;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }

        r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.println("The roots are: " + r1 + " and " + r2);
    }
}
