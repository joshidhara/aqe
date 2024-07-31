package com.amdocs.aqeppt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ArmstrongApplication {
	@GetMapping("/isArmstrong")
    public String isArmstrong(@RequestParam int number) {
        boolean result = isArmstrongNumber(number);
        return number + " is " + (result ? "" : "not ") + "an Armstrong number.";
    }

    private boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }
        return result == number;

}}
