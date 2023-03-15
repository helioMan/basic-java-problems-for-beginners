public class andornot {
    public static void main(String[] args) {
        int x = 10, y = 6, z;
        z = x & y;
        System.out.println(z);

        int p = 0b1010;
        int q = 0b0110;
        int l = p & q;  
        int h = p | q;
        int f = p ^ p;
        System.out.println(l);
        System.out.println(h);
        System.out.println(f);
    }
}
