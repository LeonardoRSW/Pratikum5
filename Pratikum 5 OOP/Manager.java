public class Manager extends Pegawai {
    private double tunjangan;

    public Manager(String nama){
        super(nama);
    }

    public Manager(String nama , double gajipokok){
        super(nama, gajipokok);
    }
    public Manager(String nama , double gajipokok ,double tunjangan){ 
        super(nama , gajipokok);
        this.tunjangan = tunjangan;
    }
    public double getTunjangan() {
        return tunjangan;
    }
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    void cetakinfo(){
        super.cetakinfo();
        System.out.println("Tunjangan : " + getTunjangan() + "\n\t");
    }
}
