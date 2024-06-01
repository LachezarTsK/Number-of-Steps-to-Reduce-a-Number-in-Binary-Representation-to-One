
using System;

public class Solution
{
    public int NumSteps(string binaryInt)
    {
        int carryOver = 0;
        int transformationSteps = 0;

        for (int bit = binaryInt.Length - 1; bit > 0; --bit)
        {
            int current = binaryInt[bit] - '0';
            transformationSteps += 1 + (current + carryOver) % 2;
            carryOver = carryOver | current;
        }

        return transformationSteps + carryOver;
    }
}
