import java.util.List;
import java.util.Scanner;

public class BasketNews extends News implements SportsNews{

    private String author;
    private List<BasketNews> basketNewsList;
    private String competition;
    private String club;

    public BasketNews(String headline, String mainBody, NewsWriter author) {
        super(headline, mainBody, author);
        otherData();
    }

    public void addToNewsList(BasketNews basketNews) {

        basketNewsList.add(basketNews);

    }

    public void otherData(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Which competition?");
        this.competition = sc.nextLine();

        System.out.println("Which team?");
        this.club = sc.nextLine();

    }

    @Override
    public int calculateNewsPrice() {

        int initialPrice = 250;
        int competitionExtraPrice = 0, clubExtraPrice = 0;

        if (this.competition.equals("Eurolliga")) {
            competitionExtraPrice = 75;
        } else if (this.club.equals("Madrid") || this.club.equals("Barça")) {
            clubExtraPrice = 75;
        }
        return initialPrice + competitionExtraPrice + clubExtraPrice;
    }

    @Override
    public int calculateNewsScore() {

        int initialScore = 4;
        int competitionExtraScore = 0, clubExtraScore = 0, playerExtraScore = 0;

        if (this.competition.equals("Eurolliga")) {
            competitionExtraScore = 3;
        } else if (this.competition.equals("ACB")) {
            competitionExtraScore = 2;
        } else if (this.club.equals("Madrid") || this.club.equals("Barça")) {
            clubExtraScore = 1;
        }
        return initialScore + competitionExtraScore + clubExtraScore + playerExtraScore;
    }
}