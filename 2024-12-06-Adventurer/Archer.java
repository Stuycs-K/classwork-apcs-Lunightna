public class Archer extends Adventurer{
    private int mana;
    private int arrowCount;
    private int bowDurability;

    public Archer(String name, int hp){
        super(name, hp);
        mana = 100;
        arrowCount = 10;
        bowDurability = 100;
    }

    public String getSpecialName(){
        return "Infinity Hood";
    }

    public int getSpecial(){
        return mana;
    }

    public void setSpecial(int n){
        if(mana>0){
            mana = n;
        }
        else{
            mana = 0;
        }
    }

    public int getSpecialMax(){
        return 1000000;
    }
}
