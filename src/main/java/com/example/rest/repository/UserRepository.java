package com.example.rest.repository;

import com.example.rest.model.Authorities;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    final private String user = "Aleks";
    final private String password = "123";

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals(this.user) & password.equals(this.password)){
            return List.of(Authorities.values());
        }
        return null;
    }

}
