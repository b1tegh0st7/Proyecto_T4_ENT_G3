package codigoOriginal;

public class Cuenta {

	//Atributos
	
	private int numeroCuenta;
	private static int contadorCuentas = 1001;
	private String titular; //Nombre y apellidos
	private String dni;
	private String fechaNacimiento;
	private float saldo;
	private float interesAnual;
	
	//Constructores
	
	public Cuenta() {
		
	}
	
	public Cuenta(String titular, String dni, String fecha) {
		this.titular = titular;
		this.dni = dni;
		this.fechaNacimiento = fecha;
	}

	//Setters y Getters
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(float interesAnual) {
		this.interesAnual = interesAnual;
	}
	
	
	
	
}