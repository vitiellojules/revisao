package poo;

public class Cliente extends Pessoa{
	private Integer nrConta;
	private Double saldo;
	
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
public Integer getNrConta() {
	return nrConta;
}
public void setNrConta(Integer nrConta) {
	this.nrConta = nrConta;
}


public Double sacar(Double valor) {
	if (this.saldo >= valor) {
		this.saldo=-valor;
		System.out.println(" saque foi realizado na sua conta : ");
		}
	else {
		System.out.println("Saldo insuficiente !");
	}
	return valor;
	
}

public Double depositar(Double valor) {
	this.saldo += valor;
	return saldo;
}

public Double mostrarSaldo() {
	System.out.println(" seu saldo :");
	return saldo;
	
}


}
