package PratikEtkinlik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sicaklik;
        System.out.print("Bugün hava kaç derece? : ");
        sicaklik = scn.nextInt();
        if(sicaklik <= 5){
            System.out.println("Bugün dışarıya çıkmak yerine evde vakit geçirmeyi düşünmelisin.");
        }else if(sicaklik > 5 && sicaklik <= 15){
            System.out.println("Evden dışarı çıkabilirsin ama kapalı yere ihtiyacın olabilir. Bilardo oynamaya ne dersin?");
        }else if(sicaklik > 15 && sicaklik <= 25){
            System.out.println("Tam bir gezme havası hadi ne duruyorsun! Ara arkadaşlarını, mangal zamanı.");
        }else{
            System.out.println("Serinlemek içn bir şeyler yapmalı Aqua parka gitmeye ne dersin?");
        }
    }
    //instagram Kursattrgt 
}