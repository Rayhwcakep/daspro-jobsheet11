public static void menu(String namaPelanggan, String kodePromo, boolean isMember) {
    System.out.println("Selamat datang " + namaPelanggan + "!");

    if (isMember) {
        System.out.println("anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        if (kodePromo.equalsIgnoreCase("DISKON50%")) {
            System.out.println("anda mendapatkan diskon 50% untuk setiap pembelian");
        } else if (kodePromo.equalsIgnoreCase("DISKON30%")) {
            System.out.println("anda mendapatkan diskon 30% untuk setiap pembelian");
            } else {
                System.out.println("kode invalid");
            }
        }
        

System.out.println("=======MENU RESTO KAFE=======");
System.out.println("1. Kopi hitam - Rp 15.000");
System.out.println("2. Cappucino - Rp 20.000");
System.out.println("3. Latte - Rp 22.000");
System.out.println("4. Teh tarik - Rp 12.000");
System.out.println("5. Roti bakar - Rp 10.000");
System.out.println("6. MIe goreng - Rp 18.000");
System.out.println("=============================");
System.out.println("Silahkan pilih menu yang anda inginkan.");

}
    public static void main(String[] args) {
        menu("Andi","diskon30%", true);
}
