import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Bingo! To start a new game of Bingo, type 'start'.");
        boolean start = false;
        Scanner scanner = new Scanner(System.in);
        while(!start)
        {
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("Start"))
            {
                start = true;
                System.out.println("Starting game...");
                int numbers = 75;
                ArrayList<Integer> bingoNumbers = new ArrayList<Integer>(numbers);
                for(int i=1;i<numbers+1;i++)
                {
                    bingoNumbers.add(i);
                }
                Random rand = new Random();
                while(bingoNumbers.size() > 0)
                {
                    int rand_int = 0;
                    if(bingoNumbers.size() > 1)
                    {
                        rand_int = rand.nextInt(bingoNumbers.size());
                    }
                    if(bingoNumbers.get(rand_int) <= 15)
                    {
                        System.out.println("\nThe system calls: B " + bingoNumbers.get(rand_int) + "!");
                    } 
                    else if(bingoNumbers.get(rand_int) > 15 && bingoNumbers.get(rand_int) <= 30)
                    {
                        System.out.println("\nThe system calls: I " + bingoNumbers.get(rand_int) + "!");
                    }
                    else if(bingoNumbers.get(rand_int) > 30 && bingoNumbers.get(rand_int) <= 45)
                    {
                        System.out.println("\nThe system calls: N " + bingoNumbers.get(rand_int) + "!");
                    }
                    else if(bingoNumbers.get(rand_int) > 45 && bingoNumbers.get(rand_int) <= 60)
                    {
                        System.out.println("\nThe system calls: G " + bingoNumbers.get(rand_int) + "!");
                    }
                    else
                    {
                        System.out.println("\nThe system calls: O " + bingoNumbers.get(rand_int) + "!");
                    }
                    bingoNumbers.remove(rand_int);
                    boolean nextNumber = false;
                    while(!nextNumber)
                    {
                        System.out.println("Type 'next' to call the next number.");
                        input = scanner.nextLine();
                        if(input.equalsIgnoreCase("next"))
                        {
                            nextNumber = true;
                        }
                        else{System.out.println("Invalid command. Please try again.");}
                    }
                }
                System.out.println("All bingo numbers have been called.");
            }
            else{System.out.println("Invalid command. Please try again.");}
        }
        scanner.close();
    }
}
