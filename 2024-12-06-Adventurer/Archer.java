public class Archer extends Adventurer{
    private int mana;
    private int manaCapacity;
    private int arrowCount;

    public Archer(String name, int hp){
        super(name, hp);
        mana = 100;
        manaCapacity = 100;
        arrowCount = 10;
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
        other.applyDamage(damage);
        return getName() + " dealt " + damage + "hp on " + other.getName() + " with a normal attack";
    }

    public String support(Adventurer other){
        int heal = (mana/10);
        other.setHP(Math.min(other.getHP()+heal, other.getmaxHP()));
        return getName() + "healed " + other.getName() + " " + heal + " hp";
    }

    public String support(){
        int healme = (mana/10);
        setHP(Math.min(getHP()+healme, getmaxHP()));
        return getName() + " self healed " + healme + "hp";
    }

    public String specialAttack(Adventurer other){
        if(mana>20 && arrowCount>3){
            int damage = (int)(3*Math.sqrt(mana/arrowCount));
            other.applyDamage(damage);
            mana -= 30;
            arrowCount -= 3;
            return getName() + " dealt " + damage + "hp on " + other.getName() + " with a crazy attack";
        }
        else{
            return "insuffient mana or arrows";
        }
    }

  public int getArrow(){
      return arrowCount;
  }

}
