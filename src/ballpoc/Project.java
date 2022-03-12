package ballpoc;

public class Project {
    public static void main(String[] args) {
        Camera c[] = new Camera[3];
        c[0] = new Camera("Camera Central");
        c[0].setId(111);
        c[0].setLigada(false);
        c[1] = new Camera("Camera Esquerda");
        c[1].setId(222);
        c[1].setLigada(true);
        c[1].setPausada(true);
        c[2] = new Camera("Camera Direita");
        c[2].setId(333);
        c[2].setLigada(true);

        System.out.println(c[0].toString());
        System.out.println(c[1].toString());
        System.out.println(c[2].toString());
        System.out.println("------------------------");

        Employee e1 = new Employee("João", "Silva", "M", 5435678);
        e1.status();
    }
}
