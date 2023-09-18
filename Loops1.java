public class Loops1 {

public static int rollDice(){

        double randomNumber = Math.random();

        randomNumber *= 5;
        randomNumber += 1;

        int randomInt = (int) randomNumber;

        return randomInt;
        
    }
public static int  keepRolling(){

    int dice1 = rollDice();
    int dice2 = rollDice();
    int count = 1;

   while (dice1 != dice2) {
     dice1 = rollDice();
     dice2 = rollDice();
     count++;
   }
   return count;

}


public static void main(String[] args) 
{
  System.out.println(rollDice());
  System.out.println(rollDice());
  System.out.println(keepRolling());
} 
}
