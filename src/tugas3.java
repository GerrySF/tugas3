import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah yang diambil: ");
        int n = input.nextInt();

        // Input nilai mata kuliah dan jumlah SKS
        double totalNilai = 0;
        int totalSks = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan nilai mata kuliah ke-" + i + ": ");
            double nilai = input.nextDouble();
            System.out.print("Masukkan jumlah SKS mata kuliah ke-" + i + ": ");
            int sks = input.nextInt();

            totalNilai += nilai * sks;
            totalSks += sks;
        }

        // Hitung IPS
        double ips = totalNilai / totalSks;
        System.out.println("Indeks Prestasi Semester (IPS) anda adalah " + ips);

        // Tentukan SKS maksimal
        int sksMaksimal;
        if (ips >= 3.5) {
            sksMaksimal = 24;
        } else if (ips >= 3.0) {
            sksMaksimal = 21;
        } else if (ips >= 2.5) {
            sksMaksimal = 18;
        } else if (ips >= 2.0) {
            sksMaksimal = 15;
        } else {
            sksMaksimal = 12;
        }
        System.out.println("SKS maksimal yang dapat dicapai adalah " + sksMaksimal);
    }
}