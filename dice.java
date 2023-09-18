public class dice {

    public static int rollDice(){

        double randomNumber = Math.random();

        randomNumber *= 8;
        randomNumber += 1;

        int randomInt = (int) randomNumber;

        return randomInt;
        
    }

    public static void main(String[] args) 
{
   int roll1 = rollDice();
   int roll2 = rollDice();

   System.out.println(roll1);
   System.out.println(roll2);
} 
}
