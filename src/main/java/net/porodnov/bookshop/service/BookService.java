package net.porodnov.bookshop.service;

import net.porodnov.bookshop.dao.BookDao;
import net.porodnov.bookshop.entity.BookEntity;
import net.porodnov.bookshop.exception.BookNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<BookEntity> getBook() throws BookNotFoundException {

        if (bookDao.findAll() == null) {
            throw new BookNotFoundException("Книг не существеут");
        }
        List<BookEntity> list = (List<BookEntity>) bookDao.findAll();
        return list;
    }


}