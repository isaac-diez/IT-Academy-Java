import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<NewsWriter> newsWriterList = new ArrayList<>();

        NewsWriter writer1 = new NewsWriter("Alice Johnson", "12345678A");
        NewsWriter writer2 = new NewsWriter("Bob Smith", "87654321B");
        NewsWriter writer3 = new NewsWriter("Charlie Davis", "23456789C");
        NewsWriter writer4 = new NewsWriter("David Miller", "98765432D");
        NewsWriter writer5 = new NewsWriter("Emma Brown", "34567890E");
        NewsWriter writer6 = new NewsWriter("Michael Scott", "45678901F");
        NewsWriter writer7 = new NewsWriter("Sarah Lee", "56789012G");
        //NewsWriter writer8 = new NewsWriter("James Wilson", "67890123H");

        newsWriterList.add(writer1);
        newsWriterList.add(writer2);
        newsWriterList.add(writer3);
        newsWriterList.add(writer4);
        newsWriterList.add(writer5);
        newsWriterList.add(writer6);
        newsWriterList.add(writer7);


        int menuOption = 1;
        while (menuOption!=0){

            System.out.println("Choose option (1-7):");
            System.out.println(
                    "1 Introduir redactor.\n" +
                            "2 Eliminar redactor.\n" +
                            "3 Introduir notícia a un redactor.\n" +
                            "4 Eliminar notícia (ha de demanar redactor i titular de la notícia).\n" +
                            "5 Mostrar totes les notícies per redactor.\n" +
                            "6 Calcular puntuació de la notícia.\n" +
                            "7 Calcular preu-notícia.\n" +
                            "8 Llistar redactors.\n" +
                            "0 Exit"
                    );

            System.out.print("Your choice: ");
            menuOption = Integer.parseInt(sc.nextLine());

            if (menuOption < 0 || menuOption > 8) {
                System.out.println("Options valid are from 1 to 8.");
            }

            switch (menuOption) {
                case 1:
                    createNewsWriter(newsWriterList);
                    break;
                case 2:
                    deleteNewsWriter(newsWriterList);
                    break;
                case 3:
                    createNews(newsWriterList);
                    break;
                case 4:
                    deleteNews(newsWriterList);
                    break;
                case 5:
                    listNews(newsWriterList);
                    break;
                case 6:
                    calculateNewsScore(newsWriterList);
                    break;
                case 7:
                    calculateNewsPrice(newsWriterList);
                    break;
                case 8:
                    listAuthors(newsWriterList);
                    break;
            }
        }
    }

    public static void createNewsWriter(List<NewsWriter> list) {

        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter DNI");
        String DNI = sc.nextLine();

        list.add(new NewsWriter(name,DNI));

    }

    public static void deleteNewsWriter(List<NewsWriter> list) {

        System.out.println("Which writer do you want to eliminate?");

        int i = 1;
        for (NewsWriter writer : list) {
            System.out.println(i+"-"+writer);
            i++;
        }

        int option = Integer.valueOf(sc.nextLine());

        list.remove(option-1);

    }

    public static void createNews(List<NewsWriter> list) {

        int typeOfNews = 1;

        while (typeOfNews != 0) {

            System.out.println("Which type of news you want to add?");

            System.out.println(
                    "1 Football\n" +
                            "2 Basket\n" +
                            "3 Tennis\n" +
                            "4 F1\n" +
                            "5 Motorbikes\n" +
                            "0 Exit"
            );
            System.out.print("Your choice: ");

            typeOfNews = Integer.parseInt(sc.nextLine());

            if (typeOfNews < 0 || typeOfNews > 5) {
                System.out.println("Valid options are from 1 to 5.");
            }

            if (typeOfNews!=0) {

                System.out.println("Enter headline");
                String headline = sc.nextLine();
                System.out.println("Enter main body");
                String mainBody = sc.nextLine();

                System.out.println("Which writer to add the news?");

                int i = 1;
                for (NewsWriter writer : list) {
                    System.out.println(i + "-" + writer);
                    i++;
                }

                int writer = Integer.valueOf(sc.nextLine());

                if (typeOfNews == 1) {
                    FootballNews newFootballNews = new FootballNews(headline, mainBody, list.get(writer - 1));
                    list.get(writer-1).addNewsToWriter(newFootballNews);
                } else if (typeOfNews == 2) {
                    BasketNews newBasketNews = new BasketNews(headline, mainBody, list.get(writer - 1));
                    list.get(writer-1).addNewsToWriter(newBasketNews);
                } else if (typeOfNews == 3) {
                    TennisNews newTennisNews = new TennisNews(headline, mainBody, list.get(writer - 1));
                    list.get(writer-1).addNewsToWriter(newTennisNews);
                } else if (typeOfNews == 4) {
                    F1News newF1News = new F1News(headline, mainBody, list.get(writer - 1));
                    list.get(writer-1).addNewsToWriter(newF1News);
                } else if (typeOfNews == 5) {
                    MotorbikesNews newMotorbikesNews = new MotorbikesNews(headline, mainBody, list.get(writer - 1));
                    list.get(writer-1).addNewsToWriter(newMotorbikesNews);
                }
            }
        }
    }

    public static void deleteNews(List<NewsWriter> list) {

        System.out.println("Of which writer do you want to eliminate a news?");

        int i = 1;
        for (NewsWriter writer : list) {
            System.out.println(i + "-" + writer);
            i++;
        }

        int option = Integer.valueOf(sc.nextLine());

        System.out.println("Which news do you want to delete?");

        i = 1;
        for (News news : list.get(option-1).getNewsWrittenByWriter()) {
            System.out.println(i + "-" + news);
            i++;
        }

        option = Integer.valueOf(sc.nextLine());

    }

    public static void listNews(List<NewsWriter> list) {

        int i = 1;
        for (NewsWriter writer : list) {
            System.out.println("Author: " + writer + " ");

            for (News news : writer.getNewsWrittenByWriter()) {
                System.out.println(news);
            }
        }
    }

    public static void calculateNewsScore(List<NewsWriter> list) {

        List<News> listOfNewsToCalculateScore = new ArrayList<>();

        System.out.println("Of which news do you want to calculate the score?");
        int i = 1;
        for (NewsWriter writer : list) {
            for (News news : writer.getNewsWrittenByWriter()) {
                System.out.print(i + " - " + news + " ");
                listOfNewsToCalculateScore.add(news);
            }
        }
        int option = Integer.valueOf(sc.nextLine());

        System.out.println("The score is: " + listOfNewsToCalculateScore.get(option-1).calculateNewsScore());

    }

    public static void calculateNewsPrice(List<NewsWriter> list) {

        List<News> listOfNewsToCalculatePrice = new ArrayList<>();

        System.out.println("Of which news do you want to calculate the score?");
        int i = 1;
        for (NewsWriter writer : list) {
            for (News news : writer.getNewsWrittenByWriter()) {
                System.out.print(i + " - " + news + " ");
                listOfNewsToCalculatePrice.add(news);
            }
        }
        int option = Integer.valueOf(sc.nextLine());

        System.out.println("The price is: " +  listOfNewsToCalculatePrice.get(option-1).calculateNewsPrice());
    }

    public static void listAuthors(List<NewsWriter> list) {

        int i = 1;
        for (NewsWriter writer : list) {
            System.out.println(i + " - " + writer + " ");
            i++;
        }
    }
}
