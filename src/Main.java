import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static List<Integer> multiply(List<Integer> pol1, List<Integer> pol2 ){
        int deg1 = pol1.size() - 1;
        int deg2 = pol2.size() - 1;
        int resultdeg = deg1 + deg2;
        List<Integer> result = new ArrayList<>(resultdeg + 1);

        for (int i = 0; i <= resultdeg; i++){
            result.add(0);
        }
        for (int i = 0; i <= deg1; i++){
            for (int j = 0; j <= deg2; j++){
                result.set(i+j, result.get(i+j) + pol1.get(i) * pol2.get(j));
            }
        }
        return  result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи количество коэффицентов первого многочлена:");
        int n1 = sc.nextInt();
        while (n1 <= 0){
            System.out.println("Количество коэффицентов должно быть больше 0. Попробуйте снова:");
            n1 = sc.nextInt();
        }
        List<Integer> pol1= new ArrayList<>();
        System.out.println("Введи коэффиценты первого многочлена:");
        for (int i = 0; i < n1; i++){
            pol1.add(sc.nextInt());
        }

        System.out.println("Введи количество коэффицентов второго многочлена:");
        int n2 = sc.nextInt();
        while (n2 <= 0){
            System.out.println("Количество коэффицентов должно быть больше 0. Попробуйте снова:");
            n2 = sc.nextInt();
        }
        List<Integer> pol2= new ArrayList<>();
        System.out.println("Введи коэффиценты второго многочлена:");
        for (int i = 0; i < n2; i++){
            pol2.add(sc.nextInt());
        }
        List<Integer> result = multiply(pol1, pol2);

        System.out.println("Полученный результат:");
        for (int i = result.size() - 1; i >= 0; i--){
            if (result.get(i) != 0){
                System.out.print(result.get(i));
                if (i > 0){
                    System.out.print("x^" + i + "+");
                }
            }
        }
    }
}