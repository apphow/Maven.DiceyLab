import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testConstructorWithNumOfDice() {
        Dice dice = new Dice(100);

        Integer expected = 100;
        Integer actual = dice.numOfDice;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTossAndSum1() {
        Dice dice = new Dice(10);

        Integer expected = 10;
        Integer actual = dice.numOfDice;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTossAndSum2() {
        Dice dice = new Dice(1);

        Integer expected = 1;
        Integer actual = dice.numOfDice;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTossAndSum3() {
        Dice dice = new Dice(3);

        Integer expected = 3;
        Integer actual = dice.numOfDice;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTossAndSum4() {
        Dice dice = new Dice(2);

        Integer actualTossed = dice.tossAndSum();

        Assert.assertTrue(actualTossed >= dice.numOfDice && actualTossed < +dice.numOfDice * 6);
    }

    @Test
    public void testTossAndSum5() {
        Dice dice = new Dice(45);

        Integer actualTossed = dice.tossAndSum();

        Assert.assertTrue(actualTossed > +dice.numOfDice && actualTossed <= dice.numOfDice * 6);
    }
}