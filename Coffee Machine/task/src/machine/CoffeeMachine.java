package machine;
import java.util.*;
public class CoffeeMachine
{
    /*public static void amount(){
        Scanner sc=new Scanner(System.in);
        int coff=sc.nextInt();
        System.out.println("For "+coff+" cups of coffee you will need:");
        int water=200*coff;
        int milk=50*coff;
        int beans=15*coff;
        System.out.println(water+" ml of water");
        System.out.println(milk+" ml of milk");
        System.out.println(beans+" g of coffee beans");
    }*/
   /* public static void EnoughCoffee(){
        Scanner sc=new Scanner(System.in);
        int water=sc.nextInt();
        int milk=sc.nextInt();
        int beans=sc.nextInt();
        int cups=sc.nextInt();
        int reqwater=cups*200;
        int reqmilk=cups*50;
        int reqbeans=cups*15;
        int remwater=water-reqwater;
        int remmilk=milk-reqmilk;
        int rembeans=beans-reqbeans;
        int morewcups=remwater/200;
        int moremcups=remmilk/50;
        int morebcups=rembeans/15;
        int availwcups=water/200;
        int availmcups=milk/50;
        int availbcups=beans/15;
        int more=(morewcups<moremcups && morewcups<morebcups)?morewcups:(moremcups<morebcups?moremcups:morebcups);
        int avail=(availwcups<availmcups && availwcups<availbcups)?availwcups:(availmcups<availbcups?availmcups:availbcups);
        if(reqwater <= water)
        {
            if(remwater<200)
            {
                System.out.println("Yes, I can make that amount of coffee");
            }
            else
                {

                System.out.println("Yes, I can make that amount of coffee (and even "+more+" more than that)");
            }
        }
        else{

                System.out.println("No, I can make only " + avail + " cup(s) of coffee");
            }


    }*/
   public static void action()
   {
       int money = 550;
       int water = 400;
       int milk = 540;
       int beans = 120;
       int cups = 9;
       /*System.out.println("The coffee machine has:");
       System.out.println(water + " of water");
       System.out.println(milk + " of milk");
       System.out.println(beans + " of coffee beans");
       System.out.println(cups + " of disposable cups");
       System.out.println(money + " of money");*/
       Scanner sc = new Scanner(System.in);
       String action1;
       do
       {
           System.out.println("Write action1 (buy, fill, take, remaining, exit):");
           action1 = sc.next();
           if (action1.equals("buy"))
           {
               System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu ");

               int option=0;
               String y=sc.next();
               if(Character.isDigit(y.charAt(0)))
                   option=Integer.parseInt(y);
               switch (option)
               {
                   case 1:
                       if (water >= 250 && milk >= 16 && beans >= 4 && cups > 0)
                       {
                           System.out.println("I have enough resources, making you a coffee!");
                           water = water - 250;
                           beans = beans - 16;
                           money = money + 4;
                           cups = cups - 1;
                       }
                       else
                       {
                           if (water < 250)
                           {
                               System.out.println("Sorry, not enough water!");
                           }
                           else if (milk < 16)
                           {
                               System.out.println("Sorry, not enough milk!");
                           }
                           else if (beans < 4)
                           {
                               System.out.println("Sorry, not enough beans!");
                           }
                           else
                           {
                               System.out.println("Sorry, not enough cups!");
                           }
                       }
                       break;
                   case 2:
                       if (water >= 350 && milk >= 75 && beans >= 20 && cups > 0)
                       {
                           System.out.println("I have enough resources, making you a coffee!");
                           water = water - 350;
                           milk = milk - 75;
                           beans = beans - 20;
                           money = money + 7;
                           cups = cups - 1;
                       }
                       else if (action1.equals("remaining"))
                       {
                           if (water < 350) {
                               System.out.println("Sorry, not enough water!");
                           } else if (milk < 75) {
                               System.out.println("Sorry, not enough milk!");
                           } else if (beans < 20) {
                               System.out.println("Sorry, not enough beans!");
                           } else {
                               System.out.println("Sorry, not enough cups!");
                           }
                       }
                       break;
                   case 3:
                       if (water >= 200 && milk >= 100 && beans >= 12 && cups > 0)
                       {
                           System.out.println("I have enough resources, making you a coffee!");
                           water = water - 200;
                           milk = milk - 100;
                           beans = beans - 12;
                           money = money + 6;
                           cups = cups - 1;
                       }
                       else
                       {
                           if (water < 200)
                           {
                               System.out.println("Sorry, not enough water!");
                           }
                           else if (milk < 100)
                           {
                               System.out.println("Sorry, not enough milk!");
                           }
                           else if (beans < 12)
                           {
                               System.out.println("Sorry, not enough beans!");
                           }
                           else
                           {
                               System.out.println("Sorry, not enough cups!");
                           }
                       }
                       break;
                   default:
                       System.out.println("invalid");


               }
           }
           else if (action1.equals("fill"))
           {
               System.out.println("Write how many ml of water do you want to add:");
               int awater = sc.nextInt();
               System.out.println("Write how many ml of milk do you want to add:");
               int amilk = sc.nextInt();
               System.out.println("Write how many grams of coffee beans do you want to add:");
               int abeans = sc.nextInt();
               System.out.println("Write how many disposable cups of coffee do you want to add:");
               int acups = sc.nextInt();
               water = water + awater;
               milk = milk + amilk;
               beans = beans + abeans;
               cups = cups + acups;
           }
           else if (action1.equals("take"))
           {
               System.out.println("I gave you $" + money);
               money = 0;
           }
           else if(action1.equals("remaining")) {
               System.out.println("The coffee machine has:");
               System.out.println(water + " of water");
               System.out.println(milk + " of milk");
               System.out.println(beans + " of coffee beans");
               System.out.println(cups + " of disposable cups");
               System.out.println(money + " of money");
           }
       }while(!action1.equals("exit"));
   }
    public static void main(String[] args)
    {

       // amount();
        //EnoughCoffee();
        action();
    }
}
