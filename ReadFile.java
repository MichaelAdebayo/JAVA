
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;


public class ReadFile {
/*Make a method that returns an array of Strings
Then when the method is made I'll be able to return that 
array list in the main method.

*/

//Constructor that will make calling the object print out
 

  //Random number that will corespond with the List of movies in the file
  public int randomNumber(){
     double randomNumber = Math.random();

        randomNumber *= 25;
        randomNumber += 1;

        int randomInt = (int) randomNumber;

        return randomInt;
  }

//Method that will select the movie text file and put the movies in an array @movieTitles
    String[] movieTitles(String filePath) throws FileNotFoundException {
        File movieDatabase = new File("movies.txt");
        Scanner movieDatabaseScanner = new Scanner(movieDatabase);
        StringBuilder movieListReader = new StringBuilder();
        while (movieDatabaseScanner.hasNextLine()) {
            movieListReader.append(movieDatabaseScanner.nextLine());
            movieListReader.append("\n");
        }
        movieDatabaseScanner.close();
        return movieListReader.toString().trim().split("\n");
        

  }

  //Method that will make the movie filled with _
  String movieGuess() throws FileNotFoundException {
    int rand = randomNumber();
    String [] movies = movieTitles("movie.txt");
    String currentMovie = null;
    for(int i = 0 ; i < movies.length; i ++){
        if(i == rand){
            
            currentMovie = movies[rand];
            System.out.println(currentMovie);
            currentMovie = currentMovie.replaceAll("[a-zA-Z]", "_");
        }
}
    return currentMovie;
}


String ReturnGuess(String currentMovie) throws FileNotFoundException{
    for(int i = 0 ; i < 10; i ++){
    currentMovie = movieGuess();
//User Input
        try (Scanner scanner = new Scanner (System.in)) {

        System.out.println("Enter a Guess.");

        String input = scanner.nextLine();
        if(currentMovie.contains(input) == true){
          currentMovie =currentMovie.replaceAll("[a-zA-Z&&[^" + input +"]]", "_");
        }
        
     
    }
    

      }
    return currentMovie;
    
}
}
