import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String str = "ab abcd cd";
        String samp = "abcd";
        String temp = "";
        StringBuilder result = new StringBuilder("");
        StringTokenizer stringTokenizer = new StringTokenizer(str," ");
        int n = stringTokenizer.countTokens();
        String[] s = new String[n];
        int i=0;
        while(stringTokenizer.hasMoreTokens()){
            s[i++] = stringTokenizer.nextToken();
        }
        List<String> list = new ArrayList<>(Arrays.asList(s));
        //System.out.println(Arrays.toString(s));
        i=0;
        for(int j=0;j<samp.length();j++){
            //while(!list.contains(temp))
            temp=temp+samp.charAt(j);
            if(list.contains(temp)){
                //System.out.println(temp);
                result.append(temp);
                result.append(" ");
                if(!(j==samp.length()-1))
                    temp = "";

            }
            if(j==samp.length()-1){
                //System.out.println(temp);
                if(list.contains(temp)){
                    System.out.println(result);
                }else{
                    //result = new StringBuilder("WRONG PASSWORD");
                    System.out.println("WRONG PASSWORD");
                }
            }
        }

    }
}
