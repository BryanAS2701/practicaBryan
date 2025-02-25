package com.poryect1.practicaBryan.Security.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class RequestException extends RuntimeException{
    @Getter
    @Setter
    private String code;
    public RequestException(String code, String message){
        super(message);
        this.code= code;
    }
}
