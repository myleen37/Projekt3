public class Admin {
    private Long id;
    private String imie;
    private String nazwisko;
    private String email;

    public Admin (String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;

}

    public Long getId() {
            return id;
    }

    public String getImie() {
            return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
