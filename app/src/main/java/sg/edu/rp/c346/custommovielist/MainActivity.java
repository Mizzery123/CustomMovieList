package sg.edu.rp.c346.custommovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Movieitem> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.ListViewMovie);

        alMovieList = new ArrayList<>();

        Movieitem movie1 = new Movieitem("Avengers Infinity War", "Release Date: 2018.04");
        Movieitem movie2 = new Movieitem("Justice League", "Release Date: 2017.11");
        alMovieList.add(movie1);
        alMovieList.add(movie2);

        caMovie = new CustomAdapter(this, R.layout.movie_item, alMovieList);

        lvMovie.setAdapter(caMovie);
    }
}
