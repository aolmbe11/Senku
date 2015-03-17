package senku;

import java.util.ArrayList;

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

    public boolean isMovimientoVertical() {
        boolean movimientoVertical;
        if (filaOrigen == filaDestino) {
            movimientoVertical = false;
        } else {
            movimientoVertical = true;
        }
        return movimientoVertical;
    }

    public boolean isMovimientoHorizontal() {
        boolean movimientoHorizontal;

        if (columOrigen == columDestino) {
            movimientoHorizontal = false;
        } else {
            movimientoHorizontal = true;
        }
        return movimientoHorizontal;
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
            System.out.println("Prueba vertical");
            System.out.println("movimiento" + this.getMovimiento());
            switch (this.getMovimiento()) {
                case MOVER_ARRIBA:
                    System.out.println("Prueba arriba");
                    if (tablero[filaOrigen - 1][columOrigen] == FICHA
                            && tablero[filaOrigen - 2][columOrigen] == HUECO) {
                        tablero[filaOrigen - 1][columOrigen] = HUECO;
                        tablero[filaDestino][columDestino] = FICHA;
                        tablero[filaOrigen][columOrigen] = HUECO;
                    } else {
                        movimientoValido = false;
                    }
                    break;
                case MOVER_ABAJO:
                    if (tablero[filaOrigen + 1][columOrigen] == FICHA
                            && tablero[filaOrigen + 2][columOrigen] == HUECO) {
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
                                && tablero[filaOrigen][columOrigen - 2] == HUECO) {
                            tablero[filaOrigen][columOrigen - 1] = HUECO;
                            tablero[filaDestino][columDestino] = FICHA;
                            tablero[filaOrigen][columOrigen] = HUECO;
                        } else {
                            movimientoValido = false;
                        }
                        break;
                    case MOVER_DER:
                        if (tablero[filaOrigen][columOrigen + 1] == FICHA
                                && tablero[filaOrigen][columOrigen + 2] == HUECO) {
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

        movimientos = new Movimientos(filaOrigen, filaDestino, columOrigen, columDestino);
        listaMovimientos.add(movimientos);

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
                    tablero[filaOrigen + 1][columOrigen] = FICHA;
                    break;
                case MOVER_ABAJO:
                    tablero[filaOrigen][columOrigen] = FICHA;
                    tablero[filaDestino][columDestino] = HUECO;
                    tablero[filaOrigen - 1][columOrigen] = FICHA;
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
        listaMovimientos.remove(listaMovimientos.size() - 1);
    }

}
