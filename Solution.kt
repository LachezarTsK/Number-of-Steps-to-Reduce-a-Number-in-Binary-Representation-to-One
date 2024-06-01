
class Solution {
    fun numSteps(binaryInt: String): Int {
        var carryOver = 0
        var transformationSteps = 0

        for (bit in binaryInt.length - 1 downTo 1) {
            val current = binaryInt[bit] - '0'
            transformationSteps += 1 + (current + carryOver) % 2
            carryOver = carryOver or current
        }

        return transformationSteps + carryOver
    }
}
