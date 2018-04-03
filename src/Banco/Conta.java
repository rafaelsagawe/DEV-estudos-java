class Conta{
  int numero;
  String dono;
  double saldo;
  double limite;
  double salario;


  void saca(double quantidade){
    double novoSaldo = this.saldo - quantidade;
    this.saldo = novoSaldo;
  }

  void deposita(double quantidade) {
    this.saldo += quantidade;
  }
/*
minhaConta.saldo = 1000;
if (minhaConta.saca(2000)) {
  System.out.println("Saca");
}else {
  System.out.println("Não");
}

///////
minhaConta.saldo = 1000;
boolean consegui = minhaConta.saca(2000);
if (consegui) {
  System.out.println("Pode sacar");
}else {
System.out.println("Não pode");
}
*/
}
