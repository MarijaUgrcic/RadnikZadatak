import java.text.DecimalFormat;

public class RadnikPoSatu extends Radnik {
    double plataPoSatu;

    public RadnikPoSatu(String ime, String prezime, String jmbg, String ziroRacun, double plataPoSatu) {
        super(ime, prezime, jmbg, ziroRacun);
        this.plataPoSatu = plataPoSatu;
    }

    @Override
    public void isplatiPlatu() {
        double plata = plataPoSatu * 8 * 22;
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
