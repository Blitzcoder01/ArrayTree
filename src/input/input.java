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
                System.out.println("Enter the root value of tree:");
                String key = sc.nextLine();
                object.root(key);
                while (true) {
                    System.out.println(" * press " + 1 + " for add parent node");
                    System.out.println(" * press " + 2 + " for add left child node");
                    System.out.println(" * press " + 3 + " for add right child node");
                    System.out.println(" * press " + 4 + " to view array");
                    System.out.println(" * press " + 5 + " to exit:");
                    int input_choice = sc.nextInt(); //variable to store the choice
                    sc.nextLine();
                }
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


