package org.freecodecamp.app.model.repository;

import com.speedment.jpastreamer.application.JPAStreamer;
import jakarta.inject.Inject;
import org.freecodecamp.app.model.Film;

import java.util.Optional;

public class FilmRepository {

    @Inject
    JPAStreamer jpaStreamer;

    public Optional<Film> getFilm(short filmId) {

    }
}
