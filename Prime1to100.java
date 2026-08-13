package module1;
class Prime1to100 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;

            if (i <= 1) isPrime = false;
            else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime)
                System.out.print(i + " ");
        }
    }
}