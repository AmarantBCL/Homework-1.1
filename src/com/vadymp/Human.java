package com.vadymp;

public class Human {

    private String lastName;
    private String firstName;
    private String middleName;

    public Human(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Human(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        String fullName = String.format("%s %s", lastName, firstName);
        if (middleName != null) {
            return fullName + " " + middleName;
        }

        return fullName;
    }

    public String getShortName() {
        String shortName = String.format("%s %s.", lastName, firstName.charAt(0));
        if (middleName != null) {
            return shortName + " " + middleName.charAt(0) + ".";
        }

        return shortName;
    }
}
