# Pet BAG – Software Design Project (Academic Simulation)
Java Class • Pseudocode • Flowchart • OOP Summary  
Author: Ben

---

## Project Overview
This repository contains my work for a **school project** based on a simulated industry scenario involving *Global Rain*, a fictional software engineering company. The assignment required designing part of a software system for a fictional client, **Pet Boarding and Grooming (Pet BAG)**, which wants to modernize its check‑in and check‑out processes.

The goal of this project was to practice:
- Reading and interpreting UML class diagrams  
- Designing and implementing a Java class  
- Writing high‑level pseudocode  
- Creating a flowchart to model system logic  
- Applying object‑oriented programming (OOP) principles  

This project is part of my academic coursework and is not affiliated with any real company.

---

## 📁 Repository Structure


---

## Pet.java Class (Summary)
The `Pet` class was implemented using the UML class diagram provided in the assignment.  
It includes:

- All required **attributes** with appropriate data types  
- A constructor that initializes the pet’s information  
- **Getters and setters** for each attribute  
- Clear inline comments for readability and maintainability  

This class represents the foundation of the Pet BAG system and demonstrates how object‑oriented design translates from UML to Java code.

View the file here:  
[`src/Pet.java`](src/Pet.java)

// Pet.java
// This class represents a pet staying at Pet Bag. It is based on the UML
// specification provided by Global Rain. The class includes attributes,
// constructors, and accessor/mutator methods following OO principles.

public class Pet {
	
	//----------------------------------
	// Attributes (Encapsulated)
	//----------------------------------
	private String petType;    // Dog or Cat
	private String petName;    // Name of the pet
	private int petAge;        // Age in years
	private int dogSpaces;     // Number of dog spaces available
	private int catSpaces;     // Number of cat spaces available
	private int daysStay;      // Number of days the pet will stay
	private double amountDue;  // Total cost for the stay
	
	//----------------------------------
	// Constructor
	//----------------------------------
	// Initialization all attributes (Exceeds Expectations)
	public Pet(String petType, String petName, int petAge,
			int dogSpaces, int catSpaces, int dayStay, double amountDue) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
		this.dogSpaces = dogSpaces;
		this.catSpaces = catSpaces;
		this.daysStay = daysStay;
		this.amountDue = amountDue;
	}
	
	//-----------------------------------
	//Default constructor
	//-----------------------------------
	public Pet() {
	}
	
	// ----------------------------------
	   Accessors (Getters)
	//-----------------------------------
    public String getPetType() { return petType; }
	public String getPetName() { return petName; }
	public int getPetAge() return { petAge; }
	public int getDogSpaces() { return dogSpaces; }
	public int getCatSpaces() { return catSpaces; }
	public int getDaysStay() { return daysStay; }
	public double getAmountDue() { return amountDue; }
	   
	 //----------------------------------
	 // Mutators (Setters)
	 //----------------------------------
	public void setPetType(String petType) { this.petType = petType; }
	public void setPetName(String petName) { this.petName = petName; }
	public void setPetAge(int petAge) { this.petAge = petAge; }
	public void setDogSpaces(int dogSpaces) { this.dogSpaces = dogSpaces; }
	public void setCatSpaces(int catSpaces) { this.catSpaces = catSpaces; }
	public void setDaysStay(int daysStay) { this.daysStay = daysStay; }
	public void setAmountDue(double amountDue) { this.amountDue = amountDue; }
	}
}

---

## Pseudocode
The pseudocode for the selected method (pet check‑in or pet check‑out) is located in:

[`docs/Pseudocode.md`](docs/Pseudocode.md)
https://github.com/Ben03-lab/Pet-BAG---Software-Design-Project-Academic-Simulation-/edit/main/docs/pseudocode.md

It outlines the logic at a high level and follows the functional requirements from the assignment.

---

## Flowchart
The flowchart visually represents the logic of the selected method and includes:

- Start and end points  
- Decision branches  
- A clear flow aligned with the check‑in or check‑out process  

View the flowchart here:  

<img width="903" height="997" alt="Picture2" src="https://github.com/user-attachments/assets/b4075f20-4cdb-407b-94c6-32b169cd9643" />


---

## OOP Principles Applied
This project demonstrates core object‑oriented programming concepts.  
The `Pet` class uses **encapsulation** by keeping attributes private and exposing them through public getters and setters. The constructor ensures proper initialization of object state. Although this project focuses on a single class, the UML diagram shows how inheritance and class relationships would be used in a larger system. This design approach supports modularity, scalability, and maintainability — key goals in object‑oriented software development.

---

## Notes
This project is part of an academic assignment and uses fictional companies and scenarios.  
It is intended for learning, practice, and portfolio demonstration.
