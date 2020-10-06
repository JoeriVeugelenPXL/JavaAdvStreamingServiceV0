package be.pxl.ja.opdracht1;

public final class TVShow extends Content {
    private int numberOfSeasons;

    public TVShow(String naam, Rating rating, int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }
}
