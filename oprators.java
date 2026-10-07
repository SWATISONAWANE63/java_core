public class oprators {

    public static void main(String[] args) {
        // int num1=12;
        // int num2=11;
        // System.out.println(num1 + num2);
        // System.out.println(num1 - num2);
        // System.out.println(num1 * num2);
        // System.out.println(num1 / num2);
        // int sum=12;
        // int result=sum++;
        // System.out.println(result);
        // System.out.println(sum);
        int num=3;
        int resul=++num+num++;
        System.out.println(num);
        System.out.println(resul);
        int n1=1;
        int n2=2;
        int n3=3;
        int result=n1++ + ++n2 * n3++ - --n1 + n2--;
        System.out.println(result);

    }
}