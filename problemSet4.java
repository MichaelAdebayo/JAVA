
public class problemSet4 {

//Question 2
public static int factorial(int n) {
int factorial = 1;
for (int i = 1; i <= n; i++) {
factorial = factorial * i;
}
System.out.println(factorial);
return factorial;
}

//Question 3

public static int indexOfFirstOccurrence(String[] stringArray, String target)
{

return -1;
}


//Question 4
public static int yearsTilOneMillion(double initialBalance) {
double million = 1000000; 
int years = 0;


while(initialBalance < million)
{
 if (initialBalance < million)
 {
 initialBalance = initialBalance * 1.05;
 years ++;
 }
}
System.out.println(years);
return years;
}

//Question 5
public static void printInReverse(String[] stringArray) {
  for (String i : stringArray) 
  System.out.println(i);
}

//Question 6
public static int findRange(int[] intArray) {
    int maxValue = intArray[0];
    int minValue = intArray[0];
    int range = 0;
    if(intArray.length == 0){
        return -1;
    }
//Looping through the array to find the smallest value and setting it to the minValue
    for (int i = 0; i < intArray.length; i ++){
        if (intArray[i] < minValue){
            minValue = intArray[i];
        }
//Looping through the array to find the largest value and setting it to the maxValue
        if (intArray[i] > maxValue){
            maxValue = intArray[i];
        }
        range = maxValue - minValue;
    }
System.out.println(range);
return range;
}

//Question 8
public static int  monopolyRoll(){

        double randomNumber = Math.random();

        randomNumber *= 6;
        randomNumber += 1;

        int randomInt = (int) randomNumber;

        if (randomNumber != randomNumber){
            double sum;
        }
        return randomInt;
        
    }

public static void main(String[] args) 
{
yearsTilOneMillion(5);
factorial(5);
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
printInReverse(cars);
int[] test = {12,34,56,2};
findRange(test);
} 
}
