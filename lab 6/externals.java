1BM23CS032

package SEE;
import CIE.internals;
import java.util.Scanner;
public class externals extends internals {
protected int seemarks[];
protected int finalmarks[];

public externals() {
seemarks=new int[5];
finalmarks=new int[5];
}
public void inpseemarks() {
Scanner s= new Scanner(System.in);
System.out.println("Enter SEE marks of 5 courses: ");
for(int i=0;i<5;i++) {
seemarks[i]=s.nextInt();
}
}
public void calcfinalmarks() {
for(int i=0;i<5;i++) {
finalmarks[i]=seemarks[i]+marks[i];
}
}
public void displayfinalmarks() {
disp();
System.out.println("Final marks are: ");
for(int i=0;i<5;i++) {
System.out.println(finalmarks[i]);
}

}

}


