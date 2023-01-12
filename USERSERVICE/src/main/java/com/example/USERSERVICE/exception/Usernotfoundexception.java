package com.example.USERSERVICE.exception;

public class Usernotfoundexception extends  RuntimeException{

public Usernotfoundexception(String m)
{
    super(m);
}

    public Usernotfoundexception()
    {
        super("Resource not found on server!..");
    }
}
