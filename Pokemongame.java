

public class Pokemongame{
     public static void main (String[] args){
        Pokemon p1 = new Pokemon(); 
        p1.setName();
        Pokemongame runPkm = new Pokemongame();
        runPkm.startPokemon(p1);
        p1.sleepAndEat();
        
        
        
    
    }
    public void startPokemon(Pokemon p){
        System.out.println("----------------Start pokemon game------------------");
        System.out.print("Name: ");
            p.getName();
        System.out.print("Level: ");
            p.getLevel();
        System.out.print("HP:");
            p.getHp();
        System.out.println("----------------------------------------------------");
    }

}