package mongodb.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by guilin1 on 15/12/3.
 */
@Component
public class MyBean_MongoTemplate {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void example() {
        List<Customer> list = mongoTemplate.findAll(Customer.class);
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }

}
