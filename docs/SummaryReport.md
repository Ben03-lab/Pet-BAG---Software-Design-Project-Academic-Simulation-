# Global Rain Summary Report  
### Pet BAG Software Design Project (Academic Simulation)

---

## 1. Pseudocode for Selected Method

BENGIN Pet Check-In

PROMPT user for pet type (dog or cat)
STORE input in petType

IF petType is “dog” THEN
    IF dog spaces are available THEN
        DECREASE dogSpaces by 1
    ELSE
        DISPLAY “No dog spaces available”
        END process
    ENDIF
ELSE IF petType is “cat” THEN
    IF cat spaces are available THEN
        DECREASE catSpaces by 1
    ELSE
            DISPLAY “No cat spaces available”
            END process
    ENDIF
ELSE
        DISPLAY “Invalid pet type”
        END process
ENDIF
PROMPT user for pet name
STORE input in petName
PROMPT user for pet age
STORE input in petAge
PROMPT user for number of days staying
STORE input in daysStay

CALCULATE amountDue = daysStay * daylyrate

DISPLAY confirmation message with:
    petType, petName, daysStay, and amountDue

END Pet Check-In


---

## 2. Flowchart Reference

The flowchart for the selected method is included in the `/flowchart` folder.

![Flowchart](../flowchart/PetCheckInFlowchart.png)

---

## 3. Explanation of OOP Principles Applied

In this project, I applied core object-oriented programming (OOP) principles while designing the `Pet` class from the UML diagram. I used encapsulation by declaring all attributes as private and providing public getters and setters to control access to the data. The constructor initializes the object’s state and ensures that each Pet object begins with valid information. Although this assignment focuses on a single class, the UML diagram demonstrates how inheritance and class relationships would support a larger system. Following the UML structure helped me design a class that is modular, maintainable, and aligned with real-world software development practices.

---
