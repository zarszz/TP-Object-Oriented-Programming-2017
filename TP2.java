/**
 * TP2
 */
public class TP2 {

  public static void main(String[] args) {
    Gedung g1 = new Gedung("GKU1", 3, "Merah");
    Gedung g2 = new Gedung("Bangkit", 5, "Biru");

    System.out.println("Gedung 1");
    g1.display();
    System.out.println("Gedung 2");
    g2.display();
  }
}

class Gedung {
  String nama, warna;
  Integer lantai;
  Gedung(String nama, Integer lantai, String warna){
    this.nama = nama;
    this.lantai = lantai;
    this.warna = warna;
  }

  public void display(){
    System.out.println("Nama Gedung: "+this.nama);
    System.out.println("Jumlah Lantai: "+this.lantai);
    System.out.println("Warna Cat: "+this.warna + "\n");
  }
}