public class DocOfimatico {
    public String name;
    public String tamaño;

    public DocOfimatico(String name, String tamaño) {
        this.name = name;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Documento Ofimatico => {" +
                "name='" + name + '\'' +
                ", tamaño='" + tamaño + '\'' +
                '}' + "\n";
    }
}
