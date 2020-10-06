package be.pxl.ja.opdracht1;

public class Documentary extends Movie {
    private String topic;

    public Documentary(String title, Rating rating) {
        super(title, rating);
        setGenre(Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
