package ministerioGeografia;

class GeneradorDirectorio implements Runnable {
	
	private Sistema sistema;

    public GeneradorDirectorio(Sistema sistema) {
        this.sistema = sistema;
    }

    
    @Override
    public void run() {
        System.out.println("Hilo secundario 1: Generando directorio...");
        String directorio = "C:\\Users\\pcorrals\\eclipse-workspace\\CursoJavaTC\\src\\ministerioGeografia\\"+ sistema.getCiudad().getNombre();
        boolean creado = new java.io.File(directorio).mkdir();
        if (creado) {
            System.out.println("Hilo secundario 1, "+ sistema.getCiudad().getNombre()+" : Directorio generado con éxito.");
        } else {
            System.out.println("Hilo secundario 1, "+ sistema.getCiudad().getNombre()+" : El directorio ya existe.");
        }
    }
}