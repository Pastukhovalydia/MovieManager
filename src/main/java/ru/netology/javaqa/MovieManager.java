package ru.netology.javaqa;

public class MovieManager {
    private Movie[] movies;
    private int limit;

    public MovieManager() {
        this.movies = new Movie[0];
        this.limit = 5;
    }

    public MovieManager(int limit) {
        this.movies = new Movie[0];
        this.limit = limit;
    }

    public void addMovie(Movie movie) {
        Movie[] newArray = new Movie[movies.length + 1];
        System.arraycopy(movies, 0, newArray, 0, movies.length);
        newArray[newArray.length - 1] = movie;
        movies = newArray;
    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie[] findLast() {
        int count = Math.min(limit, movies.length);
        Movie[] lastMovies = new Movie[count];
        for (int i = 0; i < count; i++) {
            lastMovies[i] = movies[movies.length - i - 1];
        }
        return lastMovies;
    }

}
