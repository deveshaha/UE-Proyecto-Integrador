package com.example.ue_proyectointegrador.model;

import com.example.ue_proyectointegrador.R;
import com.example.ue_proyectointegrador.entity.Cines;

import java.util.ArrayList;

public class DataSource {
    private ArrayList<Movie> listMovies;

    public DataSource(){
        listMovies = new ArrayList<>();
        uploadMovies();
    }

    private void uploadMovies() {
        listMovies.add(new Movie(R.drawable.im_movie_1, "Cocaine Bear", "Comedy", "1h 35m",
                "Elizabeth Banks", 6.4,
                "An oddball group of cops, criminals, tourists and teens converge on a Georgia forest where a huge black bear goes on a murderous rampage after unintentionally ingesting cocaine."));
        listMovies.add(new Movie(R.drawable.im_movie_2, "Knock at the Cabin", "Horror - Mystery","1h 40m","M. Night Shyamalan", 6.1,
                        "While vacationing, a girl and her parents are taken hostage by armed strangers who demand that the family make a choice to avert the apocalypse."));
        listMovies.add(new Movie(R.drawable.im_movie_3, "A Man Called Otto", "Comedy - Drama","2h 6m", "Marc Forster", 7.5,
                "Otto is a grump who's given up on life following the loss of his wife and wants to end it all. " +
                        "When a young family moves in nearby, he meets his match in quick-witted Marisol, leading to a friendship that will turn his world around."));
        listMovies.add(new Movie(R.drawable.im_movie_4, "Plane", "Action - Adventure","1h 47m", "Jean-François Richet", 6.5,
                "A pilot finds himself caught in a war zone after he's forced to land his commercial aircraft during a terrible storm."));
        listMovies.add(new Movie(R.drawable.im_movie_5, "M3gan", "Horror - Sci-Fi","1h 42m", "Gerard Johnstone", 6.4,
                "A robotics engineer at a toy company builds a life-like doll that begins to take on a life of its own."));
        listMovies.add(new Movie(R.drawable.im_movie_6, "Missing", "Drama","1h 51m",
                "Nicholas D. JohnsonWill Merrick", 7.3,
                "After her mother goes missing, a young woman tries to find her from home, using tools available to her online."));
        listMovies.add(new Movie(R.drawable.im_movie_7, "Creed III", "Drama - Sport","1h 56m","Michael B. Jordan", 7.3,
                "Adonis has been thriving in both his career and family life, but when a childhood friend and former boxing prodigy resurfaces, the face-off is more than just a fight."));
        listMovies.add(new Movie(R.drawable.im_movie_8, "Ant-Man and the Wasp: Quantumania", "Action - Adventure - Comedy","2h 4m", "Peyton Reed", 6.5,
                "Scott Lang and Hope Van Dyne, along with Hank Pym and Janet Van Dyne, explore the Quantum Realm, where they interact with strange creatures and embark on an adventure that goes beyond the limits of what they thought was possible."));
    }

    public ArrayList<Movie> getListMovies() {
        return listMovies;
    }

}
