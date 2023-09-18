public class forLoops {

public static int countBlocks(int levels){
    int total = 0;
    for(int i = 0; i < levels; i++)
    {
        total = total + (i*i);
    }
    System.out.println(total);
    return total;
}
public static void main(String[] args) 
{
   
  for(int i = 20; i>= 0; i --)
  {
    System.out.println(i);
  }
  countBlocks(5);
} 
}
