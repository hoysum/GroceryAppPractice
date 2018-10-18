package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    ArrayList<GroceryInvoiceApp> groceries = new ArrayList<>();
    String response = "";

    do {
        System.out.println("Enter a grocery item");
        String item = in.nextLine();
        System.out.println("Enter item's price");
        double price = in.nextDouble();
        //System.out.println("Enter quantity of items");
        //int quantity = in.nextInt();
        int qty = rand.nextInt(5)+1; //+1 so that bound starts at 1, not 0;

        //add items to arraylist
        groceries.add(new GroceryInvoiceApp(item, price, qty));
        System.out.println("Do you want to input another Grocery item?  Yes or no");
        response = in.next();
        in.nextLine();
    }while(!response.equalsIgnoreCase("no"));

    double total = 0;
    int purchase = 0;
        System.out.println("Item" + "\t Price " + "\t Quantity" + "\t Cost");
    for(GroceryInvoiceApp g:groceries){
        System.out.print(g.getItem() + " \t");
        System.out.print("$" + g.getPrice() +  "\t\t");
        System.out.print(g.getQuantity() + "\t\t");
        System.out.print("$" + g.getCost() +"\t\t\n");

        total +=g.getCost(); //this comes from method getCost in GroceryInvoiceApp
        purchase = groceries.size(); //this is the array list "groceries" size

    }
        System.out.printf("Total Purchase Amount = " + "$"+"%.2f",total);
        System.out.println("\nTotal Items Purchased: " + "\t"+purchase);

        //bonus
        if(total>20){
            System.out.println("You spent too much today...");
        }else {
            System.out.println("Thank you for shopping at my market!");
        }
    }
}
