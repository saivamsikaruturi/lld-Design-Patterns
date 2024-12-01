package com.example.designpatterns.structural.facade.BookMyShow;

import java.util.HashMap;
import java.util.Map;

class MovieService {
    private Map<String, String[]> movieShowtimes;

    public MovieService() {
        movieShowtimes = new HashMap<>();
        movieShowtimes.put("Inception", new String[]{"5:00 PM", "7:00 PM", "9:00 PM"});
        movieShowtimes.put("The Dark Knight", new String[]{"4:00 PM", "6:30 PM", "9:30 PM"});
    }

    public boolean selectMovie(String movieName) {
        if (movieShowtimes.containsKey(movieName)) {
            System.out.println("Movie '" + movieName + "' is available.");
            return true;
        } else {
            System.out.println("Movie '" + movieName + "' is not available.");
            return false;
        }
    }

    public boolean selectShowTime(String movieName, String time) {
        String[] availableTimes = movieShowtimes.get(movieName);
        if (availableTimes != null) {
            for (String availableTime : availableTimes) {
                if (availableTime.equals(time)) {
                    System.out.println("Show time '" + time + "' selected for movie '" + movieName + "'.");
                    return true;
                }
            }
        }
        System.out.println("Show time '" + time + "' is not available for movie '" + movieName + "'.");
        return false;
    }
}
