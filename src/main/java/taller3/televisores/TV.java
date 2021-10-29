package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV = 1;

    public TV (Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public void volumenUp() {
        if(volumen != 7 && estado) {
            volumen++;
        }
    }

    public void volumenDown() {
        if(volumen != 0 && estado) {
            volumen--;
        }
    }

    public void canalUp() {
        if(canal != 120 && estado) {
           canal++;
        }
    }

    public void canalDown() {
        if(canal != 1 && estado) {
            canal--;
        }
    }

    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public static int getNumTV() {
        return numTV;
    }

    public Marca getMarca() {
        return marca;
    }

    public int getCanal() {
        return canal;
    }

    public int getPrecio() {
        return precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public Control getControl() {
        return control;
    }

    public boolean getEstado() {
        return estado;
    }

    void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setCanal(int canal) {
        if(estado) {
            this.canal = canal;
        }
    }

    void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    void setControl(Control control) {
        this.control = control;
    }

    public static void setNumTV(int numTV) {
    }
}
