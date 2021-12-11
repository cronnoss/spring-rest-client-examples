package com.cronnoss.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Card {

    private String id;
    private String type;
    private String number;
    private Set<ExpirationDate> expirationDates;
    private String ibon;
    private String swift;
}
