package com.zipcodewilmington;



/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        StringBuilder result = new StringBuilder(); // (24) alternative to S.B is assigning result to empty string. (27) result.append would become result +=(person array and line (30) return result
        int counter = 0; // counter created
        while (counter < personArray.length) { // while counter is less than the length of the person array, count
            result.append(personArray[counter]); // counter is placed inside person array index to identify current person. this person is then appended to the result
            counter++;
        }
        return result.toString(); // recommended using .toString to convert StringBuilder created from .append
    }



    public String forLoop() {
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        int counter = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= personArray.length-1; i++) {
                result.append(personArray[counter]);
                counter++;
            }
        return result.toString();
    }

    public String forEachLoop() {
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        int counter=0; // created counter
        StringBuilder result = new StringBuilder("");
        for(Person name : personArray) {
            result.append(personArray[counter]);
            counter++;
        }
        return result.toString();
    }
    }
