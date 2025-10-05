public class Exercicio2 {
    public void calcularMedia(){
        // Exercicio 02
        // Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
        //números 4, 5 e 6. A soma das duas médias. A média das médias.

        double nums = 7+8+9;
        double mediaAritmetica = (nums)/3;
        System.out.println("Média aritmética: " + mediaAritmetica);

        double nums2 = 4 + 5 + 6;
        double mediaAritmetica2 = (nums2)/3;
        System.out.println("Média Aritmetica: " + mediaAritmetica2);

        double somaMedias = mediaAritmetica + mediaAritmetica2;
        System.out.println("Soma das Médias: " + somaMedias);
        ;
        double mediaDasMedias = somaMedias/2;
        System.out.println("Media das medias: " + mediaDasMedias);

    }
}
