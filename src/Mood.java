/**
 * Created by Вадим on 25.03.2015.
 */
public class Mood {
    private String title;


    Mood() {
        this.title = "Настроение_не_задано";
    }

    Mood(String title) {
        this.title = title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getTitle() {
        return this.title;
    }
}
