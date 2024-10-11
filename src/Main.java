import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        String declareEnd = "Y";
        String menuChoice;
        String player2;
        String menu = "Player 1:Enter R for Rock, P for Paper, or S for Scissors.";


        do
            {
                System.out.println(menu);
                if( scan.hasNext() )
                {
                    menuChoice = scan.next();
                    scan.nextLine();

                    if( menuChoice.equalsIgnoreCase( "R" ) )
                    {
                        System.out.println("Player 2:Enter R for Rock, P for Paper, or S for Scissors.");
                        player2 = scan.next();
                        scan.nextLine();
                        if( player2.equalsIgnoreCase( "R" ) )
                        {
                            System.out.println("Its a Tie!");
                            System.out.println("Want to play again [Y/N]?");
                            declareEnd = scan.next();
                        }
                        else if( player2.equalsIgnoreCase( "P" ) )
                        {
                            System.out.println("Player 2 wins" );
                            System.out.println("Want to play again [Y/N]?");
                            declareEnd = scan.next();

                        }
                        else if( player2.equalsIgnoreCase( "S" ) )
                        {
                            System.out.println( "Player 1 wins" );
                            System.out.println("Want to play again [Y/N]?");
                            declareEnd = scan.next();
                        }
                        else
                        {
                            System.out.println( "ERROR\nYou entered " + player2 + "\nYou must choose R,P, or C" );
                        }
                    }
                    else if( menuChoice.equalsIgnoreCase( "P" ) )
                    {
                        System.out.println("Player 2:Enter R for Rock, P for Paper, or S for Scissors.");
                        player2 = scan.next();
                        scan.nextLine();
                        if( player2.equalsIgnoreCase( "R" ) )
                        {
                            System.out.println("Player 1 wins");
                            System.out.println("Want to play again [Y/N]?");
                            declareEnd = scan.next();
                        }
                        else if( player2.equalsIgnoreCase( "P" ) )
                        {
                            System.out.println("Its a tie!" );
                            System.out.println("Want to play again [Y/N]?");
                            declareEnd = scan.next();

                        }
                        else if( player2.equalsIgnoreCase( "S" ) )
                        {
                            System.out.println( "Player 2 wins" );
                            System.out.println("Want to play again [Y/N]?");
                            declareEnd = scan.next();
                        }
                        else
                        {
                            System.out.println( "ERROR\nYou entered " + player2 + "\nYou must choose R,P, or C" );
                        }

                    }
                    else if( menuChoice.equalsIgnoreCase( "S" ) )
                    {
                        System.out.println("Player 2:Enter R for Rock, P for Paper, or S for Scissors.");
                        player2 = scan.next();
                        scan.nextLine();
                        if( player2.equalsIgnoreCase( "R" ) )
                        {
                            System.out.println("Player 2 wins");
                            System.out.println("Want to play again [Y/N]?");
                            declareEnd = scan.next();
                        }
                        else if( player2.equalsIgnoreCase( "P" ) )
                        {
                            System.out.println("Player 1 wins" );
                            System.out.println("Want to play again [Y/N]?");
                            declareEnd = scan.next();

                        }
                        else if( player2.equalsIgnoreCase( "S" ) )
                        {
                            System.out.println( "Its a tie" );
                            System.out.println("Want to play again [Y/N]?");
                            declareEnd = scan.next();
                        }
                        else
                        {
                            System.out.println( "ERROR\nYou entered " + player2 + "\nYou must choose R,P, or C" );
                        }
                    }
                    else
                    {
                        System.out.println( "ERROR\nYou entered " + menuChoice + "\nYou must choose R,D, or I" );
                    }
                }

            }
            while(declareEnd.equalsIgnoreCase( "Y" ));
                //quits prog
    }
}


//Class RockPaperScissors
//
//main()
//
//
//
//String declareEnd = "Y"
//
//String player1
//
//String player2
//
//
//
//while declareEnd == "Y"
//
//
//
//output "Player 1:Enter R for Rock, P for Paper, or S for Scissors."
//
//input player1
//
//output "Player 2:Enter R for Rock, P for Paper, or S for Scissors"
//
//input player2
//
//
//
//if player1 == "R" then
//
//if player2 == "R" then
//
//output "It's a tie"
//
//        else if player2 == "P" then
//
//output "Paper covers Rock, player two wins!"
//
//        else if player2 == "S" then
//
//output "Rock breaks Scissors, player one wins!
//
//        else
//
//output "OOPS! please enter R,P, or S"
//
//end if
//
//        else if player1 == "P" then
//
//if player2 == "P" then
//
//output "It's a tie"
//
//        else if player2 == "R" then
//
//output "Paper covers Rock, player one wins!"
//
//        else if player2 == "S" then
//
//output "Scissors cuts paper, player two wins!
//
//        else
//
//output "OOPS! please enter R,P, or S"
//
//end if
//
//        else if player1 == "S" then
//
//if player2 == "S" then
//
//output "It's a tie"
//
//        else if player2 == "R" then
//
//output "Rock breaks Scissors, player two wins"
//
//        else if player2 == "S" then
//
//output "scissors cut paper, player one wins!
//
//        else
//
//output "OOPS! please enter R,P, or S"
//
//end if
//
//        else
//
//output "OOPS! please enter R,P, or S"
//
//end if
//
//
//
//output "Enter Y(yes) to keep playing. Or ANY other character to quit"
//
//input declareEnd
//
//
//
//end while
//
//
//
//        return
//
//end class