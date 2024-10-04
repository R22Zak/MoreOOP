
public class Character {
    protected String name;
    protected int power;
    protected int hp;
    public void kick(Character c) {
        
    }
    public boolean isAlive() {
        return hp>0;
    }
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp<0){
            this.hp=0;
        }else{
        this.hp = hp;}
    }
    @Override
    public String toString(){
        if (this instanceof Elf){
        return "Elf{hp="+hp+", power="+power+"}";
        }
        if (this instanceof Hobbit){
            return "Hobbit{hp="+hp+", power="+power+"}";
        }
        if (this instanceof King){
            return "King{hp="+hp+", power="+power+"}";
        }
        return "Knight{hp="+hp+", power="+power+"}";
                 
    }
}

