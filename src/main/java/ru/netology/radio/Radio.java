package ru.netology.radio;

public class Radio {
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume = minVolume;
    private int minChanel = 0;
    private int maxChanel = 9;
    private int currentChanel = minChanel;

    public int getCurrentChanel() {
        return currentChanel;

    }

    public int getCurrentVolume() {
        return currentVolume;

    }

    public void nextChannel() {
        if (currentChanel == maxChanel) {
            currentChanel = minChanel;
        } else {
            currentChanel++;
        }
    }

    public void prevChannel() {
        if (currentChanel == minChanel) {
            currentChanel = maxChanel;
        } else {
            currentChanel--;
        }
    }

    public void setChanel(int chanel) {
        if (chanel >= minChanel && chanel <= maxChanel) {
            currentChanel = chanel;
        }

    }
    public void setVolume(int volume) {
        if (volume >= minVolume && volume <= maxVolume) {
            currentVolume = volume;
        }

    }


    public void plusVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        }
    }

    public void minusVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
        }
    }

}

