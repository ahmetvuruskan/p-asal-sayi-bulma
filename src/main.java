import javax.swing.*;

public class main {

    public static void main(String[] args) {
         Operations operation_191104024 =new Operations();// Operations tipinde bir değişken ürettk.
          int firstNumber191104024=0,secondNumber191104024=0;
        //getNumber fonksiyonumuz ile değişkenlerimize kullanıcıdan değer alıyoruz.
          firstNumber191104024=getNumber_191104024();
          secondNumber191104024=getNumber_191104024();
          // Fonkisyonlarımızı çağırıyoruz..
       int result_191104024=operation_191104024.CevabiBul(firstNumber191104024,secondNumber191104024);
       int secondResult_191104024=  operation_191104024.CevabiBul();

       if (result_191104024 ==-1){
           // Kullanıcının girdiği sayılar aralarında asalsa kullanıcıya uyarı veriyoruz..
           JOptionPane.showMessageDialog (null,"Girdiğiniz sayılar aralarında asaldır.","Uyarı",JOptionPane.INFORMATION_MESSAGE);
       }else{
           // Sonucumuzu burada yazdırıyoruz..
           JOptionPane.showMessageDialog(null,firstNumber191104024+" ve "+secondNumber191104024+" arasındaki p-asal sayisi : "+result_191104024,"Sonuç",JOptionPane.INFORMATION_MESSAGE);
       }
        JOptionPane.showMessageDialog(null,"70 sayısı ile aralarında 5-asal sayı olan iki basamaklı toplam "+secondResult_191104024+" sayı vardır.","Sonuç",JOptionPane.INFORMATION_MESSAGE);

    }
    public static boolean   AsalMi_191104024(int num_191104024){
        // Boolean olarak tanımlanan fonksiyonumuz gönderilen parametre asal değilse false  asalsa true dönderiyor.
        int i_191104024  =2;

        while (i_191104024 <= num_191104024/ 2){
            if (num_191104024 % i_191104024  ==0){
                return false;
            }
            else {
                i_191104024 ++;
            }
        }
        return true;

    }
    public  static  boolean  AralarindaAsalMi_191104024( int firstNum_191104024,int secondNum_191104024){
/* Bu fonksiyonumuz parametre olarak gelen iki sayının aralarında asal olup olmadığını kontrol ediyor.
Sayılar aralarında asalsa false değilse true dönderiyor.
 */
        int kucukSayi_191104024=0;

            if (firstNum_191104024<secondNum_191104024){
                kucukSayi_191104024=firstNum_191104024;
            }
            else{
                kucukSayi_191104024=secondNum_191104024;
            }
            for (int i = 2; i <= kucukSayi_191104024; i++){
                if ((firstNum_191104024 % i == 0 && secondNum_191104024 % i == 0)) {
                    return true;
                }
            }
            return false;
        }


    public static int  getNumber_191104024(){
        //Kullanıcıdan bir adet sayı alıp dönderen fonksiyonumuz
        String number_191104024="";
        int num_191104024=0;
        try {
            number_191104024= JOptionPane.showInputDialog("Lutfen bir sayı giriniz");
            num_191104024=  Integer.parseInt(number_191104024);

        }catch (NumberFormatException e){
            //Kullanıcıdan veri alan fonksiyonumuzda sayı dışında bir veri girildiğinde hata mesajımızla birlikte kullanıcıya uyarı verip programımızı sonlandırıyoruz..
            JOptionPane.showMessageDialog(null,"Lütfen Sadece Sayı giriniz."+e.getMessage(),"UYARI",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Program Sonlandırılıyor..","UYARI",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        return num_191104024;
    }
    }


