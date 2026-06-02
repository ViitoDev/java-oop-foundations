package br.com.pixelcast.models;

public class Serie extends Title{
    private int seasons;
    private boolean active;
    private int seasonsEpisodes;
    private int seasonMinutes;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getSeasonsEpisodes() {
        return seasonsEpisodes;
    }

    public void setSeasonsEpisodes(int seasonsEpisodes) {
        this.seasonsEpisodes = seasonsEpisodes;
    }

    public int getSeasonMinutes() {
        return seasonMinutes;
    }

    public void setSeasonMinutes(int seasonMinutes) {
        this.seasonMinutes = seasonMinutes;
    }

    @Override
    public int getRunTime() {
        return seasons * seasonsEpisodes * seasonMinutes;
    }
}
