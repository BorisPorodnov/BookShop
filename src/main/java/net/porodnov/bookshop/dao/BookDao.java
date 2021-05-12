package net.porodnov.bookshop.dao;

import net.porodnov.bookshop.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<BookEntity, Long> {

    BookEntity findByTitle(String title);
}
