public class Socio {
    private String nombre;
    private String identificador;
    public static int numSocio = 0;
    private TipoSocioEnum tipo;
    private int  numeroSocio;

    public Socio(String nombre, String apellido, String identificador, Integer tipoSocio) {
        this.asignarNombre(nombre, apellido);
        this.identificador = identificador;
        this.tipo = this.validarTipo(tipoSocio);
        numSocio++;
        this.numeroSocio = numSocio;
    }

    private TipoSocioEnum validarTipo(int numeroTipoSocio) {
        if (numeroTipoSocio == TipoSocioEnum.NUMERARIO.getCodigoTipo()) {
            return TipoSocioEnum.NUMERARIO;
        }


        if (numeroTipoSocio == TipoSocioEnum.FAMILIAR.getCodigoTipo()) {
            return TipoSocioEnum.FAMILIAR;
        }
        return TipoSocioEnum.NO_NUMERARIO;
    }

    private void asignarNombre(String nombre, String apellido) {
        this.nombre = apellido + " , " + nombre;
    }

    public TipoSocioEnum getTipoSocio() {

        return tipo;
    }

    public void setTipoSocio(int t) {

        this.tipo = this.validarTipo(t);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Número de Socio: " + numeroSocio + "\n"
                + "TIPO: " + tipo + " DNI: " + identificador;
    }
}
