package br.com.unifuck.lib.Repositories;


import br.com.unifuck.lib.Entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<BookEntity,Integer> {
}
