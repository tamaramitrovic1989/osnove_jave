package d17_01_2023;

public class QualityOptimizerControl extends Control {

private int brzinaInterneta;



//    implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti
////        od brzine interneta. Kvalitet se racuna na osnovu formule:
////        brzina interneta * 10.1, gde se uzima prvi veci kvalitet
////        npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
////        npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
////        npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720
//    144, 240, 360, 480, 720, 1080
    @Override    public void izvrsiAkciju(VideoPlayer videoPlayer) {

          if(brzinaInterneta* 10.1<144) {
            videoPlayer.setKvalitetVidea(144);
            }
            if (brzinaInterneta* 10.1<240&&brzinaInterneta* 10.1>144) {
              videoPlayer.setKvalitetVidea(240);
             }
              if(brzinaInterneta* 10.1<360&&brzinaInterneta* 10.1>240) {
                  videoPlayer.setKvalitetVidea(360);
             }
            if(brzinaInterneta* 10.1<480&&brzinaInterneta* 10.1>360) {
                videoPlayer.setKvalitetVidea(480);            }
            if(brzinaInterneta* 10.1<720&&brzinaInterneta* 10.1>480) {
                    videoPlayer.setKvalitetVidea(720);                }
            if ( brzinaInterneta * 10.1 > 720) {
                    videoPlayer.setKvalitetVidea(1080);                    }

                }

    public QualityOptimizerControl(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl(){

    }

    public int getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }


}
