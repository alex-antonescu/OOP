import java.io.*;
import java.util.*;

class Interval {
    private int lowerLimit;
    private int upperLimit;
    private int totalNumbersTested = 0;
    private int numbersContained = 0;

    public Interval(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public void testNumber(Double number) {
        totalNumbersTested++;
        if (number >= lowerLimit && number <= upperLimit) {
            numbersContained++;
        }
    }

    public void writeResults(PrintWriter writer) {
        double percentage = (totalNumbersTested == 0) ? 0 : ((double) numbersContained / totalNumbersTested) * 100;
        writer.printf("Interval [%d, %d]: %.2f%% numbers within the interval.%n", lowerLimit, upperLimit, percentage);
    }
}