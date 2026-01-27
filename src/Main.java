import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arr
        double[] arr = {2, 5, 12, 54, -34, 50, -4, -45, 2, 5, -4};

        // #1-masala: Kvadrat perimetri
//        System.out.print("a ni kiriting: ");
//        int a = sc.nextInt();
//        int P = 4 * a;
//        System.out.println("Perimetr: " + P);

        // #1-masala
//        System.out.println("N sonini kiriting: ");
//        int n = sc.nextInt();
//        int a = n%10;
//        if (a>7) {
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }

        // #2-masala
//        System.out.println("N sonini kiriting: ");
//        double n = sc.nextDouble();
//        int butun = (int) n;
//        double kasir = n - butun;
//
//        if (butun>kasir)
//            System.out.println("Butun qisim katta");
//        else
//            System.out.println("Kasr qisim katta");

        // #3-masala
//        System.out.println("N sonini kriting: ");
//        int n = sc.nextInt();
//        int a = n/100;
//        int b = n%10;
//
//        if (a==b)
//            System.out.println("Mos");
//        else
//            System.out.println("!Mos");

        // #4-masala
//        System.out.println("a sonini kriting: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if ((a+b)>(a*b))
//            System.out.println("Yig'indo katta");
//        else
//            System.out.println("Ko'paytma");

        // 5-masala
//        System.out.println("N sonini kriting: ");
//        int n = sc.nextInt();
//
//        if (n>10 && n<100 && n%5 != 0)
//            System.out.println("Ha");
//        else
//            System.out.println("No");

        // 6-masala
//        System.out.println("N sonini kiriting: ");
//        int n = sc.nextInt();
//
//        if (Math.pow(n, 2) > n)
//            System.out.println("Kvadrati katta");
//        else
//            System.out.println("N soni katta");

        // #7-masala
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//
//        if (Math.abs(a) < Math.abs(b)) {
//            System.out.println(a);
//        } else if (Math.abs(a) > Math.abs(b)) {
//            System.out.println(b);
//        } else {
//            System.out.println("2 si ham bir xil masofada");
//        }

        // #8-masala
//        System.out.print("a ni kiriting: ");
//        int a = sc.nextInt();
//
//        if (a == 0) {
//            System.out.println("Son 0 ga teng");
//        } else if (Math.abs(a) == a) {
//            System.out.println("Son musbat");
//        } else {
//            System.out.println("Son manfiy");
//        }

        // #9-masala
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int count = 0;
//
//        if (a > b + c) count++;
//        if (b > a + c) count++;
//        if (c > a + b) count++;
//
//        if (count == 1) {
//            System.out.println("Ha, faqat bittasi katta");
//        } else {
//            System.out.println("Yo‘q, shart bajarilmadi");
//        }

        // #10-masala
//        System.out.print("x kiriting: ");
//        int x = sc.nextInt();
//
//        double ildiz = Math.sqrt(x);
//
//        if (x >= 0){
//            if (ildiz == (int) ildiz)
//                System.out.println("Ildiz butun");
//            else
//                System.out.println("Ildiz butun emas");
//        }else
//            System.out.println("Ildiz mavjud emas");

        // #11-masala
//        System.out.print("a kriting: ");
//        double a = sc.nextDouble();
//        System.out.print("b kriting: ");
//        double b = sc.nextDouble();
//
//        if ((a/2) == b)
//            System.out.println(a + " " + b + " ning yarmiga teng");
//        else if ((b/2) == a)
//            System.out.println(b + " " + a + " ning yarmiga teng");
//        else
//            System.out.println("budnay shartga mos kelmaydi");

        // #12-masala
//        System.out.print("x kiriting: ");
//        double x = sc.nextDouble();
//
//        if (x != Math.round(x))
//            System.out.println("Son yuvarlanganda o‘zgardi");
//        else
//            System.out.println("Son yuvarlanganda o‘zgarmadi");

        // #13-masala
