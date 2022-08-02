package com.example.testApp1.Customer;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table
public class Customer {

    @Id
    @SequenceGenerator(
            name="customer_sequence",
            sequenceName="customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator="customer_sequence"
    )
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;
    private String state;
    private Integer zipCode;
    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email != null) {
            this.email = email;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName != null) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName != null) {
            this.lastName = lastName;
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age != null) {
            this.age = age;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address != null) {
            this.address = address;
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if(state !=null) {
            this.state = state;
        }
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        if(zipCode != null) {
            this.zipCode = zipCode;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber != null) {
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public Customer(Long id) {
        this.id = id;
    }

    public Customer() {
    }
    public Customer(Long id, String email, String phoneNumber) {
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    //doesn't have id because DB will generate id automatically
    public Customer(Long id,String email, String firstName, String lastName, Integer age, String address, String state, Integer zipCode, String phoneNumber) {
       this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }
}
