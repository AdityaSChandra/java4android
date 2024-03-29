package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size)
    {    int r=2*size+1;
         int c=2*size+2;

        // TODO -- add your code here
        for(int i=1; i<=r;i++)
            for(int j=1;j<=c;j++)
            {
                if(j==1)
                {
                    if(i==1||i==r)
                    {
                        mOut.print("+");
                    }
                    else
                    {
                        mOut.print("|");
                    }
                }
                if(j==c)
                {
                    if(i==1||i==r)
                    {
                        mOut.println("+");
                    }
                    else
                    {
                        mOut.println("|");
                    }
                }
                if(j>1 && j<c)
                {
                    if(i==1||i==r) {
                        mOut.print("-");
                    }
                    else if(i==r/2+1) {
                        if (j == c / 2 + 1 - size) {
                            mOut.print("<");
                        } else if (j == c / 2 + size) {
                            mOut.print(">");
                        }
                        else {
                            if (i % 2 == 0) {
                                mOut.print("=");
                            } else {
                                mOut.print("-");
                            }
                        }
                    }
                    else if(i<r/2+1)
                    {
                        if(j==c/2-i+2)
                        {
                            mOut.print("/");
                        }
                        else if(j==c/2+i-1)
                        {
                            mOut.print("\\");
                        }
                        else if(j<c/2-i+2||j>c/2+i-1)
                        {
                            mOut.print(" ");
                        }
                        else
                        {
                            if (i % 2 == 0) {
                                mOut.print("=");
                            } else {
                                mOut.print("-");
                            }
                        }

                    }
                    else
                    {
                        if(j==c/2+i-(r-1))
                        {
                            mOut.print("\\");
                        }
                        else if(j==c/2-i+(r-1)+1)
                        {
                            mOut.print("/");
                        }
                        else if(j<c/2+i-(r-1)||j>c/2-i+(r-1)+1)
                        {
                            mOut.print(" ");
                        }
                        else
                        {
                            if (i % 2 == 0) {
                                mOut.print("=");
                            } else {
                                mOut.print("-");
                            }
                        }
                    }
                }

            }



    }
}
