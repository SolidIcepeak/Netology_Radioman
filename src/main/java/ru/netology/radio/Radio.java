package ru.netology.radio;

public class Radio {
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentVolume = minVolume;
    private final int minChanelNumber = 0;
    private int maxChanelNumber;
    private int currentChanel = minChanelNumber;

    public Radio() {
        maxChanelNumber = 9;
    }
    public Radio(int chanelAmount) {
        if (chanelAmount <= minChanelNumber) {
            maxChanelNumber = minChanelNumber;
        } else {
            maxChanelNumber = chanelAmount - 1;
        }
    }



    public int getCurrentChanel() {
        return currentChanel;

    }

    public int getCurrentMinChanel() {
        return minChanelNumber;

    }

    public int getCurrentMaxChanel() {
        return maxChanelNumber;

    }

    public int getCurrentVolume() {
        return currentVolume;

    }


    public void nextChannel() {
        if (currentChanel == maxChanelNumber) {
            currentChanel = minChanelNumber;
        } else {
            currentChanel++;
        }
    }

    public void prevChannel() {
        if (currentChanel == minChanelNumber) {
            currentChanel = maxChanelNumber;
        } else {
            currentChanel--;
        }
    }

    public void setChanel(int chanel) {
        if (chanel >= minChanelNumber && chanel <= maxChanelNumber) {
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

