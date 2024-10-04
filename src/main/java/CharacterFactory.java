public class CharacterFactory {
    public Character createCharacter(){
        int ran=(int) (Math.random()*4);
        if (ran==0){
            return new Elf();
        }
        if (ran==1){
            return new Hobbit();
        }
        if (ran==2){
            return new Knight();
        }
        return new King();
        
    }
}

