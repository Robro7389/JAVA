import java.util.Random;
public class CrazyHelloWorld {
    static void CHW(String str){
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0;i < str.length();i++){
            sb.append(' ');
            do {
                if (str.charAt(i) == ' '){
                    sb.append(' ');
                    break;
                }
                int randomChar = 97 + (int)(random.nextFloat() * 26);
                String rc = String.valueOf((char)(randomChar));
                sb.replace(i,i+1,rc);
                System.out.println(sb);
                if (sb.charAt(i) != str.charAt(i)){
                    sb.deleteCharAt(i);
                    sb.append(' ');
                }
            }while(sb.charAt(i) != str.charAt(i));
        }
    }
}
