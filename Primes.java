public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean arr[] = new boolean[n];
        
        arr[0] = false; arr[1] = false;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }

        for (int i = 2; i < arr.length; i++) {
            for (int j = 2; j < arr.length; j++){
                if (j%i == 0 && j != i){
                    arr[j] = false;
                }
            }
        }

        int counter = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]) {
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("There are " + counter +" primes between 2 and " + n + " (" + (int)((counter/(double)(n))*100) +"% are primes)");

    }
}