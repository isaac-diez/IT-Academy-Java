public abstract class News {

    private String headline;
    private String mainBody;
    private NewsWriter author;

    public News(String headline, String mainBody, NewsWriter author) {
        this.headline = headline;
        this.mainBody = mainBody;
        this.author = author;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public NewsWriter getAuthor() {
        return author;
    }

    public void setAuthor(NewsWriter author) {
        this.author = author;
    }

    public String getMainBody() {
        return mainBody;
    }

    public void setMainBody(String mainBody) {
        this.mainBody = mainBody;
    }

    public void callCalculateNewsPrice(SportsNews obj) {
        obj.calculateNewsPrice();
    }

    public abstract int calculateNewsScore();
    public abstract int calculateNewsPrice();

    @Override
    public String toString() {
        return "headline= " + headline + "mainBody= " + mainBody;
    }
}
