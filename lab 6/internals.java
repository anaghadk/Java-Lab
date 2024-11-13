1BM23CS032

package CIE;
import java.util.Scanner;
public class internals extends student {

protected int marks[]=new int[5];
public void inpciemarks() {
Scanner s=new Scanner(System.in);
System.out.println("Enter marks of 5 courses: ");
for(int i=0;i<5;i++) {
marks[i]=s.nextInt();
}
}
}
