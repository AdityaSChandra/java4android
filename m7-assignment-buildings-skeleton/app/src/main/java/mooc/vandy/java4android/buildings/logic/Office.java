package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {
       
    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices=0;

    public Office(int length,int width,int lotLength,int lotWidth)
    {
        super(length,width,lotLength,lotWidth);
        mBusinessName=null;
        mParkingSpaces=0;
        sTotalOffices+=1;
    }
    public Office(int length,int width,int lotLength,int lotWidth,String businessName)
    {
        super(length,width,lotLength,lotWidth);
        mBusinessName=businessName;
        mParkingSpaces=0;
        sTotalOffices+=1;
    }
    public Office(int length,int width,int lotLength,int lotWidth,String businessName,int parkingSpaces)
    {
        super(length,width,lotLength,lotWidth);
        mBusinessName=businessName;
        mParkingSpaces=parkingSpaces;
        sTotalOffices+=1;
    }
    public String getBusinessName()
    {
        return mBusinessName;
    }
    public int getParkingSpaces()
    {
        return mParkingSpaces;
    }
    public void setBusinessName(String businessName)
    {
        mBusinessName=businessName;
    }
    public void setParkingSpaces(int parkingSpaces)
    {
        mParkingSpaces=parkingSpaces;
    }
    @Override
    public String toString()
    {
        return "Business:" + (mBusinessName==null?" unoccupied":mBusinessName) +(mParkingSpaces==0?"": "; has"+mParkingSpaces+" parking spaces") + " (total offices: "+sTotalOffices+")" ;
    }
    @Override
    public boolean equals(Object o)
    {
        if(this==o) return true;
        if(!(o instanceof Office)||o==null) return false;
        Office office= (Office) o;
        return (getParkingSpaces()==office.getParkingSpaces())  && (calcBuildingArea()==office.calcBuildingArea());
    }
}
