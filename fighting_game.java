import java.util.Random;
import java.util.Scanner;

public class fighting_game{
    public static void main (String[] args) throws InterruptedException{
        Random roll = new Random();
        Scanner enter = new Scanner(System.in);

        int pHealth = 20;
        int cHealth = 20;
        int round = 0;

        System.out.println("You entered a battle!");

        System.out.println("Your health: "+pHealth);
        System.out.println("Enemy health: "+cHealth);
        Thread.sleep(800);
        System.out.println();

        while (pHealth > 0 && cHealth > 0){
            round++;
            System.out.println("Round "+round);

            System.out.println("Press ENTER to attack!");
            enter.nextLine();
            
            System.out.println("Your turn");
            int pRoll = roll.nextInt(11);
            int cRoll = roll.nextInt(11);
            int damage = Math.max(pRoll - cRoll, 0);
 
            if(damage > 0){
                System.out.println("The enemy took "+damage+" damage!");
                cHealth -= damage;
            }
            else{
                System.out.println("You missed!");
            }
            Thread.sleep(800);
            System.out.println();

            System.out.println("Enemy's turn");
            pRoll = roll.nextInt(11);
            cRoll = roll.nextInt(11);
            damage = Math.max(cRoll - pRoll, 0);
            
            if(damage > 0){
                System.out.println("You took "+damage+" damage!");
                pHealth -= damage;
            }
            else{
                System.out.println("The enemy missed!");
            }
            Thread.sleep(800);
            System.out.println();

            if(pHealth <= 0){
                System.out.println("GAME OVER");
                break;
            }
            if(cHealth <= 0){
                System.out.println("You Won!");
                break;
            }

            System.out.println("Your health: "+pHealth);
            System.out.println("Enemy health: "+cHealth);
            Thread.sleep(800);
            System.out.println();
        }
    }
}