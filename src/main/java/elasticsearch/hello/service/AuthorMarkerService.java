package elasticsearch.hello.service;

import elasticsearch.hello.entity.AuthorMarkerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guilin1 on 15/12/3.
 */
@Component
public class AuthorMarkerService {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    public void insert(){
        elasticsearchTemplate.createIndex(AuthorMarkerEntity.class);
        elasticsearchTemplate.refresh(AuthorMarkerEntity.class, true);
        elasticsearchTemplate.putMapping(AuthorMarkerEntity.class);
        List<IndexQuery> indexQueries = new ArrayList<>();

//        indexQueries.add(new AuthorMarkerEntityBuilder("1").name("Franck Marchand").location(45.7806d, 3.0875d).buildIndex());
//        indexQueries.add(new AuthorMarkerEntityBuilder("2").name("Mohsin Husen").location(51.5171d, 0.1062d).buildIndex());
//        indexQueries.add(new AuthorMarkerEntityBuilder("3").name("Rizwan Idrees").location(51.5171d, 0.1062d).buildIndex());
//        elasticsearchTemplate.bulkIndex(indexQueries);

    }

}
