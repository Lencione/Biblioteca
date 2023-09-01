package br.com.unifuck.lib.Controllers;

import br.com.unifuck.lib.Entities.UserEntity;
import br.com.unifuck.lib.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/users")
public class UserController {
  private final UserService service;

  @Autowired
  public UserController(UserService service){
    this.service = service;
  }

  @PostMapping
  public ResponseEntity<UserEntity> store(@RequestBody UserEntity user){
    return ResponseEntity.ok(service.createUser(user));
  }

  @GetMapping("get/{id}")
  public ResponseEntity<Optional<UserEntity>> get(@PathVariable Integer id){
    return ResponseEntity.ok(service.get(id));
  }
}
