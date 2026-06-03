package br.com.pixelcast.calculations;

import br.com.pixelcast.models.Title;

public class TimeCalculate {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include (Title title) {
        this.totalTime += title.getRunTime();
    }
}
