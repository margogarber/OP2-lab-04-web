package model;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static final Database instance = new Database();
    private List<Film> films;
    private List<Actor> actors;

    private Database() {
        films = new ArrayList<>();
        actors = new ArrayList<>();
        initializeData();
    }

    public static Database getInstance() {
        return instance;
    }

    private void initializeData() {
        Actor margotRobbie = new Actor("Margot Robbie");
        Actor ryanGosling = new Actor("Ryan Gosling");
        Actor tomHolland = new Actor("Tom Holland");
        Actor zendaya = new Actor("Zendaya");

        actors.add(margotRobbie);
        actors.add(ryanGosling);
        actors.add(tomHolland);
        actors.add(zendaya);

        Film barbie = new Film("Barbie (2023)");
        Film spiderMan = new Film("Spider-Man: Far From Home");

        films.add(barbie);
        films.add(spiderMan);

        barbie.addActor(margotRobbie);
        barbie.addActor(ryanGosling);

        spiderMan.addActor(tomHolland);
        spiderMan.addActor(zendaya);
    }

    public List<Film> getFilms() {
        return films;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public Film findFilmByTitle(String title) {
        return films.stream()
                .filter(f -> f.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    public Actor findActorByName(String name) {
        return actors.stream()
                .filter(a -> a.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
