package com.luizfnds.workshopmongo.service;

import com.luizfnds.workshopmongo.domain.User;
import com.luizfnds.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        List<User> list = repository.findAll();
        return list;
    }

    public Optional<User> findById(String id){
        Optional<User> user = repository.findById(id);
        return user;
    }
}
