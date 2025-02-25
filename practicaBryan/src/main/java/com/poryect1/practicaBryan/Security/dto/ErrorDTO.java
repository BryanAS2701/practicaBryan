package com.poryect1.practicaBryan.Security.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class ErrorDTO {
    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    private String message;
}
