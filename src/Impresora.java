import java.util.ArrayList;

public class Impresora {
    private final static int VNUM = 0;
    public boolean estado = false;

    private ArrayList<DocOfimatico> collection = new ArrayList<>();

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void on() {
        estado = true;
    }
    public void off() {
        estado = false;
    }
    public void enqueue(DocOfimatico element) {
        collection.add(element);
    }
    public DocOfimatico dequeue() {
        return collection.remove(VNUM);
    }

    @Override
    public String toString() {
        String out = "TOP -> ";
        for (DocOfimatico element: collection) {
            out += element.toString() + " | ";
        }
        return out;
    }
}
