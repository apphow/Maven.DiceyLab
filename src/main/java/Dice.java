import java.util.Random;

public class Dice {
    public int numOfDice;

    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public Integer tossAndSum() {
        Random random = new Random();
        Integer sumOfToss = 0;

        for (int i = 0; i < numOfDice; i++) {
            sumOfToss += random.nextInt(6) + 1;
        }
        return sumOfToss;
    }
}

