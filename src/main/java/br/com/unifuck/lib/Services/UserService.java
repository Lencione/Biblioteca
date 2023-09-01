package br.com.unifuck.lib.Services;

import br.com.unifuck.lib.Entities.UserEntity;
import br.com.unifuck.lib.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

  private UserRepository repository;
  @Autowired
  public UserService(UserRepository repository){
    this.repository = repository;
  }

  public UserEntity createUser(UserEntity user){
    return repository.save(user);
  }

  public Optional<UserEntity> get(Integer id){
    return repository.findById(id);
  }

}
