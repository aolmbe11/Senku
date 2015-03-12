package senku;

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

    private char[][] tablero;

    // Para almacenar el patron del fichero private String[] patron;
    public Senku() {
        tablero = new char[FILAS][COLUMNAS];
    }

    public void crearPatron() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (i < 2 || i > 4) {
                    switch (j) {
                        case 0:
                            tablero[i][j] = LIMITE;
                            break;
                        case 1:
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
                        case 5:
                            tablero[i][j] = LIMITE;
                            break;
                        case 6:
                            tablero[i][j] = LIMITE;
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

        String texto = "";
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

    public void mover(int filaActual, int nuevaFila, int columActual, int nuevaColumn) {

        boolean movimientoVertical;

        boolean movimientoHorizontal;

        movimientoValido = true;

        if (filaActual == nuevaFila) {
            movimientoVertical = false;
        } else {
            movimientoVertical = true;
        }

        if (columActual == nuevaColumn) {
            movimientoHorizontal = false;
        } else {
            movimientoHorizontal = true;
        }

        if (movimientoVertical) {
            if (nuevaFila > filaActual) {
                movimiento = MOVER_ABAJO;
            } else {
                movimiento = MOVER_ARRIBA;
            }
        }
        if (movimientoHorizontal) {
            if (nuevaColumn > columActual) {
                movimiento = MOVER_DER;
            } else {
                movimiento = MOVER_IZQ;
            }
        }

        if (movimientoVertical) {
            System.out.println("movimiento" + movimiento);
            switch (movimiento) {
                case MOVER_ARRIBA:
                    if (tablero[filaActual - 1][columActual] == FICHA
                            && tablero[filaActual - 2][columActual] == HUECO) {
                        tablero[filaActual - 1][columActual] = HUECO;
                        tablero[nuevaFila][nuevaColumn] = FICHA;
                        tablero[filaActual][columActual] = HUECO;
                    } else {
                        movimientoValido = false;
                    }
                    break;
                case MOVER_ABAJO:
                    if (tablero[filaActual + 1][columActual] == FICHA
                            && tablero[filaActual + 2][columActual] == HUECO) {
                        tablero[filaActual + 1][columActual] = HUECO;
                        tablero[nuevaFila][nuevaColumn] = FICHA;
                        tablero[filaActual][columActual] = HUECO;
                    } else {
                        movimientoValido = false;
                    }
                    break;
            }
        } else {
            if (movimientoHorizontal) {

                switch (movimiento) {
                    case MOVER_IZQ:
                        if (tablero[filaActual][columActual - 1] == FICHA
                                && tablero[filaActual][columActual - 2] == HUECO) {
                            tablero[filaActual][columActual - 1] = HUECO;
                            tablero[nuevaFila][nuevaColumn] = FICHA;
                            tablero[filaActual][columActual] = HUECO;
                        } else {
                            movimientoValido = false;
                        }
                        break;
                    case MOVER_DER:
                        if (tablero[filaActual][columActual + 1] == FICHA
                                && tablero[filaActual][columActual + 2] == HUECO) {
                            tablero[filaActual][columActual + 1] = HUECO;
                            tablero[nuevaFila][nuevaColumn] = FICHA;
                            tablero[filaActual][columActual] = HUECO;
                        } else {
                            movimientoValido = false;
                        }
                        break;
                }
            }
        }

    }

}
