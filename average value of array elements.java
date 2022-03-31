//Write a java program to calculate the average value of the array elements.

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    // create Scanner class object
    Scanner sc = new Scanner(System.in);

    // take total number of elements
    System.out.print("Enter number of elements: ");
    int size = sc.nextInt();

 // declare an array with given size
    int array[] = new int[size];
 // declare sum variable, & initialize with 0
    int sum = 0.0;
// declare average variable
    int avg = 0.0;

// take numbers and store them to the array
    System.out.println("Enter array elements: ");
    for (int i=0; i<array.length; i++) {
      array[i] = scan.nextInt();
// add numbers
      sum = sum + array[i];
    }
// calculate the average value
    avg = sum/array.length;
// display result
    System.out.println("Average: " + avg );
  }
}
