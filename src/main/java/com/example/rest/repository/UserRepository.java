package com.example.rest.repository;

import com.example.rest.model.Authorities;
import com.example.rest.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    final private String name = "Aleks";
    final private String password = "123";

    public List<Authorities> getUserAuthorities(User user) {
        if (user.getName().equals(this.name) & user.getPassword().equals(this.password)) {
            return List.of(Authorities.values());
        }
        return null;
    }

}
