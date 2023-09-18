import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.cert.X509CRLSelector;
import java.lang.reflect.Array;
public class GuessTheMovie {

    
public static void main(String[] args) throws FileNotFoundException 
{
    
   try (Scanner myInp = new Scanner(System.in)) {
    String [] lettersGuessed = new String [4];
    lettersGuessed[1] = "_";
    lettersGuessed[2] = "_";
    lettersGuessed[3] = "_";
        
        ReadFile myObj = new ReadFile();
        int guess = myObj.randomNumber();
    
        /*
        ReadFile myObj3 = new ReadFile();
        System.out.println(myObj3.movieGuess());
        */
    
        ReadFile myObj2 = new ReadFile();
    
        String [] movies = myObj2.movieTitles("movies.txt");
        String currentMovie =  movies[guess];
        String currentMovie2 =  movies[guess];
        
        //String currentMovie3 =  movies[guess];
        System.out.println(currentMovie);
    
                
    
        StringBuilder maskedTitle = new StringBuilder(currentMovie.replaceAll("[a-zA-Z]", "_"));

for(int j = 0; j < 4 ; j++){
    System.out.print("Please Guess: ");
    String userInp = myInp.nextLine();

    if(currentMovie2.contains(userInp)){
        lettersGuessed[j] = userInp;
        for(int k = 0; k < currentMovie.length(); k++){
            if(currentMovie.charAt(k) == userInp.charAt(0)){
                maskedTitle.setCharAt(k, userInp.charAt(0));
            }
        }
        System.out.println(maskedTitle);
    }
}

}

} 
}
