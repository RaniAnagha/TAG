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

        System.out.println("A shephard is sitting under the tree, the cool breeze playing with his long hair which was tied into a pony.");
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
                } //add this for other choice blocks, also make dance scene seperate. no nesting choices like that. then make home scene.
                
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
                    System.out.println("What will you do?\n 1. Show off your dancing skills\n 2. Butter him up\n 3. You know what? Let's just go home");
                    
                    choice = input.nextInt();

                    if (choice == 1) //Show off your dancing skills
                    {
                        patience = patience + 4;
                        browniePT = browniePT + 2;
                        System.out.println("*looks dumbfounded* \"Uhhhhh, that was...unique. I suppose we can wrap up for today & go home! Follow me!\"");
                        System.out.println("As if in a trance, you & the sheep follow him");
                    }
                    else if (choice == 2) //Butter him up
                    {
                        patience = patience + 2;
                        browniePT = browniePT +1;
                        System.out.println("=_= \"I can see what you're doing...No matter! I suppose I could forgive you THIS once.\"");
                    }
                    else if (choice == 3) //You know what? Let's just go home
                    {
                        System.out.println("\"Tch! I REALLY don't like your attitude. Hmph@ Come my dearies, it's time to go home~\"");
                        System.out.println("As if in a trance, all the sheep follow him at once. You...well you also follow him cause you don't really have a choice.");
                    }
                    else
                    {
                        printINVALIDchoice();
                    }
                }
                else if (choice == 3) //Let's go home
                {
                    System.out.println("\"Sounds good.\"");
                }
                else
                {
                    printINVALIDchoice();
                }
            }
            
        }     
    }
    public static void printINVALIDchoice() //void = Execute this code, but don't expect a value back
    {
        System.out.println("You weren't paying attention, were you? *sighs* I asked you to enter a number from 1/2/3!");
    }
}



System.out.println("You have reached home. The shephard is rounding up the sheep in their pen.");
                System.out.println("\"Okay, that's all of them. What now?\");
                System.out.println("1. Idk. YOU tell ME\n
                                   2. Tell me about yourself");
            }
            
                System.out.println("You have reached home. The shephard is rounding up the sheep in their pen.");
                System.out.println("\"Okaaaay, that's all of them. What is your order now sire?~\");
                System.out.println("1. Uhhhhhh, idk. What do you  usually do?\n"
                                   + "2. Tell me about yourself my dear subject!");
            }
