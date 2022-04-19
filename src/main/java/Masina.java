public class Masina extends Brand{

    private String mod_nume;
    private int rating;
    private int nr_pasageri;

    public Masina(String mod_nume, int rating, int nr_pasageri,Brand brand) {

        this.mod_nume = mod_nume;
        this.rating = rating;
        this.nr_pasageri = nr_pasageri;
        this.setPret(brand.getPret());
        this.setNume(brand.getNume());
        this.setModel(brand.getModel());


    }
    @Override
    public float getPret() {
        return super.getPret();
    }

    @Override
    public Model getModel() {
        return super.getModel();
    }

    @Override
    public String getNume() {
        return super.getNume();
    }

    @Override
    public void setModel(Model model) {
        super.setModel(model);
    }

    @Override
    public void setNume(String nume) {
        super.setNume(nume);
    }

    @Override
    public void setPret(float pret) {
        super.setPret(pret);
    }

    @Override
    public String toString() {
        return "Masina:" +
                "mod_nume='" + mod_nume + '\'' +
                ", rating=" + rating + "p"+
                ", nr_pasageri=" + nr_pasageri+
                super.toString();
    }

    public String getModNume() {
        return mod_nume;
    }

    public void setModNume(String mod_nume) {
    	 this.mod_nume = mod_nume;
    	 }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getNrPasageri() {
        return nr_pasageri;
    }

    public void setNrPasageri(int nr_pasageri) {
    	 this.nr_pasageri = nr_pasageri;
    }
}
