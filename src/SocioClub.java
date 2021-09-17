import java.util.ArrayList;
import java.util.List;

public class SocioClub {
    private List<Socio> listadoSocios = new ArrayList<Socio>();
    private Socio socio1 = new Socio("Pepe","Martin","4529P",10);
    private Socio socio2 = new Socio("Marta","Gonzales","9865N",20);
    private Socio socio3 = new Socio("Carlos","Cabrera","28729I",30);
    private int totalSocio;

    public SocioClub() {
        this.totalSocio = Socio.numSocio;
    }

    public int cuantosFamiliares(){
        int contador = 0;
        if (socio1.getTipoSocio().equals(TipoSocioEnum.FAMILIAR)){
            contador++;
        }
        if (socio2.getTipoSocio().equals(TipoSocioEnum.FAMILIAR)){
            contador++;
        }
        if (socio3.getTipoSocio().equals(TipoSocioEnum.FAMILIAR)){
            contador++;
        }
        return contador;
    }
    public void anadirSocio(String nombre, String apellido, String identificador, Integer tipoSocio){
        Socio socio = new Socio(nombre, apellido, identificador, tipoSocio);
        this.listadoSocios.add(socio);
        this.totalSocio++;
    }
    public void listarSocios(){
        System.out.println(socio1);
        System.out.println(socio2);
        System.out.println(socio3);
        System.out.println(listadoSocios.toString());
    }
    public int borrarNumerarios(){
        int contador = 0;
        for (Socio socio : this.listadoSocios ) {
            if(this.isNumerario(socio)){
                this.listadoSocios.remove(socio);
                contador++;
            }
        }
        return contador;
    }
    private Boolean isNumerario(Socio socio){
        if(socio.getTipoSocio().equals(TipoSocioEnum.NUMERARIO)){
            return true;
        }
        return false;
    }
}
