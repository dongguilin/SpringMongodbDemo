package elasticsearch.hello.entity;

import org.elasticsearch.common.geo.GeoPoint;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by guilin1 on 15/12/3.
 */
@Document(indexName = "test-geo-index", type = "geo-class-point-type")
public class AuthorMarkerEntity {

    @Id
    private String id;

    private String name;

    private GeoPoint location;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GeoPoint getLocation() {
        return location;
    }

    public void setLocation(GeoPoint location) {
        this.location = location;
    }

    public AuthorMarkerEntity(String id) {

        this.id = id;
    }

    public AuthorMarkerEntity() {

    }
}
