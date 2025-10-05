import java.util.Scanner;

public class Exercicio1 {
        /*
    Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
    mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
     (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
     */

    public void calcularIdade(){
        // Exercício 01
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: \n" + "Utilize o formado DD/MM/AAAA\n");
        String dataDeNascimento = sc.nextLine();


        int anoAtual = 2025;
        int diaAtual = 05;
        int mesAtual = 10;

        String[] partesData = dataDeNascimento.split("/");
        int dia = Integer.parseInt(partesData[0]);
        int mes = Integer.parseInt(partesData[1]);
        int ano = Integer.parseInt(partesData[2]);

        // conversao

        if (diaAtual < dia ){
            diaAtual = diaAtual + 30;
            mesAtual = mesAtual -1;
        }
        if (mesAtual < mes){
            mesAtual = mesAtual + 12;
            anoAtual = anoAtual-1;
        }

        // Cálculo de Ano
        int calculoIdade = anoAtual - ano;
        // Cálculo de MESES
        int calculoQuantidadeMeses = mesAtual - mes;
        // Calculo de DIAS
        int calculoQuantidadeDias = diaAtual-dia;
        // calculo total
        int totalDiasVividos = (calculoIdade * 365) + calculoQuantidadeDias + (calculoQuantidadeMeses * 30);

        //impressao de todas as infos
        System.out.println("Você tem: " + calculoIdade + " anos, " + calculoQuantidadeMeses + " e " + calculoQuantidadeDias + " dias. ");
        System.out.println("Total de dias vividos: " + totalDiasVividos );
}
}