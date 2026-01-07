Rapido Clone – Core Java Console Application
 Project Overview

This project is a simplified Rapido ride-booking system built using pure Core Java.
It is a console-based application where a user can choose a ride, enter distance, calculate fare, and book a ride using prefilled data.

The main goal of this project is to demonstrate strong understanding of Core Java concepts, OOP principles, and layered architecture, without using any framework or database.

 Features

View available rides (Bike / Auto / Cab)

Select ride using number input

Input distance in kilometers

Automatic fare calculation

Input validation (no crash on wrong input)

Clean, modular, and scalable architecture

🧠 Java Concepts Used

OOP Principles

Abstraction

Inheritance

Polymorphism

Encapsulation

Abstract Classes & Method Overriding

Interfaces

Collections (List, ArrayList)

Layered Architecture

Input Validation using Scanner

Control Flow (loops, conditions)

🏗️ Project Architecture (Layered Design)
rapido-clone
│
├── model
│   ├── Ride.java
│   ├── Bike.java
│   ├── Auto.java
│   ├── Cab.java
│
├── service
│   ├── RideService.java
│
├── controller
│   ├── RideController.java
│
├── app
│   ├── RapidoApp.java

🔹 Layer Responsibilities

Model → Defines ride structure and fare behavior

Service → Business logic (available rides, future pricing logic)

Controller → Handles user input, validation, and flow

App → Application entry point (main())

🔄 Application Flow

User runs the application

Available rides are displayed

User selects a ride using number input

User enters distance in km

Fare is calculated based on selected ride

Booking summary is displayed
