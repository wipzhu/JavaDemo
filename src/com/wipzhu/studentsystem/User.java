package com.wipzhu.studentsystem;

public class User {
    private String username;
    private String password;
    private String phoneNumber;
    private String personId;

    public User() {
    }

    public User(String username, String password, String phoneNumber, String personId) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.personId = personId;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取
     * @return personId
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * 设置
     * @param personId
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String toString() {
        return "User{username = " + username + ", password = " + password + ", phoneNumber = " + phoneNumber + ", personId = " + personId + "}";
    }
}
