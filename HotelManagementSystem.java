import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class FoodItem implements Serializable {
    int items;
    int quantity;
    float price;

    FoodItem(int items, int quantity) { // inteface
        this.items = items;
        this.quantity = quantity;
        switch (items) {
            case 1:
                price = quantity * 50;
                break;
            case 2:
                price = quantity * 60;
                break;
            case 3:
                price = quantity * 70;
                break;
            case 4:
                price = quantity * 30;

                break;
            case 5:
                price = quantity * 15;
                break;

                case 6:
                price = quantity *290;
            
            
        }
    }
}

class Singleroom implements Serializable {
    String name;
    String contact;
    String gender;
    ArrayList<FoodItem> food = new ArrayList<>(); // interface

    Singleroom() {
        this.name = "";
    }

    Singleroom(String name, String contact, String gender) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
    }
}

class Doubleroom extends Singleroom implements Serializable {
    String name2;
    String contact2; // inheritance
    String gender2;

    Doubleroom() {
        this.name = "";
        this.name2 = "";
    }

    Doubleroom(String name, String contact, String gender, String name2, String contact2, String gender2) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
        this.name2 = name2;
        this.contact2 = contact2;
        this.gender2 = gender2;
    }
}

class NotAvailable extends Exception {
    @Override
    public String toString() {
        return "Not Available !";                  //userdefine exception handling//
    }
}

class customer implements Serializable {
    Doubleroom luxury_doublerrom[] = new Doubleroom[10]; // Luxury //inteface
    Doubleroom deluxe_doublerrom[] = new Doubleroom[20]; // Deluxe
    Singleroom luxury_singleerrom[] = new Singleroom[10]; // Luxury
    Singleroom deluxe_singleerrom[] = new Singleroom[20]; // Deluxe
}

class Hotel {
    static customer  hotel_ob = new customer();
    static Scanner sc = new Scanner(System.in);

    static void CustDetails(int i, int rn) {
        String name, contact, gender;
        String name2 = null, contact2 = null;
        String gender2 = "";
        System.out.print("\nEnter customer name: ");
        name = sc.next();
        System.out.print("Enter contact number: ");
        contact = sc.next();
        System.out.print("Enter gender: ");
        gender = sc.next();
        if (i < 3) {
            System.out.print("Enter second customer name: ");
            name2 = sc.next();
            System.out.print("Enter contact number: ");
            contact2 = sc.next();
            System.out.print("Enter gender: ");
            gender2 = sc.next();
        }

        switch (i) {
            case 1:
                hotel_ob.luxury_doublerrom[rn] = new Doubleroom(name, contact, gender, name2, contact2, gender2);
                break;
            case 2:
                hotel_ob.deluxe_doublerrom[rn] = new Doubleroom(name, contact, gender, name2, contact2, gender2);
                break;
            case 3:
                hotel_ob.luxury_singleerrom[rn] = new Singleroom(name, contact, gender);
                break;
            case 4:
                hotel_ob.deluxe_singleerrom[rn] = new Singleroom(name, contact, gender);
                break;
            default:
                System.out.println("You choose Wrong option!!");
                break;
        }
    }

