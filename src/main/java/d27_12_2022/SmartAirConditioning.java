package d27_12_2022;

public class SmartAirConditioning {

    public String markaKlime;
    public int izabranaTemperatura;
    public String mode;


    public void stampaj() {
        System.out.print(this.mode + " , " + this.izabranaTemperatura + " , " + this.mode);


    }
        public boolean merenjeTemperature(int temperaturaNapolju) {

            if(temperaturaNapolju > this.izabranaTemperatura) {
                return true;
            }
            return false;



        }




}
