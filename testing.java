import java.io.FileNotFoundException;
import java.lang.reflect.Array;

public class testing {
    public static void main(String [] args) throws FileNotFoundException {
        

      String [] arr = {"Michael", "Smith"};
      char [] ss = {'s', 'd', 't'};

      for (char x : ss){
        Array.setChar(ss, arr.length, '_');
        System.out.println(x);
      }

      for (int i = 0; i < arr.length; i ++){

        System.out.println(i);
      }


     
    }
}
