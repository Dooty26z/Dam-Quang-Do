Public Interface Signal {

 String ten_tin_hieu();

 double bien_do();

double tinh_thuong_xuyen();

 double chu_ky();

 double buoc_song();

 double gia_tri();




Public class DiscreteSignal implements Signal {

 private String ten;

 private double bien_do;

 private double tinh_thuong_xuyen;

 private double chu_ky;

 private double buoc_song;

}

 public DiscreteSignal (String ten , double bien_do, double tinh_thuong_xuyen, double chu_ky, double buoc_song) {

 this.ten = ten;

 this.bien_do = bien_do;

 this.tinh_thuong_xuyen = tinh_thuong_xuyen;

 this.chu_ky = chu_ky;

 this.buoc_song = buoc_song;

}

public double lay_bien_do(){

 return bien_do;

}

public double lay_tinh_thuong_xuyen(){

 return tinh_thuong_xuyen;

}

public double lay_chu_ky(){

 return chu_ky;

}

public double lay_buoc_song(){

 return buoc_song;

}

public String lay_ten(){

 return ten;

 }

}




public class Radar {
    private DiscreteSignal signal;

    public Radar(DiscreteSignal signal) {
        this.signal = signal;


 }

}
