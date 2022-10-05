package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(uniques(numbers));
    }

    static boolean uniques (int[] numbers)
    {
        boolean result = true;
        for (int n = 0; n < numbers.length; n++)
        {
            for (int i = n + 1; i < numbers.length; i++)
                if (numbers[n] == numbers[i])
                    result = false;
        }
        return result;
    }
}
