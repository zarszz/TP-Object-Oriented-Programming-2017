import java.io.*;

class Person {
  public String name, address;
  public int age;

  public Person(String name, String address, int age){
    this.name = name;
    this.address = address;
    this.age = age;
  }
}

class ReadFromFile {

  public String fileName;
  
  public ReadFromFile(String fileName){
    this.fileName = fileName;
  }

  public void readFromFile() {
    FileInputStream finput = null;
    int data;

    // membaca file
    try {
      finput = new FileInputStream("/home/ganjarggt/" + this.fileName + ".txt");
    } catch (FileNotFoundException fnfe) {
      System.out.println("File tidak ditemukan ...");
      System.out.println(fnfe.getMessage());
      System.exit(1);
    }

    // membaca isi file, apabila file ketemu
    try {
      System.out.println("File ditemukan ....");
      System.out.println("Memulai pembacaan isi file ....\n");
      while ((data = finput.read()) != -1) {
        System.out.print((char) data);
      }
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }

    // menutup file
    try {
      finput.close();
    } catch (IOException ioe) {}
  }
}

class WriteToFile {

  /**
   * nama file yang akan dibuat akan
   * mengikuti variabel namaFile
   */
  public String namaFile;

  public WriteToFile(String namaFile){
    this.namaFile = namaFile;
  }
  
  public void writeToFile(String data){
    FileOutputStream foutput = null;

    /**
     * membuat file baru 
     * nama file mengikuti variabel namaFile
     * pada directory /home/ganjarggt/
     */
    try {
      String fileName = "/home/ganjarggt/" + this.namaFile + ".txt";
      foutput = new FileOutputStream(fileName);
    } catch (FileNotFoundException fnfe) {
      System.out.println("File tidak terbentuk ...");
    }

    // menulis ke dalam file
    try {
      for (int i = 0; i < data.length(); i++) {
        foutput.write((int) data.charAt(i));
      }
    } catch (IOException ioe) {
      System.out.println("Data tidak dapat terbaca ...");
      System.out.println(ioe.getMessage());
    }
    
    // menutup file
    try {
      foutput.close();
    } catch (IOException e) {}
  }
}

/**
 * TP7
 */
public class TP7 {
  public static void main(String[] args) {

    Person manusia = new Person("Ganjar", "ebah", 20);
    WriteToFile tulisKeDalamFile = new WriteToFile("profile_manusia_1");
    ReadFromFile bacaDariDalamFile = new ReadFromFile("profile_manusia_1");
    
    String data = "nama : " + manusia.name + "\n" + "alamat : " + manusia.address + "\n" + "umur : " + manusia.age;
    
    //System.out.println(data);

    /**
     * menulis data dari variabel data dan menyimpannya 
     * ke dalam file bernama profile_manusia_1 
     * yang berekstensi .txt ke direktori
     * /home/ganjarggt
     */
    tulisKeDalamFile.writeToFile(data);


    /**
     * membaca data dari file profile_manusia_1
     * yang terdapat di direktori
     * /home/ganjarggt
     */
     bacaDariDalamFile.readFromFile();
  }
}