public class Operations {
    public  int CevabiBul(){
        // 70 ile aralarında 5-asal sayı olan sayıların adedini bulup dönderen fonksiyonumuz.
        //Parametre sayısına göre overload yapılmıştır..
        int asalBolen_191104024=0,counter_191104024=0;
        for (int i = 9; i <= 99 ; i++) {
            if (main.AralarindaAsalMi_191104024(70,i)){
                for (int j = 2; j <=i ; j++) {
                    if (70%j==0 && i%j==0){
                        if (main.AsalMi_191104024(j) && j>asalBolen_191104024 ){
                            asalBolen_191104024=j;
                        }
                    }
                }


                if (asalBolen_191104024==5){
                    counter_191104024++;
                    asalBolen_191104024=0;
                }else {
                    asalBolen_191104024=0;
                }
            }

        }
        return counter_191104024;
    }


public  int CevabiBul(int firstNumber_191104024,int secondNumber_191104024){
    //Parametre sayısına göre overload yapılmıştır..
    int  kucukSayi_191104024=0;
    int divides_191104024=0;

       if (!main.AralarindaAsalMi_191104024(firstNumber_191104024,secondNumber_191104024)){
           //Parametre olarak gelen sayılar  aralarında asalsa fonksiyonumuz -1 dönderiyor.
           return -1;
       }

    //Küçük sayımızı bulmak için Math.min fonksiyonumuzla karşılaştırma yapıyoruz.
    kucukSayi_191104024= Math.min(firstNumber_191104024, secondNumber_191104024);

       //Sayılarımız arasında en küçüğe kadar döngümüzü kurup, ortak bölenlerimizi bulup bölenimiz asal sayi ise divides adındaki array liste atıyoruz.
       for (int i = 2; i <=kucukSayi_191104024 ; i++) {
           if (firstNumber_191104024%i==0 && secondNumber_191104024%i==0){
               if (main.AsalMi_191104024(i) && i>divides_191104024){
                  divides_191104024=i;
               }
           }
       }
           return divides_191104024;




}


}
