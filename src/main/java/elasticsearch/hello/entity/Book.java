package elasticsearch.hello.entity;

/**
 * Created by guilin1 on 15/12/3.
 */
public class Book {

    private String id;

    private String name;

    private float price;

    private String author;

    @Override
    public String toString() {
        return String.format(
                "Book[id=%s, name='%s', author='%s', price=%.2f]",
                id, name, author, price);
    }

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
