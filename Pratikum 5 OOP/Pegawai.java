public class Pegawai{
    private String nama;
    private double gajipokok;

    public Pegawai(String nama){
        this.nama = nama;
    }
    
    public Pegawai(String nama , double gajipokok){
        this.nama = nama;
        this.gajipokok = gajipokok;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama; 
    }

    public double getGajipokok(){
        return gajipokok;
    }
    public void setGajipokok(double gajipokok){
        this.gajipokok = gajipokok; 
    }
    void cetakinfo(){
        System.out.println("Nama : " + getNama());
        System.out.println("Gajipokok : " + getGajipokok());
    }
}