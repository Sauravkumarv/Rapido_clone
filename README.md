#  Rapido Clone – Core Java Console Application

##  📌 Project Overview

This project is a **simplified Rapido ride-booking system** built using **pure Core Java**.  
It is a **console-based application** where a user can:

- Choose a ride
- Enter distance
- Calculate fare
- Book a ride using **prefilled data**

The main goal of this project is to demonstrate a **strong understanding of Core Java concepts, OOP principles, and layered architecture**, without using any framework or database.

---

##  ✨  Features

- View available rides (Bike / Auto / Cab)
- Select ride using number input
- Input distance in kilometers
- Automatic fare calculation
- Input validation (no crash on wrong input)
- Clean, modular, and scalable architecture

---

## 🧠 Java Concepts Used

- OOP Principles
- Abstraction
- Inheritance
- Polymorphism
- Encapsulation
- Abstract Classes & Method Overriding
- Interfaces
- Collections (List, ArrayList)
- Layered Architecture
- Input Validation using Scanner
- Control Flow (loops, conditions)

---

## 🏗️ Project Architecture (Layered Design)

rapido-clone
│
├── model
│ ├── Ride.java
│ ├── Bike.java
│ ├── Auto.java
│ ├── Cab.java
│
├── service
│ ├── RideService.java
│
├── controller
│ ├── RideController.java
│
├── app
│ ├── RapidoApp.java


---

## 🔹 Layer Responsibilities

### 📦 Model Layer
- Defines ride structure and fare behavior
- Uses abstraction and inheritance
- Example: Ride, Bike, Auto, Cab

### ⚙️ Service Layer
- Handles business logic
- Provides available rides
- Easily extendable for surge pricing or discounts

### 🎮 Controller Layer
- Handles user input
- Performs validation
- Controls application flow

### 🚀 App Layer
- Entry point of application
- Contains `main()` method

---

## 🔄 Application Flow

1. User runs the application
2. Available rides are displayed
3. User selects a ride using number input
4. User enters distance in kilometers
5. Fare is calculated based on selected ride
6. Booking summary is displayed
