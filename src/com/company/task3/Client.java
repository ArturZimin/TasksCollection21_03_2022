package com.company.task3;

import java.util.Comparator;
import java.util.Objects;

public class Client implements Comparable<Client> {

    private String firstName;
    private String lastName;
    private String location;

    public Client(String firstName, String lastName, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
    }
    public Client(){}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLocation() {
        return location;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(firstName, client.firstName) && Objects.equals(lastName, client.lastName) && Objects.equals(location, client.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, location);
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }


    @Override
    public int compareTo(Client o) {

        return this.getLocation().compareTo(o.getLocation());
    }
}
