package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int firstStation = 0;
    private int lastStation = 9;
    private int currentVolume;
    private int lowVolume = 0;
    private int highVolume = 10;

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < firstStation) {
            return;
        }
        if (currentStation > lastStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (lastStation <= currentStation) {
            setCurrentStation(firstStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (currentStation <= firstStation) {
            setCurrentStation(lastStation);
        } else setCurrentStation(currentStation - 1);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < lowVolume) {
            return;
        }
        if (currentVolume > highVolume) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
