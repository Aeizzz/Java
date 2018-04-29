package ch2;

/**
 * 判断素数
 */
public class PrimePrint {

    boolean isprime[] = new boolean[110];

    public static void main(String[] args) {
        PrimePrint pp = new PrimePrint();
        pp.printPrime();
        System.out.println();
        pp.is_Prime();
    }

    //暴力计算
    public boolean isPrime(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    //直接暴力求素数
    public void printPrime() {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    //埃式筛素数
    public void is_Prime() {
        for (int i = 1; i <= 100; i++) {
            isprime[i] = true;
        }

        for (int i = 2; i * i <= 100; i++) {
            if (isprime[i]) {
                for (int j = i * 2; j <= 100; j += i) {
                    isprime[j] = false;
                }
            }
        }
        for (int i = 2; i <= 100; i++) {
            if (isprime[i]) {
                System.out.printf(i + "\t");
            }
        }
    }
}
