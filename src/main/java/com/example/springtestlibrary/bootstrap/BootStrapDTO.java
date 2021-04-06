package com.example.springtestlibrary.bootstrap;

import com.example.springtestlibrary.entity.Author;
import com.example.springtestlibrary.entity.Book;
import com.example.springtestlibrary.entity.Publisher;
import com.example.springtestlibrary.repository.AuthorRepository;
import com.example.springtestlibrary.repository.BookRepository;
import com.example.springtestlibrary.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapDTO implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapDTO(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publisher");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        publisherRepository.save(publisher);

        System.out.println("Publisher count: " + publisherRepository.count());

        Author author = new Author("Mike", "Golden");
        Book book = new Book("Harry Potter", "241834172392");
        author.getBooks().add(book);
        book.getAuthors().add(author);
        publisher.getBooks().add(book);

        authorRepository.save(author);
        bookRepository.save(book);
        publisherRepository.save(publisher);

        Author newAuthor = new Author("John", "Lennon");
        Book newBook = new Book("Way in future", "43813871873");
        newAuthor.getBooks().add(newBook);
        newBook.getAuthors().add(newAuthor);
        publisher.getBooks().add(newBook);

        authorRepository.save(newAuthor);
        bookRepository.save(newBook);
        publisherRepository.save(publisher);

        System.out.println("We are created news");
        System.out.println("We are have books number: " + bookRepository.count());
        System.out.println("Publisher number of books: " + publisher.getBooks().size());


    }

}
