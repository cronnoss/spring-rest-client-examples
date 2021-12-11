package com.cronnoss.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {

    private String id;
    private String street;
    private String city;
    private String state;
    private String postcode;
}
