package com.app.myrhh.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class OfferRequest {
    private String title;
    private String description;
    private String location;
    private String degree;
    private Double salary;
    private String profile;
    private String companyId;
}
