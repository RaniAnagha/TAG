import java.util.Scanner;
public class Shephard_Wizard //inspired by The Shephard Wizard Webtoon
{
    static int patience = 6;
    static int browniePT = 0;
    static int sass = 10;

    static Scanner input = new Scanner(System.in);

    public static void main(String[]args)
    {
        String currentSCENE = "HILL_SCENE";
        boolean gameRUNNING = true;
        int choice;

        boolean scenerySEEN = false;

        System.out.println("A shepherd is sitting under the tree, the cool breeze playing with his long hair which was tied into a pony.");
        System.out.println("His sheep are grazing on the evergreen hill, a scene he's all too familiar with.");

        while (gameRUNNING) //forever loop
        {
            //------------ HILL SCENE ------------
            if (currentSCENE.equals("HILL_SCENE"))
            {
                System.out.println("\"Ah~ I'm bored. Do something, won't you? Or are you just here to stare at my face?\"");
                System.out.println("Enter a number from 1-3 to select ur choice:");
                if (scenerySEEN ==  false)
                {
                    System.out.println(" 1. Just enjoy the scenery");
                }
                System.out.println(" 2. Dance for me\n 3. Let's go home");
                
                if (!input.hasNextInt()) //Read as: If the input is NOT an integer
                {
                    printINVALIDchoice();
                    input.next(); //Clears the bad text (like "abc") out of the scanner
                    continue;
                }
                else
                {
                    choice = input.nextInt();

                    if (choice<1 || choice>3)
                    {
                        printINVALIDchoice();
                        continue;
                    }
                }
                
                if (choice == 1 && scenerySEEN == false) //Just enjoy the scenery
                {
                    patience = patience - 3;
                    
                    System.out.println("\"There is a tree behind me, there is a tree in front of me, there's a sheep there, there's a sheep here & grass gRAsS GRASS EVERYWHERE! Happy?\"");

                    scenerySEEN = true;
                }
                else if (choice == 2) //Dance for me
                {
                    patience = patience - 5;
                    
                    System.out.println("\"No, YOU dance for ME. period.\"");
                    
                    currentSCENE = "DANCE_SCENE";                 
                }
                else if (choice == 3) //Let's go home
                {
                    patience = patience + 1;

                    System.out.println("\"Sounds good.\"  *stands up & looks at his sheep* \"Come on my dearies, it's time to go home~\"");
                    System.out.println("As if in a trance, all the sheep start following him at once! You freeze & look at the scene with amazed eyes. Then you snap out of it & catch up with them on the way home.");

                    currentSCENE = "HOME_SCENE";
                }
            }
            
            //--------------- DANCE SCENE ---------------------
            if (currentSCENE.equals("DANCE_SCENE"))
            {
                System.out.println("What will you do?\n 1. Show off your dancing skills\n 2. Butter him up\n 3. Beg for forgiveness");

                if (!input.hasNextInt())
                {
                    printINVALIDchoice();
                    input.next();
                    continue;
                }
                else
                {
                    choice = input.nextInt();

                    if (choice<1 || choice>3)
                    {
                        printINVALIDchoice();
                        continue;
                    }
                }

                if (choice == 1) //Show off your dancing skills
                    {
                        patience = patience + 4;
                        sass = sass - 1;

                        System.out.println("*looks dumbfounded*\n\"Uhhhhh, that was...unique. I suppose we can wrap up for today & go home! Follow me!\"");
                        System.out.println("He grabs his cane & starts moving uphill. As if in a trance, you & the sheep unconditionally follow him.");

                        currentSCENE = "HOME_SCENE";
                    }
                    else if (choice == 2) //Butter him up
                    {
                        patience = patience + 5;
                        browniePT = browniePT +1;

                        System.out.println("=_=\n\"I can see what you're doing\"\n. . .\n\"No matter! I suppose I could forgive you THIS once.\"");
                        System.out.printl("He continues to ador-AHEM! tend to his sheep, while humming a tune with a smile on his face. The day comes to an end with the sun setting, painting the hillside in hues of red. Then, he tells the sheep & you to follow him as it was time to go home.");
                        
                        currentSCENE = "HOME_SCENE";
                    }
                    else if (choice == 3) //Beg for forgiveness
                    {
                        System.out.println("You get down on your knees & start begging for forgiveness. The shepherd makes a disgusted look & acts as if he didn't see anything. He ignores you as he continues to adore(?) his sheep affectionately, like a mother does to her child.");
                        System.out.println("The day eventually comes to an end with the sunset, marking the end of the unbearable silence. Then, he yells out loud to follow him home & you do so, along with the sheep, without giving it a single thought.");
                    }
            }          
        }     
    }

    public static void printINVALIDchoice() //void = Execute this code, but don't expect a value back
    {
        System.out.println("You weren't paying attention, were you? *sighs* I asked you to enter ONE number from 1,2 or 3!");
    }

    public static void displayPARAMETERS() //temporary tracker of secret stats
    {
        System.out.println(" patience = "+ patience +"\n browniePT = "+ browniePT +"\n sass = "+ sass);
    }
}



System.out.println("You have reached home. The shepherd is rounding up the sheep in their pen.");
                System.out.println("\"Okay, that's all of them. What now?\");
                System.out.println("1. Idk. YOU tell ME\n
                                   2. Tell me about yourself");
            }
            
                System.out.println("You have reached home. The shepherd is rounding up the sheep in their pen.");
                System.out.println("\"Okaaaay, that's all of them. What is your order now sire?~\");
                System.out.println("1. Uhhhhhh, idk. What do you  usually do?\n"
                                   + "2. Tell me about yourself my dear subject!");
            }
