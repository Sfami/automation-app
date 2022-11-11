package com.example.automationapp;

import org.springframework.http.HttpStatus;

public class Response {
    String message = "Done Running";
    HttpStatus status = HttpStatus.OK;

    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }

}
