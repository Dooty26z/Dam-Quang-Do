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

    this.gtri = new HashMap<>();

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
public void them_gtri(int n, double gtri){
    gtri.put(n,gtri);
public double lay_gtri(double time) {
    int n = (int)Math.round(time);
    return gtri.getOrDefault(n,0.0);
    }
}

public class Radar {
    private DiscreteSignal signal;

    public Radar(DiscreteSignal signal) {
        this.signal = signal;
    }
     public void analyzeSignal(int n) {
        System.out.println("Signal value at n = " + n + ": " + signal.lay_gtri(n));
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            if (i <= 15) {
                discreteSignal.them_gtri(i, 1.0);
            } else {
                discreteSignal.them_gtri(i, 0.0);
            }
        }
        Radar radar = new Radar(discreteSignal);
        radar.analyzeSignal(4);
    }
}
