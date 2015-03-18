package senku;

import com.sun.org.apache.xml.internal.serializer.OutputPropertiesFactory;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class Senku {

    public static final int FILAS = 7;
    public static final int COLUMNAS = 7;

    private int movimiento;
    private boolean movimientoValido;

    public final int MOVER_ARRIBA = 1;
    public final int MOVER_ABAJO = 2;
    public final int MOVER_IZQ = 3;
    public final int MOVER_DER = 4;

    public final char LIMITE = ' ';
    public final char FICHA = '#';
    public final char HUECO = '.';

    private int filaOrigen;
    private int filaDestino;
    private int columOrigen;
    private int columDestino;

    private char[][] tablero;

    private Movimientos movimientos;
    private ArrayList<Movimientos> listaMovimientos = new ArrayList();

    public Senku() {
        tablero = new char[FILAS][COLUMNAS];
    }

    public void crearPatron() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (i < 2 || i > 4) {
                    switch (j) {
                        case 0:
                        case 1:
                        case 5:
                        case 6:
                            tablero[i][j] = LIMITE;
                            break;
                        case 2:
                            tablero[i][j] = FICHA;
                            break;
                        case 3:
                            tablero[i][j] = FICHA;
                            break;
                        case 4:
                            tablero[i][j] = FICHA;
                            break;
                    }
                } else {
                    if (i == 2 || i == 4) {
                        tablero[i][j] = FICHA;
                    } else {
                        if (j == 3) {
                            tablero[i][j] = HUECO;
                        } else {
                            tablero[i][j] = FICHA;
                        }
                    }
                }
            }
        }
    }

    public String pintarTablero() {

        String texto = " ";
        for (int j = 0; j < COLUMNAS; j++) {
            texto += j;
        }
        texto += "\n";

        for (int i = 0; i < FILAS; i++) {
            texto += i;
            for (int j = 0; j < COLUMNAS; j++) {
                texto += tablero[i][j];
            }
            texto += "\n";
        }
        return texto;
    }

    public boolean isMovimientoValido() {
        return movimientoValido;
    }

    public boolean isMovimientoHorizontal() {
        boolean movimientoHorizontal;
        if (filaOrigen == filaDestino) {
            movimientoHorizontal = true;
        } else {
            movimientoHorizontal = false;
        }
        return movimientoHorizontal;
    }

    public boolean isMovimientoVertical() {
        boolean movimientoVertical;

        if (columOrigen == columDestino) {
            movimientoVertical = true;
        } else {
            movimientoVertical = false;
        }
        return movimientoVertical;
    }

    private int getMovimiento() {

        if (isMovimientoVertical()) {
            if (filaDestino > filaOrigen) {
                movimiento = MOVER_ABAJO;
            } else {
                movimiento = MOVER_ARRIBA;
            }
        } else {
            if (isMovimientoHorizontal()) {
                if (columDestino > columOrigen) {
                    movimiento = MOVER_DER;
                } else {
                    movimiento = MOVER_IZQ;
                }
            }
        }
        return movimiento;
    }

    public void mover(int filaOrigen, int filaDestino, int columOrigen, int columDestino) {

        this.filaOrigen = filaOrigen;
        this.filaDestino = filaDestino;
        this.columOrigen = columOrigen;
        this.columDestino = columDestino;

        movimientoValido = true;

        if (isMovimientoVertical()) {
            switch (this.getMovimiento()) {
                case MOVER_ARRIBA:
                    if (tablero[filaOrigen - 1][columOrigen] == FICHA
                            && tablero[filaDestino][columDestino] == HUECO
                            && filaDestino + 2 == filaOrigen) {
                        tablero[filaOrigen - 1][columOrigen] = HUECO;
                        tablero[filaDestino][columDestino] = FICHA;
                        tablero[filaOrigen][columOrigen] = HUECO;
                    } else {
                        movimientoValido = false;
                    }
                    break;
                case MOVER_ABAJO:
                    if (tablero[filaOrigen + 1][columOrigen] == FICHA
                            && tablero[filaDestino][columDestino] == HUECO
                            && filaDestino - 2 == filaOrigen) {
                        tablero[filaOrigen + 1][columOrigen] = HUECO;
                        tablero[filaDestino][columDestino] = FICHA;
                        tablero[filaOrigen][columOrigen] = HUECO;
                    } else {
                        movimientoValido = false;
                    }
                    break;
            }
        } else {
            if (isMovimientoHorizontal()) {
                switch (this.getMovimiento()) {
                    case MOVER_IZQ:
                        if (tablero[filaOrigen][columOrigen - 1] == FICHA
                                && tablero[filaDestino][columDestino] == HUECO
                                && columDestino + 2 == columOrigen) {
                            tablero[filaOrigen][columOrigen - 1] = HUECO;
                            tablero[filaDestino][columDestino] = FICHA;
                            tablero[filaOrigen][columOrigen] = HUECO;
                        } else {
                            movimientoValido = false;
                        }
                        break;
                    case MOVER_DER:
                        if (tablero[filaOrigen][columOrigen + 1] == FICHA
                                && tablero[filaDestino][columDestino] == HUECO
                                && columDestino - 2 == columOrigen) {
                            tablero[filaOrigen][columOrigen + 1] = HUECO;
                            tablero[filaDestino][columDestino] = FICHA;
                            tablero[filaOrigen][columOrigen] = HUECO;
                        } else {
                            movimientoValido = false;
                        }
                        break;
                }
            }
        }
        if (isMovimientoValido()) {
            movimientos = new Movimientos(filaOrigen, filaDestino, columOrigen, columDestino);
            listaMovimientos.add(movimientos);
        }

    }

    public void deshacerMovimiento() {

        this.filaOrigen = listaMovimientos.get(listaMovimientos.size() - 1).getFilaDestino();
        this.filaDestino = listaMovimientos.get(listaMovimientos.size() - 1).getFilaOrigen();
        this.columOrigen = listaMovimientos.get(listaMovimientos.size() - 1).getColumDestino();
        this.columDestino = listaMovimientos.get(listaMovimientos.size() - 1).getColumOrigen();

        if (isMovimientoVertical()) {
            switch (this.getMovimiento()) {
                case MOVER_ARRIBA:
                    tablero[filaOrigen][columOrigen] = HUECO;
                    tablero[filaDestino][columDestino] = FICHA;
                    tablero[filaOrigen - 1][columOrigen] = FICHA;
                    break;
                case MOVER_ABAJO:
                    tablero[filaOrigen][columOrigen] = HUECO;
                    tablero[filaDestino][columDestino] = FICHA;
                    tablero[filaOrigen + 1][columOrigen] = FICHA;
                    break;
            }
        } else {
            if (isMovimientoHorizontal()) {
                switch (this.getMovimiento()) {
                    case MOVER_IZQ:
                        tablero[filaOrigen][columOrigen] = HUECO;
                        tablero[filaDestino][columDestino] = FICHA;
                        tablero[filaOrigen][columOrigen - 1] = FICHA;
                        break;
                    case MOVER_DER:
                        tablero[filaOrigen][columOrigen] = HUECO;
                        tablero[filaDestino][columDestino] = FICHA;
                        tablero[filaOrigen][columOrigen + 1] = FICHA;
                        break;
                }
            }
        }
        if (!listaMovimientos.isEmpty()) {
            listaMovimientos.remove(listaMovimientos.size() - 1);
        }
    }

    private String getListaMovimientos() {
        String texto = "";

        for (int i = 0; i < listaMovimientos.size(); i++) {
            texto += "Movimiento: " + (i + 1) + " " + listaMovimientos.get(i).toString() + "\n";
        }
        return texto;
    }

    public void listaMovimientosToXML() {
        try {
            DocumentBuilderFactory fábricaCreadorDocumento = DocumentBuilderFactory.newInstance();
            DocumentBuilder creadorDocumento = fábricaCreadorDocumento.newDocumentBuilder();
            //Crear un nuevo documento XML
            Document documento = creadorDocumento.newDocument();

            //Crear el nodo raíz y colgarlo del documento
            Element elementoRaiz = documento.createElement("MOVIMIENTOS");
            documento.appendChild(elementoRaiz);

            for (int i = 0; i < listaMovimientos.size(); i++) {
                //Crear un elemento MOVMIMIENTO colgando de MOVIMIENTOS
                Element elementoMovimiento = documento.createElement("MOVIMIENTO");
                elementoRaiz.appendChild(elementoMovimiento);

                //Crear un elemento NUM_MOVIMIENTO colgando de MOVIMIENTO
                Element elementoNumMovimiento = documento.createElement("NUM_MOVIMIENTO");
                elementoMovimiento.appendChild(elementoNumMovimiento);

                //Crear un elemento FILA_ORIGEN colgando de MOVIMIENTO
                Element elementoFilaOrigen = documento.createElement("FILA_ORIGEN");
                elementoMovimiento.appendChild(elementoFilaOrigen);

                //Crear un elemento FILA_DESTINO colgando de MOVIMIENTO
                Element elementoFilaDestino = documento.createElement("FILA_DESTINO");
                elementoMovimiento.appendChild(elementoFilaDestino);

                //Crear un elemento COLUM_ORIGEN colgando de MOVIMIENTO
                Element elementoColumOrigen = documento.createElement("COLUM_ORIGEN");
                elementoMovimiento.appendChild(elementoColumOrigen);

                //Crear un elemento COLUM_DESTINO colgando de MOVIMIENTO
                Element elementoColumDestino = documento.createElement("COLUM_DESTINO");
                elementoMovimiento.appendChild(elementoColumDestino);

                //Obtener los numero de movimiento y colgarlos de NUM_MOVIMIENTO
                Text textoNumMovimiento = documento.createTextNode(String.valueOf(i + 1));
                elementoNumMovimiento.appendChild(textoNumMovimiento);

                //Obtener la fila de origen y colgarlos de FILA_ORIGEN
                Text textoFilaOrigen = documento.createTextNode(String.valueOf(listaMovimientos.get(i).getFilaOrigen()));
                elementoFilaOrigen.appendChild(textoFilaOrigen);

                //Obtener la fila de destino y colgarlos de FILA_DESTINO
                Text textoFilaDestino = documento.createTextNode(String.valueOf(listaMovimientos.get(i).getFilaDestino()));
                elementoFilaDestino.appendChild(textoFilaDestino);

                //Obtener la columna de origen y colgarlos de COLUM_ORIGEN
                Text textoColumOrigen = documento.createTextNode(String.valueOf(listaMovimientos.get(i).getColumOrigen()));
                elementoColumOrigen.appendChild(textoColumOrigen);

                //Obtener la columna de destino y colgarlos de COLUM_DESTINO
                Text textoColumDestino = documento.createTextNode(String.valueOf(listaMovimientos.get(i).getColumDestino()));
                elementoColumDestino.appendChild(textoColumDestino);
            }
            //Generar el tranformador para obtener el documento XML en un fichero
            TransformerFactory fábricaTransformador = TransformerFactory.newInstance();
            Transformer transformador = fábricaTransformador.newTransformer();
            //Insertar saltos de línea al final de cada línea
            transformador.setOutputProperty(OutputKeys.INDENT, "yes");
            //Añadir 3 espacios delante, en función del nivel de cada nodo
            transformador.setOutputProperty(OutputPropertiesFactory.S_KEY_INDENT_AMOUNT, "3");
            Source origen = new DOMSource(documento);
            Result destino = new StreamResult("movimientos.xml");
            transformador.transform(origen, destino);

        } catch (ParserConfigurationException ex) {
            System.out.println("ERROR: No se ha podido crear el generador de documentos XML\n" + ex.getMessage());
            ex.printStackTrace();
        } catch (TransformerConfigurationException ex) {
            System.out.println("ERROR: No se ha podido crear el transformador del documento XML\n" + ex.getMessage());
            ex.printStackTrace();
        } catch (TransformerException ex) {
            System.out.println("ERROR: No se ha podido crear la salida del documento XML\n" + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
