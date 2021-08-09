//Carlos Jimenez
//Method Industries programming problem
//Function that takes 3 integers input A,B,C and outputs a string that has determined
//which mathematical operation allows for A ? B = C

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //acquire A B and C integers
        System.out.println("Enter 3 integers");
        System.out.println("First integer:");
        int a = scanner.nextInt();
        System.out.println("Second integer:");
        int b = scanner.nextInt();
        System.out.println("Third integer:");
        int c = scanner.nextInt();
        
        scanner.close();

        //use mathFunction to get output
        System.out.println(mathFunction(a, b, c));
    }
    
    public static String mathFunction(int a , int b , int c){

        //initialize string
        String output = "";

        //test math operations, concat to string if they pass
        //if they fail return None
        if(a + b == c){
            output = output.concat("+");
        }
        if(a - b == c){
            output = output.concat("-");
        }
        if(a * b == c){
            output = output.concat("*");
        }
        if(a / b == c){
            output = output.concat("/");
        }
        if(output.length()>0){
            return output;
        }
        else{
            return "None";
        }
    }
}