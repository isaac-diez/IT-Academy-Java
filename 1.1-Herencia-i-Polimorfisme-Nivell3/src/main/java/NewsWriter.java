import java.util.ArrayList;
import java.util.List;

public class NewsWriter {

    private String name;
    private String DNI;
    private static int wage = 1500;
    private List<News> newsWrittenByWriter;

    public NewsWriter(String name, String DNI) {
        this.name = name;
        this.DNI = DNI;
        this.newsWrittenByWriter = new ArrayList<>();
    }

    public void addNewsToWriter(News news){
        this.newsWrittenByWriter.add(news);
    }

    public List<News> getNewsWrittenByWriter() {
        return newsWrittenByWriter;
    }

    public void setNewsWrittenByWriter(List<News> newsWrittenByWriter) {
        this.newsWrittenByWriter = newsWrittenByWriter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public static int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return name + ", " + DNI;
    }
}
