package input;

import array_tree.ArrayTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class input {
    public void userFunction() {
        try {
            System.out.println("*****Tree Using Array*****");
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Enter the size of Array:");
                int size = sc.nextInt();
                sc.nextLine();
                ArrayTree object = new ArrayTree(size);
            }
            catch (InputMismatchException e) {
                //block to handle exception
                System.out.println(" wrong value try again..");
            }
        }
        catch(InputMismatchException e){
            //block to handle exception
            System.out.println(" please enter correct input....");
        }
    }
    }


