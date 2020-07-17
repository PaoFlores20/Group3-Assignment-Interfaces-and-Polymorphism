/*Author: Paola Flores ID T00651883*/

public class AngryDuck extends WaterFowl
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
     
}//end of class
