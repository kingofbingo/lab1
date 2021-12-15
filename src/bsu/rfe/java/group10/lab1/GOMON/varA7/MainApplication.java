package bsu.rfe.java.group10.lab1.GOMON.varA7;


import java.util.Scanner;

public class MainApplication {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        for (int i = 0; i < 20; i++) {
            System.out.println("Введите блюдо (если блюд достаточно, напишите стоп)");
            String food = scanner.nextLine();
            if (food.equals("сыр")) {
                breakfast[i] = new Cheese();
            } else if (food.equals("яблоко/большое")) {
                breakfast[i] = new Apple("большое");
            } else if (food.equals("яблоко/маленькое")) {
                breakfast[i] = new Apple("маленькое");
            } else if (food.equals("мороженое/шоколад")) {
                breakfast[i] = new IceCream("шоколад");
            } else if (food.equals("мороженое/карамель")) {
                breakfast[i] = new IceCream("карамель");
            }  else break;
        }
        for (int j=0; j<breakfast.length; j++) {
            if (breakfast[j] != null)
                breakfast[j].consume();
            else break;
        }

        int apple_counter=0;
        int cheese_counter=0;
        int ice_counter=0;
        for (int i = 0; i < 20; i++) {
            if(breakfast[i] != null){
            if(breakfast[i].equals(new Apple("большое"))) {
                apple_counter++;
            } else if(breakfast[i].equals(new Cheese()) ) {
                cheese_counter++;
            } else if(breakfast[i].equals(new IceCream("шоколад"))) {
                ice_counter++;
            }
            else if(breakfast[i].equals(new IceCream("карамель"))) {
                ice_counter++;
            }
            else if(breakfast[i].equals(new Apple("маленькое"))) {
                apple_counter++;
            }
        }}
        System.out.println("CЫР - " +cheese_counter );
        System.out.println("ЯБЛОКО - " +apple_counter );
        System.out.println("МОРОЖЕНОЕ - " + ice_counter);
    }
}
