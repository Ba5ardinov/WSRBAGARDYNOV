package ru.startandroid.wsrbagardynov.Common;

public class RegisterRequest
{

    private  String email;
    private  String password;
    private  String firstname;
    private  String lastname;

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }
}
