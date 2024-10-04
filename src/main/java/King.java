

public class King extends Character{
    String name = "King";
    public King(){
        this.power=(int) (5+Math.random()*11);
        this.hp=(int) (5+Math.random()*11);
    }
    public void kick(Character c) {
            c.hp-=power;
    }
}
