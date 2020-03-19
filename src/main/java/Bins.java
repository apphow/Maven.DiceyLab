public class Bins {
    private int startingNumberOfDie;
    private int totalPossibleSum;
    private int[] rollSums;

    public Bins(int startingNumberOfDie, int totalPossibleSum) {
        rollSums = new int[totalPossibleSum + 1];
    }

    public int getBin(int value) {
        return rollSums[value];
    }

    public void incrementBin(int value) {
        rollSums[value] = rollSums[value] + 1;
    }
}