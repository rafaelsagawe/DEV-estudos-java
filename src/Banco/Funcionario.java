/*
   Class funcionario deve ter:
   nome
   data de entrada no banco
   dp onde trabalha
   salario
   rg

   metodo:
   receberAumento
   calculo de ganho anual
 */

class Funcionario {
String nomeFuncionario = "Rafael";
String dataAdmicao;
String departamento;
double salario;
int rG;

   void receberAumento(double aumento){

   }

double calculoDeGanhoAnual = salario;

void amostra(){
        System.out.println("  Dados de Funcionario  ");
        System.out.println("Nome do funcionario: " + nomeFuncionario);
        System.out.println("Data de admição: " + dataAdmicao);
        System.out.println("Departamento de Atuação: " + departamento);
        System.out.println("  Dados de Financeiros  ");
        System.out.println("Salario atual: " + salario);
        System.out.println("Ganho de um ano de trabalho: " + calculoDeGanhoAnual);
};

}
