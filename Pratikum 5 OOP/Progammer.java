public class Progammer extends Pegawai {
    private double bonus;

    public Progammer(String nama){
        super(nama);
    }

    public Progammer(String nama , double gajipokok){
        super(nama , gajipokok);
    }

    public Progammer(String nama , double gajipokok , double bonus){
        super(nama , gajipokok);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }

    void cetakinfo(){
        super.cetakinfo();
        System.out.println("Bonus : " + getBonus() + "\n\t");
    }
}
