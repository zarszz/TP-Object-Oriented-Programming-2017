import java.sql.*;

class Pelanggan {
  String nama, address;
  Integer idPelanggan;

  Pelanggan(String nama, String address, Integer idPelanggan) {
    this.nama = nama;
    this.address = address;
    this.idPelanggan = idPelanggan;
  }

  void savePelanggan(Pelanggan p) {
    Connection c = null;
    Statement statement = null;

    try {
      Class.forName("org.postgresql.Driver");
      c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "ganjarggt", "");
      c.setAutoCommit(false);

      statement = c.createStatement();

      String sqlQuery = "INSERT INTO PERSON (ID, NAME, ADDRESS) " + "VALUES (" + p.idPelanggan + ", '" + p.nama + "', '" + p.address + "');";
      //System.out.println(sqlQuery);

      
      statement.executeUpdate(sqlQuery);
      c.commit();

      statement.close();
      c.close();

    } catch (Exception e) {
      System.err.println(e.getClass().getName() + ": " + e.getMessage());
      System.exit(0);
    }
    System.out.println("PENGISIAN DATA BERHASIL ......");
  }

  void getPelanggan(Integer idPelanggan) {
    Connection c = null;
    Statement statement = null;

    try {
      Class.forName("org.postgresql.Driver");
      c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "ganjarggt", "");
      c.setAutoCommit(false);

      statement = c.createStatement();

      String sqlQuery = "SELECT name, address FROM person WHERE id=" + idPelanggan + ";";
      
      ResultSet hasilFetch = statement.executeQuery(sqlQuery);

      while (hasilFetch.next()) {
        String nama = hasilFetch.getString("name");
        String address = hasilFetch.getString("address");

        System.out.println("Nama pelanggan    = " + nama);
        System.out.println("Id   Pelanggan    = " + idPelanggan);
        System.out.println("Address Pelanggan = " + address);
      }

      hasilFetch.close();
      statement.close();
      c.close();

    } catch (Exception e) {
      System.err.println(e.getClass().getName() + ": " + e.getMessage());
      System.exit(0);
    }
    System.out.println("FETCH DATA BERHASIL ......");
  }

  void deletePelanggan(Integer idPelanggan) {
    Connection c = null;
    Statement statement = null;

    try {
      Class.forName("org.postgresql.Driver");
      c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "ganjarggt", "");
      c.setAutoCommit(false);

      statement = c.createStatement();

      String sqlQuery = "DELETE FROM person WHERE id=" + idPelanggan +";";
      //System.out.println(sqlQuery);

      
      statement.executeUpdate(sqlQuery);
      c.commit();

      statement.close();
      c.close();

    } catch (Exception e) {
      System.err.println(e.getClass().getName() + ": " + e.getMessage());
      System.exit(0);
    }
    System.out.println("DELETE DATA BERHASIL ......");
  }

}
/**
 * TP8
 */
public class TP9 {
  public static void main(String[] args) {
    Pelanggan pelanggan1 = new Pelanggan("ucok", "majalaya", 0);
    //pelanggan1.savePelanggan(pelanggan1);

    //pelanggan1.getPelanggan(0);
    //pelanggan1.deletePelanggan(0);
  }
}