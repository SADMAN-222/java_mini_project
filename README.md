# Hotel Management System (Console Based)

## Project Description
This is a **Console-based Java application** developed as part of the CSE110 course.  
The system provides basic hotel operations such as room booking, food ordering, customer checkout, and room availability checking. Data persistence is handled through file serialization.

## Features
- **Room Booking**  
  Book Luxury Double, Super Deluxe Double, Luxury Single, or Super Deluxe Single rooms.
- **Room Availability Check**  
  View the number of available rooms by room type.
- **Order Food**  
  Order food items and attach the cost to the customer's bill.
- **Checkout and Billing**  
  Checkout process includes automatic invoice generation for room and food charges.
- **Data Persistence**  
  Customer and room data are saved into a file (`InfoOfCustomer.dat`) and loaded upon system start.

## Technologies Used
- **Java SE** (Standard Edition)
- **File I/O** (`FileInputStream`, `FileOutputStream`)
- **Serialization** (saving and loading Java objects)
- **Multithreading** (`Runnable` interface)
- **Exception Handling** (custom exception `NotAvailable`)

## How to Run
1. **Clone the repository**:
   ```bash
   git clone <your-repo-link>
