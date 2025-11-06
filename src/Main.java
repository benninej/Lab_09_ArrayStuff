import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];

        Random rand = new Random();
        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rand.nextInt(100) + 1; // random int between 1 and 100
        }

        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }

//        Code a loop that calculates the sum and the average of the values in dataPoints.

        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);

        Scanner in = new Scanner(System.in);
        int input = SafeInput.getRangedInt(in, "Enter a number between ", 1, 100);

//        Code a loop that iterates the entire dataPoints array and counts how many times the user's value is found within the array.
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == input)
            {
                count++;
            }
        }
        System.out.println("The number " + input + " was found " + count + " times in the array.");


       // Code a loop that iterates through the dataPoints array checking each value to see if it matches the one the user input. This loop should short circuit (break) when it finds the value and displays the first position of the value within the array in a complete sentence.
        int val = SafeInput.getRangedInt(in, "Enter another number between ", 1, 100);
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == val)
            {
                System.out.println("The first occurrence of the number " + val + " is at index " + i + ".");
                break;
            }
            if (i == dataPoints.length - 1)
            {
                System.out.println("The number " + val + " was not found in the array.");
            }
        }

        //Write a loop to scan for the minimum and maximum values in the dataPoints array. Display these values to the user.
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

    }




    public static double getAverage(int values[])
    {
        int sum = 0;
        for (int num : values)
        {
            sum += num;
        }
        return (double) sum / values.length;
    }
}