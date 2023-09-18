public class arrays {

    public static double calculateAverage(double [] temperatures){
        int size = temperatures.length;
        double total = 0;
        for(int i = 0; i<size; i++ )
        {
            total += temperatures[i];

        }
        double average = total/size;
        return average;
        }
        public static String findLongestName(String [] names){

            int length = names.length;

            String longestName = names[0];

            for(int i = 1; i < length; i++)
            {
             if(names[i].length() > longestName.length()){
             
                longestName = names[i];
             }
            }
            return longestName;
        }
    public static void main(String[] args) 
{
    int [] numbers = {1, 2 , 4};
    String [] words = {"Marks", "Matthew","JOSHSMIHTJE"};
    System.out.println(numbers[0]);

    //Foreach loop unlike c#, there is no foreach key word
    for(String i : words)
    {
        System.out.println(i);
    }
 double [] trys = {75,73,72,80};
 System.out.println(calculateAverage(trys));
 System.out.println(findLongestName(words));

} 
}
