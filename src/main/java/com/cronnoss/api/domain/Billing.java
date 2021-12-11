package com.cronnoss.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Billing {

    private String id;
    private Set<Card> card;
}
