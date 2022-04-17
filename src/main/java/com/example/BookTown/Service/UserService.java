package com.example.BookTown.Service;

import com.example.BookTown.Entity.User;

public interface UserService /*extends UserDetailsService*/ {

    User getUserByEmail(String email);
    User createUser(User user);

}
