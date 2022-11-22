package ejerciciomatricesarreglos_rodrigovasquez;

import java.util.Scanner;
import java.util.Random;

public class EjercicioMatricesArreglos_RodrigoVasquez {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner badApple = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.print("1. Battleship\n2. Buscaminas\n¿Qué desea jugar? ");
            choice = badApple.nextInt();
            switch (choice) {
                case 1:
                    battle_ship();
                    break;
                case 2:
                    busca_minas();
            }
        } while (choice < 3 && choice > 0);
    }

    public static void battle_ship() {
        Scanner nakama = new Scanner(System.in);
        System.out.println("~~~ B I E N V E N I D O S   A   B A T T L E S H I P ~~~");
        int tab1 = new Random().nextInt((5 - 1) + 1) + 1;
        int tab2 = new Random().nextInt((5 - 1) + 1) + 1;
        String[][] tableroA = new String[6][5];
        String[][] tableroB = new String[6][5];
        if (tab1 != tab2) {
            switch (tab1) {
                case 1:
                    tableroA = battle_ship_A();
                    break;
                case 2:
                    tableroA = battle_ship_B();
                    break;
                case 3:
                    tableroA = battle_ship_C();
                    break;
                case 4:
                    tableroA = battle_ship_D();
                    break;
                case 5:
                    tableroA = battle_ship_E();
                    break;
            }
            switch (tab2) {
                case 1:
                    tableroB = battle_ship_A();
                    break;
                case 2:
                    tableroB = battle_ship_B();
                    break;
                case 3:
                    tableroB = battle_ship_C();
                    break;
                case 4:
                    tableroB = battle_ship_D();
                    break;
                case 5:
                    tableroB = battle_ship_E();
                    break;
            }
        }
        int cont1 = 0;
        int cont2 = 0;
        int contTurno = 0;
        do {
            if (contTurno % 2 == 0) {
                System.out.println("P1, ingrese coordenadas a atacar: ");
                String coordenadas = nakama.next();
                if (coordenadas.length() > 2 || coordenadas.length() <= 1) {
                    System.out.println("Coordenadas Invalidas");
                } else {
                    int fila = coordenadas.charAt(0);
                    int columna = coordenadas.charAt(1);
                    switch (fila) {
                        case 48:
                            fila = 0;
                            break;
                        case 49:
                            fila = 1;
                            break;
                        case 50:
                            fila = 2;
                            break;
                        case 51:
                            fila = 3;
                            break;
                        case 52:
                            fila = 4;
                            break;
                        case 53:
                            fila = 5;
                            break;
                    }
                    switch (columna) {
                        case 48:
                            columna = 0;
                            break;
                        case 49:
                            columna = 1;
                            break;
                        case 50:
                            columna = 2;
                            break;
                        case 51:
                            columna = 3;
                            break;
                        case 52:
                            columna = 4;
                            break;
                    }
                    if ((fila < 0 || fila > 5) && (columna < 0 || columna > 4)) {
                        System.out.println("Coordenadas Invalidas");
                    } else {
                        coordenadas = fila + "" + columna;
                        tiro_al_blanco(tableroB, coordenadas);
                        contTurno++;
                    }
                }
            } else {
                System.out.println("P2, ingrese coordenadas a atacar: ");
                String coordenadas = nakama.next();
                if (coordenadas.length() > 2 || coordenadas.length() <= 1) {
                    System.out.println("Coordenadas Invalidas");
                } else {
                    int fila = coordenadas.charAt(0);
                    int columna = coordenadas.charAt(1);
                    switch (fila) {
                        case 48:
                            fila = 0;
                            break;
                        case 49:
                            fila = 1;
                            break;
                        case 50:
                            fila = 2;
                            break;
                        case 51:
                            fila = 3;
                            break;
                        case 52:
                            fila = 4;
                            break;
                        case 53:
                            fila = 5;
                            break;
                    }
                    switch (columna) {
                        case 48:
                            columna = 0;
                            break;
                        case 49:
                            columna = 1;
                            break;
                        case 50:
                            columna = 2;
                            break;
                        case 51:
                            columna = 3;
                            break;
                        case 52:
                            columna = 4;
                            break;
                    }
                    if ((fila < 0 || fila > 5) && (columna < 0 || columna > 4)) {
                        System.out.println("Coordenadas Invalidas");
                    } else {
                        coordenadas = fila + "" + columna;
                        tiro_al_blanco(tableroA, coordenadas);
                        contTurno++;
                    }
                }
            }
        } while (cont1 != 3 || cont2 != 3);
    }

    public static String[][] battle_ship_A() {
        String[][] battle_ship_A = new String[6][5];
        for (int i = 0; i < battle_ship_A.length; i++) {
            for (int j = 0; j < battle_ship_A[i].length; j++) {
                if ((i == 0 && j == 0) || (i == 1 && j == 0) || (i == 2 && j == 0) || (i == 1 && j == 2) || (i == 1 && j == 3) || (i == 3 && j == 4) || (i == 4 && j == 4) || (i == 5 && j == 4)) {
                    battle_ship_A[i][j] = "*";
                } else {
                    battle_ship_A[i][j] = " ";
                }
            }
        }
        return battle_ship_A;
    }

    public static String[][] battle_ship_B() {
        String[][] battle_ship_B = new String[6][5];
        for (int i = 0; i < battle_ship_B.length; i++) {
            for (int j = 0; j < battle_ship_B[i].length; j++) {
                if ((i == 3 && j == 1) || (i == 4 && j == 1) || (i == 5 && j == 1) || (i == 1 && j == 3) || (i == 2 && j == 3) || (i == 3 && j == 3) || (i == 5 && j == 3) || (i == 5 && j == 4)) {
                    battle_ship_B[i][j] = "*";
                } else {
                    battle_ship_B[i][j] = " ";
                }
            }
        }
        return battle_ship_B;
    }

    public static String[][] battle_ship_C() {
        String[][] battle_ship_C = new String[6][5];
        for (int i = 0; i < battle_ship_C.length; i++) {
            for (int j = 0; j < battle_ship_C[i].length; j++) {
                if ((i == 0 && j == 4) || (i == 1 && j == 4) || (i == 2 && j == 4) || (i == 3 && j == 1) || (i == 3 && j == 2) || (i == 3 && j == 3) || (i == 4 && j == 0) || (i == 5 && j == 0)) {
                    battle_ship_C[i][j] = "*";
                } else {
                    battle_ship_C[i][j] = " ";
                }
            }
        }
        return battle_ship_C;
    }

    public static String[][] battle_ship_D() {
        String[][] battle_ship_D = new String[6][5];
        for (int i = 0; i < battle_ship_D.length; i++) {
            for (int j = 0; j < battle_ship_D[i].length; j++) {
                if ((i == 3 && j == 2) || (i == 4 && j == 2) || (i == 5 && j == 2) || (i == 2 && j == 1) || (i == 2 && j == 2) || (i == 2 && j == 3) || (i == 0 && j == 2) || (i == 1 && j == 2)) {
                    battle_ship_D[i][j] = "*";
                } else {
                    battle_ship_D[i][j] = " ";
                }
            }
        }
        return battle_ship_D;
    }

    public static String[][] battle_ship_E() {
        String[][] battle_ship_E = new String[6][5];
        for (int i = 0; i < battle_ship_E.length; i++) {
            for (int j = 0; j < battle_ship_E[i].length; j++) {
                if ((i == 3 && j == 0) || (i == 4 && j == 0) || (i == 5 && j == 0) || (i == 0 && j == 1) || (i == 0 && j == 2) || (i == 0 && j == 3) || (i == 2 && j == 3) || (i == 2 && j == 4)) {
                    battle_ship_E[i][j] = "*";
                } else {
                    battle_ship_E[i][j] = " ";
                }
            }
        }
        return battle_ship_E;
    }

    public static void imprimir_battleship(String[][] matriz) {
        for (int i = 0; i < matriz[i].length; i++) {
            if (i == 0) {
                System.out.print("  ");
            }
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void imprimir_battleship_vacio() {
        String[][] matriz = new String[6][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = " ";
            }
        }
        for (int i = 0; i < matriz[i].length; i++) {
            if (i == 0) {
                System.out.print("  ");
            }
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void tiro_al_blanco(String[][] matriz, String coordenadas) {
        String[] positions = new String[8];
        for (int i = 0; i < positions.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz[j].length; k++) {
                    if (matriz[j][k].equals("*")) {
                        positions[i] = j + "" + k;
                    } else {
                        positions[i] = "";
                    }
                }
            }
        }
        /*for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = " ";
            }
        }*/
        int fila = coordenadas.charAt(0);
        int columna = coordenadas.charAt(1);
        switch (fila) {
            case 48:
                fila = 0;
                break;
            case 49:
                fila = 1;
                break;
            case 50:
                fila = 2;
                break;
            case 51:
                fila = 3;
                break;
            case 52:
                fila = 4;
                break;
            case 53:
                fila = 5;
                break;
        }
        switch (columna) {
            case 48:
                columna = 0;
                break;
            case 49:
                columna = 1;
                break;
            case 50:
                columna = 2;
                break;
            case 51:
                columna = 3;
                break;
            case 52:
                columna = 4;
                break;
        }
        String test = "";
        for (int i = 0; i < positions.length; i++) {
            if (positions[i].equals(coordenadas)) {
                test = positions[i];
            }
        }
        if (test.contains(coordenadas)) {
            matriz[fila][columna] = "X";
            System.out.println("Uy, un barco ha sido dañado");
        } else {
            matriz[fila][columna] = "X";
            System.out.println("Bomba al agua");
        }
        for (int i = 0; i < matriz[i].length; i++) {
            if (i == 0) {
                System.out.print("  ");
            }
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void busca_minas() {
        Scanner karma = new Scanner(System.in);
        System.out.println("~~~ B I E N V E N I D O S   A   B U S C A M I N A S ~~~");
        String[][] tablero = tableroMinas();
        boolean flag = false;
        do {
            imprimirMinas(tablero);
            System.out.print("Ingrese una coordenada: ");
            String coordenada = karma.next();
            if (coordenada.length() > 2) {
                System.out.println("Coordenada invalida");
            } else {
                for (int i = 0; i < coordenada.length(); i++) {
                    char caracter = coordenada.charAt(i);
                    if (caracter >= 54 || caracter <= 47) {
                        System.out.println("Coordenada invalida");
                    } else {
                        tiro_Minas(tablero, coordenada);
                        char char1 = coordenada.charAt(0);
                        int fila = Character.getNumericValue(coordenada.charAt(0));
                        char char2 = coordenada.charAt(1);
                        int columna = (int) char2;
                        if (tablero[fila][columna].equals("*")) {
                            flag = true;
                        }
                    }
                }
            }
        } while (flag == false);
    }

    public static String[][] tableroMinas() {
        String[][] tableroMinas = new String[6][6];
        int fila = 6;
        int columna = 6;
        for (int i = 0; i < tableroMinas.length; i++) {
            for (int j = 0; j < tableroMinas[i].length; j++) {
                tableroMinas[i][j] = " ";
            }
        }
        for (int i = 0; i < 5; i++) {
            fila = new Random().nextInt((5 - 0) + 1) + 0;
            columna = new Random().nextInt((5 - 0) + 1) + 0;
            if (tableroMinas[fila][columna].equals(" ")) {
                tableroMinas[fila][columna] = "*";
            } else if (tableroMinas[fila][columna].equals("*")) {
                int newfila = new Random().nextInt((5 - 0) + 1) + 0;
                int newcolumna = new Random().nextInt((5 - 0) + 1) + 0;
                tableroMinas[newfila][newcolumna] = "*";
            }
        }
        return tableroMinas;
    }

    public static void imprimirMinas(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void tiro_Minas(String[][] tablero, String coordenada) {
        String[][] tableroPrueba = tablero;
        int fila = (int) coordenada.charAt(0);
        int columna = (int) coordenada.charAt(1);
        switch (fila) {
            case 48:
                fila = 0;
            case 49:
                fila = 1;
            case 50:
                fila = 2;
            case 51:
                fila = 3;
            case 52:
                fila = 4;
            case 53:
                fila = 5;
        }
        switch (columna) {
            case 48:
                fila = 0;
            case 49:
                fila = 1;
            case 50:
                fila = 2;
            case 51:
                fila = 3;
            case 52:
                fila = 4;
            case 53:
                fila = 5;
        }
        if (tablero[fila][columna].equals("*")) {
            System.out.println("BOOM");
        } else {
            tablero[fila][columna] = "X";
        }
    }
}
