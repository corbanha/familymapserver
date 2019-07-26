package services.results;

import model.Person;

public class MultiPersonResult extends Result{
    private Person[] persons;

    /**
     * Creates a Multi Person Result object with an error message
     * @param message the error message that resulted when trying to get the persons
     */
    public MultiPersonResult(String message){
        super(message);
        persons = new Person[0];
    }

    /**
     * Creates a Multi Person Result object with the associated persons that was obtained
     * @param persons the persons found in the search
     */
    public MultiPersonResult(Person[] persons){
        super("");
        this.persons = persons;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }
}
