package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldNextCurrentRadioStation(){
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(6);
        radioStation.nextCurrentRadioStation();
        assertEquals(7, radioStation.getCurrentRadioStation());
    }
    @Test
    public void shouldNextCurrentRadioStation1(){
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(8);
        radioStation.nextCurrentRadioStation();
        assertEquals(9, radioStation.getCurrentRadioStation());
    }
    @Test
    public void shouldNextCurrentRadioStation2(){
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(0);
        radioStation.nextCurrentRadioStation();
        assertEquals(1, radioStation.getCurrentRadioStation());
    }
    @Test
    public void shouldNextMaxCurrentRadioStation(){
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(9);
        radioStation.nextCurrentRadioStation();
        assertEquals(0, radioStation.getCurrentRadioStation());
    }
    @Test
    public void shouldPrevCurrentRadioStation(){
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(6);
        radioStation.prevCurrentRadioStation();
        assertEquals(5, radioStation.getCurrentRadioStation());
    }
    @Test
    public void shouldPrevCurrentRadioStationFor1(){
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(1);
        radioStation.prevCurrentRadioStation();
        assertEquals(0, radioStation.getCurrentRadioStation());
    }
    @Test
    public void shouldPrevCurrentRadioStationFor9(){
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(9);
        radioStation.prevCurrentRadioStation();
        assertEquals(8, radioStation.getCurrentRadioStation());
    }
    @Test
    public void shouldPrevMinCurrentRadioStation(){
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(0);
        radioStation.prevCurrentRadioStation();
        assertEquals(9, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStation(){
        Radio setCurrent = new Radio();
        setCurrent.setCurrentRadioStation(0);
        assertEquals(0, setCurrent.getCurrentRadioStation());

        setCurrent.setCurrentRadioStation(9);
        assertEquals(9, setCurrent.getCurrentRadioStation());

        setCurrent.setCurrentRadioStation(10);
        assertEquals(9, setCurrent.getCurrentRadioStation());

        setCurrent.setCurrentRadioStation(-1);
        assertEquals(9, setCurrent.getCurrentRadioStation());

        setCurrent.setCurrentRadioStation(1);
        assertEquals(1, setCurrent.getCurrentRadioStation());

        setCurrent.setCurrentRadioStation(8);
        assertEquals(8, setCurrent.getCurrentRadioStation());
    }

    @Test
    public void shouldPlusCurrentVolumeFor0(){
        Radio volume = new Radio();
        volume.plusCurrentVolume();
        assertEquals(1, volume.getCurrentVolume());
    }
    @Test
    public void shouldPlusCurrentVolumeFor5(){
        Radio volume = new Radio();
        volume.plusCurrentVolume();
        volume.plusCurrentVolume();
        volume.plusCurrentVolume();
        volume.plusCurrentVolume();
        volume.plusCurrentVolume();
        assertEquals(5, volume.getCurrentVolume());
    }
    @Test
    public void shouldPlusCurrentVolumeFor10(){
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
        assertEquals(10, volume.getCurrentVolume());
    }
    @Test
    public void shouldPlusCurrentVolumeFor11(){
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
    public void shouldMinusCurrentVolumeFor0(){
        Radio volume = new Radio();
        volume.minusCurrentVolume();
        assertEquals(0, volume.getCurrentVolume());
    }
    @Test
    public void shouldMinusCurrentVolumeFor10(){
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
        volume.minusCurrentVolume();
        assertEquals(9, volume.getCurrentVolume());
    }
    @Test
    public void shouldMinusCurrentVolumeFor1(){
        Radio volume = new Radio();
        volume.plusCurrentVolume();
        volume.minusCurrentVolume();
        assertEquals(0, volume.getCurrentVolume());
    }

}
