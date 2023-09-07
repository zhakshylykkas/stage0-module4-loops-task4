package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public static void main(String[] args) {
        printUntilButThird(9);
    }
    public static void printUntilButThird(int lastPrinted) {
        int count = 0;
        for (int i = 1; i <= lastPrinted; i++) {
            count++;
            if (count == 3) {
                count = 0;
                continue;
            }
            System.out.println(i);
        }
    }
}
