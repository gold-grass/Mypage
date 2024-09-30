package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tradeComment;
    private String nickname;
    private float mannerTemp;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTradeComment() {
        return tradeComment;
    }

    public void setTradeComment(String tradeComment) {
        this.tradeComment = tradeComment;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getMannerTemp() {
        return mannerTemp;
    }

    public void setMannerTemp(float mannerTemp) {
        this.mannerTemp = mannerTemp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

