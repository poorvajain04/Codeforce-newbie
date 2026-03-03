import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class WayTooLong {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String word=br.readLine();
            if(word.length()>10){
                System.out.println(word.charAt(0)+String.valueOf(word.length()-2)+word.charAt(word.length()-1));
            }
            else{
                System.out.println(word);
            }
        }
    }
}