
#include <string>
using namespace std;

class Solution {

public:
    int numSteps(const string& binaryInt) const {
        int carryOver = 0;
        int transformationSteps = 0;

        for (size_t bit = binaryInt.length() - 1; bit > 0; --bit) {
            int current = binaryInt[bit] - '0';
            transformationSteps += 1 + (current + carryOver) % 2;
            carryOver = carryOver | current;
        }

        return transformationSteps + carryOver;
    }
};
