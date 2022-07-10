package com.example.testApp1.Order;

public class Order {
    private Long id;
    private Long profileId;
    private String profileEmail;
    private String profileNumber;
    private Long wic;

    public Order(Long id) {
        this.id = id;
    }

    public Order() {
    }
    public Order(Long id, Long profileId, String profileEmail, String profileNumber, Long wic) {
        this.id = id;
        this.profileId = profileId;
        this.profileEmail = profileEmail;
        this.profileNumber = profileNumber;
        this.wic = wic;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", profileId=" + profileId +
                ", profileEmail='" + profileEmail + '\'' +
                ", profileNumber='" + profileNumber + '\'' +
                ", wic=" + wic +
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

    public String getProfileEmail() {
        return profileEmail;
    }

    public void setProfileEmail(String profileEmail) {
        this.profileEmail = profileEmail;
    }

    public String getProfileNumber() {
        return profileNumber;
    }

    public void setProfileNumber(String profileNumber) {
        this.profileNumber = profileNumber;
    }

    public Long getWic() {
        return wic;
    }

    public void setWic(Long wic) {
        this.wic = wic;
    }
}
