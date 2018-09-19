package pkg364.dice.roller;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PokkeFe
 */
public class DiceRoller {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        String input, rollList;
        String[] inputSplit;
        int rolls, sides, roll, total;
        
        
        System.out.println("--- PokkeFe's Dice Roller ---\n");
        
        //Main Loop
        do {
            input = sc.nextLine();
            if(input.equals("exit")) break;
            
            rollList = "";
            total = 0;
            inputSplit = input.split("d");
            rolls = Integer.parseInt(inputSplit[0]);
            sides = Integer.parseInt(inputSplit[1]);
            
            for(int r = 0; r < rolls; r++){
                roll = roll(sides);
                total += roll;
                rollList = rollList.concat(roll + " ");
            }
            System.out.println(total + ": " + rollList);
            
        } while(run);
    }
    
    //Processes roll
    public static int roll(int sides){
        Random r = new Random();
        return r.nextInt(sides) + 1;
    }
    
    
}
