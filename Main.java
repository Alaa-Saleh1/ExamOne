import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Q1. Write a Java program that accept three numbers from the user and print
the largest number .*/


//        System.out.println("Please enter first number: ");
//        int number1 = input.nextInt();
//        System.out.println("Please enter second number: ");
//        int number2 = input.nextInt();
//        System.out.println("Please enter third number:  ");
//        int number3 = input.nextInt();
//
//        int maxValue = number1;
//
//        if (number1 < number2)
//            maxValue = number2;
//        if (number1 < number3)
//            maxValue = number3;

//        System.out.println("The largest number is "+maxValue);


        /*Q2. Write a Java program that accept a String and a number from the
user,then print the character in the given index .*/

//        System.out.println("Please enter String : ");
//        String word = input.nextLine();
//        System.out.println("Please enter Number : ");
//        int number = input.nextInt();
//
//        for (int i = 0; i < word.length(); i++) {
//            if (word.equals(i)==word.equals(number)) {
//                System.out.println("The character is " +word.charAt(number));
//                break;
//            }
//        }


        /*Q3. Write a program to enter the numbers till the user wants and at the end
it should display the sum entered .*/

//        System.out.println("Please enter number to sum , enter -1 to stop ");
//
//        int sum =0 ;
//        do {
//            System.out.println("Enter number: ");
//            int number = input.nextInt();
//            if (number!=-1)
//                sum+=number;
//            else break;
//        }while (true);
//
//        System.out.println("sum of number = "+sum);


        /*Q4. Write a Java program to find positive and negative numbers of a given
array:
- Original Array:
[10, -21 , 30, 31, -25]*/

//        System.out.println("Please enter count of your number : ");
//        int count = input.nextInt();
//        int[] numbers = new int[count];
//        for (int i = 0; i < count ; i++) {
//            System.out.println("enter number :");
//            int n= input.nextInt();
//            numbers[i]=n;
//
//        }
//        for (int n : numbers) {
//            if (n > 0){
//                System.out.println(n+" is a positive number");
//            }else if (n< 0){
//                System.out.println(n+" is a negative number");
//            }else {
//                System.out.println("Zero");
//            }
//        }


        /*Q5. Write a Java program to find a shortest word of a given array:
- Original Array:
[“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
- Expected Output:
JAVA*/

//        System.out.println("Please enter count of your number : ");
//        int count = input.nextInt();
//        ArrayList<String> words= new ArrayList<>();
//
//        for (int i = 0; i <count ; i++) {
//            System.out.println("Enter word: ");
//            String word = input.next();
//            words.add(word);
//        }
//        System.out.println("The original Array : \n"+words);
//        String shortW = words.get(0);
//        for (int i = 0; i < words.size() ; i++) {
//
//            if (words.indexOf(0)< words.indexOf(i)){
//                shortW = words.get(i);
//            }
//        }
//        System.out.println("The shortest word is "+shortW);
//
//    }
}