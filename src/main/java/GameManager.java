
public class GameManager {
    public void fight(Character c1, Character c2){
        while (c1.isAlive() && c1.isAlive()){
            if (c1 instanceof Hobbit&&c2  instanceof Hobbit){
                System.out.println("2 Hobits will always live in peace");
                break;
            }
            System.out.println(c1.name+" atacks "+c2.name);
            int old1_hp=c1.hp;
            c1.kick(c2);
            if (c1 instanceof Hobbit){
                System.out.println("Hobbit start crying");
            }else{
                System.out.println(c1+" hurt "+ c2 +" on "+(old1_hp-c2.hp)+" hp");
            }
            System.out.println(c2.name+" atacks "+c1.name);
            int old2_hp=c1.hp;
            c2.kick(c1);
            if (c2 instanceof Hobbit){
                System.out.println("Hobbit start crying");
            }else{
                System.out.println(c2+" hurt "+ c1 +" on "+(old2_hp-c1.hp)+" hp");
            }
        }
        if (c1.isAlive()&&c2.isAlive()==false){
            System.out.println(c1.name+" win the "+c2.name);
        }
        if (c2.isAlive()&&c1.isAlive()==false){
            System.out.println(c2.name+" win the "+c1.name);
        }
    }    
}
