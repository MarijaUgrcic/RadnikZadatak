import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Napraviti apstraktnu klasu Radnik
        //Napraviti main klasu za ispis
        //Sub klase: radnik po satu, radnik po danu, radnik fiksno
        //polja: ime, prezime, jmbg, ziro racun, plata
        //napraviti metod isplatiPlatu() koji ce da ispisuje podatke radnika i obracun za svakog radnika posebno
        //u main klasi podakte za svaki objekat puniti preko Scanner klase

//        RadnikPoSatu radnikPoSatu = new RadnikPoSatu("Jana", "Janic",
//                "2308999716485", "325-98678-66", 900);
//
//        RadnikPoDanu radnikPoDanu = new RadnikPoDanu("Ivan", "Ivic",
//                "1409989756598", "325-83758-76", 7500);
//
//        RadnikFiksno radnikFiksno = new RadnikFiksno("Ana", "Antic",
//                "1706975716598", "325-84658-88", 136660);

Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite podatke za radnika za platu po satu: ");
        System.out.print("Unesite ime: ");
        String a = scanner.nextLine();
        System.out.print("Unesite prezime: ");
        String b = scanner.nextLine();
        System.out.print("Unesite jmbg: ");
        String c = scanner.nextLine();
        System.out.print("Unesite ziro racun: ");
        String d = scanner.nextLine();
        System.out.print("Unesite platu po danu: ");
        double e = scanner.nextDouble();

        RadnikPoSatu radnikPoSatu = new RadnikPoSatu(a, b, c, d, e);

        System.out.println("Unesite podatke za radnika za platu po danu:");
        String w = scanner.nextLine();
        System.out.print("Unesite ime: ");
        String f = scanner.nextLine();
        System.out.print("Unesite prezime: ");
        String g = scanner.nextLine();
        System.out.print("Unesite jmbg: ");
        String h = scanner.nextLine();
        System.out.print("Unesite ziro racun: ");
        String j = scanner.nextLine();
        System.out.print("Unesite platu po danu: ");
        double k = scanner.nextDouble();
        RadnikPoDanu radnikPoDanu = new RadnikPoDanu(f, g, h, j, k);

        System.out.println("Unesite podatke za radnika za platu fiksno:");
        String y = scanner.nextLine();
        System.out.print("Unesite ime: ");
        String m = scanner.nextLine();
        System.out.print("Unesite prezime: ");
        String n = scanner.nextLine();
        System.out.print("Unesite jmbg: ");
        String o = scanner.nextLine();
        System.out.print("Unesite ziro racun: ");
        String p = scanner.nextLine();
        System.out.print("Unesite platu fiksnu: ");
        double r = scanner.nextDouble();
        RadnikFiksno radnikFiksno = new RadnikFiksno(m, n, o, p, r);

        Radnik[] radnik = {radnikPoSatu, radnikPoDanu, radnikFiksno};
        for (int i = 0; i < radnik.length; i++) {
            radnik[i].isplatiPlatu();
        }


    }
}