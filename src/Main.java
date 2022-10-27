import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are on an island surrounded by water.\nThere is a path to the woods to the north, the sea to the south, and a beach shack to the east. \nWhich way do you want to go (n,e,s,w)?");
        String command = scan.nextLine();

        if (command.equals("n"))
        {
            System.out.println("You enter the forest and hear some rustling.\nThere may be tigers here or maybe it's just monkeys.");
            command = scan.nextLine();
            if (command.equals("scream"))
            {
                System.out.println("You scream at the top of your lungs.\nIn the silence, you hear a faint screech from the opposite side of the island.");
            }
            else if (command.equals("forage"))
            {
                System.out.println("You forage the ground for food.\nAll you can find are mushrooms.");
                command = scan.nextLine();
                if (command.equals("eat"))
                {
                    int random = 1 + (int)(Math.random() * 3);
                    if (random == 3)
                    {
                        System.out.println("You died of food poisoning.");
                    }
                    else
                    {
                        System.out.println("You feel satiated.");
                    }
                }
            }
        }
        else if (command.equals("s"))
        {
            System.out.println("You approach the sea.\nThe sea is teeming with salmon, but bears may be nearby.");
            command = scan.nextLine();
            if (command.equals("fish"))
            {
                int random = 1 + (int)(Math.random() * 3);
                if (random == 3)
                {
                    System.out.println("You caught a fish!");
                }
                else
                {
                    System.out.println("You disappear into the sea and drown.");
                }
            }
            else if (command.equals("search"))
            {
                System.out.println("You come face-to-face with a bear.\nIt starts chasing you and you get caught.");
            }
        }
        else if (command.equals("w"))
        {
            System.out.println("You are at the island edge. You cannot go any further west.");
        }
        else if (command.equals("e"))
        {
            System.out.println("You see a man in a shack sleeping.");
            command = scan.nextLine();
            if (command.equals("wake"))
            {
                System.out.println("The man angrily wakes up and starts chasing you with a spear.");
            }
            else if (command.equals("avoid"))
            {
                System.out.println("Wise choice, He had a spear under his bed.");
            }
        }
        else
        {
            System.out.println("That is not a direction.");
        }
        System.out.println("End of adventure!");
    }
}
