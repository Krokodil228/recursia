import java.util.Scanner;
public class recursia7109 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число = ");
        int a = sc.nextInt();
        System.out.println("Введите второе число = ");
        int b = sc.nextInt();
        System.out.println(nod(a, b));
    }
        public static int nod(int a, int b){
            if(a==b)
                return a;
            if(a < b)
                return nod(a, b-a);
            else
                return nod(a-b, b);
        }
    }
