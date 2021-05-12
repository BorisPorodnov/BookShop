package net.porodnov.bookshop.service;

import net.porodnov.bookshop.dao.BookDao;
import net.porodnov.bookshop.entity.BookEntity;
import net.porodnov.bookshop.exception.BookNotFoundException;
import net.porodnov.bookshop.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public Book getBookBy(BookEntity entity) throws BookNotFoundException {
        BookEntity e = bookDao.findByTitle(entity.getTitle());
        if (e == null) {
            throw new BookNotFoundException("Данной книги не существует");
        }
        Book bookResponse = Book.toModel(e);
        return bookResponse;
    }

        public List<Book> getBook() throws BookNotFoundException {
            List<BookEntity> listBooks = (List<BookEntity>) bookDao.findAll();
            List<Book> books = new ArrayList<>();
            if (listBooks.isEmpty()) {
                throw new BookNotFoundException("Книг не существеут");
            }
            for (BookEntity book : listBooks) {
                Book bookRes = Book.toModel(book);
                books.add(bookRes);
            }
            return books;
        }

    }