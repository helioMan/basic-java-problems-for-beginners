class incdec {
    public static void main(String[] args) {
        int x = 5, z;

        // pehle yahan pehla x hoga 5, fir ++x tak jaate hue, pehle wala 5 6 banega
        // left side mein , fir rigth wala banega 7.
        z = 2 * x++ + 3 * ++x;
        System.out.println(z);

        byte b = 6;
        b++;
        System.out.println(b);
    }
}
