Hotel Management System (Console Based)
Project Description
This is a Console-based Java application developed as part of the CSE110 course.
The system provides basic hotel operations such as room booking, food ordering, customer checkout, and room availability checking. Data persistence is handled through file serialization.

Features
Room Booking
Book Luxury Double, Super Deluxe Double, Luxury Single, or Super Deluxe Single rooms.

Room Availability Check
View the number of available rooms by room type.

Order Food
Order food items and attach the cost to the customer's bill.

Checkout and Billing
Checkout process includes automatic invoice generation for room and food charges.

Data Persistence
Customer and room data are saved into a file (InfoOfCustomer.dat) and loaded upon system start.

Technologies Used
Java SE (Standard Edition)

File I/O (FileInputStream, FileOutputStream)

Serialization (saving and loading Java objects)

Multithreading (Runnable interface)

Exception Handling (custom exception NotAvailable)

How to Run
Clone the repository:

bash
Copy
Edit
git clone <your-repo-link>
Navigate to the project directory:

bash
Copy
Edit
cd HotelManagementSystem
Compile the code:

bash
Copy
Edit
javac HotelManagementSystem.java
Run the application:

bash
Copy
Edit
java HotelManagementSystem
File Structure
HotelManagementSystem.java: Main program file containing all the logic (room booking, food order, billing, etc.)

InfoOfCustomer.dat: Data file for storing room and customer details.

Project Screenshots
(Optional: Add screenshots showing console outputs like booking, ordering food, and invoice.)

Author
Sadman Ahmmed Chowdhuri

Course: CSE110

