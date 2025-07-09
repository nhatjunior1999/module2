public class bai7_toantu {
    public static void main(String[] args) {
//        int a = 11;
//        int b = 5;
//        System.out.println(a + b);
//        System.out.println(a % b);
//        System.out.println((double) a / b);
        int i1 = 2;
        int i2 = 5;
        int i3 = -3;

        double d1 = 2.0;
        double d2 = 5.0;
        double d3 = -0.5;

        System.out.println("a) " + (i1 + (i2 * i3)));                  // 2 + (5 * -3) = -13
        System.out.println("b) " + (i1 * (i2 + i3)));                  // 2 * (5 + (-3)) = 4
        System.out.println("c) " + (i1 / (i2 + i3)));                  // 2 / (5 - 3) = 1
        System.out.println("e) " + ((double)i1 / i2 + i3));           // 2/5 = 0.4 → 0.4 + (-3) = -2.6
        System.out.println("g) " + (3 + 4 + 5 / 3));                   // 5/3 = 1 → 3 + 4 + 1 = 8
        System.out.println("i) " + ((3 + 4 + 5) / 3));                 // 12 / 3 = 4
        System.out.println("k) " + (d1 + (d2 * d3)));                  // 2.0 + (5.0 * -0.5) = -0.5
        System.out.println("l) " + (d1 + d2 + d3));                    // 2.0 + 5.0 + (-0.5) = 6.5
        System.out.println("m) " + (d1 / d2 - d3));                    // 2.0 / 5.0 = 0.4 → 0.4 - (-0.5) = 0.9
        System.out.println("n) " + (d1 / (d2 - d3)));                  // 2.0 / (5.5) ≈ 0.3636
        System.out.println("o) " + (d1 + d2 + d3 / 3));                // d3/3 = -0.1667 → 2+5-0.1667 = 6.8333
        System.out.println("p) " + ((d1 + d2 + d3) / 3));              // (2 + 5 + -0.5)/3 = 2.1667
        System.out.println("q) " + (d1 + d2 + (d3 / 3)));              // giống o
        System.out.println("r) " + (3 * (d1 + d2) * (d1 - d3)));       // 3 * 7 * (2.0 - (-0.5)) = 3 * 7 * 2.5 = 52.5
    }
}
