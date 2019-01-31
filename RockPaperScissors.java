// Filename: RockPaperScissors.java
// Author: Malachi
// Date: 1/31/2019

/* Basic game of rock, paper, scissors. User will choose from a numeric menu which represents one of the 3 items. Computer will randomly select a number representing the 3 items. Game will determine a winner.*/

import javax.swing.JOptionPane;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        // Variables and constants
        int user; // user number
        int com; // computer number

        String userPick;
        String comPick;
        String message;

        // Computer randomly chooses a number between 1 and 3
        com = 1 + (int)(Math.random() * 3);

        // User chooses a number representing an item
        user = Integer.parseInt(JOptionPane.showInputDialog(null, "A new challenger has appeared! \nPlease choose wisely:\n 1 -- ROCK\n2 -- PAPER\n3 -- SCISSORS"));

        // Decision making proccess assigns a string with the item name to the numeric choices

        //Player's string
        if(user == 1)
        {
            userPick = "ROCK";
        }
        else
        {
            if (user == 2)
            {
              userPick = "PAPER";
            }

            else
            {
                userPick = "SCISSORS";
            }
        }

        //Computer's string
        if(com == 1)
        {
            comPick = "ROCK";
        }
        else
        {
            if (com == 2)
            {
              comPick = "PAPER";
            }

            else
            {
                comPick = "SCISSORS";
            }
        }

        // Game mechanics
        
    }
}
