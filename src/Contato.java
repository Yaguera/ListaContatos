import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Contato {
    private String nome;
    private LocalDate nascimento;
    private String telefone;
    private String celular;
    private String email;
    
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Contato(String nome, LocalDate nascimento, String telefone, String celular, String email) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

	@Override
	public String toString() {
		return "Nome: " + nome
				+ "\nNascimento: " + dtf.format(nascimento)
				+ "\nTelefone: " + telefone
	        	+ "\nCelular: " + celular
	        	+ "\nEmail: " + email
	        	+ "\n-------------------------------";
	}

    
}

