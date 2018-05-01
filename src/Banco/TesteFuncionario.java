class TesteFuncionario extends Parent implements Interface {
  public static void main(String[] args) {
    Funcionario f1 = new Funcionario();
    f1.nome = "hugo";
    f1.salario = 100;
    f1.receberAumento(50);

    System.out.println("Salario atual: " + f1.salario);
    System.out.println("ganho anual: " + f1.calculoDeGanhoAnual);
    f1.mostra();
  }
}
