import java.text.DecimalFormat;

public class RadnikPoSatu extends Radnik {
    double plataPoSatu;
    int brRadnihSati;

    public RadnikPoSatu(String ime, String prezime, String jmbg, String ziroRacun, double plataPoSatu, int brRadnihSati) {
        super(ime, prezime, jmbg, ziroRacun);
        this.plataPoSatu = plataPoSatu;
        this.brRadnihSati = brRadnihSati;
    }

    @Override
    public void isplatiPlatu() {
        double plata = plataPoSatu * brRadnihSati;
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
