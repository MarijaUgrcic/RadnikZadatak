import java.text.DecimalFormat;

public class RadnikPoDanu extends Radnik {
    double plataPoDanu;
    private int brRadnihDanaUMesecu = 22;

    public RadnikPoDanu(String ime, String prezime, String jmbg, String ziroRacun, double plataPoDanu) {
        super(ime, prezime, jmbg, ziroRacun);
        this.plataPoDanu = plataPoDanu;
    }

    @Override
    public void isplatiPlatu() {
        double plata = plataPoDanu * brRadnihDanaUMesecu;
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

