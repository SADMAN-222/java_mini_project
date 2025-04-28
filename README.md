
# Hotel Management System (Console Based)

## 📖 Project Description
This is a **Console-based Java application** developed as part of the CSE110 course.  
The system provides basic hotel operations such as:
- Room booking
- Food ordering
- Customer checkout
- Room availability checking

Data is saved between sessions using **file serialization**.

---

## ✨ Features
- **Room Booking**
  - Book Luxury Double, Super Deluxe Double, Luxury Single, or Super Deluxe Single rooms.
- **Room Availability Check**
  - See the number of available rooms for each room type.
- **Order Food**
  - Add food orders to the customer's bill during their stay.
- **Checkout and Billing**
  - Generate a full invoice including room charges and food costs.
- **Data Persistence**
  - Customer and room data are saved into a file (`InfoOfCustomer.dat`) and loaded automatically.

---

## 🛠️ Technologies Used
- **Java SE** (Standard Edition)
- **Object Serialization** (`Serializable`, `ObjectOutputStream`, `ObjectInputStream`)
- **File Handling** (`File`, `FileInputStream`, `FileOutputStream`)
- **Multithreading** (`Runnable` Interface)
- **Exception Handling** (custom exception `NotAvailable`)



## 📂 File Structure
- HotelManagementSystem.java — Main source file containing:
  - Room booking
  - Food order handling
  - Billing
  - Room availability checking
  - Checkout process
- InfoOfCustomer.dat — Serialized data file storing room and customer information.

---

## 🖥️ Project Output

- Welcome screen with date and time
- Room selection and details
- Booking confirmation
- Food menu and order placement
- Final invoice (bill) after checkout
- Automatic data saving to file after operations



---

## 👨‍💻 Author

- **Sadman Ahmmed Chowdhuri **
- CSE110 - OOP 

---

## ⚡ Notes
- This project is designed for learning purposes.
- Only **console interaction** — no graphical interface.
- Supports **basic hotel management operations** only.
```

