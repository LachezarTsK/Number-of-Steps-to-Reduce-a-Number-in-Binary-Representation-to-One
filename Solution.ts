
function numSteps(binaryInt: string): number {
    let carryOver = 0;
    let transformationSteps = 0;

    for (let bit = binaryInt.length - 1; bit > 0; --bit) {
        let current = binaryInt.codePointAt(bit) - '0'.codePointAt(0);
        transformationSteps += 1 + (current + carryOver) % 2;
        carryOver = carryOver | current;
    }

    return transformationSteps + carryOver;
};
