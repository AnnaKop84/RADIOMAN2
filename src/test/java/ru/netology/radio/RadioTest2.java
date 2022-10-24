package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest2 {

    @Test
    public void shouldChangeStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expect = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);

    }

    @Test
    public void shouldChangeUnderFirstStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expect = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldChangeOverLastStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expect = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        int expect = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldNextStationBorderLastStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expect = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldNextStationOverLastStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextStation();
        int expect = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        int expect = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldPrevStationOverFirstStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expect = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldPrevStationUnderFirstStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prevStation();
        int expect = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldChangeVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expect = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expect = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldBorderHighVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expect = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldOverHighVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int expect = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int expect = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldBorderLowVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expect = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldUnderLowVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int expect = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }
}
