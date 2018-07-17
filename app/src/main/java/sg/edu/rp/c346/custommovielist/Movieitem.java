package sg.edu.rp.c346.custommovielist;

/**
 * Created by 17000719 on 17/7/2018.
 */

public class Movieitem {
    private String name;
    private String date;

    public Movieitem(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Movieitem{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
