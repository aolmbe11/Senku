
package senku;

public class Movimientos {
    
    private int filaOrigen; 
    private int filaDestino;
    private int columOrigen;
    private int columDestino;
   
    public int getFilaOrigen() {
        return filaOrigen;
    }

    public int getFilaDestino() {
        return filaDestino;
    }

    public int getColumOrigen() {
        return columOrigen;
    }

    public int getColumDestino() {
        return columDestino;
    }
    
    public Movimientos(int filaOrigen, int filaDestino, int columOrigen, int columDestino) {
        this.filaOrigen = filaOrigen;
        this.filaDestino = filaDestino;
        this.columOrigen = columOrigen;
        this.columDestino = columDestino;
    }

    @Override
    public String toString() {
        return "Fila Origen: " + filaOrigen + ", Fila Destino: " + filaDestino + 
                ", Columna Origen: " + columOrigen + ", Columna Destino: " + columDestino ;
    }

}
