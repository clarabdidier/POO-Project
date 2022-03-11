package ballpoc;

public class CameraService extends Camera {
    private int id;
    private boolean ligada;


    public CameraService(String m, int p){
        this.setNomeCamera(m);
        this.setId(p);
        this.ligar();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void ligar(){
        this.ligada = true;
    }
    public void desligar(){
        this.ligada = false;
    }

    public void status() {
        System.out.println("SOBRE A CAMERA: ");
        System.out.println("Nome: " + getNomeCamera());
        System.out.println("Id: " + getId());
        System.out.println("Esta ligada: " + this.ligada);
    }
}
