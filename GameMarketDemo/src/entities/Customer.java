package entities;

import abstracts.IEntity;

import java.time.LocalDate;

public class Customer implements IEntity {
    int id;
    String fName;
    String lName;

    public Customer(int id, String fName, String lName, LocalDate dayOfBirth, String natID) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.dayOfBirth = dayOfBirth;
        this.natID = natID;
    }

    LocalDate dayOfBirth;

    public Customer() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getNatID() {
        return natID;
    }

    public void setNatID(String natID) {
        this.natID = natID;
    }

    String natID;



}
