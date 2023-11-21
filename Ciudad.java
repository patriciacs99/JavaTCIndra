package ministerioGeografia;

public class Ciudad implements IGeneradorInformacion{
	
	private String nombre;
	private int habitantes;
	private double superficie;
	private int habitantes2030;
	private double superficieOcupada;
	
	
	public Ciudad(String nombre, int habitantes, double superficie) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.superficie = superficie;
    }
	
	@Override
	public void generarInformacion() {
		this.habitantes2030 = (int) (habitantes * 0.90);
        this.superficieOcupada = superficie + 10000;
	}
	
	@Override
    public String toString() {
        return String.format("Ciudad: %s\nCantidad de habitantes: %d\nSuperficie: %.2f\nProyección habitantes 2030: %d\nSuperficie ocupada: %.2f\n",
                nombre, habitantes, superficie, habitantes2030, superficieOcupada);
    }

    public String getNombre() {
        return nombre;
    }
}
