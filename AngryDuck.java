/*Author: Paola Flores ID T00651883*/

public class AngryDuck extends WaterFowl implements Teleporter
{
     public AngryDuck()
     {
          super();
     }//end of AngryDuck(). 12122
     
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
    
      }//end of 
  
     
     public String getPosition() 
     {
          return this.getName() + "'s position is:(" + x + "," + y +")";
     }//end of 
}//end of class
