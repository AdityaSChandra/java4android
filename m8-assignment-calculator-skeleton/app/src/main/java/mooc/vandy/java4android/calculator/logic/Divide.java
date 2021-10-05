package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    private int margumentOne;
    private int margumentTwo;

    public Divide(int argumentOne, int argumentTwo)
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
    public String calcDivide()
    {
        if(margumentTwo==0)
        {
            return "Error: Argument Two should be a non-zero integer";
        }
        else
        {
            return String.valueOf(margumentOne/margumentTwo) + " R: " + String.valueOf(margumentOne%margumentTwo);
        }
    }

    @Override
    public String toString() {
        return calcDivide();
    }
}
