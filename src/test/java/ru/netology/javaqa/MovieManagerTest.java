package ru.netology.javaqa;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;




public class MovieManagerTest {
    @Test
    public void shouldAddMovie() {
        Movie movie = new Movie("Бладшот");
        MovieManager manager = new MovieManager();

        manager.addMovie(movie);

        Movie[] actual = manager.findAll();
        Movie[] expected = {movie};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovies() {
        Movie movie1 = new Movie("Бладшот");
        Movie movie2 = new Movie("Вперед");
        MovieManager manager = new MovieManager();

        manager.addMovie(movie1);
        manager.addMovie(movie2);

        Movie[] actual = manager.findAll();
        Movie[] expected = {movie1, movie2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovies() {
        Movie movie1 = new Movie("Бладшот");
        Movie movie2 = new Movie("Вперед");
        Movie movie3 = new Movie("Отдель Белград");
        Movie movie4 = new Movie("Джентельмены");
        Movie movie5 = new Movie("Человек-невидимка");
        Movie movie6 = new Movie("Тролли.Мировой тур");
        Movie movie7 = new Movie("Номер один");
        MovieManager manager = new MovieManager(3);

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);

        Movie[] actual = manager.findLast();
        Movie[] expected = {movie7, movie6, movie5};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnAllMoviesIfLimitLessThanMoviesCount() {
        Movie movie1 = new Movie("Бладшот");
        Movie movie2 = new Movie("Вперед");
        MovieManager manager = new MovieManager(1);

        manager.addMovie(movie1);
        manager.addMovie(movie2);

        Movie[] actual = manager.findLast();
        Movie[] expected = {movie2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldUseMockitoToTestAddMovie() {
        Movie movie = Mockito.mock(Movie.class);
        MovieManager manager = new MovieManager();

        manager.addMovie(movie);

        Movie[] actual = manager.findAll();
        Movie[] expected = {movie};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldUseMockitoToTestFindAllMovies() {
        Movie movie1 = Mockito.mock(Movie.class);
        Movie movie2 = Mockito.mock(Movie.class);
        MovieManager manager = new MovieManager();

        manager.addMovie(movie1);
        manager.addMovie(movie2);

        Movie[] actual = manager.findAll();
        Movie[] expected = {movie1, movie2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldUseMockitoToTestFindLastMovies() {
        Movie movie1 = Mockito.mock(Movie.class);
        Movie movie2 = Mockito.mock(Movie.class);
        Movie movie3 = Mockito.mock(Movie.class);
        Movie movie4 = Mockito.mock(Movie.class);
        Movie movie5 = Mockito.mock(Movie.class);
        Movie movie6 = Mockito.mock(Movie.class);
        Movie movie7 = Mockito.mock(Movie.class);
        MovieManager manager = new MovieManager(3);

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);

        Movie[] actual = manager.findLast();
        Movie[] expected = {movie7, movie6, movie5};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldUseMockitoToTestReturnAllMoviesIfLimitLessThanMoviesCount() {
        Movie movie1 = Mockito.mock(Movie.class);
        Movie movie2 = Mockito.mock(Movie.class);
        MovieManager manager = new MovieManager(1);

        manager.addMovie(movie1);
        manager.addMovie(movie2);

        Movie[] actual = manager.findLast();
        Movie[] expected = {movie2};

        assertArrayEquals(expected, actual);
    }

}
