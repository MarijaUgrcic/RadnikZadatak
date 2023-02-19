import java.text.DecimalFormat;

public class RadnikFiksno extends Radnik {
    double plataFiksno;

    public RadnikFiksno(String ime, String prezime, String jmbg, String ziroRacun, double plataFiksno) {
        super(ime, prezime, jmbg, ziroRacun);
        this.plataFiksno = plataFiksno;
    }

    @Override
    public void isplatiPlatu() {
        double plata = plataFiksno;
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

