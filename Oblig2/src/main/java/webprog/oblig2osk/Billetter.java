package webprog.oblig2osk;

public class Billetter {
    private String film;
    private String antall;
    private String forNavnet;
    private String etterNavnet;
    private String tlfNret;
    private String eposten;

    public Billetter(String film, String antall, String forNavnet, String etterNavnet, String tlfNret, String eposten){
        this.film = film;
        this.antall = antall;
        this.forNavnet = forNavnet;
        this.etterNavnet = etterNavnet;
        this.tlfNret = tlfNret;
        this.eposten = eposten;
    }
    /* Get først*/
    public String getFilm(){
        return film;
    }
    public void setFilm(String film){
        this.film = film;
    }
    public String getAntall(){
        return antall;
    }
    public void setAntall(String antall) {
        this.antall = antall;
    }
    public String getForNavnet(){
        return forNavnet;
    }
    public void setForNavnet(String forNavnet){
        this.forNavnet=forNavnet;
    }
    public String getEtterNavnet(){
        return etterNavnet;
    }
    public void setEtterNavnet(String etterNavnet){
        this.etterNavnet=etterNavnet;
    }
    public String getTlfNret(){
        return tlfNret;
    }
    public void setTlfNret(String tlfNret){
        this.tlfNret=tlfNret;
    }
    public String getEposten(){
        return eposten;
    }
    public void setEposten(String eposten){
        this.eposten=eposten;
    }
}

