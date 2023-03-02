import java.util.Scanner;

class Umpire
{
    int numGuess;
    int numP1;
    int numP2;
    int numP3;
    


    public void getNumberFromGusser() 
    {
        Guesser gusser = new Guesser();
        numGuess = gusser.guessNumber();

    }

    public void getNumerFromPlayers() 
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numP1 = p1.guessNumber();
        numP2 = p2.guessNumber();
        numP3 = p3.guessNumber();
    }

    public void result() 
    {
       System.out.println(numGuess +" " + numP1 + " " + numP2 + " " + numP3 + " ");
       
       if(numGuess == numP1)
       {
        if(numGuess == numP2 && numGuess == numP3)
        System.out.println("All are the winners");

        else if (numGuess == numP2 )
        System.out.println(" Player 1 and Player 2 are the Winners ");

        else if(numGuess == numP3)
        System.out.println("Player 1 and Player 3 are the Winners ");

        else 
        System.out.println("Player 1 is the Winner ");

       }

       else if(numGuess == numP2)
       { 
        if(numGuess == numP3)
        System.out.println("Player 2 and Player 3 are winners");
        else 
        System.out.println("Player 2 is the Winner");
         }

         else if(numGuess == numP3)
         {
            System.out.println("Player 3 is the winner");
         }

         else 
         {
            System.out.println("Game lost try again ");
         }
    }

}

class Guesser
{
      int numGuess;
    public int guessNumber() 
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("Hey ! Guesser Guess the Number ");
        numGuess = scan.nextInt();

        return numGuess;
    }

}

class Player
{
 int guessNum;
    public int guessNumber() 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey ! Player Guess the Number ");
        guessNum = scan.nextInt();
        return guessNum;
    }

}

class LaunchGame
{
    public static void main(String[] args) 
    {
           Umpire umpire = new Umpire();
           umpire.getNumberFromGusser();
           umpire.getNumerFromPlayers();
           umpire.result();
    }
}