    static void bookroom(int i) {
        int j;
        int rn;
        System.out.println("\nChoose Room Number from The Given Room Here : ");
        switch (i) {
            case 1:
                for (j = 0; j < hotel_ob.luxury_doublerrom.length; j++) {
                    if (hotel_ob.luxury_doublerrom[j] == null) {
                        System.out.print(j + 1 + ",");
                    }
                }
                System.out.println("Enter room number: ");
                try {
                    rn = sc.nextInt();
                    rn--;
                    if (hotel_ob.luxury_doublerrom[rn] != null)
                        throw new NotAvailable();
                    CustDetails(i, rn);
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 2:
                for (j = 0; j < hotel_ob.deluxe_doublerrom.length; j++) {
                    if (hotel_ob.deluxe_doublerrom[j] == null) {
                        System.out.print(j + 11 + ",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try {
                    rn = sc.nextInt();
                    rn = rn - 11;
                    if (hotel_ob.deluxe_doublerrom[rn] != null)
                        throw new NotAvailable();
                    CustDetails(i, rn);
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 3:
                for (j = 0; j < hotel_ob.luxury_singleerrom.length; j++) {
                    if (hotel_ob.luxury_singleerrom[j] == null) {
                        System.out.print(j + 31 + ",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try {
                    rn = sc.nextInt();
                    rn = rn - 31;
                    if (hotel_ob.luxury_singleerrom[rn] != null)
                        throw new NotAvailable();
                    CustDetails(i, rn);
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 4:
                for (j = 0; j < hotel_ob.deluxe_singleerrom.length; j++) {
                    if (hotel_ob.deluxe_singleerrom[j] == null) {
                        System.out.print(j + 41 + ",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try {
                    rn = sc.nextInt();
                    rn = rn - 41;
                    if (hotel_ob.deluxe_singleerrom[rn] != null)
                        throw new NotAvailable();
                    CustDetails(i, rn);
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
        System.out.println("Room Booked");
    }

    static void features(int i) {
        switch (i) {
            case 1:
                System.out.println("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per night BDT:6999 ");
                break;
            case 2:
                System.out.println("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per night BDT:6549  ");
                break;
            case 3:
                System.out.println("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per night BDT:5999  ");
                break;
            case 4:
                System.out.println("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per night BDT:5549 ");
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
    }

    static void availability(int i) {
        int j, count = 0;
        switch (i) {
            case 1:
                for (j = 0; j < 10; j++) {
                    if (hotel_ob.luxury_doublerrom[j] == null)
                        count++;
                }
                break;
            case 2:
                for (j = 0; j < hotel_ob.deluxe_doublerrom.length; j++) {
                    if (hotel_ob.deluxe_doublerrom[j] == null)
                        count++;
                }
                break;
            case 3:
                for (j = 0; j < hotel_ob.luxury_singleerrom.length; j++) {
                    if (hotel_ob.luxury_singleerrom[j] == null)
                        count++;
                }
                break;
            case 4:
                for (j = 0; j < hotel_ob.deluxe_singleerrom.length; j++) {
                    if (hotel_ob.deluxe_singleerrom[j] == null)
                        count++;
                }
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
        System.out.println("Number of rooms available : " + count);
    }

    static void bill(int rn, int rtype) {
        double amount = 0;
        String list[] = { "Sandwich", "Pasta", "Noodles", "Coke", "water", "Khechuri" };
        System.out.println("\\\\\\\\\\\\\\\\");
        System.out.println(" INVOICE:-");
        System.out.println("*******");

        switch (rtype) {
            case 1:
                amount += 4000;
                System.out.println("\t\t  Room Charge BDT- " + 6999);
                System.out.println("........................................");
                System.out.println("        Food cost BDT-                  ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("    Item       Quantity       Price     ");
                System.out.println("----------------------------------------");
                for (FoodItem obb : hotel_ob.luxury_doublerrom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.items - 1], obb.quantity, obb.price);
                }

                break;
            case 2:
                amount += 3000;
                System.out.println("\t\tRoom Charge BDT -" + 6549);
                System.out.println("........................................");
                System.out.println("        Food cost BDT- ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("    Item       Quantity       Price");
                System.out.println("----------------------------------------");
                for (FoodItem obb : hotel_ob.deluxe_doublerrom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.items - 1], obb.quantity, obb.price);
                }
                break;
            case 3:
                amount += 2200;
                System.out.println("\t\tRoom Charge BDT -" + 5999);
                System.out.println("........................................");
                System.out.println("        Food cost BDT- ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("    Item       Quantity       Price");
                System.out.println("----------------------------------------");
                for (FoodItem obb : hotel_ob.luxury_singleerrom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.items - 1], obb.quantity, obb.price);
                }
                break;
            case 4:
                amount += 1200;
                System.out.println("Room Charge - BDT-" + 5549);
                System.out.println(".......................................");
                System.out.println("        Food cost BDT- ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("    Item       Quantity       Price");
                System.out.println("----------------------------------------");
                for (FoodItem obb : hotel_ob.deluxe_singleerrom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.items - 1], obb.quantity, obb.price);
                }
                break;
            default:
                System.out.println("Not valid");
        }
        System.out.println("\nTotal Amount- " + amount);
    }

    static void deallocate(int rn, int rtype) {
        //int j;
        char w;
        switch (rtype) {
            case 1:
                if (hotel_ob.luxury_doublerrom[rn] != null)
                    System.out.println("Room used by " + hotel_ob.luxury_doublerrom[rn].name);
                else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println("Do You Want to Checkout From Our Hotel ? if Yes, press (y) else press(n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);
                    hotel_ob.luxury_doublerrom[rn] = null;
                    System.out.println("Deallocated succesfully");
                }

                break;
            case 2:
                if (hotel_ob.deluxe_doublerrom[rn] != null)
                    System.out.println("Room used by " + hotel_ob.deluxe_doublerrom[rn].name);
                else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to checkout ?(y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);
                    hotel_ob.deluxe_doublerrom[rn] = null;
                    System.out.println("Deallocated succesfully");
                }

                break;
            case 3:
                if (hotel_ob.luxury_singleerrom[rn] != null)
                    System.out.println("Room used by " + hotel_ob.luxury_singleerrom[rn].name);
                else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to checkout ? (y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);
                    hotel_ob.luxury_singleerrom[rn] = null;
                    System.out.println("Deallocated succesfully");
                }

                break;
            case 4:
                if (hotel_ob.deluxe_singleerrom[rn] != null)
                    System.out.println("Room used by " + hotel_ob.deluxe_singleerrom[rn].name);
                else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to checkout ? (y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);
                    hotel_ob.deluxe_singleerrom[rn] = null;
                    System.out.println("Deallocated succesfully");
                }
                break;
            default:
                System.out.println("\nEnter valid option : ");
                break;
        }
    }

    static void order(int rn, int rtype) {
        int i, q;
        char yes;
        try {
            System.out.println("\n ===========================\n          Our Menu:  \n ===========================\n");
            System.out.println(" Item\t\t  Price");
            System.out.println("-------\t-----\t---------");
            System.out.println("1.Sandwich\tBDT: 155");
            System.out.println("2.Pasta(oven)\tBDT: 260");
            System.out.println("3.Noodles\tBDT: 70");
            System.out.println("4.Coke(250ml)\tBDT: 25");
            System.out.println("5.Water(250ml)\tBDT: 15");
            System.out.println("6.Khechuri\tBDT:290");

            do {
                i = sc.nextInt();
                System.out.print("Quantity- ");
                q = sc.nextInt();

                switch (rtype) {
                    case 1:
                        hotel_ob.luxury_doublerrom[rn].food.add(new FoodItem(i, q));
                        break;
                    case 2:
                        hotel_ob.deluxe_doublerrom[rn].food.add(new FoodItem(i, q));
                        break;
                    case 3:
                        hotel_ob.luxury_singleerrom[rn].food.add(new FoodItem(i, q));
                        break;
                    case 4:
                        hotel_ob.deluxe_singleerrom[rn].food.add(new FoodItem(i, q));
                        break;

                }
                System.out.println("Do you want to order more ? (y/n)");
                yes = sc.next().charAt(0);
            } while (yes == 'y' || yes == 'Y');
        } catch (NullPointerException e) {
            System.out.println("\nRoom not booked");
        } catch (Exception e) {
            System.out.println("Cannot be done");
        }
    }
}

class write implements Runnable {
    customer hotel_ob;

    write(customer hotel_ob) {
        this.hotel_ob = hotel_ob;
    }

    @Override
    public void run() {
        try {
            FileOutputStream fout = new FileOutputStream("InfoOfCustomer.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fout); // Write info of a customer in backep file//
            oos.writeObject(hotel_ob);
            oos.close();
        } catch (Exception e) {
            System.out.println("Error in writing " + e);
        }

    }

}

public class HotelManagementSystem {
    public static void main(String[] args) {

        try {
            File f = new File("InfoOfCustomer.dat");
            if (f.exists()) {
                FileInputStream fin = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fin); // read from the file for checkout of a customer//
                Hotel.hotel_ob = (customer) ois.readObject();
                ois.close();
            }
            Scanner sc = new Scanner(System.in);
            int ch, ch2;
            char yes;
            x: do {

                System.out.println("           ________________________");
                System.out.println("          |                        |");
                System.out.println("          |  WELCOME TO OUR HOTEL  |");
                System.out.println("          |________________________|");
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("             yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                System.out.println(dtf.format(now));
                System.out.println("0000000000000000000000000000000000000000000000000");
                System.out.println("0...............................................0");
                System.out.println("0..........**THE HOTEL ABASHIK**................0");
                System.out.println("0................**DHAKA**......................0");
                System.out.println("0...............................................0");
                System.out.println("0000000000000000000000000000000000000000000000000\n");
                System.out.println(" 1.Show Room Details");
                System.out.println(" 2.Show Room Availability");
                System.out.println(" 3.Want to Book");
                System.out.println(" 4.Want to OrderFood");
                System.out.println(" 5.Want to checkout");
                System.out.println(" 6.Want to exit form this site");
                System.out.println("Enter Your Choiche:");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println(
                                "\nChoose room type :\n1.Luxury Double Room \n2.Super Deluxe Double Room \n3.Luxury Single Room \n4.Super Deluxe Single Room\n");
                        ch2 = sc.nextInt();
                        Hotel.features(ch2);
                        break;
                    case 2:
                        System.out.println(
                                "\nChoose room type :\n1.Luxury Double Room \n2.Super Deluxe Double Room \n3.Luxury Single Room\n4.Super Deluxe Single Room\n");
                        ch2 = sc.nextInt();
                        Hotel.availability(ch2);
                        break;
                    case 3:
                        System.out.println(
                                "\nChoose room type :\n1.Luxury Double Room \n2.Super Deluxe Double Room \n3.Luxury Single Room\n4.Super Deluxe Single Room\n");
                        ch2 = sc.nextInt();
                        Hotel.bookroom(ch2);
                        break;
                    case 4:
                        System.out.print("Room Number -");
                        ch2 = sc.nextInt();
                        if (ch2 > 60)
                            System.out.println("This Room Number doesn't exist");
                        else if (ch2 > 40)
                            Hotel.order(ch2 - 41, 4);
                        else if (ch2 > 30)
                            Hotel.order(ch2 - 31, 3);
                        else if (ch2 > 10)
                            Hotel.order(ch2 - 11, 2);
                        else if (ch2 > 0)
                            Hotel.order(ch2 - 1, 1);
                        else
                            System.out.println("This Room  Number doesn't exist");
                        break;
                    case 5:
                        System.out.print("Room Number -");
                        ch2 = sc.nextInt();
                        if (ch2 > 60)
                            System.out.println("The Room Number doesn't exist");
                        else if (ch2 > 40)
                            Hotel.deallocate(ch2 - 41, 4);
                        else if (ch2 > 30)
                            Hotel.deallocate(ch2 - 31, 3);
                        else if (ch2 > 10)
                            Hotel.deallocate(ch2 - 11, 2);
                        else if (ch2 > 0)
                            Hotel.deallocate(ch2 - 1, 1);
                        else
                            System.out.println("The Room Number doesn't exist");
                        break;
                    case 6:
                        break x;

                }

                System.out.println("\nDo you want to continue ? IF Continue press (y) else doesn't continue press (n)");
                yes = sc.next().charAt(0);
                if (!(yes == 'y' || yes == 'Y' || yes== 'n' || yes == 'N')) {
                    System.out.println("Invalid Option");
                    System.out.println(
                            "\nDo you want to continue ? IF Continue press (y) else doesn't continue press (n)");
                    yes = sc.next().charAt(0);
                }

            } while (yes == 'y' || yes== 'Y');

            Thread t = new Thread(new write(Hotel.hotel_ob));
            t.start();
        } catch (Exception e) {
            System.out.println("Not a valid input");
        }
    }
}