package be.pxl.ja.opdracht1;

public abstract class Content {
    private String title;
    private Rating maturityRating;
    private String imageUrl;

    public String getTitle() {
        return title;
    }

    public Rating getMaturityRating() {
        return maturityRating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
