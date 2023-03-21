package com.example.demo;


public class Model {
    
    private Integer userId;
    private int numFiles;
    private byte[] filename;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    //private String mobNumber;

    public Model(Integer userId, String userName, String firstName, String lastName, String email, String password)
    {
        this.email = email;
        this.userId = userId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

   

    public void setUserID(Integer userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Model(Integer userId, int numFiles, String string, byte[] fileContent)
    {
        this.userId = userId;
        this.numFiles = numFiles;
        this.filename = fileContent;
    }

    public Model(int id, Integer userId2, int numFiles2, String originalFilename, byte[] fileContent) {
    }



    public Integer getUserID()
    {
        return userId;
    }

    // public void setUserID(Integer userId)
    // {
    //     this.userId = userId;
    // }

    public Integer getNumFiles()
    {
        return numFiles;
    }

    public void setNumFiles(int numFiles)
    {
        this.numFiles = numFiles;
    }

    public byte[] getFile()
    {
        return filename;
    }

    public void setFile(byte[] filename)
    {
        this.filename = filename;
    }
}

