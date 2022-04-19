public class main {
    public static void main(String[] args) {

        Model model1 = new Model(1, "masina", 2010);
        Brand b1 = new Brand(1000, "Dacia", model1 );
        Masina m1 = new Masina("Logan", 5, 4, b1);
        Model model2 = new Model(10, "ASUS", 2022);
        Brand b2 = new Brand(549, "TUF Gaming", model2);
        Laptop laptop_asus = new Laptop("i9 10900k", "NVIDIA RTX 3060", 32, 512,1440, b2 );
        System.out.println(m1);
        System.out.println(laptop_asus);



    }
}
