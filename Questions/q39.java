public class q39 {
    public static void vowel(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a'||
            str.charAt(i) =='e'||
            str.charAt(i) == 'i'||
            str.charAt(i)=='o'||
            str.charAt(i) =='u'){
                count++;

            }
        }System.out.print(count);
    }
    public static void main(String[] args) {
        String str = "hello my name tony";
        vowel(str);
    }

    
}
