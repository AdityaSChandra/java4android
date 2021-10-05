package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
       
    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;

    public House (int length, int width, int lotLength, int lotWidth)
    {
        super(length, width, lotLength, lotWidth);
        mOwner=null;
        mPool=false;
    }
    public House(int length, int width, int lotLength, int lotWidth, String owner)
    {
        super(length, width, lotLength, lotWidth);
        mOwner=owner;
        mPool=false;

    }
    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool)
    {
        super(length, width, lotLength, lotWidth);
        mOwner=owner;
        mPool=pool;
    }
    public String getOwner()
    {
        return mOwner;
    }
    public boolean hasPool()
    {
        return mPool;
    }
    public void setOwner(String owner)
    {
        this.mOwner=owner;
    }
    public void setPool(boolean pool)
    {
        this.mPool=pool;
    }
    @Override
    public String toString()
    {
        return "Owner: " + (mOwner==null ? "n/a":mOwner) + (hasPool() ? "; has a pool":"") + (calcLotArea()>calcBuildingArea() ? "; has a big open space":"");
    }
    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if(!(o instanceof House)||o==null) return false;
        House house = (House) o;
        return (mPool == house.hasPool()) && (calcBuildingArea() == house.calcBuildingArea());
    }
}
