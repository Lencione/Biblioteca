package br.com.unifuck.lib.Services;

import br.com.unifuck.lib.Entities.BookEntity;
import br.com.unifuck.lib.Repositories.BooksRepository;
import br.com.unifuck.lib.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

  private final BooksRepository repository;
  private final UserRepository userRepository;
  @Autowired
  public BookService(BooksRepository repository, UserRepository userRepository){
    this.repository = repository;
    this.userRepository = userRepository;
  }

  public BookEntity create(BookEntity book){
    return repository.save(book);
  }

  public Optional<BookEntity> get(Integer id){
    return repository.findById(id);
  }

}
