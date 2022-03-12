package ballpoc;

public class Camera implements CameraService {

    private String nomeCamera;
    private int Id;
    private boolean ligada;
    private boolean pausada;

    public Camera(String nomeCamera){
        this.nomeCamera = nomeCamera;
        this.Id = 0;
        this.ligada = true;
        this.pausada = false;
    }

    public String getNomeCamera() {
        return nomeCamera;
    }

    public void setNomeCamera(String nomeCamera) {
        this.nomeCamera = nomeCamera;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public boolean isLigada() {
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean isPausada() {
        return pausada;
    }

    public void setPausada(boolean pausada) {
        this.pausada = pausada;
    }

    @Override
    public void ligar() {
        this.ligada = true;
        this.pausada = false;
    }

    @Override
    public void desligar(){
        this.ligada = false;
        this.pausada = false;
    }

    @Override
    public void pausar(){
        this.pausada = true;
    }

    @Override
    public String toString() {
        return "Camera \n" + "Nome da câmera = " + nomeCamera + "\nId = " + Id + "\nEstá ligada? " + ligada + "\nEstá pausada? " + pausada;
    }
}
