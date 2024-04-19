import java.time.LocalDate;
import java.util.Date;
class Student {
    private static int kolejnyNumerIndeksu = 1;
    private String imie;
    private String nazwisko;
    private String email;
    private String adres;
    private LocalDate dataUrodzenia;
    private int numerIndeksu;
    private ProgramStudiow programStudiow;
    private int aktualnySemestr;
    private String status;
    private String numerTelefonu;
    public Student(String imie, String nazwisko, String email, String adres, String numerTelefonu, Date dataUrodzenia, ProgramStudiow programStudiow, int aktualnySemestr) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.adres = adres;
        this.numerIndeksu = kolejnyNumerIndeksu++;
        this.programStudiow = programStudiow;
        this.aktualnySemestr = aktualnySemestr;
        this.status = "kandydat";
        this.numerTelefonu = numerTelefonu;
    }
    public Student(String imie, String nazwisko, String mail, String adres, String numerTelefonu, Date dataUrodzenia) {
    }

    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAdres() {
        return adres;
    }
    public void setAdres(String adres) {
        this.adres = adres;
    }
    public int getNumerIndeksu() {
        return numerIndeksu;
    }
    public ProgramStudiow getProgramStudiow() {
        return programStudiow;
    }
    public void setProgramStudiow(ProgramStudiow programStudiow) {
        this.programStudiow = programStudiow;
    }
    public int getAktualnySemestr() {
        return aktualnySemestr;
    }
    public void setAktualnySemestr(int aktualnySemestr) {
        this.aktualnySemestr = aktualnySemestr;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}