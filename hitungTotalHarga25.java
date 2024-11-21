import java.util.Scanner;
 
    
    public static int hitungTotalHarga(String kodePromo, int pilihanMenu, int banyakItem) {
    int [] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
    
    int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;
   
   if (kodePromo.equalsIgnoreCase("DISKON50%")) {
        System.out.println("Anda mendapatkan diskon 50%");
        hargaTotal -= hargaTotal * 2;
   } else if (kodePromo.equalsIgnoreCase("DISKON30%")) {
    System.out.println("Anda mendapatkan diskon 30%");
    hargaTotal -= hargaTotal * 30/100;
   }else {
    System.out.println("Kode invalid");
   }
    return hargaTotal;
    
}

public static void main(String[]args) {
    System.out.println("=======MENU RESTO KAFE=======");
System.out.println("1. Kopi hitam - Rp 15.000");
System.out.println("2. Cappucino - Rp 20.000");
System.out.println("3. Latte - Rp 22.000");
System.out.println("4. Teh tarik - Rp 12.000");
System.out.println("5. Roti bakar - Rp 10.000");
System.out.println("6. MIe goreng - Rp 18.000");
System.out.println("=============================");
System.out.println("Silahkan pilih menu yang anda inginkan.");

    Scanner input = new Scanner(System.in);
    System.out.print("\nmasukkan nomor menu yang ingin anda pesan: ");
    int pilihanMenu = input.nextInt();
    System.out.print("Masukkan jumlah item yang ingin dipesan: ");
    int banyakItem = input.nextInt();
    input.nextLine();
    System.out.print("Masukkan kode promo: ");
    String kodePromo = input.nextLine();

    int totalHarga = hitungTotalHarga(kodePromo, pilihanMenu, banyakItem);
    
    System.out.print("Total harga untuk pesanan anda: " + totalHarga);
    
}
