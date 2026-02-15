import java.io.*;
public class Main
{
  public static void main(String[] args) throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    String a[]=new String[n];
    int k=0;
    for(int i=0;i<n;i++){
      a[i]=br.readLine();
      k=Math.max(k,a[i].length());      
    }
    for(int i=0;i<n;i++){
      int z=k-a[i].length();
      z=z/2;
      String str="";
      for(int j=0;j<z;j++){
        str=str+".";
      }
      str=str.trim();
      System.out.println(str+a[i]+str);
    }
  }
}