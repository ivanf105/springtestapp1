package com.example.testApp1.Orders;

import javax.persistence.*;

@Entity
@Table
public class Orders {
    @Id
    @SequenceGenerator(
            name="order_sequence",
            sequenceName = "order_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_sequence"
    )
    private Long id;
    private Long profileId;
    private String profileEmail;
    private String profileNumber;
    private Long wic;

    public Orders(Long id) {
        this.id = id;
    }

    public Orders() {
    }
    public Orders(Long id, Long profileId, String profileEmail, String profileNumber, Long wic) {
        this.id = id;
        this.profileId = profileId;
        this.profileEmail = profileEmail;
        this.profileNumber = profileNumber;
        this.wic = wic;
    }

    @Override
    public String toString() {
        return "Orders{" +
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
