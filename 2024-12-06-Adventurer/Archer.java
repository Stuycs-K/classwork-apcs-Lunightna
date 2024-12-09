public class Archer extends Adventurer{
    private int mana;
    private int manaCapacity;
    private int arrowCount;
    private int bowDurability;

    public Archer(String name, int hp){
        super(name, hp);
        mana = 100;
        manaCapacity = 100;
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
            if(mana>manaCapacity){
                mana = manaCapacity;
            }
        }
        else{
            mana = 0;
        }
    }

    public int getSpecialMax(){
        return manaCapacity;
    }

    public String attack(Adventurer other){
        int damage = (int)(Math.sqrt(mana/arrowCount));
        arrowCount--;
        bowDurability -= 10;
        return getName() + "dealt " + damage + " on " + other.getName() + " with a normal attack";
    }

    public String support(Adventurer other){
        int heal = (mana/10);
        return "healed " + other.getName() + " " + heal + " hp";
    }

    public String support(){
        int healme = (mana/10);
        setHP(getHP() + healme);
        bowDurability += 10;
        return "self-healed" + healme + ", increased bow durability by 10";
    }

    public String specialAttack(Adventurer other){
        if(mana>20){
            int damage = (int)(3*Math.sqrt(mana/arrowCount));
            other.applyDamage(damage);
            mana -= 30;
            bowDurability -= 50;
            return "dealt " + damage + " on " + other.getName() + " with a crazy attack";
        }
        else{
            return "insuffient mana";
        }
    }


}
