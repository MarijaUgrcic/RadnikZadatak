import java.text.DecimalFormat;

public class RadnikPoSatu extends Radnik {
    double plataPoSatu;
    private int brRadnihSatiUDanu = 8;
    private int brRadnihDanaUMesecu = 22;

    public RadnikPoSatu(String ime, String prezime, String jmbg, String ziroRacun, double plataPoSatu) {
        super(ime, prezime, jmbg, ziroRacun);
        this.plataPoSatu = plataPoSatu;
    }

    @Override
    public void isplatiPlatu() {
        double plata = plataPoSatu * brRadnihSatiUDanu * brRadnihDanaUMesecu;
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
