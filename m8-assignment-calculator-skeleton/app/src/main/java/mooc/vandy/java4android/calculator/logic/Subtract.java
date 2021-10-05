package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO -- start your code here
    private int margumentOne;
    private int margumentTwo;

    public Subtract(int argumentOne, int argumentTwo)
    {
        this.margumentOne=argumentOne;
        this.margumentTwo=argumentTwo;
    }

    public int getMargumentOne() {
        return margumentOne;
    }

    public int getMargumentTwo() {
        return margumentTwo;
    }

    public void setargumentOne(int argumentOne) {
        this.margumentOne = argumentOne;
    }

    public void setargumentTwo(int argumentTwo) {
        this.margumentTwo = argumentTwo;
    }
    public int calcSubtract()
    {
        return margumentOne-margumentTwo;
    }

    @Override
    public String toString() {
        return String.valueOf(calcSubtract());
    }
}
