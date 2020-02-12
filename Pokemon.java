import java.util.Scanner;

public class Pokemon {
   Scanner sc = new Scanner(System.in);
   private String name;
   private int level;
   private int hp;
   //private String ansSleep;
   //private String ansEat;

   

      public Pokemon(){
         this.level = 1;
         this.hp = 100;
        // this.power = 100;
        // this.exp = 0;
      }
        public void setName(){
            System.out.print("Please Enter Your Pokemon Name:");
            this.name = sc.nextLine();

        }
        public void getName(){
            System.out.println(this.name);
        }
        public void setLevel(int level){
            this.level = level;

        }
        public void getLevel(){
            System.out.println(this.level);
        }
        public void setHp(int hp){
            this.hp = hp;
        }
        public void getHp(){
            System.out.println(this.hp);
         }
      
    public void sleepAndEat(){
        String ansSleep;
        
        System.out.println("Do you want to sleep?(Yes(Y) or No(N))");
        ansSleep = sc.nextLine();
            if(ansSleep.equals("Y"))
                System.out.println("...zzZZZ");
            else if
            (ansSleep.equals("N")){
                System.out.println("End Game, See you later");
            }
           
    }
    /*
    public void eatBerry(int berry){
        HP += 20;    
    }
     public void atk{
        MP -= 5;
     }
     public void levelUp{

     }
     public void status{

     }*/
   

}