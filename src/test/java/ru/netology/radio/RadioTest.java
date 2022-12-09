package ru.netology.radio;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RadioTest {

    @Test
    public void testNextChannel() {
        var radio = new Radio();
        radio.nextChannel();
        int expected = 1;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);

    }

    @Test
    public void testNextChannelMax() {
        var radio = new Radio();
        radio.setChanel(9);
        radio.nextChannel();
        int expected = 0;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);

    }

    @Test
    public void testPrevChannel() {
        var radio = new Radio();
        radio.setChanel(1);
        radio.prevChannel();
        int expected = 0;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);


    }
    @Test
    public void testPrevChannelMin() {
        var radio = new Radio();
        radio.prevChannel();
        int expected = 9;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);


    }

    @Test
    void testSetChanel() {
        var radio = new Radio();
        radio.setChanel(7);
        int expected = 7;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    void testSetChanelMoreMax() {
        var radio = new Radio();
        radio.setChanel(123);
        int expected = 0;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }
    @Test
    void testSetChanelLessMin() {
        var radio = new Radio();
        radio.setChanel(-123);
        int expected = 0;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    void testPlusVolume() {
        var radio = new Radio();
        radio.plusVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testPlusVolumeMax() {
        var radio = new Radio();
        radio.setVolume(10);
        radio.plusVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void testPlusVolumeMoreMax() {
        var radio = new Radio();
        radio.setVolume(123);
        radio.plusVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testMinusVolume() {
        var radio = new Radio();
        radio.setVolume(5);
        radio.minusVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void testMinusVolumeMin() {
        var radio = new Radio();
        radio.minusVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void testMinusVolumeLessMin() {
        var radio = new Radio();
        radio.setVolume(-123);
        radio.minusVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}