import java.util.Arrays;
public class TopluTasima {
    public static double[] softmax(double [] sartlar) {
    double toplamUstel=0.0;
    double[] ustelDeger=new double[sartlar.length];
    for (int i = 0; i < sartlar.length; i++) {
        ustelDeger[i]=Math.exp(sartlar[i]);
        toplamUstel+=ustelDeger[i];
    }
    for (int i = 0; i < ustelDeger.length; i++) {
        ustelDeger[i]=toplamUstel/ustelDeger[i];
    }
    return ustelDeger;
    }
    public static double hesapla(double[] mahalleDeger,double[]agirliklar) {
        double toplamSkor=0.0;
        for (int i = 0; i < mahalleDeger.length; i++) {
            toplamSkor+=mahalleDeger[i]*agirliklar[i];
        }
return toplamSkor;
    }
    public static void main(String[] args) {
        double[]sartlar={8,8,8,8,5};
        double[]agirliklar=softmax(sartlar);

        double[][] mahalleVeri={
                {8,8,8,8,5},
                {5,2,1,4,5},
                {6,7,7,8,5},
        };
        String[]mahalleİslem={"Karacaibrahim Mahallesi","Karakas Mahallesi ","Pınar Mahallesi"};
        double enBuyuk=0.0;
        String enIyıMahalle="";
        for(int i=0;i<mahalleVeri.length;i++){
            double skor=hesapla(mahalleVeri[i],agirliklar);
            System.out.println(mahalleİslem[i]+" "+skor);
            if (skor>enBuyuk){
                enBuyuk=skor;
                enIyıMahalle=mahalleİslem[i];
            }
        }
        System.out.println("En Uygun Güzergah"+enIyıMahalle);
    }
}

