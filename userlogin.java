package Main;

import java.util.Scanner;

public class userlogin {

    public static void main(String[] args) {

        String userName, passWord, reset, newPassword ;
        Scanner input= new Scanner(System.in);
        System.out.print(" Kullancı Adınızı girin  ");
        userName=input.nextLine( );
        System.out.print(" Şifrenizi yazınız  ");
        passWord=input.nextLine();

        if (userName.equals("patika") && passWord.equals("123ptk") ){
            System.out.println(" ***  Giriş yaptınız **** ");

        }
        else{
            System.out.println("  Hatalı şifre girdiniz yeni şifre belirtmek isterseniz \"yes\"  istemezseniz \" no\"  seçin  ");
            reset=input.nextLine();

            if( reset.equals("no")){
                System.out.println(" Giriş sonlandırıldı ");}

            else if (reset.equals("yes")) {
                System.out.println(" Yeni şifrenizi yazın ");
                newPassword=input.nextLine();

                if( newPassword.equals("123ptk")|| newPassword.equals(passWord)){
                    System.out.println(" Hatalı giriş tekrar deneyin ");
                }
                else{
                    System.out.println(" Şifrenizi başarıyla yenilendi ");

                }

            }
            else{
                System.out.println(" Hatalı seçim yaptınız. ");

            }

        }
    }

}
