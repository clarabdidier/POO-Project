package ballpoc;

public class Project {
    public static void main(String[] args) {
        CameraService c1 = new CameraService("Camera Central", 1979);
        c1.status();

        System.out.println("------------------------");

        Employee e1 = new Employee("João", "Silva", "M", 5435678);
        e1.status();
    }
}
