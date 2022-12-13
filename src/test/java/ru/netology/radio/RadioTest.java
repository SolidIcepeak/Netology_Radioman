package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RadioTest {
    Radio service = new Radio();

    @Test
    public void constructorPositiveTest() {
        Radio service = new Radio(100);
        Assertions.assertEquals(99, service.getCurrentMaxChanel());
        Assertions.assertEquals(0, service.getCurrentMinChanel());
        Assertions.assertEquals(0, service.getCurrentChanel());
    }

    @Test
    public void constructorNegativeTest() {
        Radio service = new Radio(-100);
        Assertions.assertEquals(0, service.getCurrentMaxChanel());
        Assertions.assertEquals(0, service.getCurrentMinChanel());
        Assertions.assertEquals(0, service.getCurrentChanel());
    }


    @Test
    public void testNextChannel() {
        service.nextChannel();
        int expected = 1;
        int actual = service.getCurrentChanel();
        assertEquals(expected, actual);

    }

    @Test
    public void testNextChannelMax() {
        service.setChanel(9);
        service.nextChannel();
        int expected = 0;
        int actual = service.getCurrentChanel();
        assertEquals(expected, actual);

    }

    @Test
    public void testPrevChannel() {
        service.setChanel(1);
        service.prevChannel();
        int expected = 0;
        int actual = service.getCurrentChanel();
        assertEquals(expected, actual);


    }

    @Test
    public void testPrevChannelMin() {
        service.prevChannel();
        int expected = 9;
        int actual = service.getCurrentChanel();
        assertEquals(expected, actual);


    }

    @Test
    void testSetChanel() {
        service.setChanel(7);
        int expected = 7;
        int actual = service.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    void testSetChanelMoreMax() {
        service.setChanel(123);
        int expected = 0;
        int actual = service.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    void testSetChanelLessMin() {
        service.setChanel(-123);
        int expected = 0;
        int actual = service.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    void testPlusVolume() {
        service.plusVolume();
        int expected = 1;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testPlusVolumeMax() {
        service.setVolume(100);
        service.plusVolume();
        int expected = 100;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testPlusVolumeMoreMax() {
        service.setVolume(123);
        service.plusVolume();
        int expected = 1;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testMinusVolume() {
        service.setVolume(5);
        service.minusVolume();
        int expected = 4;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testMinusVolumeMin() {
        service.minusVolume();
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testMinusVolumeLessMin() {
        service.setVolume(-123);
        service.minusVolume();
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }
}