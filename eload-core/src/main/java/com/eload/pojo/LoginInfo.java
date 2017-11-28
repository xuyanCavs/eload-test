package com.eload.pojo;

public class LoginInfo {
    private Long id;

    private String username;

    private String password;

    private Byte state;

    private Byte usertype;

    private Boolean admin;

    public LoginInfo(Long id, String username, String password, Byte state, Byte usertype, Boolean admin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.state = state;
        this.usertype = usertype;
        this.admin = admin;
    }

    public LoginInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getUsertype() {
        return usertype;
    }

    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}