public class Utils {
    public static int numberSum(int n) {
        n = Math.abs(n);
        int sum = 0;

        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return  sum;
    }

    public static boolean juftOrToq(int n){
        return n % 2 == 0;
    }

    public static double maxNumber(double a, double b){
        return (a >= b) ? a : b;
    }

    public static double arrSum(double[] arr){
        double sum = 0;
        for (double n: arr){
            sum += n;
        }
        return sum;
    }

    public static double pow_2_3(double n, int k){
        double res = 1;
        for (int i = 0; i < k; i++)
            res *= n;
        return res;
    }

    public static double arrMusbatSum(double[] arr){
        double res = 0;
        for (double i: arr){
            if (i > 0)
                res += i;
        }

        return res;
    }

    public  static  int faktarial(double n){
        int n1 = (int) n;
        int res = 1;

        for (int i = 1; i <= n1; i++)
            res *= i;

        return res;
    }

    public  static  void a_b_number(int a, int b){
        for (int i = a; i <= b; i++)
            System.out.println(i);
    }

    public static  double arrMax(double[] arr){
        double max_number = arr[0];

        for (double i: arr)
            if (i>max_number)
                max_number =i;

        return max_number;
    }

    public static double arrJuftSum(double[] arr){
        double sum = 0;

        for (double i: arr)
            if (i % 2 == 0)
                sum += i;

        return sum;
    }

}
