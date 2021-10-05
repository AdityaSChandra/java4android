package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    // TODO -- Fill your code in here
    public void setCorralGates(Gate[] gate, Random selectDirection)
    {
        int rn= selectDirection.nextInt(3)-1;
        mOut.println("Initial gate setup");
        for (int i=0 ; i<gate.length; i++)
        {
            gate[i].setSwing(rn);
            mOut.println("Gate "+i+": "+ gate[i].toString() );
        }

    }
    public boolean anyCorralAvailable(Gate[] corral)
    {
        for(int i=0 ; i<corral.length ; i++)
        {
            if(corral[i].getSwingDirection() == Gate.IN)
                return true;
        }
        return false;
    }
    public int corralSnails(Gate[] corral , Random rand)
    {
        int pasture=5;
        int attempt=0;
        do
        {
            int randomnumber = rand.nextInt(5)+1 ;
            int randomGate = rand.nextInt(corral.length);
            mOut.println(randomnumber + " are trying to move through corral " + randomGate);
            pasture-=corral[randomGate].thru(randomnumber);
            attempt++;
        }while (pasture > 0);
        mOut.println("It took "+attempt+" attempts to corral all of the snails.");
        return attempt;

    }

}
