
package teste_tinnova;

public class Ex4 {

    public static void main(String[] args) {
        int x = 3;
        int z = 5;
        int res = 0;

        for (int i = 0; i < 10; i++) {
            if (i % x == 0 || i % z == 0) {
                res += i;
            }
        }

        System.out.println("A soma dos multiplos de 3 e 5 abaixo de 10, é: " + res);
    }
}
