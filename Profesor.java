public class Profesor extends Persona {

    private String asignatura;



    public Profesor(String nombre, String asignatura) {

        super(nombre);

        this.asignatura = asignatura;

    }



    public String getAsignatura() {

        return asignatura;

    }



    @Override

    public void mostrarDetalles() {

        System.out.println("Profesor: " + getNombre() + " | Asignatura: " + asignatura);

    }

}