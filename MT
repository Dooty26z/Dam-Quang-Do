Public Interface Signal{

    String ten_tin_hieu();

    double bien_do();

    double tinh_thuong_xuyen();

    double chu_ky();

    double buoc_song();

    double gia_tri();




Public class DiscreteSignal implements Signal{

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

Public class ContinuousSignal implements Signal {

    private String ten;

    private double bien_do;

    private double tinh_thuong_xuyen;

    private double chu_ky;

    private double buoc_song;

    private double gia_tri;

    public ContinuousSignal (String ten , double bien_do, double tinh_thuong_xuyen, double chu_ky, double buoc_song) {

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

public class Main {

    public static void main(String{} args) {

        System.out.println("Ten tin hieu roi rac : " + DiscreteSignal.lay_ten());

        System.out.println("bien do tin hieu roi rac : " + DiscreteSignal.lay_bien_do());

        System.out.println("tinh thuong xuyen tin hieu roi rac : " + DiscreteSignal.lay_tinh_thuong_xuyen());

        System.out.println("chu ky tin hieu roi rac : " + DiscreteSignal.lay_chu_ky());

        System.out.println("buoc song tin hieu roi rac : " + DiscreteSignal.lay_buoc_song());


        System.out.println("Ten tin hieu lien tuc : " + ContinuousSignal.lay_ten());

        System.out.println("bien do tin hieu lien tuc : " + ContinuousSignal.lay_bien_do());

        System.out.println("tinh thuong xuyen tin hieu lien tuc : " + ContinuousSignal.lay_tinh_thuong_xuyen());

        System.out.println("chu ky tin hieu lien tuc : " + ContinuousSignal.lay_chu_ky());

        System.out.println("buoc song tin hieu lien tuc : " + ContinuousSignal.lay_buoc_song());

    }
}
