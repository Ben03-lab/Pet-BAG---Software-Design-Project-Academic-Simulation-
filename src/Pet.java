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
