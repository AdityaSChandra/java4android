package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO -- start your code here
    private int margumentOne;
    private int margumentTwo;

    public Multiply(int argumentOne, int argumentTwo)
    {
        this.margumentOne=argumentOne;
        this.margumentTwo=argumentTwo;
    }

    public int getargumentOne() {
        return margumentOne;
    }

    public int getargumentTwo() {
        return margumentTwo;
    }

    public void setargumentOne(int argumentOne) {
        this.margumentOne = argumentOne;
    }

    public void setargumentTwo(int argumentTwo) {
        this.margumentTwo = argumentTwo;
    }
    public int calcMultiply()
    {
        return margumentTwo*margumentOne;
    }

    @Override
    public String toString() {
        return String.valueOf(calcMultiply());
    }
}
