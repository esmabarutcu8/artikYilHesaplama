package hesap;
import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[]args){
        int yil;
        Scanner input=new Scanner(System.in);
        System.out.println("Yıl giriniz");
        yil=input.nextInt();
        boolean artikMi=false;
        if(yil % 4 == 0)
        {
            if( yil % 100 == 0)
            {
                if ( yil % 400 == 0)
                    artikMi = true;
                else
                    artikMi = false;
            }
            else
                artikMi= true;
        }
        else
            artikMi = false;

        if(artikMi)
            System.out.println(yil + " artık yıldır!");
        else
            System.out.println(yil + " artık yıl değildir!");
    }
}
