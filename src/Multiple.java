public class Multiple {
    public static void main(String[] args) {
        int total = 0;
        int i = 0;
        while(i < 1000){
            total = isMultiple(i, total);
            i++;
        }
        System.out.println(total);
    }

    private static int isMultiple(int i, int total) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        if(divisibleBy3 || divisibleBy5) {
            total += 1;
        }
        return total;
    }
}
