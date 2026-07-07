public class q36 {
    public static void main(String[] args) {
        String veggies []= {"tomato","potato","carrot","brinjal"};
        String largest = veggies[0];
        for(int i=0;i<veggies.length;i++){
            if(largest.compareTo(veggies[i]) < 0){
                largest = veggies[i];
            }
            
        }
System.out.println(largest);
    }
    
}
