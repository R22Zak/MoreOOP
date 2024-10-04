
public class Elf extends Character {
    String name = "Elf";
    int hp=10;
    int power=10;
    @Override
    public void kick(Character c) {
        if (c.power<power){
            c.hp-=c.hp;
        }else{
            c.hp-=1;
        }
    }
    @Override
    public String toString(){
        return "Elf{hp="+hp+", power="+power+"}";
        }
}
