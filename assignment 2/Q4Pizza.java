package assignment2;

/*
 Question 4
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Q4Pizza {
   String type;
   double unitPrice;
   int loyaltyPoints;
   int prepareTime;

   public Q4Pizza(String t, double price, int points, int time) {
       type = t;
       unitPrice = price;
       loyaltyPoints = points;
       prepareTime = time;
   }

   public Q4Pizza(String type ){
       if ( "DoubleCheese" == type ){
           this.unitPrice = 4.0;
           this.loyaltyPoints = 8;
           this.prepareTime = 2;
           return;
       }
       if ( "Gourmet" == type ){
           this.unitPrice = 3.0;
           this.loyaltyPoints = 7;
           this.prepareTime = 15;
           return;
       }
       if ( "MexicanGreenWave" == type ){
           this.unitPrice = 2.0;
           this.loyaltyPoints = 5;
           this.prepareTime = 18;
           return;
       }
       if ( "Margherita" == type ){
           this.unitPrice = 4.0;
           this.loyaltyPoints = 3;
           this.prepareTime = 7;
           return;
       }
       if ( "PeppyPaneer" == type ){
           this.unitPrice = 3.0;
           this.loyaltyPoints = 5;
           this.prepareTime = 11;
           return;
       }
       System.out.println( "Do not have this flavor, please choose another!" );
   }

   public void pizza(){
       this.type = "random";
       this.unitPrice = 3.0;
       this.loyaltyPoints = 8;
       this.prepareTime = 5;
   }

   public static void printTypeWithinTime(List<Q4Pizza> menu, int time) {
       for(int i = 0; i < menu.size(); i++) {
           Q4Pizza temp = menu.get(i);
           if(temp.prepareTime < time) {
               System.out.println(temp.type);
           }
       }
   }

   public static void main(String[] args) {
       Q4Pizza doubleCheese = new Q4Pizza("DoubleCheese", 4.0, 8, 2);
       Q4Pizza gourmet = new Q4Pizza("Gourmet", 3.0, 7, 15);
       Q4Pizza mexicanGreenWave = new Q4Pizza("MexicanGreenWave", 2.0, 5, 18);
       Q4Pizza margherita = new Q4Pizza("Margherita", 4.0, 3, 7);
       Q4Pizza peppyPaneer = new Q4Pizza("PeppyPaneer", 3.0, 5, 11);

       List<Q4Pizza> menu = new ArrayList<>(Arrays.asList(gourmet, doubleCheese, mexicanGreenWave, margherita, peppyPaneer));
       printTypeWithinTime(menu, 100);


   }
}

