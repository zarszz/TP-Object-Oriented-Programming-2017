/**
 * TP3
 */
public class TP3 {

  public static void main(String[] args) {

    /**
     * Variable Implementation for Lecturer and Lecture
     */
    Lecture lectures = new Lecture("Calculus", 3, 45);
    lectures.setName("Calculus");
    lectures.setLecturer("Max Steel", "MXS");

    /**
     * Object and Variable implemented for Student
     */
    Student student1 = new Student("Bobby", 12341);
    Student student2 = new Student("Suzy", 12342);
    Student student3 = new Student("Andrew", 12343);
    Student student4 = new Student("Briant", 12344);
    Student student5 = new Student("Cobi", 12345);

    /**
     * Call Lecture method
     */
    System.out.println("-> Lecture");
    System.out.println("\tName : " + lectures.name);
    System.out.println("\tCredit : " + lectures.credit);
    System.out.println("\tMax Student : " + lectures.maxStudent);
    System.out.println("\n");

    /**
     * Call Lecturer method
     * class Lecturer has implemented in Lecture class,
     * implemented as object name "dosen"
     */
    System.out.println("-> Lecturer");
    System.out.println("\tName : " + lectures.dosen.getName());
    System.out.println("\tCode : " + lectures.dosen.getCode());
    System.out.println("\n");

    /**
     * Implemented Student method
     */
    System.out.println("-> Student: ");
    System.out.println("\tName:"+ student1.getName()+", id:"+student1.idStudent);
    System.out.println("\tName:"+ student2.getName()+", id:"+student2.idStudent);
    System.out.println("\tName:"+ student3.getName()+", id:"+student3.idStudent);
    System.out.println("\tName:"+ student4.getName()+", id:"+student4.idStudent);
    System.out.println("\tName:"+ student5.getName()+", id:"+student5.idStudent);

  }
}

class Lecturer {
  String name, code;
  Lecturer(String name, String code){
    this.name = name;
    this.code = code;
  }

  String getName(){
    return this.name;
  }

  void setName(String name){
    this.name = name;
  }

  String getCode(){
    return this.code; 
  }

  void setCode(String code){
    this.code = code;
  }
}

class Lecture {
  String name, lecturerName, lecturerCode;
  Integer credit, maxStudent;
  Lecture(String name, Integer credit, Integer maxStudent){
    this.name = name;
    this.credit = credit;
    this.maxStudent = maxStudent;
  }
  Lecturer dosen = new Lecturer(lecturerName, lecturerCode);
  /**
   * @return the name
   */
  public String getName() {
    return this.name;
  }
  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
  
  void setLecturer(String name, String code){
    dosen.setName(name);
    dosen.setCode(code);
  }

  void getLecturer(){
    dosen.getName();
    dosen.getCode();
  }

}

class Student {
  String name;
  long idStudent;

  Student(String name, long idStudent){
    this.name = name;
    this.idStudent = idStudent;
  }

  String getName(){
    return this.name;
  }
  void setName(String name){
    this.name = name;
  }
  long getId(){
    return this.idStudent;
  }
  void setId(long idStudent){
    this.idStudent = idStudent;
  }
}