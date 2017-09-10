package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the temperature in Celcius? ");
        double temp = scan.nextDouble();

        if(temp < 97.5){
            System.out.println("The temperature is low");
        } else if((temp > 97.5) && (temp < 99.5)) {
            System.out.println("The temperature is normal");
        } else{
            System.out.println("The temperature is High");
        }
    }
}
