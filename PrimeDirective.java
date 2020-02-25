/*
This program prints out all the prime numbers in a given list
Created by Emma on Feb. 25th, 2020
Intermediate Programming - Block 8
*/
import java.util.ArrayList;
class PrimeDirective {
  public boolean isPrime(int number){
    //smallest prime number
    if (number == 2) {
      return true;
    //isn't prime
    } else if (number < 2) {
      return false;
    }
    //checks to see if the number is prime
    for (int i = 2; i < number; i++) {
    //if this works then the number isn't prime
      if (number%i == 0) {
        return false;
      }
    }
    return true;
  }
  //method that returns an ArrayList of integers that are all prime
  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    //stores all prime numbers here
    ArrayList<Integer> primes = new ArrayList<Integer>();
    //checks each number in numbers
    for (int number : numbers) {
      //if the number is prime, it is added to the prime list
      if (isPrime(number)) {
        primes.add(number);
      }
    }
    return primes;
  }
  //main method
  public static void main(String[] args) {
    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    //tests out prime numbers
    System.out.println(pd.isPrime(7));
    System.out.println(pd.isPrime(28));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(0));
    //prints out only the prime numbers in the numbers list
    System.out.println(pd.onlyPrimes(numbers));
  }
}
