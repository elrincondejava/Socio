public enum TipoSocioEnum {
    NUMERARIO(10),
    NO_NUMERARIO(20),
    FAMILIAR(30);

    private final int codigoTipo;

    public int getCodigoTipo() {
        return codigoTipo;
    }

    TipoSocioEnum(int codigoTipo) {
        this.codigoTipo = codigoTipo;
    }
}
