class whiledowhile {
    public static void main(String[] args) {
        int a = 2;
        while (a != 10) {
            System.out.print(a + " ");
            a += 2;
        }
        System.out.println();
        int b = 20;
        do {
            System.out.print(b + " ");
            b *= 2;
        } while (b < 200);
    }
}
