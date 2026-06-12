import java.util.Scanner;
public class Shephard_Wizard //inspired by The Shephard Wizard Webtoon
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
        int patience = 10;
        
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
            patience--;
            System.out.println("\"You weren't paying attention, were you? Then let me be direct I'm sick of seeing this everyday so choose something else!\"");
        }
        else if (choice == 2)
        {
            patience = patience-5;
            System.out.println("\"No, YOU dance for ME. period.\"");
        }
        else if (choice == 3)
        {
            System.out.println("Sounds good.");
        }
        else
        {
            System.out.println("I'm sorry, but did you even TRY to pay attention? I said choose a number from 1-3!!!");
        }
    }
}