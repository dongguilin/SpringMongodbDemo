package mongodb.hello;

import com.mongodb.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by guilin1 on 15/12/3.
 */
@Component
public class MyBean_MongoDbFactory {

    private final MongoDbFactory mongo;

    @Autowired
    public MyBean_MongoDbFactory(MongoDbFactory mongo) {
        this.mongo = mongo;
    }

    public void example() {
        DB db = mongo.getDb();
        DBCollection collection = db.getCollection("customer");

        List<DBObject> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        map.put("firstName", "张");
        map.put("lastName", "三");

        list.add(new BasicDBObject(map));
        map = new HashMap<>();
        map.put("firstName", "李");
        map.put("lastName", "四");
        list.add(new BasicDBObject(map));

        collection.insert(list);

    }

}
