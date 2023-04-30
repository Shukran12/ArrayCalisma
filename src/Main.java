import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aşağıdan Sistemi Seçin");
        Scanner scanner = new Scanner(System.in);

        String sinif = scanner.nextLine();

        if(sinif.equals("Sagird")){
            System.out.println("Sagird Sistemi Secildi. Sistemde ne edeceksiniz?");
            StudentClass studentClass = new StudentClass();
            String method = scanner.next();
            if(method.equals("Elave")){
                System.out.println("Okay, Sagirdin Adin  Daxil Et");
                String ad = scanner.next();
                if(ad.length() > 0){
                    System.out.println("Aha, indide Soyadini Daxil et");
                    String soyad = scanner.next();
                    if(soyad.length() > 0) {
                        System.out.println("Netice: ");
                        studentClass.add(ad, soyad, studentClass.students);
                    }
                }

            } else if (method.equals("Deyis")) {
                System.out.println("Aha Duzeltmek Istediyiniz Sagirdin ID daxil edin");
                int id = scanner.nextInt();
                if(id>0) {
                    System.out.println("Teze Adi ne olsun?");
                    String ad = scanner.next();
                    if(ad.length()>0){
                        System.out.println("Teze Soyadi Ne olsun?");
                        String soyad = scanner.next();

                        if(soyad.length()>0){
                            System.out.println("Aha Netice:");
                            studentClass.update(id, ad, soyad);
                        }
                    }
                }



            } else if (method.equals("Sec")) {
                System.out.println("Okay, Sagirdin Id nomresin Daxil Edin");
                int id = scanner.nextInt();
                System.out.println("Netice: ");
                 if(id>0){
                     studentClass.select(id);
                 }

            } else if (method.equals("Sil")) {
                System.out.println("Okay, Sagirdin Id nomresin Daxil Edin");
                int id = scanner.nextInt();
                System.out.println("Netice: ");
                if(id>0){
                    studentClass.remove(id);
                }
            } else{
                System.out.println("Ne edeceyinizi Bilmedim");
            }

        }else {
            System.out.println("Bele adda sistem Yoxdu");
        }



       // System.out.println("");
        //studentClass.remove(1);
        //studentClass.update(1, "Sebri", "Memmedli");
        //System.out.println(Arrays.toString(studentClass.students));
        //studentClass.select(1);



    }
}