package com.agilekatas.fizzbuzzclasses;

public class FizzBuzz_Features {

	public String getfizzbuzzresult(int number) {
		if (number % 3 == 0) {
			return "fizz";
		} else {
			return String.valueOf(number);
		}
	}
}
