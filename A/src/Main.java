import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Here we won't take input from user

        //Outer loop -> 6 is the number star's that we have to print in row and column of A
        for(int i=1; i<=6; i++){
            //Inner loop
            for(int j=1; j<=6; j++){
                //Giving condition 
                if(i==1 || i==(6/2) || j==1 || j==6){
                    System.out.print("*"); //For stars
                }else{
                    System.out.print(" "); //For space
                }
            }
            System.out.println(); //For next line
        }
    }
}