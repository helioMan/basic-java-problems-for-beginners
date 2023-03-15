class leftrightshift {
    public static void main(String[] args) {
        int x = -0b1010;
        int y;

        y = x << 1;
        System.out.println(y);
        int m = -0b1010;
        int h;

        h = m >> 1;
        int v = 0b1010;
        int d;

        d = v >>> 1;
        int e = ~v;
        // this gives us the 32 bit number that is 5
        System.out.println(String.format("%s", Integer.toBinaryString(h)));
        // when we right shift something, like >>>, for a negative number we get the
        // positive value and that positive value is not shown at MSB with a zero
        System.out.println(String.format("%32s", Integer.toBinaryString(d)));
        System.out.println(e);
    }
}