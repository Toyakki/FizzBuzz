public class Multiples {
    public static void main(String[] args) {
        int count = 0;

        for (int i=1; i < 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                count++;
            } else if (i % 3 == 0) {
                count++;
            } else if (i % 5 == 0) {
                count++;
            } else{
                continue;
            }
        }
        System.out.println(count);

    }
}
