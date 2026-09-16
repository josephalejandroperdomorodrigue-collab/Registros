public class Estudiante extends Persona {

    private double nota;

    private boolean esColaboradorEstrella;



    public Estudiante(String nombre, double notaInicial, boolean esColaboradorEstrella) {

        super(nombre);

        this.esColaboradorEstrella = esColaboradorEstrella;

        setNota(notaInicial);

    }



    public double getNota() {

        return nota;

    }



    public void setNota(double nota) {

        if (nota < 0.0) {

            this.nota = 0.0;

        } else if (nota > 5.0) {

            this.nota = 5.0;

        } else {

            this.nota = nota;

        }

    }



    public boolean isEsColaboradorEstrella() {

        return esColaboradorEstrella;

    }



    public void evaluarColaboracion() {

        if (this.esColaboradorEstrella) {

            setNota(this.nota + 1.0);

        }

    }



    @Override

    public void mostrarDetalles() {

        System.out.println("Estudiante: " + getNombre() +

                " | Colaborador Estrella: " + (esColaboradorEstrella ? "Sí (+1.0 pt)" : "No") +

                " | Nota Final: " + nota);

    }

}

