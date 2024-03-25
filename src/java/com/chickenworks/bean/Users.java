package com.chickenworks.bean;

public class Users
{
    private String user_id;
    private String user_email;
    private String user_name;
    private String user_pass;
    private String user_type;

    public Users() {}

    public Users(String user_id, String user_email, String user_name, String user_pass, String user_type)
    {
        this.user_id = user_id;
        this.user_email = user_email;
        this.user_name = user_name;
        this.user_pass = user_pass;
        this.user_type = user_type;
    }

    public String getUser_type()
    {
        return user_type;
    }

    public void setUser_type(String user_type)
    {
        this.user_type = user_type;
    }

    public String getUser_id()
    {
        return user_id;
    }

    public void setUser_id(String user_id)
    {
        this.user_id = user_id;
    }

    public String getUser_email()
    {
        return user_email;
    }

    public void setUser_email(String user_email)
    {
        this.user_email = user_email;
    }

    public String getUser_name()
    {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }
}