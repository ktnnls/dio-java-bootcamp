public class Encapsulamento {

    private String nome;
    private int idade;

    // Getter
    public String getNome() {
        return nome;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter
    public int getIdade() {
        return idade;
    }

    // Setter
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        Encapsulamento pessoa = new Encapsulamento();
        pessoa.setNome("Maria");
        pessoa.setIdade(30);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
