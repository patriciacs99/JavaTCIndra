package ministerioGeografia;

class Sistema implements IGeneradorInformacion {
    private Ciudad ciudad;

    public Sistema(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public void generarInformacion() {
        this.ciudad.generarInformacion();
    }

    public Ciudad getCiudad() {
        return ciudad;
    }
}
