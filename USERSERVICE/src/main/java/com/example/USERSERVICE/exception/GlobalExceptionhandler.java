package com.example.USERSERVICE.exception;

import com.example.USERSERVICE.entity.Apiresponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.lang.module.ResolutionException;

@RestControllerAdvice
public class GlobalExceptionhandler {


    @ExceptionHandler(Usernotfoundexception.class)
    public ResponseEntity<Apiresponse> handleresourcenotfound(Usernotfoundexception e)
    {
        Apiresponse build = Apiresponse.builder().message(e.getMessage()).Status(HttpStatus.NOT_FOUND).Success(false).build();
         return new ResponseEntity<Apiresponse>(build,HttpStatus.NOT_FOUND) ;
    }
}
