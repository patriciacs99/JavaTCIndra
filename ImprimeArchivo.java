package ministerioGeografia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class ImprimeArchivo implements Runnable {
    private Sistema sistema;

    public ImprimeArchivo(Sistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\pcorrals\\eclipse-workspace\\CursoJavaTC\\src\\ministerioGeografia\\"+ sistema.getCiudad().getNombre() +"\\"+sistema.getCiudad().getNombre() +"_informacion.txt"))) {
            System.out.println("Hilo secundario 2, "+ sistema.getCiudad().getNombre()+" : Imprimiendo información en archivo...");

            writer.write(sistema.getCiudad().toString());

            System.out.println("Hilo secundario 2, "+sistema.getCiudad().getNombre()+" : Información impresa en archivo con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}