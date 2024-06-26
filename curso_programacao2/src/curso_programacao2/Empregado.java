package curso_programacao2;

public class Empregado {
    private String nome;
    private String id;
    private String alergias;
    private String problemasMedicos;
    private String telefoneContato;
    private String emailContato;

    public Empregado(String nome, String id, String alergias, String problemasMedicos, String telefoneContato, String emailContato) {
        this.nome = nome;
        this.id = id;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
        this.telefoneContato = telefoneContato;
        this.emailContato = emailContato;
    }

    public String getId() {
        return id;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Alergias: " + alergias);
        System.out.println("Problemas Médicos: " + problemasMedicos);
        System.out.println("Telefone de Contato: " + telefoneContato);
        System.out.println("Email de Contato: " + emailContato);
    }
}