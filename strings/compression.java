//compress the string

public class compression {
    public static String compress(String str){
        String newStr = "";

        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){          // n-1 isliye kyuki humne i+1 liya h
                   count++;
                   i++;
            }
            newStr += str.charAt(i);
            if(count >1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "aaaaabbbccdddd";
        System.out.println(compress(str));
    }
    
}
