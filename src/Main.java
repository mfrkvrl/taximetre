import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double acilis,kmUcret,km,toplamUcret;
        acilis =10.0;
        kmUcret=2.20;
        System.out.println("Toplam kilometreyi girin");
        Scanner scanner=new Scanner(System.in);
        km=scanner.nextDouble();
        toplamUcret=acilis+km*kmUcret;
        double finalUcret=(toplamUcret<20.0) ? 20.0: toplamUcret;
        System.out.println("toplam ücret" +finalUcret);
    }
}