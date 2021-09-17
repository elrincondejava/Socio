public class Main {
    public static void main(String[] args) {
        SocioClub socioClub = new SocioClub();
       // socioClub.listarSocios();
        socioClub.anadirSocio("Oscar","Suarez","3246U",10);
        System.out.println("-------------");
       // socioClub.listarSocios();
        socioClub.borrarNumerarios();
        socioClub.listarSocios();

        socioClub.generarYMostrarNumerosAleatorios();

        socioClub.mostrarCuantasVocales();
    }
}
