import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String öğrenci1;
        String öğrenci2;
        double avarge;
        int vize1;
        int fınal1;
        int vize2;
        int fınal2;

        System.out.print("İlk Öğrenci Adını Giriniz :");
        öğrenci1 = inp.next();
        System.out.print("Vize notunu giriniz :");
        vize1 = inp.nextInt();
        System.out.print("Final Notunu giriniz :");
        fınal1 = inp.nextInt();

        System.out.println("==========================");

        System.out.print("İkinci Öğrencinin Adını Giriniz :");
        öğrenci2 = inp.next();
        System.out.print("Vize notunuz giriniz :");
        vize2 = inp.nextInt();
        System.out.print("Final Notunu giriniz :");
        fınal2 = inp.nextInt();

        if (vize1 >= 0 && vize1 <= 100 && fınal1 >= 0 && fınal1 <= 100) {

            avarge = (vize1 * 0.4) + (fınal1 * 0.6);

            System.out.println("==========================");
            System.out.println("Vize notu :" + vize1);
            System.out.println("Final notu :" + fınal1);
            System.out.println("Ortalaması :" + avarge);

            if (avarge > 55 && fınal1 > 50) {
                System.out.println(öğrenci1 + " Sınavlarında Başarılı Not Alıp Sınıfı Geçmişdir!");
            } else {
                System.out.println(öğrenci1 + " Genel ortalaması 55 in altın da ve ya final notu 50nin altında olduğu için sınıfı geçememiştir!");
            }


        } else {
            System.out.println(öğrenci1 + " Lütfen notlarınızı doğru giriniz! (Sadece 0 ile 100 arasında girebilirsiniz!)");
        }

        if (vize2 >= 0 && vize2 <= 100 && fınal2 >= 0 && fınal2 <= 100) {
            avarge = (vize2 * 0.4) + (fınal2 * 0.6);

            System.out.println("Vize notu :" + vize2);
            System.out.println("Final notu :" + fınal2);
            System.out.println("Ortalaması :" + avarge);

            if (avarge > 55 && fınal2 > 50) {
                System.out.println(öğrenci2 + " Sınavlarında Başarılı Not Alıp Sınıfı Geçmişdir!");
            } else {
                System.out.println(öğrenci2 + " Genel ortalaması 55 in altın da ve ya final notu 50nin altında olduğu için sınıfı geçememiştir!");
            }

        } else {

            System.out.println(öğrenci2 + " Lütfen notlarınızı doğru giriniz! (Sadece 0 ile 100 arasında girebilirsiniz!)");
        }


    }
}