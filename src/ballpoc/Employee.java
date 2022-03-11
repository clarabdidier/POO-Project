package ballpoc;

public class Employee extends User {
    private int matricula;

    public Employee(String n, String s, String g, int m) {
        this.setNome(n);
        this.setSobrenome(s);
        this.setSexo(g);
        this.setMatricula(m);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void status() {
        System.out.println("SOBRE O FUNCIONÁRIO: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Matrícula: " + getMatricula());
    }
}
