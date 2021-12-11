package com.cronnoss.springrestclientexamples.services;

import com.cronnoss.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
