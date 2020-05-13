package com.emrys.rest.config.services;

import com.emrys.rest.config.domain.User;

import java.util.List;

/**
 * Created by jt on 9/21/17.
 */
public interface ApiService {

    List<User> getUsers(Integer limit);
}
