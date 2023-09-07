package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public static void main(String[] args) {
        printSumOfTwoRanges(3, 6);
    }
    public static void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) System.out.println("number to skip is bugger then the last");
        else if (lastInRow < 0) System.out.println("last number in row is negative");
        else {
            int sum = 0;
            for (int i = 0; i <= lastInRow; i++) {
                if (i == numberToSkip) {
                    System.out.println("skipped sum is " + (sum+i));
                    continue;
                }
                sum += i;
            }
            System.out.println("counted sum is " + sum);
        }
    }
}
