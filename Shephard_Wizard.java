import java.util.Scanner;
public class Shephard_Wizard //inspired by The Shephard Wizard Webtoon
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
        int patience = 9;
        int browniePT = 0;
        int sass = 10;
        
        System.out.println("A shephard is sitting under the tree, the cool breeze playing with his long hair which was tied into a pony.");
        System.out.println("His sheep are grazing on the evergreen hill, a scene he's all too familiar with.");
        System.out.println("\"Ah~ I'm bored. Do something, won't you? Or are you just here to stare at my face?\"");
        System.out.println("Enter a number to select ur choice:\n"
        + "1. Just enjoy the scenery\n"
        + "2. Dance for me\n"
        + "3. Let's go home");
        
        int choice = input.nextInt();

        if (choice == 1)
        {
            patience = patience - 2;
            System.out.println("\"There is a tree behind me, there is a tree in front of me, there's a sheep there, there's a sheep here & grass gRAsS GRASS EVERYWHERE! Happy?\"");
        }
        else if (choice == 2)
        {
            patience = patience - 5;
            System.out.println("\"No, YOU dance for ME. period.\"");
            System.out.println("What will you do?\n
            + "1. Show off your dancing skills"
            + "2. Butter him up"
            + "3. You know what? Let's just go home");

            choice = input.nextInt();

            if (choice == 1)
            {
                patience = patience + 4;
                browniePT = browniePT + 2;
                System.out.println("*looks dumbfounded* \"Uhhhhh, that was...unique. I suppose we can wrap up for today & go home! follow me!\");
                System.out.println("As if in a trance, you & the sheep follow him");
                System.out.println("You have reached home. The shephard is rounding up the sheep in their pen.");
                System.out.println("\"Okay, that's all of them. What now?\");
                System.out.println("1. Idk. YOU tell ME\n"
                                   + "2. Tell me about yourself");
            }
            else if (choice == 2)
            {
                patience = patience + 2;
                browniePT = browniePT + 1;
                System.out.println("=_= \"I see what you're doing there...No matter. I suppose I could forgive yout THIS once");
            }
            else if (choice == 3)
            {
                System.out.println("\"Tch, I REALLY don't like you attitude. Hmph! Come my dearies, it's time to go home~\"");
                System.out.println("As if in a trance, all the sheep follow him at once. You...well you also gotta follow him.");
                System.out.println("You have reached home. The shephard is rounding up the sheep in their pen.");
                System.out.println("\"Okaaaay, that's all of them. What is your order now sire?~\");
                System.out.println("1. Uhhhhhh, idk. What do you  usually do?\n"
                                   + "2. Tell me about yourself my dear subject!");
            }
        else if (choice == 3)
        {
            System.out.println("\"Sounds good.\"");
        }
        else
        {
            System.out.println("You weren't paying attention, were you? *sighs* let me repeat: choose a number from 1-3");
            continue;
        }
    }
}
