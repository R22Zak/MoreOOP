
class Hobbit extends Character{
    String name = "Hobbit";
    int power=0;
    int hp=3;
    public void kick(Character c) {
        toCry();
    }
    public void toCry(){
    }
    @Override
    public String toString(){
        return "Hobbit{hp="+hp+", power="+power+"}";
        }
}