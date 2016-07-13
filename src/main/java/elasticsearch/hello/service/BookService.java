package elasticsearch.hello.service;

import elasticsearch.hello.entity.Book;
import elasticsearch.hello.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guilin1 on 15/12/3.
 */
@Component
public class BookService {

    @Autowired
    private BookRepository repository;

    public void save() {

        List<Book> list = new ArrayList<>();

        Book entity = new Book();
        entity.setId("123456_1");
        entity.setName("鬼吹灯");
        entity.setAuthor("天下霸唱");
        entity.setPrice(37.5f);
        list.add(entity);

        entity = new Book();
        entity.setId("123456_2");
        entity.setName("盗墓笔记");
        entity.setAuthor("南派三叔");
        entity.setPrice(35.2f);
        list.add(entity);

        repository.save(list);
    }

    public void findAll() {

    }


}
