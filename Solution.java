
public class Solution {

    public int numSteps(String binaryInt) {
        int carryOver = 0;
        int transformationSteps = 0;

        for (int bit = binaryInt.length() - 1; bit > 0; --bit) {
            int current = binaryInt.charAt(bit) - '0';
            transformationSteps += 1 + (current + carryOver) % 2;
            carryOver = carryOver | current;
        }

        return transformationSteps + carryOver;
    }
}
