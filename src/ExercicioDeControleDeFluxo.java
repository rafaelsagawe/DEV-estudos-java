/* Criar uma Variavel salario e imprimir seu imposto
Tabela de imposto

salario < 1000 5%
salario >= 1000 && salario < 2000 10%
salario >= 2000 && salario < 4000 15%
salario > 5000 20%

*/

/**
 * ExercicioDeControleDeFluxo
 */
public class ExercicioDeControleDeFluxo {
    public static void main(String[] args) {
        int salario = 2000;

        if (salario < 1000) {
            System.out.println("5%");
        } else if (salario >= 1000 && salario < 2000){
            System.out.println("10%");
        }else if (salario >= 2000 && salario < 4000) {
            System.out.println("15%");
        } else {
            System.out.println("20%");
        }

        /*System.out.println(salario);*/
    }
        
    }
    
