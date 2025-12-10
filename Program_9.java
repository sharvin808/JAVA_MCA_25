/* The 15-puzzle (also known as the sliding puzzle) consists of a 4×4 grid containing 15 numbered tiles (from 1 to 15) and one empty space. The objective is to rearrange the tiles by sliding them horizontally or vertically into the empty space to achieve the correct ascending order, as shown below: [Experiential Learning]
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 _*/

import java.io.*;
import java.util.*;

class SLIDER 
{
    public static final int SIZE = 4;  
    int Board[][] = new int[SIZE][SIZE];    
    Scanner s  = new Scanner(System.in);
    int ec = 3, er = 3; 
    int er1 = 3, ec1 = 3;
    public void initBoard()
    {
        Board[0] = new int[]{1, 2, 3, 4};
        Board[1] = new int[]{5, 6, 12, 7};
        Board[2] = new int[]{9, 10, 11, 8};
        Board[3] = new int[]{13, 14, 15, 0};
    }
    public void printboard()
    {
        for(int i = 0; i < SIZE; i++)
        {
            for(int j = 0; j < SIZE; j++)
            {
                if (Board[i][j] == 0)   
                    System.out.print(" \t"); 
                else
                    System.out.print(Board[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public void swap(int er , int ec, int er1, int ec1)
    {
        int temp = Board[er][ec];
        Board[er][ec] = Board[er1][ec1];
        Board[er1][ec1] = temp;
    }
    public boolean checkswap(int a) 
    {
        if(er + 1 < SIZE && Board[er + 1][ec] == a) 
        { 
            er1 = er + 1;
            ec1 = ec;
            return true;
        }
        if(er - 1 >= 0 && Board[er - 1][ec] == a) 
        {    
            er1 = er - 1;
            ec1 = ec;
            return true;
        }
        if(ec + 1 < SIZE && Board[er][ec + 1] == a) 
        {  
            er1 = er;
            ec1 = ec + 1;
            return true;
        }
        if(ec - 1 >= 0 && Board[er][ec - 1] == a) 
        {   
            er1 = er;
            ec1 = ec - 1;
            return true;
        }
        return false;
    }
    public boolean checkwin()
    {
        int count = 1;
        for(int i = 0; i < SIZE; i++)
        {
            for(int j = 0; j < SIZE; j++)
            {
                if(i == SIZE - 1 && j == SIZE - 1) 
                {
                    if(Board[i][j] != 0) 
                    {
                        return false;
                    }
                }
                else 
                {
                    if(Board[i][j] != count) 
                    {
                        return false;
                    }
                    count++;
                }
            }
        }
        return true;
    }
    public void option()
    {
        int option;
        initBoard();
        while (true) 
        {
            printboard();
            if(checkwin())
            {
                System.out.println("Congrats on solving!!");
                System.exit(0);
            }
            System.out.println("Enter the number to slide the space. Enter -1 to exit");
            System.out.print("Enter number to swap: ");
            option = s.nextInt();
            if(option == -1)   
                System.exit(0);
            else
            {
                if(checkswap(option))
                {
                    swap(er,ec,er1,ec1);
                    er = er1;
                    ec = ec1;
                }
                else 
                {
                    System.out.println("Unable to swap!!");
                }
            }

        }
    }
}
class Program_9
{
    public static void main(String args[])
    {
        SLIDER sli = new SLIDER();
        sli.option();
    }
}
