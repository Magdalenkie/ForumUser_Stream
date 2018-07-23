package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int IDNum;
    private String name;
    private char sex;
    private LocalDate dateOfBirth;
    private int postsQuantity;

    public ForumUser(final int IDNum, String name, char sex, LocalDate dateOfBirth, int postsQuantity){
        this.IDNum = IDNum;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postsQuantity = postsQuantity;
    }

    public int getIDNum(){
        return IDNum;
    }

    public String getName(){
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "IDNum=" + IDNum +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
