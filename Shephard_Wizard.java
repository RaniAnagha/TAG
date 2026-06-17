import java.util.Scanner; //if u want a tool to generate Random numbers/a dynamic inventory (ArrayList) that can grow or shrink as the player picks up or drops items, then scanner isnt enough
public class Shephard_Wizard //inspired by The Shephard Wizard Webtoon
{
    static int patience = 6; //In Java, usually, variables belong to specific objects. But when you mark something as static, you are making it a Global Variable
    static int browniePT = 0;
    static int pride = 10;

    static Scanner input = new Scanner(System.in);
    //input is an object/sprite which contains data/varaibles/fields(attributes) & methods(like move 10 steps or next costume)

    public static void main(String[]args)
    {
        String currentSCENE = "HILL_SCENE";
        boolean gameRUNNING = true;
        int choice;

        boolean scenerySEEN = false;

        System.out.println("A shepherd is sitting under the tree, the cool breeze playing with his long hair which was tied into a pony.");
        System.out.println("His sheep are grazing on the evergreen hill, a scene he's all too familiar with.");

        while (gameRUNNING) //forever loop (referring to scratch logic . . . u should do that more often uk?)
        {
            //------------------ HILL SCENE ---------------------
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

                    displayPARAMETERS();
                }
                else if (choice == 2) //Dance for me
                {
                    if (scenerySEEN == false)
                    {
                        patience = patience - 5;

                        System.out.println("\"No, YOU dance for ME. period.\"");

                        currentSCENE = "DANCE_SCENE";
                    }
                    else
                    {
                        patience = patience - 8;

                        System.out.println("\"OKAY, THAT'S IT! I'M LEAVING!\"");
                        System.out.println("The shepherd calls for his sheep & stomps his way uphill leaving you alone. You follow them from a distance like a lost lamb.");

                        currentSCENE = "HOME_SCENE";
                    }
                    displayPARAMETERS();
                }
                else if (choice == 3) //Let's go home
                {
                    patience = patience + 1;

                    System.out.println("\"Sounds good.\"  *stands up & looks at his sheep* \"Come on my dearies, it's time to go home~\"");
                    System.out.println("As if in a trance, all the sheep start following him at once! You freeze & look at the scene with amazed eyes. Then you snap out of it & catch up with them on the way home.");

                    currentSCENE = "HOME_SCENE";

                    displayPARAMETERS();
                }
            }
            
            //--------------- DANCE SCENE ---------------------
            else if (currentSCENE.equals("DANCE_SCENE"))
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
                    pride = pride - 1;

                    System.out.println("*looks dumbfounded*\n\"Uhhhhh, that was...unique. I suppose we can wrap up for today & go home! Follow me!\"");
                    System.out.println("He grabs his cane & starts moving uphill. As if in a trance, you & the sheep unconditionally follow him.");

                    currentSCENE = "HOME_SCENE";

                    displayPARAMETERS();
                }
                else if (choice == 2) //Butter him up
                {
                    patience = patience + 5;
                    browniePT = browniePT +1;

                    System.out.println("=_=\n\"I can see what you're doing\"\n. . .\n\"No matter! I suppose I could forgive you THIS once.\"");
                    System.out.println("He continues to ador-AHEM! tend to his sheep, while humming a tune with a smile on his face. The day comes to an end with the sun setting, painting the hillside in hues of red. Then, he tells the sheep & you to follow him as it was time to go home.");
                        
                    currentSCENE = "HOME_SCENE";
                        
                    displayPARAMETERS();
                }
                else if (choice == 3) //Beg for forgiveness
                {
                    browniePT = browniePT - 1;
                    pride = pride + 1;

                    System.out.println("You get down on your knees & start begging for forgiveness. The shepherd makes a disgusted look & acts as if he didn't see anything. He ignores you as he continues to adore(?) his sheep affectionately, like a mother does to her child.");
                    System.out.println("The day eventually comes to an end with the sunset, marking the end of the unbearable silence. Then, he yells out loud to follow him home & you do so, along with the sheep, without giving it a single thought.");

                    currentSCENE = "HOME_SCENE";
                        
                    displayPARAMETERS();
                }
            }
            //-------------- HOME SCENE -----------------
            else if (currentSCENE.equals("HOME_SCENE"))
            {
                System.out.println("You have reached home. The shepherd is rounding up the sheep into the pen.");
                
                if (patience>0) //is that enough? considering u have pride(sass) & brownie points this is too simple!!!
                {
                    System.out.println("\"Okay, that's all of them. What now?\"");
                    System.out.println("1. Uhhhhh, idk. what do you usually do?"); //direct to to do list scenen
                    System.out.println("2. tell me about urself"); //direct to backstory scene
                }
                else
                {
                    System.out.println("\"Ok, I'm done. Now I'm gonna go in & sleep. And just to make things clear, you are NOT allowed inside.\" *bangs the door shut"); //direct to next day sequence without TDL/backstory
                }
                
                gameRUNNING = false;
            }                     
        }     
    }

    public static void printINVALIDchoice() //void = Execute this code, but don't expect a value back
    {
        System.out.println("You weren't paying attention, were you? *sighs* I asked you to enter ONE number from 1,2 or 3!");
    }

    public static void displayPARAMETERS() //temporary tracker of secret stats
    {
        System.out.println(" patience = "+ patience +"\n browniePT = "+ browniePT +"\n pride = "+ pride);
    }
}