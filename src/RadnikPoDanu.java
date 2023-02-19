import java.text.DecimalFormat;

public class RadnikPoDanu extends Radnik {
    double plataPoDanu;

    public RadnikPoDanu(String ime, String prezime, String jmbg, String ziroRacun, double plataPoDanu) {
        super(ime, prezime, jmbg, ziroRacun);
        this.plataPoDanu = plataPoDanu;
    }

    @Override
    public void isplatiPlatu() {
        double plata = plataPoDanu * 22;
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Radnik{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", jmbg='" + jmbg + '\'' +
                ", ziroRacun='" + ziroRacun + '\'' +
                ", plata='" + df.format(plata) + '\'' +
                '}');


    }
}

