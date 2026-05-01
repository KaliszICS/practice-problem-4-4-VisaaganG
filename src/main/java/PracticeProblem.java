/**
	* File: Lesson 4.4 - Boolean functions with loops
	* Author: Visaagan Gunabalachandran
	* Date Created: April 6, 2023
	* Date Last Modified: May 1, 2026
	*/
public class PracticeProblem {

	public static boolean hasCapital(String word) {
	
    for (int i = 0; i < word.length(); i++) {
        if (Character.isUpperCase(word.charAt(i))) {
            return true;
        }
    }
    return false;
}
	public static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}






}
