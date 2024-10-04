
public class Knight extends King{
    String name = "Knight";
    public Knight(){
        this.power=(int) (2+Math.random()*11);
        this.hp=(int) (2+Math.random()*11);
    }
}
