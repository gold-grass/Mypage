package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String interestList;
    private String saleList;
    private String buyList;
    private String bedge;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInterestList() {
        return interestList;
    }

    public void setInterestList(String interestList) {
        this.interestList = interestList;
    }

    public String getSaleList() {
        return saleList;
    }

    public void setSaleList(String saleList) {
        this.saleList = saleList;
    }

    public String getBuyList() {
        return buyList;
    }

    public void setBuyList(String buyList) {
        this.buyList = buyList;
    }

    public String getBedge() {
        return bedge;
    }

    public void setBedge(String bedge) {
        this.bedge = bedge;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
