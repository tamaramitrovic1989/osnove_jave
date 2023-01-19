package d17_01_2023;

public class TimeControl extends Control {

    private  boolean premotavaUnapred;

    public TimeControl(boolean premotavaUnapred) {
        this.premotavaUnapred = premotavaUnapred;
    }//    implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s
//    unapred ili unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double preostaloVreme = videoPlayer.getDuzinaVidea() - videoPlayer.getTrenutnoVremeVidea();
        double premotavanje;
        if (this.premotavaUnapred) {
            if (preostaloVreme < 15) {
                premotavanje = preostaloVreme;
            } else {
                premotavanje = 15;
            }
        } else {
            if (videoPlayer.getTrenutnoVremeVidea() < 15) {
                premotavanje = videoPlayer.getTrenutnoVremeVidea();
            } else {
                premotavanje = 15;
            }
        }

        if (premotavaUnapred) {
            videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea() + premotavanje);
        } else {
            videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea() - premotavanje);
        }
    }
    public TimeControl() {
    }




    }


