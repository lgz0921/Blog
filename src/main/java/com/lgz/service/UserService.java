package com.lgz.service;

import com.lgz.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
