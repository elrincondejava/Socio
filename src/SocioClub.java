import java.util.*;
import java.util.function.Predicate;

public class SocioClub {
    private List<Socio> listadoSocios = new ArrayList<>();
    private Socio socio1 = new Socio("Pepe", "Martin", "4529P", 10);
    private Socio socio2 = new Socio("Marta", "Gonzales", "9865N", 20);
    private Socio socio3 = new Socio("Carlos", "Cabrera", "28729I", 30);
    private int totalSocio;

    public SocioClub() {
        this.totalSocio = Socio.numSocio;
    }

    public int cuantosFamiliares() {
        int contador = 0;
        if (socio1.getTipoSocio().equals(TipoSocioEnum.FAMILIAR)) {
            contador++;
        }
        if (socio2.getTipoSocio().equals(TipoSocioEnum.FAMILIAR)) {
            contador++;
        }
        if (socio3.getTipoSocio().equals(TipoSocioEnum.FAMILIAR)) {
            contador++;
        }
        return contador;
    }

    public void anadirSocio(String nombre, String apellido, String identificador, Integer tipoSocio) {
        Socio socio = new Socio(nombre, apellido, identificador, tipoSocio);
        this.listadoSocios.add(socio);
        this.totalSocio++;
    }

    public void listarSocios() {
        System.out.println(socio1);
        System.out.println(socio2);
        System.out.println(socio3);
        System.out.println(listadoSocios.toString());
    }

    public int borrarNumerarios() {
        int contador = 0;

        /* FORMA 1

        for (Iterator<Socio> socioIterator = this.listadoSocios.iterator(); socioIterator.hasNext(); ) {
            Socio socio = socioIterator.next();
            if(this.isNumerario(socio)){
                socioIterator.remove();
                contador++;
            }
        }

        */

        /* FORMA 2

        this.listadoSocios.removeIf(socio -> this.isNumerario(socio));

         */

        // FORMA 3
        List<Socio> listadoSociosClonado = new ArrayList<>(this.listadoSocios);
        for (Socio socio : this.listadoSocios) {
            if (this.isNumerario(socio)) {
                listadoSociosClonado.remove(socio);
                contador++;
            }
        }
        this.listadoSocios = listadoSociosClonado;
        return contador;
    }

    private Boolean isNumerario(Socio socio) {
        if (socio.getTipoSocio().equals(TipoSocioEnum.NUMERARIO)) {
            return true;
        }
        return false;
    }

    public void generarYMostrarNumerosAleatorios() {
        int contador = 0;
        int sumaPares = 0;
        for (int i = 1; i <= 10; i++) {
            int numeroAleatorio = new Random().nextInt(11) + 10;
            if (numeroAleatorio == 10) {
                contador++;
            }
            if (numeroAleatorio%2 == 0) {
                sumaPares += numeroAleatorio;
            }
            System.out.print(numeroAleatorio + "   ");
        }
        System.out.println("\nEl número 10 a salido " + contador + " veces.");
        System.out.println("La suma de los números pares es: " + sumaPares);
    }

    public void mostrarCuantasVocales() {
        Scanner scanner = new Scanner(System.in);
        char letra;
        StringBuilder vocales = new StringBuilder();
        while ( (letra = scanner.next().charAt(0)) != 'X') {
            if (String.valueOf(letra).matches("[aeiou]")) {
                vocales.append(letra).append("  ");
            }
        }
        System.out.println(vocales);
    }
}
