public class Utama{
    public static void main(String[] args){
       Manager a = new Manager("Leo");
       Manager b = new Manager("Ridho" , 2000000);
       Manager c = new Manager("Dodol" , 2000000 , 1000000);
        
       a.cetakinfo();
       b.cetakinfo();
       c.cetakinfo();

       Progammer d = new Progammer("Andi Herlambang");
       Progammer e = new Progammer("Riko", 6000000);
       Progammer f = new Progammer ("Dina" , 5000000 , 3000000);

       d.cetakinfo();
       e.cetakinfo();
       f.cetakinfo();

}
}