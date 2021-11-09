package automationtest;

import java.util.Scanner;

public class ForLoop_Q4 {
    public void printMyName(String name,int howManyTime ){
        for (int i = 1; i <=howManyTime; i++) {
            System.out.println(name);
        }

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name :");
        String myName=scanner.nextLine();
        System.out.println("How many time you want print your name:");
        int howManyTime = scanner.nextInt();
        ForLoop_Q4 obj=new ForLoop_Q4();
        obj.printMyName(myName,howManyTime);

    }

}
