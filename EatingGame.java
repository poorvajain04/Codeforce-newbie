import java.util.*;
import java.io.*;
public class EatingGame{
    public static void main(String args[]) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int max=0;
            int count=0;
            for(int i=0;i<n;i++){
                int x=Integer.parseInt(st.nextToken());
                if(x>max){
                    max=x;
                    count=1;
                }
                else if(x==max)count++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}