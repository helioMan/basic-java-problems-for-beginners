import java.util.*;

class areaheron {
    public static void main(String[] args) {
        int a, b, c;
        float semiPeremeter;
        double areaByHeron;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }

        semiPeremeter = (a + b + c) / 2f;

        areaByHeron = Math.sqrt((semiPeremeter * (semiPeremeter - a) * (semiPeremeter - b) * (semiPeremeter - c)));

        System.out.println("The are of the rectangle by Heron's formula is: " + String.format("%.2f", areaByHeron));
    }
}
