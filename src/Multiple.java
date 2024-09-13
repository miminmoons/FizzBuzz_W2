public class Multiple {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 0; i < 1000; i++){
            boolean divby3 = i % 3 == 0;
            boolean divby5 = i % 5 == 0;

            if(divby3 && divby5){
                total -= 1;
            }
            else if(divby3){
                total += 1;
            }
            else if(divby5){
                total += 1;
            }
        }
        System.out.println(total);
    }
}
