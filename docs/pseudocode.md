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

