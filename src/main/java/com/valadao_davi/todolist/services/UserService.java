package com.valadao_davi.todolist.services;

import com.valadao_davi.todolist.dto.UserDTO;
import com.valadao_davi.todolist.entities.User;
import com.valadao_davi.todolist.projections.UserMinProjection;
import com.valadao_davi.todolist.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<UserMinProjection> getAllUsers(){
        return userRepository.findAllBy().stream().toList();
    }

    @Transactional(readOnly = true)
    public UserMinProjection getMinUser(Long userId){
        return userRepository.findByUserId(userId).orElse(null);
    }

    @Transactional
    public UserDTO getUserById(Long userId){
        return userRepository.findById(userId).map(UserDTO::new).orElse(null);
    }

}
