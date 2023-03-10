import java.text.DecimalFormat;

public class RadnikPoDanu extends Radnik {
    double plataPoDanu;
    int brRadnihDana;

    public RadnikPoDanu(String ime, String prezime, String jmbg, String ziroRacun, double plataPoDanu, int brRadnihDana) {
        super(ime, prezime, jmbg, ziroRacun);
        this.plataPoDanu = plataPoDanu;
        this.brRadnihDana = brRadnihDana;
    }

    @Override
    public void isplatiPlatu() {
        double plata = plataPoDanu * brRadnihDana;
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

