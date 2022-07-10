package com.example.testApp1.Payment;

public class Payment {
    private Long id;
    private Long profileId;
    private String email;
    private String billingAddress;
    private String firstName;
    private String lastName;
    private String cardNumber;
    private String cardType;
    private Integer paymentCode;

    public Payment(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", profileId=" + profileId +
                ", email='" + email + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardType='" + cardType + '\'' +
                ", paymentCode=" + paymentCode +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Integer getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(Integer paymentCode) {
        this.paymentCode = paymentCode;
    }

    public Payment(Long id, Long profileId, String cardNumber) {
        this.id = id;
        this.profileId = profileId;
        this.cardNumber = cardNumber;
    }

    public Payment() {
    }
}
