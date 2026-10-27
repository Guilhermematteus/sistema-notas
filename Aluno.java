import java.util.Locale;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    // Construtor
    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Regra de Negócio: Calcular a Média
    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    // Regra de Negócio: Verificar se passou
    public String verificarSituacao() {
        if (calcularMedia() >= 7.0) {
            return "Aprovado";
        } else if (calcularMedia() >= 5.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    // Método para formatar a exibição do objeto
    @Override
    public String toString() {
        return String.format(Locale.US, "Aluno: %s | Média: %.2f -> Status: %s", 
        nome, calcularMedia(), verificarSituacao());
    }

    // Getters e Setters (caso precise alterar depois)
    public String getNome() { return nome; }
    public double getNota1() { return nota1; }
    public double getNota2() { return nota2; }
}