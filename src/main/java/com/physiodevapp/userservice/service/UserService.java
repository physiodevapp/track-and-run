package com.physiodevapp.userservice.service;

import com.physiodevapp.userservice.model.User;
import com.physiodevapp.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public User getUserById(Long id) {
    return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }

  public void deleteUser(Long id) {
    userRepository.deleteById(id);
  }
}
