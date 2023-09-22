import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Contato {
    private String nome;
    private String telefone;
    private LocalDate nascimento;
    private String email;
    private String celular;
    
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Contato(String nome, String telefone, LocalDate nascimento, String email, String celular) {
        this.nome = nome;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.email = email;
        this.celular = celular;
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
				+ "\nTelefone: " + telefone
				+ "\nNascimento: " + nascimento
	        	+ "\nEmail: " + email
	        	+ "\nCelular: " + celular
	        	+ "\n--------------------";
	}

    
}

