public class multpleParam {

public static double makeChange(double itemCost, double dollarsProvided)
{
    double calculatedChange;
    {
       calculatedChange = dollarsProvided - itemCost;
    }
    System.out.println("Total Change: $" + calculatedChange);
    return calculatedChange;
}
public static double absoluteValue(double input)
{
   
       if(input < 0)
       {
        System.out.println(input);
       }
       else
       {
         System.out.println(Math.abs(input));
       }
    
    
    return input;
}

public static double calculateTip(double x)
{
return (x*0.15) + x;
}
public static void main(String[] args) 
{
makeChange(22.5, 26.5);

absoluteValue(-27.776);
double now = calculateTip(15);
System.out.println(now);


} 
    
}