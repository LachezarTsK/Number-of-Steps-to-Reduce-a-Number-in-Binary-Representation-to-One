
package main

import "fmt"

func numSteps(binaryInt string) int {
	var carryOver = 0
	var transformationSteps = 0

	for bit := len(binaryInt) - 1; bit > 0; bit-- {
		var current = int(binaryInt[bit] - '0')
		transformationSteps += 1 + (current+carryOver)%2
		carryOver = carryOver | current
	}

	return transformationSteps + carryOver
}
