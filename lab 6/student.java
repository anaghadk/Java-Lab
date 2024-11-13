1BM23CS032
  ANAGHA DK

package CIE;
import java.util.Scanner;
public class student {
protected String usn=new String();
protected String name=new String();
protected int sem;

public void input() {
Scanner s=new Scanner(System.in);
System.out.println("Enter usn, name, sem: ");
usn=s.next();
name=s.next();
sem=s.nextInt();
} 

public void disp() {
System.out.println("Student Details: ");
System.out.println("usn: "+usn);
System.out.println("name: "+name);
System.out.println("sem: "+sem);
}
}
