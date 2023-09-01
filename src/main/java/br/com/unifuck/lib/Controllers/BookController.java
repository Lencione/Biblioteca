package br.com.unifuck.lib.Controllers;

import br.com.unifuck.lib.Entities.BookEntity;
import br.com.unifuck.lib.Services.BookService;
import br.com.unifuck.lib.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/books")
public class BookController {
  private final BookService service;

  @Autowired
  public BookController(BookService service){
    this.service = service;
  }

  @PostMapping
  public ResponseEntity<BookEntity> store(@RequestBody BookEntity book){

    return ResponseEntity.ok(service.create(book));
  }

  @GetMapping("get/{id}")
  public ResponseEntity<Optional<BookEntity>> get(@PathVariable Integer id){
    return ResponseEntity.ok(service.get(id));
  }
}
