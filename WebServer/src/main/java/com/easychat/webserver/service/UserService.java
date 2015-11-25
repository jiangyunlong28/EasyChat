package com.easychat.webserver.service;

import com.easychat.webserver.model.User;

/**
 * Created by yonah on 15-10-18.
 */
public interface UserService {
    String addUser(String json);
    boolean hasUser(Long id);
    User getUserByName(String name);
}