/**
 * TP4
 */
public class TP4 {
  public static void main(String[] args) {
    Manager managerBoby = new Manager("Bobby", 2, 7500000);
    System.out.println("Seorang manager bernama " + managerBoby.name + " bergaji Rp" 
                      + (managerBoby.gajiPokok+managerBoby.setTunjunganManager(managerBoby.golongan)) 
                      + " Memiliki karyawan : \n");
    managerBoby.displayAnakBuah();                      
  }
}

class Employee {
  String name;
  Integer golongan;
  long gajiPokok;

  Employee(String name, long gajiPokok) {
    this.name = name;
    this.gajiPokok = gajiPokok;
  }

  Employee(String name, Integer golongan, long gajiPokok) {
    this.name = name;
    this.golongan = golongan;
    this.gajiPokok = gajiPokok;
  }
}

class Manager extends Employee {
  Manager(String name, Integer golongan, long gajiPokok) {
    super(name, golongan, gajiPokok);
  }

  OrdinaryEmployee anakBuahManager1 = new OrdinaryEmployee("alex", 5000000);
  OrdinaryEmployee anakBuahManager2 = new OrdinaryEmployee("ruby", 4500000);
  OrdinaryEmployee anakBuahManager3 = new OrdinaryEmployee("Suzy", 5250000);
  OrdinaryEmployee anakBuahManager4 = new OrdinaryEmployee("ben", 4750000);
  OrdinaryEmployee anakBuahManager5 = new OrdinaryEmployee("max", 5500000);

  long setTunjunganManager(Integer golongan) {
    Integer golonganManager = golongan;
    switch (golonganManager) {
    case 1:
      return 1500000;
    case 2:
      return 2000000;
    case 3:
      return 3000000;
    default:
      return 1500000;
    }
  }

  void displayAnakBuah() {
    System.out.println(anakBuahManager1.getName() + " dengan gaji Rp" + anakBuahManager1.getGajiPokok());
    System.out.println(anakBuahManager2.getName() + " dengan gaji Rp" + anakBuahManager2.getGajiPokok());
    System.out.println(anakBuahManager3.getName() + " dengan gaji Rp" + anakBuahManager3.getGajiPokok());
    System.out.println(anakBuahManager4.getName() + " dengan gaji Rp" + anakBuahManager4.getGajiPokok());
    System.out.println(anakBuahManager5.getName() + " dengan gaji Rp" + anakBuahManager5.getGajiPokok());
  }
}

class OrdinaryEmployee extends Employee {
  OrdinaryEmployee(String name, long gajiPokok) {
    super(name, gajiPokok);
  }

  String getName() {
    return this.name;
  }

  long getGajiPokok() {
    return this.gajiPokok;
  }
}