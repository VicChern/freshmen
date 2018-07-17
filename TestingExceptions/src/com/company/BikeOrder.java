package com.company;

import java.util.Scanner;

public class BikeOrder {
    private  String bikeModel;
    private int quantity;


    static Scanner scanner = new Scanner(System.in);

    public  String chooseModel() {

        System.out.println("Enter your model: \n");
        System.out.println("\t 1. Ukraine \n" +
                "\t 2. Salut \n" +
                "\t 3. Orlenok \n");
       bikeModel  = scanner.nextLine();

        switch (bikeModel) {
            case "Ukraine":
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
        return chooseModel();

    }


    public BikeOrder(int quantity) {
        this.quantity = quantity;



    }
}

