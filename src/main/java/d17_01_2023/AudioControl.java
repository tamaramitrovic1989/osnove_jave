package d17_01_2023;

public class AudioControl extends Control{
 private boolean pojacavaZvuk;

    public AudioControl(boolean pojacavaZvuk) {
        this.pojacavaZvuk = pojacavaZvuk;
    }

    public boolean isPojacavaZvuk() {
        return pojacavaZvuk;
    }

    public void setPojacavaZvuk(boolean pojacavaZvuk) {
        this.pojacavaZvuk = pojacavaZvuk;
    }
//    implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (pojacavaZvuk) {
            if (videoPlayer.getJacinaZvuka() < 100) {
                videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() + 1);
            }

        } else {
            if(videoPlayer.getJacinaZvuka()>0)  {
                videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() - 1);
            }


        }

    }

}
