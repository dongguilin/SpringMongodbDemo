package elasticsearch.hello.dao;


import elasticsearch.hello.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by guilin1 on 15/12/3.
 */
public interface BookRepository extends CrudRepository<Book, String> {

    List<Book> findByNameAndPrice(String name, Integer price);

    List<Book> findByNameOrPrice(String name, Integer price);

    Page<Book> findByName(String name, Pageable page);

    Page<Book> findByNameNot(String name, Pageable page);

    Page<Book> findByPriceBetween(int price, Pageable page);

    Page<Book> findByNameLike(String name, Pageable page);

    @Query("{\"bool\" : {\"must\" : {\"term\" : {\"message\" : \"?0\"}}}}")
    Page<Book> findByMessage(String message, Pageable pageable);

}
