1BM23CS032


import SEE.externals;
import java.util.Scanner;
class mainrun {
  public static void main(String args[]) {
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of students: ");
    n=s.nextInt();
    externals e[]=new externals[n];
    for(int i=0;i<n;i++) {
      e[i]=new externals();
      e[i].input();
      e[i].disp();
      e[i].inpciemarks();
      e[i].inpseemarks();
      e[i].calcfinalmarks();
      e[i].displayfinalmarks();
    }
  }
}
  


