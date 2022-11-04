package ba.rpr;

import java.util.List;

public class Banka {
    private Long brojRacuna;
    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;

    public Banka(){}
    public Korisnik kreirajNovogKorisnika(String ime, String prezime){
        Korisnik korisnik = new Korisnik(ime, prezime);
        return korisnik;
    }
    public Uposlenik kreirajNovogUposlenika(String ime, String prezime){
        Uposlenik uposlenik = new Uposlenik(ime, prezime);
        return uposlenik;
    }
    public Racun kreirajRacunZaKorisnika(Korisnik korisnik){
        Racun racun = new Racun(12314L, korisnik);
        return racun;
    }

    public List<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(List<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public List<Uposlenik> getUposlenici() {
        return uposlenici;
    }

    public void setUposlenici(List<Uposlenik> uposlenici) {
        this.uposlenici = uposlenici;
    }

}
