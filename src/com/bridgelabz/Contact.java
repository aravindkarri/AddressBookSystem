package com.bridgelabz;

class Contact
{
    private String firstname;
    private String lastname;
    private String city;
    private String state;
    private int zipcode;
    private String phonenumber;
    private String email;

    public Contact(String firstname, String lastname, String city, String state, int zipcode,
                   String phonenumber,String email)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phonenumber = phonenumber;
        this.email = email;
    }
    public String getFirstname()
    {
        return firstname;
    }
    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public int getZipcode()
    {
        return zipcode;
    }

    public void setZipcode(int zipcode)
    {
        this.zipcode = zipcode;
    }

    public String getPhonenumber()
    {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }

    public String getEmail()
    {
        return email;

    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return "Contact [firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + ", state="
                + state + ", zipcode=" + zipcode + ", phonenumber=" + phonenumber + ",email="+email+"]";
    }
}
