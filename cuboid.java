import java.util.*;

class cuboid {
    public static void main(String[] args) {
        int length, breadth, height;
        int totalArea, volumeCuboid;

        try (Scanner sc = new Scanner(System.in)) {
            length = sc.nextInt();
            breadth = sc.nextInt();
            height = sc.nextInt();
        }

        totalArea = 2 * ((length * breadth) + (breadth * height) + (height * length));
        volumeCuboid = length * breadth * height;

        System.out.println("The area of cuboid is " + totalArea);
        System.out.println("The volume of cuboid is " + volumeCuboid);
    }
}
