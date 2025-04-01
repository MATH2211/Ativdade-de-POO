package Estudante;

public class Estudante {
    private String nome;
    private String cpf;
    private String curso;
    private int idade;

    // Construtor para inicializar os atributos
    public Estudante(String nome, String cpf, String curso, int idade) {
        this.nome = nome.toUpperCase(); // Garantir que o nome esteja em maiúsculas
        this.cpf = cpf;
        this.curso = curso;
        this.idade = idade;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para exibir informações sobre o aluno
    public void exibirCadastro() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade); // Exibe a idade também
    }

    // Método para atualizar os dados do aluno
    public void cadastrarAluno(String nome, String cpf, String curso, int idade) {
        this.nome = nome.toUpperCase(); // Nome em maiúsculas
        this.cpf = cpf;
        this.curso = curso;
        this.idade = idade;
    }
}
