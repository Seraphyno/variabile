package variables;

/**
 * Comentariu de tip JavaDoc
 * @author Serafino Tudorovici
 * @Since 26.01.2019
 */
public class ValoriDefault {
  
  boolean b;
  char c;
  byte bb;
  short s;
  int i;
  long l;
  float f;
  double d;
  //variabila de tip referinta
  //denumita asa pt ca 'face referire' la un obiect - de tipul String
  String ss;
  
  public static void main(String[] args) {
    System.out.println("Variabile de instanta - Valori default");
    
    /* Cream o instanta a clasei ValoriDefault pentru
     * a ii putea accesa proprietatile (membrii sau atributele)
     */
    ValoriDefault v = new ValoriDefault();
    
    System.out.println("boolean: " + v.b);
    System.out.println("char: " + v.c);
    System.out.println("byte: " + v.bb);
    System.out.println("short: " + v.s);
    System.out.println("int: " + v.i);
    System.out.println("long: " + v.l);
    System.out.println("float: " + v.f);
    System.out.println("double: " + v.d);
    System.out.println("String(referinta): " + v.ss);
  }
}
