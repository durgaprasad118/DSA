package Functions;
import  java.util.Scanner;
public class functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a:" );

        int a = in.nextInt();
//        System.out.println("the factorail is "+ fact);
        System.out.println(SumN(a));
//        String answer = Grade(a);
//        System.out.println("the grade for "+ a + " marks is: "+ answer);
//        System.out.print("Enter b:" );
//        int  b = in.nextInt();
//        System.out.print("Enter c:");
//        int c = in.nextInt();
//
//        int max = Max(a,b,c);
//        int min = Min(a,b,c);
//        System.out.println("The max is :"+max + " The min is : "+ min);

//        boolean evenornot = isEven(a);
//        System.out.println(evenornot);
//        isEligibleToVote(a);
//        int sum= Sum(a,b);
//        System.out.println("The sum of "+a +" and"+b+" is: "+ sum);
//        int mul = Product(a,b);
//        System.out.println("the product is "+ mul);
        double circum = Circumference(a);
        System.out.println("The circumference of circle is :"+ circum );

    }
    //    Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
    static int Max(int a,int b,int c){
        return Math.max(a,Math.max(b,c));

    }
    //    min
    static int Min(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
    //    Define a program to find out whether a given number is even or odd.
    static boolean isEven(int a){
        return a%2==0;
    }
    //A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
    static void isEligibleToVote(int age){
        if(age>=18){
            System.out.println("This person is eligible to vote");
        }else{
            System.out.println("This person is not elgible to vote");
        }
    }
    //    Write a program to print the sum of two numbers entered by user by defining your own method.
    static int Sum(int a,int b){
        return a+b;
    }
    // Define a method that returns the product of two numbers entered by user.
    static int Product(int a, int b){
        return a*b;
    }
    //Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
    static double Circumference(int radius){
        return 2 * radius * Math.PI;
    }

    //    Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail
    static String Grade(int marks){
        if(marks<=40){
            return "Fail";
        }else if(marks>40 && marks<=50){
            return "DD";
        } else if (marks>=51 && marks<=60) {
            return "CD";
        } else if (marks>=61 && marks<=70) {
            return "BC";
        } else if (marks>=71 && marks<=80) {
            return "BB";
        } else if (marks>=81 && marks<=90) {
            return "AB";
        } else if (marks>=91 && marks<=100) {
            return "AA";
        }else{
            return "Enter marks between 0 and 100 only";
        }
    }
    //Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
    static int factorial (int a){
        if(a==0){
            return 1;
        }
        int answer =1;
        for(int i=1;i<=a;i++){
            answer*=i;
        }
        return answer;
    }
    //    Write a function to find if a number is a palindrome or not. Take number as parameter.
    static boolean isPalindrome(int a){
        return true;
    }
    //    Write a function that returns the sum of first n natural numbers
    static int SumN(int n){
        return n*(n+1)/2;
    }
}
