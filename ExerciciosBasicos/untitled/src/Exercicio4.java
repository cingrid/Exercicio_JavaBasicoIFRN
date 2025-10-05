public class Exercicio4 {
   /*
    Escrever um algoritmo que lê:
            - a porcentagem do IPI a ser acrescido no valor das peças
        - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
            - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
    O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
    Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
    */
public void ipi() {
    double IPI = 5;
    int codigoPeca1 = 1;
    double valor1 = 120.0;
    int quant1 = 100;
    int codigoPeca2 = 2;
    double valor2 = 125.0;
    int quant2 = 32;
    double calculo = (valor1 * quant1 + valor2 * quant2) * (IPI / 100 + 1);
    System.out.println(calculo);
}
}
