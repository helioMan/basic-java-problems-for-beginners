class forloop {
    public static void main(String[] args) {
        int a = 10;
        for (int i = 0; i < a; i++) {
            System.out.print(i + " ");
        }
        int b = 10;

        System.out.print("\n");

        for (int i = b - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }

        // infinite
        for (;;) {
            System.out.print("a");
        }
    }
}
