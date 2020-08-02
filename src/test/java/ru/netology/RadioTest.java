package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldNextCurrentRadioStation2() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(5);
        radioStation.nextCurrentRadioStation();
        assertEquals(6, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldNextMaxCurrentRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(9);
        radioStation.nextCurrentRadioStation();
        assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevCurrentRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(6);
        radioStation.prevCurrentRadioStation();
        assertEquals(5, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevMinCurrentRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(0);
        radioStation.prevCurrentRadioStation();
        assertEquals(9, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio setCurrent = new Radio();
        setCurrent.setCurrentRadioStation(0);
        assertEquals(0, setCurrent.getCurrentRadioStation());

        setCurrent.setCurrentRadioStation(10);
        assertEquals(0, setCurrent.getCurrentRadioStation());

        setCurrent.setCurrentRadioStation(-1);
        assertEquals(0, setCurrent.getCurrentRadioStation());

    }

    @Test
    public void shouldPlusCurrentVolumeFor0() {
        Radio volume = new Radio();
        volume.plusCurrentVolume();
        assertEquals(1, volume.getCurrentVolume());
    }

    @Test
    public void shouldPlusCurrentVolumeFor11() {
        Radio volume = new Radio();
        volume.plusCurrentVolume();
        volume.plusCurrentVolume();
        volume.plusCurrentVolume();
        volume.plusCurrentVolume();
        volume.plusCurrentVolume();
        volume.plusCurrentVolume();
        volume.plusCurrentVolume();
        volume.plusCurrentVolume();
        volume.plusCurrentVolume();
        volume.plusCurrentVolume();
        volume.plusCurrentVolume();
        assertEquals(10, volume.getCurrentVolume());
    }

    @Test
    public void shouldMinusCurrentVolumeFor0() {
        Radio volume = new Radio();
        volume.minusCurrentVolume();
        assertEquals(0, volume.getCurrentVolume());
    }

    @Test
    public void shouldMinusCurrentVolumeFor1() {
        Radio volume = new Radio();
        volume.plusCurrentVolume();
        volume.minusCurrentVolume();
        assertEquals(0, volume.getCurrentVolume());
    }

}
