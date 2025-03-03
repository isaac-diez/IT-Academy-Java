import java.util.List;
import java.util.Scanner;

public class FootballNews extends News implements SportsNews{

    private String author;
    private List<FootballNews> footballNewsList;
    private String competition;
    private String club;
    private String player;

    public FootballNews(String headline, String mainBody, NewsWriter author) {
        super(headline, mainBody, author);
        otherData();
    }

    public void addToNewsList(FootballNews footballNews) {
        footballNewsList.add(footballNews);
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void otherData(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Which competition?");
        this.competition = sc.nextLine();

        System.out.println("Which team?");
        this.club = sc.nextLine();

        System.out.println("Which player scored?");
        this.player = sc.nextLine();
    }

    @Override
    public int calculateNewsPrice() {

        int initialPrice = 300;
        int competitionExtraPrice = 0, clubExtraPrice = 0, playerExtraPrice = 0;

        if (this.competition.equals("Lliga de Campions")) {
            competitionExtraPrice = 100;
        } else if (this.club.equals("Madrid") || this.club.equals("Barça")) {
            clubExtraPrice = 100;
        } else if (this.player.equals("Ferran Torres") || this.player.equals("Benzema")) {
            playerExtraPrice = 50;
        }
        return initialPrice + competitionExtraPrice + clubExtraPrice + playerExtraPrice;
    }

    @Override
    public int calculateNewsScore() {

        int initialScore = 5;
        int competitionExtraScore = 0, clubExtraScore = 0, playerExtraScore = 0;

        if (this.competition.equals("Lliga de Campions")) {
            competitionExtraScore = 3;
        } else if (this.competition.equals("Lliga")) {
            competitionExtraScore = 2;
        } else if (this.club.equals("Madrid") || this.club.equals("Barça")) {
            clubExtraScore = 1;
        } else if (this.player.equals("Ferran Torres") || this.player.equals("Benzema")) {
            playerExtraScore = 1;
        }
        return initialScore + competitionExtraScore + clubExtraScore + playerExtraScore;
    }
}
