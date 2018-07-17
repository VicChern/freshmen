package com.company;

import java.util.Scanner;
// new class for Bike Orders in the shop
public class BikeOrder {
    private  String bikeModel;
    private int quantity;

// instance of the Scanner class, let us do some input in the program
    static Scanner scanner = new Scanner(System.in);

    // method that doing everything in the program
    public  String chooseModel() {

    // menu current program
        System.out.println("Enter your model: \n");
        System.out.println("\t 1. Ukraine \n" +
                "\t 2. Salut \n" +
                "\t 3. Orlenok \n");
    // let us convert our input into argument for switch statement    
       bikeModel  = scanner.nextLine();
   // checking our input and showing some result
        switch (bikeModel) {
            case "Ukraine":
   // usage of try/catch statement that was learn before.
                try {
                    if (quantity > 0 && quantity <= 10) {
                        System.out.println("Order validated");
                        System.out.println("Will be sent throw 3 days");
                    } else {
                        throw new TooManyBikesException("Can not ship " + quantity + " bikes of the model " + bikeModel);
                    }
                } catch (TooManyBikesException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case "Salut":
                try {
                    if (quantity > 0 && quantity <= 20) {
                        System.out.println("Order validated");
                        System.out.println("Will be sent throw 3 days");
                    } else {
                        throw new TooManyBikesException("Can not ship " + quantity + " bikes of the model " + bikeModel);
                    }
                } catch (TooManyBikesException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case "Orlenok":
                try {
                    if (quantity > 0 && quantity <= 10) {
                        System.out.println("Order validated");
                        System.out.println("Will be sent throw 3 days");
                    } else {
                        throw new TooManyBikesException("Can not ship " + quantity + " bikes of the model " + bikeModel);
                    }
                } catch (TooManyBikesException e) {
                    System.out.println(e.getMessage());
                    break;
                }
            default:
                System.out.println("Invalid choice! \n");

        }
      // this return statement let us start menu again if program will receive wrong input  
        return chooseModel();

    }

   // constructor for intstance of the BikeOrder class 
    public BikeOrder(int quantity) {
        this.quantity = quantity;



    }
}

