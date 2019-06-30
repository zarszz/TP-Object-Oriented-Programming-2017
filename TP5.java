/**
 * TP5
 */
interface Shape {
  public double PI = 3.14;
  double hitungLuas();
}

class Square implements Shape {
  String name;
  double sisi;
  Square(String name, double sisi){
    this.sisi = sisi;
    this.name = name;
  }
  @Override
  public double hitungLuas() {
    return sisi * sisi;
  }

  String getName(){
    return this.name;
  }
}

class Circle implements Shape {
  double jari2;
  String name;
  Circle(String name, double jari2){
    this.jari2 = jari2;
    this.name = name;
  }

  @Override
  public double hitungLuas() {
    return PI *jari2 * jari2;
  }

  public String getName(){
    return this.name;
  }
}

class TryShape {
  void showShape(Shape s) {
    System.out.println("Luas = " + s.hitungLuas());
  }
}

/**
 * TP5
 */
public class TP5 {

  public static void main(String[] args) {

    TryShape keluaranShape = new TryShape();
    Square persegi = new Square("Persegi", 4.0);
    Circle lingkaran = new Circle("Lingkaran", 7.0);
    
    keluaranShape.showShape(persegi);
    System.out.println("Nama = " + persegi.getName());

    keluaranShape.showShape(lingkaran);
    System.out.println("Nama = " + lingkaran.getName());
  }
  
}