//        System.out.print("a = ");
//        double a = sc.nextDouble();
//        System.out.print("b = ");
//        double b = sc.nextDouble();
//        System.out.print("c = ");
//        double c = sc.nextDouble();
//
//        double max = Math.max(a, Math.max(b, c));
//        double min = Math.min(a, Math.min(b, c));
//        double ortacha = (a + b + c) / 3;
//
//        if (max - min > ortacha) {
//            System.out.println("shart bajarildi");
//        } else {
//            System.out.println("shart bajarilmadi");
//        }

        // #14-masala
        /*
        *
        *
        *
        *
        * */

        // #15-masala
//        System.out.print("n = ");
//        int n = sc.nextInt();
//
//        int qoldiq = n % 2;
//        int oxirgiRaqam = Math.abs(n) % 10;
//
//        if (qoldiq == oxirgiRaqam) {
//            System.out.println("qoldiq oxirgi raqamga teng");
//        } else {
//            System.out.println("shart bajarilmadi");
//        }

        // #16-masala
//            System.out.print("a = ");
//            int a = sc.nextInt();
//            System.out.print("b = ");
//            int b = sc.nextInt();
//            System.out.print("c = ");
//            int c = sc.nextInt();
//
//            if (a < b && b < c) {
//                System.out.println("osuvchi");
//            } else {
//                System.out.println("shart bajarilmadi");
//            }

        // #17-masala
//        System.out.print("Son = ");
//        int son = sc.nextInt();
//
//        int sum = numberSum(son);
//
//        if (son > sum && son <= 2 * sum) {
//            System.out.println("shart bajarildi");
//        } else {
//            System.out.println("shart bajarilmadi");
//        }

        // #18-masala
//        System.out.print("a = ");
//        int a = sc.nextInt();
//
//        System.out.print("b = ");
//        int b = sc.nextInt();
//
//        double o_arifmetik = (double) (a+b)/2;
//        double o_geometrik = Math.sqrt(a*b);
//
//        if (o_arifmetik>o_geometrik)
//            System.out.println(o_arifmetik + " katta ekan.");
//        else
//            System.out.println(o_geometrik + " katta ekan.");

        // #19-masala
//        System.out.print("N = ");
//        int n = sc.nextInt();
//
//        int a = (int) Math.sqrt(n);
//        int b = a + 1;
//
//        if (n >= Math.pow(a, 2) && n <= Math.pow(b, 2))
//            System.out.println("Yes");
//        else
//            System.out.println("No");

        // #20-masala
//        System.out.print("a = ");
//        int a = sc.nextInt();
//        System.out.println("b = ");
//        int b = sc.nextInt();
//        System.out.println("c = ");
//        int c = sc.nextInt();
//
//        System.out.println(
//                ((a < b && b < c) || (a > b && b > c)) ? b : ((b < a && a < c) || (b > a && a > c)) ? a : c
//        );

        // #21-masala
//        System.out.print("N = ");
//        int n = sc.nextInt();
//
//        System.out.println(juftOrToq(n) ? "Juft son" : "Toq son");

        // #22-masala
//        System.out.print("a = ");
//        int a = sc.nextInt();
//        System.out.print("b = ");
//        int b = sc.nextInt();
//
//        System.out.println("Katta son: " + maxNumber(a, b));

        // #23-masala
//        System.out.println("Yig'indi: " + arrSum(arr));

        // #24-masala
//        System.out.print("n va k ni kiriting: ");
//        double n = sc.nextDouble();
//        int k= sc.nextInt();
//
//        System.out.println(Utils.pow_2_3(n, k));

        // #25-masala
//        System.out.println(Utils.arrMusbatSum(arr));

        // #26-masala
//        System.out.println(Utils.faktarial(3.45));

        // #27-masala
//        Utils.a_b_number(2, 6);

        // #28-masala
//        System.out.println("Arr ning eng katta qiymati: " + Utils.arrMax(arr));

        // #29-masala
//        System.out.println("Arr ning Juft qiymatlari yig'indisi: " + Utils.arrJuftSum(arr));

        // #30-masala
//        System.out.print("N = ");
//        int n = sc.nextInt();
//        System.out.println("Berilgan sonning raqamlar yig'indizi: " + Utils.numberSum(n));

        // #31-masala
//        Utils.arrReverse(arr);

    }
}
