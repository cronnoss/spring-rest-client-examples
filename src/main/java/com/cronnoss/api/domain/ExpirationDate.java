package com.cronnoss.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpirationDate {

    private String id;
    private String date;
    private Integer timezoneType;
    private String timezone;
}
