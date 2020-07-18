public class AngryDuck extends WaterFowl implements Attacker, Teleporter
{
     private int killCount;
     public AngryDuck()
     {
          super();
          killCount = 0;
     }//end of AngryDuck()
     
     public AngryDuck(String name, String primaryColor)
     {
          super(name, primaryColor);
     }//end of AngryDuck()
     
     public void fly()
     {
          if(super.health==0)
          {
               System.out.println("Sorry, it cannot do that because it is dead");
          }
          else
          {
               super.isFlying = true;
               System.out.println(super.name + " is flying");
          }
     }//end of fly()
     
     public void swim()
     {
          if(super.health==0)
          {
               System.out.println("Sorry, it cannot do that because it is dead");
          }
          else
          {
               super.isFlying = false;
               System.out.println(super.name + " is swimming");
          }
     }//end of swim()
     
     // add from here !!!
     public void teleport (int x, int y)
     {
          if( x < HALF || x > WIDTH )
          {
               System.out.println(this.getName()+ " cant teleport,value x is out of range [500,1000]");
               return;
          }
          
          if( y > HEIGHT || y < 0 )
          {
               System.out.println(this.getName() + " cant teleport, value y is out of range [0,1000]");
               return;
          }
          Animal.x = x;
          Animal.y = y;
          System.out.println(getPosition());
          
     }//end of teleport()
     
          public String getPosition() 
     {
          return this.getName() + "'s position is:(" + x + "," + y +")";
     }//end of getPosition() 
     
                                                    /////////
      public void attack(HappyPig animal)
     {
          //int killCount;
          
          if (animal.getClass().getSimpleName().equals("LoudGoose"))
          {
               System.out.println("I cannot attack, it is my friend!!");
          }
          else
          {
               if(animal.health==1)
               {
                    animal.hit();
                    killCount++;
                    System.out.println(this.name + " got a Kill Point!!");
                    System.out.println("Kill points: " + this.getKillCount());
               }
               else 
               {
                    animal.hit();
               }
          }
          
     }//end of attack()
     
     public void attack(CuriousBunny animal)
     {
          //int killCount;
          
          if (animal.getClass().getSimpleName().equals("LoudGoose"))
          {
               System.out.println("I cannot attack, it is my friend!!");
          }
          else
          {
               if(animal.health==1)
               {
                    animal.hit();
                    killCount++;
                    System.out.println(this.name + " got a Kill Point!!");
                    System.out.println("Kill points: " + this.getKillCount());
               }
               else 
               {
                    animal.hit();
               }
          }
          
     }//end of attack()
     
     public void attack(LoudGoose animal)
     {
          //int killCount;
          
          if (animal.getClass().getSimpleName().equals("LoudGoose"))
          {
               System.out.println("I cannot attack, it is my friend!!");
          }
          else
          {
               if(animal.health==1)
               {
                    animal.hit();
                    killCount++;
                    System.out.println(this.name + " got a Kill Point!!");
                    System.out.println("Kill points: " + this.getKillCount());
               }
               else 
               {
                    animal.hit();
               }
          }
          
     }//end of attack()
     
     public void attack(AngryDuck animal)
     {
          //int killCount;
          
          if (animal.getClass().getSimpleName().equals("LoudGoose"))
          {
               System.out.println("I cannot attack, it is my friend!!");
          }
          else
          {
               if(animal.health==1)
               {
                    animal.hit();
                    killCount++;
                    System.out.println(this.name + " got a Kill Point!!");
                    System.out.println("Kill points: " + this.getKillCount());
               }
               else 
               {
                    animal.hit();
               }
          }
          
     }//end of attack()
     
     public int getKillCount()
     {
          return killCount;
     }//end of getKillCount()
     
}//end of class
