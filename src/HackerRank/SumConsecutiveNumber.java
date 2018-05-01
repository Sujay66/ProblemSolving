package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A Java program to count number of ways
// to express N as sum of consecutive numbers.
public class SumConsecutiveNumber
{
    public static long count = 0;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine()); //Enter a number( <=10^12)
        //driver(num);
        func(num);
        System.out.println("count = " + count);
    }


    public static void func(long num)
    {
        long temp,i,j;
        long limit = (num / 2);
        for(i = 1 ; i <= limit ; i++)
        {
            temp = num;
            j = i;
            while(j < temp)
            {
                temp = temp - j;
                j++;
            }
            if(j == temp)
            {
                count++;
            }
        }
    }

}
