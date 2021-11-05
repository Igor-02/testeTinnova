
package Ex01;

public class percentual {

    public float Valido(float valido, float total) {
        float resultado;
        resultado = total / (valido * 100) * 10000;
        return resultado;
    }

    public float branco(float branco, float total) {
        float resultado;
        resultado = total / (branco * 100) * 10000;
        return resultado;
    }

    public float nulo(float nulo, float total) {
        float resultado;
        resultado = total / (nulo * 100) * 10000;
        return resultado;
    }

}
