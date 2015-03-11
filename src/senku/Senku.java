package senku;

public class Senku {

    private final int FILAS = 7;
    private final int COLUMNAS = 7;

    private char[][] tablero;

    private String[] patron;

    public Senku() {
        tablero = new char[FILAS][COLUMNAS];
    }

    public void crearPatron() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (i < 2 || i > 4) {
                    switch (j) {
                        case 0:
                            tablero[i][j] = '-';
                            break;
                        case 1:
                            tablero[i][j] = '-';
                            break;
                        case 2:
                            tablero[i][j] = '#';
                            break;
                        case 3:
                            tablero[i][j] = '#';
                            break;
                        case 4:
                            tablero[i][j] = '#';
                            break;
                        case 5:
                            tablero[i][j] = '-';
                            break;
                        case 6:
                            tablero[i][j] = '-';
                            break;
                    }
                } else {
                    if (i == 2 || i == 4) {
                        tablero[i][j] = '#';
                    } else {
                        if (j == 3) {
                            tablero[i][j] = '.';
                        } else {
                            tablero[i][j] = '#';
                        }
                    }
                }
            }
        }
    }

    public String pintarTablero() {

        String texto = "";
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                texto += tablero[i][j];
            }
            texto += "\n";
        }
        return texto;
    }

    public void mover(int posicion, int nuevaPosicion) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                
            }
            
        }
    }

}
