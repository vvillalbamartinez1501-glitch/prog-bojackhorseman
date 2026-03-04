public class Cliente {
    private int id;
    private String nombre;
    private String profesion;
    private int numeroEscenariosPublicos;
    private static int siguienteId = 0;

    public Cliente (String nombre, String profesion, int numeroEscenariosPublicos){
        this.id = siguienteId++;
        this.nombre = nombre;
        this.profesion = profesion;
        this.numeroEscenariosPublicos = numeroEscenariosPublicos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public int getNumeroEscenariosPublicos() {
        return numeroEscenariosPublicos;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(id);
        sb.append("]");
        sb.append(" - ");
        sb.append(nombre);
        sb.append(", ");
        sb.append(profesion);
        sb.append(", número de escándalos públicos:");
        sb.append(numeroEscenariosPublicos);
        return sb.toString();
    }
}
