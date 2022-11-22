package newproject_rodrigovasquez;

import java.util.Scanner;
import java.util.Random;

public class NewProject_RodrigoVasquez {

    public static void main(String[] args) {
        Scanner mainn = new Scanner(System.in);
        String[] acumxa = new String[30];
        String[] acumxb = new String[30];
        String[] acumxc = new String[30];
        String[] acumxd = new String[30];
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int turnob = 0;
        int turnoa = 0;
        int turnoc = 0;
        int turnod = 0;
        int cuenta1 = 0;
        int random = 0;
        int random2 = 0;
        String coorda = "";
        String coordb = "";
        String coordc = "";
        String coordd = "";
        boolean vf = true;
        System.out.println("SEAN BIENVENIDOS A BATTLESHIP");
        do {
            if (cuenta1 == 0) {
                do {
                    random = new Random().nextInt((4 - 1) + 1) + 1;
                    random2 = new Random().nextInt((4 - 1) + 1) + 1;
                    cuenta1++;
                } while (random == random2);
            }
            switch (random) {
                case 1:
                    acumxa[turnoa] = coorda;
                    tableroa(coorda, acumxa);
                    do {
                        coorda = "";
                        System.out.print("Jugador 1 ingrese la coordenada que desea bombardear: ");
                        coorda = mainn.nextLine();
                        int num1 = Character.getNumericValue(coorda.charAt(0));
                        int num2 = Character.getNumericValue(coorda.charAt(1));
                        if ((num1 > 5) || (num1 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else if ((num2 > 4) || (num2 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else {
                            vf = true;
                        }
                    } while (vf == false);
                    cont2 = HabradadoA(coorda, cont2);
                    turnoa++;
                    break;
                case 2:
                    acumxb[turnob] = coordb;
                    // esto es un array que almacena las coordenadas dichas por el usuario dependiendo al turno.
                    tablerob(coordb, acumxb);
                    //aqui se manda a la maquina al metodo donde se genera, llena y muestra el tablero B para el jugador 1
//            for (int i = 0; i < acumxb.length; i++) {
//                System.out.print(acumxb[i]+" ");}
                    do {
                        coordb = "";
                        System.out.print("Jugador 1 ingrese la coordenada que desea bombardear: ");
                        coordb = mainn.nextLine();
                        int num3 = Character.getNumericValue(coordb.charAt(0));
                        int num4 = Character.getNumericValue(coordb.charAt(1));
                        if ((num3 > 5) || (num3 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else if ((num4 > 4) || (num4 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else {
                            vf = true;
                        }
                    } while (vf == false);
                    // aqui creo un array que va agarrando las coordenadas puestas por el usuario.
                    cont1 = HabradadoB(coordb, cont1);
                    //aqui lo mando al metodo que verifica si le dio a un barco o no.
                    turnob++;
                    //sumo el turno para que vaya cambiando la posicion del array acumxb.
//                  System.out.println(cont1+"cont1");
                    break;
                case 3:
                    acumxc[turnoc] = coordc;
                    tableroc(coordc, acumxc);
                    do {
                        coordc = "";
                        System.out.print("Jugador 1 ingrese la coordenada que desea bombardear: ");
                        coordc = mainn.nextLine();
                        int num5 = Character.getNumericValue(coordc.charAt(0));
                        int num6 = Character.getNumericValue(coordc.charAt(1));
                        if ((num5 > 5) || (num5 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else if ((num6 > 4) || (num6 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else {
                            vf = true;
                        }
                    } while (vf == false);
                    cont3 = HabradadoC(coordc, cont3);
                    turnoc++;
                    break;
                case 4:
                    acumxd[turnod] = coordd;
                    tablerod(coordd, acumxd);
                    do {
                        coordd = "";
                        System.out.print("Jugador 1 ingrese la coordenada que desea bombardear: ");
                        coordd = mainn.nextLine();
                        int num7 = Character.getNumericValue(coordd.charAt(0));
                        int num8 = Character.getNumericValue(coordd.charAt(1));
                        if ((num7 > 5) || (num7 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else if ((num8 > 4) || (num8 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else {
                            vf = true;
                        }
                    } while (vf == false);
                    cont4 = HabradadoD(coordd, cont4);
                    turnod++;
                    break;
            }
//            acumxb[turnob]=coordb;
//            // esto es un array que almacena las coordenadas dichas por el usuario dependiendo al turno.
//            tablerob(coordb, acumxb);
//            //aqui se manda a la maquina al metodo donde se genera, llena y muestra el tablero B para el jugador 1
////            for (int i = 0; i < acumxb.length; i++) {
////                System.out.print(acumxb[i]+" ");
////            }
//            System.out.println();
//            // aqui creo un array que va agarrando las coordenadas puestas por el usuario.
//            System.out.print("Jugador 1 ingrese la coordenada que desea bombardear: ");
//            coordb = mainn.nextLine();
//            cont1 = HabradadoB(coordb,cont1);
//            //aqui lo mando al metodo que verifica si le dio a un barco o no.
//            turnob++;
//            //sumo el turno para que vaya cambiando la posicion del array acumxb.
////            System.out.println(cont1+"cont1");
//            
//            //literalmente lo mismo para el jugador dos 
//            acumxa[turnoa]=coorda;
//            tableroa(coorda, acumxa);
//            System.out.print("Jugador 2 ingrese la coordenada que desea bombardear: ");
//            coorda = mainn.nextLine();
//            cont2 = HabradadoA(coorda, cont2);
//            turnoa++;
////            System.out.println(cont2+"cont2");
            switch (random2) {
                case 1:
                    acumxa[turnoa] = coorda;
                    tableroa(coorda, acumxa);
                    do {
                        coorda = "";
                        System.out.print("Jugador 2 ingrese la coordenada que desea bombardear: ");
                        coorda = mainn.nextLine();
                        int num1 = Character.getNumericValue(coorda.charAt(0));
                        int num2 = Character.getNumericValue(coorda.charAt(1));
                        if ((num1 > 5) || (num1 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else if ((num2 > 4) || (num2 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else {
                            vf = true;
                        }
                    } while (vf == false);
                    cont2 = HabradadoA(coorda, cont2);
                    turnoa++;
                    break;
                case 2:
                    acumxb[turnob] = coordb;
                    // esto es un array que almacena las coordenadas dichas por el usuario dependiendo al turno.
                    tablerob(coordb, acumxb);
                    //aqui se manda a la maquina al metodo donde se genera, llena y muestra el tablero B para el jugador 1
//            for (int i = 0; i < acumxb.length; i++) {
//                System.out.print(acumxb[i]+" ");}
                    do {
                        coordb = "";
                        System.out.print("Jugador 2 ingrese la coordenada que desea bombardear: ");
                        coordb = mainn.nextLine();
                        int num3 = Character.getNumericValue(coordb.charAt(0));
                        int num4 = Character.getNumericValue(coordb.charAt(1));
                        if ((num3 > 5) || (num3 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else if ((num4 > 4) || (num4 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else {
                            vf = true;
                        }
                    } while (vf == false);
                    // aqui creo un array que va agarrando las coordenadas puestas por el usuario.
                    cont1 = HabradadoB(coordb, cont1);
                    //aqui lo mando al metodo que verifica si le dio a un barco o no.
                    turnob++;
                    //sumo el turno para que vaya cambiando la posicion del array acumxb.
//                  System.out.println(cont1+"cont1");
                    break;
                case 3:
                    acumxc[turnoc] = coordc;
                    tableroc(coordc, acumxc);
                    do {
                        coordc = "";
                        System.out.print("Jugador 2 ingrese la coordenada que desea bombardear: ");
                        coordc = mainn.nextLine();
                        int num5 = Character.getNumericValue(coordc.charAt(0));
                        int num6 = Character.getNumericValue(coordc.charAt(1));
                        if ((num5 > 5) || (num5 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else if ((num6 > 4) || (num6 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else {
                            vf = true;
                        }
                    } while (vf == false);
                    cont3 = HabradadoC(coordc, cont3);
                    turnoc++;
                    break;
                case 4:
                    acumxd[turnod] = coordd;
                    tablerod(coordd, acumxd);
                    do {
                        coordd = "";
                        System.out.print("Jugador 2 ingrese la coordenada que desea bombardear: ");
                        coordd = mainn.nextLine();
                        int num7 = Character.getNumericValue(coordd.charAt(0));
                        int num8 = Character.getNumericValue(coordd.charAt(1));
                        if ((num7 > 5) || (num7 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else if ((num8 > 4) || (num8 < 0)) {
                            vf = false;
                            System.out.println("ERROR... COORDENADA NO VALIDA, TIRE DE NUEVO");
                        } else {
                            vf = true;
                        }
                    } while (vf == false);
                    cont4 = HabradadoD(coordd, cont4);
                    turnod++;
                    break;
            }
            if (cont1 == 3) {
                break;
            }
            if (cont2 == 3) {
                break;
            }
            if (cont3 == 3) {
                break;
            }
            if (cont4 == 3) {
                break;
            }
        } while (cont1 < 4 || cont2 < 4 || cont3 < 4 || cont4 < 4);
        if ((random == 1) && ((cont1 == 3) || (cont2 == 3) || (cont3 == 3) || (cont4 == 3))) {
            System.out.println("Felicidades Jugador 1, usted ha ganado");
        } else {
            System.out.println("Felicidades Jugador 2, usted ha ganado");
        }
    }

    public static void tableroa(String coorda, String[] acumxa) {
        String[][] tableroa = new String[6][5];
        //creo la matriz 
        for (int k = 0; k < 5; k++) {
            if (k == 0) {
                System.out.print("  ");
            }
            System.out.print(k + "  ");
        }
        // este for de arriba es para escribir los numeros arriba de la matriz para que el usuario identifique las coordenadas.
        System.out.println();
        for (int i = 0; i < tableroa.length; i++) {
            System.out.print(i);
            // y este sout es para escribir lo mismo solo para las filas.
            for (int j = 0; j < tableroa[i].length; j++) {
                String ambos = "" + i + "" + j;
                //aqui creo un String que junta los numeros de i y j para que se haga un String.
//------------------------------------------------------------------------------------------------------------------------------------------------------------
//                if ((i==0&&j==0)||(i==1&&j==0)||(i==2&&j==0)||(i==1&&j==2)||(i==1&&j==3)||(i==3&&j==4)||(i==4&&j==4)||(i==5&&j==4)){
//                    if ("[X]".equals(tableroa[i][j])){
//                        tableroa[i][j]="[X]";
//                    }else{
//                        tableroa[i][j]="[]";
//                    }
//                }else{
//                    tableroa[i][j]="[ ]";
//                }
//------------------------------------------------------------------------------------------------------------------------------------------------------------
                tableroa[i][j] = "[ ]";
                // aqui determino que para cada casilla debe haber un espacio ya que no se deben de ver los *
                if (ambos.equals(coorda)) {
                    tableroa[i][j] = "[X]";
                    //esto es para que a la siguiente tirada le aparezca la X del lugar donde tiro anteriormente.
                }
//                if (ambos.equals(acumxa[i])) {
//                    tableroa[i][j]="[X]";
                //aqui lo que intento es comparar el String ambos que es el string de las coordenadas del for con la posicion que hay en el acumulador
                //de coordenadas ya escritas, pero no me funciona, solo sale la X del tiro anterior no todos los anteriores, es decir, solo uno.
//                }
                for (int b = 0; b < acumxa.length; b++) {
                    if (ambos.equals(acumxa[b])) {
                        tableroa[i][j] = "[X]";
                    }
                }
                System.out.print(tableroa[i][j]);

            }
            System.out.println();
        }
    }

    public static int HabradadoA(String coorda, int cont2) {
        String[][] tableroa = new String[6][5];
        boolean sera = false;
        for (int k = 0; k < 5; k++) {
            if (k == 0) {
            }
        }
        for (int i = 0; i < tableroa.length; i++) {
            for (int j = 0; j < tableroa[i].length; j++) {
                String ambos = i + "" + j;
                if ((i == 0 && j == 0) || (i == 1 && j == 0) || (i == 2 && j == 0) || (i == 1 && j == 2) || (i == 1 && j == 3) || (i == 3 && j == 4) || (i == 4 && j == 4) || (i == 5 && j == 4)) {
                    tableroa[i][j] = "[*]";
                    if (coorda.equals(ambos)) {
                        cont2++;
                        sera = true;
                        i = 7680;
                        //le puse ese valor para que no vuelva a entrar al ciclo.
                        break;
                    } else {
                        tableroa[i][j] = "[ ]";
                        sera = false;
                    }
                }
            }
        }
        if (sera) {
            System.out.println("Uy, un barco ha sido bombardeado");
        } else {
            System.out.println("Bomba al agua");
        }
        return cont2;
    }

    public static void tablerob(String coordb, String[] acumxb) {
        String[][] tablerob = new String[6][5];
        for (int k = 0; k < 5; k++) {
            if (k == 0) {
                System.out.print("  ");
            }
            System.out.print(k + "  ");
        }
        System.out.println();
        for (int i = 0; i < tablerob.length; i++) {
            System.out.print(i);
            for (int j = 0; j < tablerob[i].length; j++) {
                String ambos = "" + i + "" + j;
//                if ((i==1&&j==3)||(i==2&&j==3)||(i==3&&j==1)||(i==3&&j==3)||(i==4&&j==1)||(i==5&&j==1)||(i==5&&j==3)||(i==5&&j==4)){
//                    if ("[X]".equals(tablerob[i][j])){
//                        tablerob[i][j]="[X]";
//                    }else{
//                        tablerob[i][j]="[*]";
//                    }
//                }else{
//                    tablerob[i][j]="[ ]";
//                }
                tablerob[i][j] = "[ ]";
                if (ambos.equals(coordb)) {
                    tablerob[i][j] = "[X]";
                }
//                if (ambos.equals(acumxb[i])) {
//                    tablerob[i][j] = "[X]";
//                }
                for (int b = 0; b < acumxb.length; b++) {
                    if (ambos.equals(acumxb[b])) {
                        tablerob[i][j] = "[X]";
                    }
                }
                System.out.print(tablerob[i][j]);
            }
            System.out.println();
        }
    }

    public static int HabradadoB(String coordb, int cont1) {
        String[][] tableroa = new String[6][5];
        boolean sera2 = false;
        for (int k = 0; k < 5; k++) {
            if (k == 0) {
            }
        }
        for (int i = 0; i < tableroa.length; i++) {
            for (int j = 0; j < tableroa[i].length; j++) {
                String ambos = i + "" + j;
                if ((i == 1 && j == 3) || (i == 2 && j == 3) || (i == 3 && j == 1) || (i == 3 && j == 3) || (i == 4 && j == 1) || (i == 5 && j == 1) || (i == 5 && j == 3) || (i == 5 && j == 4)) {
                    tableroa[i][j] = "[*]";
                    //aqui les digo cuales son las coordenadas que tienen los barcos.
                    if (coordb.equals(ambos)) {
                        cont1++;
                        // se suma el contador que identifica las veces que le ha dado a un barco.
                        sera2 = true;
                        i = 7890;
                        // en el caso de que acierta lo saca del for y le dice que le dio.
                        //le puse ese valor para que no vuelva a entrar al ciclo.
                        break;
                    } else {
                        tableroa[i][j] = "[ ]";
                        // en caso de ser falso solo lo deja como un [ ] y le dice que le dio al agua.
                        sera2 = false;
                    }
                }
            }
        }
        if (sera2) {
            System.out.println("Uy, un barco ha sido bombardeado");
        } else {
            System.out.println("Bomba al agua");
        }
        return cont1;
    }

    public static void tableroc(String coordc, String[] acumxc) {
        String[][] tablerob = new String[6][5];
        for (int k = 0; k < 5; k++) {
            if (k == 0) {
                System.out.print("  ");
            }
            System.out.print(k + "  ");
        }
        System.out.println();
        for (int i = 0; i < tablerob.length; i++) {
            System.out.print(i);
            for (int j = 0; j < tablerob[i].length; j++) {
                String ambos = "" + i + "" + j;
//                if ((i==1&&j==3)||(i==2&&j==3)||(i==3&&j==1)||(i==3&&j==3)||(i==4&&j==1)||(i==5&&j==1)||(i==5&&j==3)||(i==5&&j==4)){
//                    if ("[X]".equals(tablerob[i][j])){
//                        tablerob[i][j]="[X]";
//                    }else{
//                        tablerob[i][j]="[*]";
//                    }
//                }else{
//                    tablerob[i][j]="[ ]";
//                }
                tablerob[i][j] = "[ ]";
                if (ambos.equals(coordc)) {
                    tablerob[i][j] = "[X]";
                }
//                if (ambos.equals(acumxb[i])) {
//                    tablerob[i][j] = "[X]";
//                }
                for (int b = 0; b < acumxc.length; b++) {
                    if (ambos.equals(acumxc[b])) {
                        tablerob[i][j] = "[X]";
                    }
                }
                System.out.print(tablerob[i][j]);
            }
            System.out.println();
        }
    }

    public static int HabradadoC(String coordc, int cont3) {
        String[][] tableroa = new String[6][5];
        boolean sera2 = false;
        for (int k = 0; k < 5; k++) {
            if (k == 0) {
            }
        }
        for (int i = 0; i < tableroa.length; i++) {
            for (int j = 0; j < tableroa[i].length; j++) {
                String ambos = i + "" + j;
                if ((i == 0 && j == 4) || (i == 1 && j == 4) || (i == 3 && j == 0) || (i == 4 && j == 0) || (i == 5 && j == 0) || (i == 3 && j == 2) || (i == 3 && j == 3) || (i == 3 && j == 4)) {
                    tableroa[i][j] = "[*]";
                    //aqui les digo cuales son las coordenadas que tienen los barcos.
                    if (coordc.equals(ambos)) {
                        cont3++;
                        // se suma el contador que identifica las veces que le ha dado a un barco.
                        sera2 = true;
                        i = 7890;
                        // en el caso de que acierta lo saca del for y le dice que le dio.
                        //le puse ese valor para que no vuelva a entrar al ciclo.
                        break;
                    } else {
                        tableroa[i][j] = "[ ]";
                        // en caso de ser falso solo lo deja como un [ ] y le dice que le dio al agua.
                        sera2 = false;
                    }
                }
            }
        }
        if (sera2) {
            System.out.println("Uy, un barco ha sido bombardeado");
        } else {
            System.out.println("Bomba al agua");
        }
        return cont3;
    }

    public static void tablerod(String coordd, String[] acumxd) {
        String[][] tablerob = new String[6][5];
        for (int k = 0; k < 5; k++) {
            if (k == 0) {
                System.out.print("  ");
            }
            System.out.print(k + "  ");
        }
        System.out.println();
        for (int i = 0; i < tablerob.length; i++) {
            System.out.print(i);
            for (int j = 0; j < tablerob[i].length; j++) {
                String ambos = "" + i + "" + j;
//                if ((i==1&&j==3)||(i==2&&j==3)||(i==3&&j==1)||(i==3&&j==3)||(i==4&&j==1)||(i==5&&j==1)||(i==5&&j==3)||(i==5&&j==4)){
//                    if ("[X]".equals(tablerob[i][j])){
//                        tablerob[i][j]="[X]";
//                    }else{
//                        tablerob[i][j]="[*]";
//                    }
//                }else{
//                    tablerob[i][j]="[ ]";
//                }
                tablerob[i][j] = "[ ]";
                if (ambos.equals(coordd)) {
                    tablerob[i][j] = "[X]";
                }
//                if (ambos.equals(acumxb[i])) {
//                    tablerob[i][j] = "[X]";
//                }
                for (int b = 0; b < acumxd.length; b++) {
                    if (ambos.equals(acumxd[b])) {
                        tablerob[i][j] = "[X]";
                    }
                }
                System.out.print(tablerob[i][j]);
            }
            System.out.println();
        }
    }

    public static int HabradadoD(String coordd, int cont4) {
        String[][] tableroa = new String[6][5];
        boolean sera2 = false;
        for (int k = 0; k < 5; k++) {
            if (k == 0) {
            }
        }
        for (int i = 0; i < tableroa.length; i++) {
            for (int j = 0; j < tableroa[i].length; j++) {
                String ambos = i + "" + j;
                if ((i == 1 && j == 2) || (i == 2 && j == 2) || (i == 3 && j == 2) || (i == 4 && j == 3) || (i == 4 && j == 4) || (i == 5 && j == 0) || (i == 5 && j == 1) || (i == 5 && j == 2)) {
                    tableroa[i][j] = "[*]";
                    //aqui les digo cuales son las coordenadas que tienen los barcos.
                    if (coordd.equals(ambos)) {
                        cont4++;
                        // se suma el contador que identifica las veces que le ha dado a un barco.
                        sera2 = true;
                        i = 7890;
                        // en el caso de que acierta lo saca del for y le dice que le dio.
                        //le puse ese valor para que no vuelva a entrar al ciclo.
                        break;
                    } else {
                        tableroa[i][j] = "[ ]";
                        // en caso de ser falso solo lo deja como un [ ] y le dice que le dio al agua.
                        sera2 = false;
                    }
                }
            }
        }
        if (sera2) {
            System.out.println("Uy, un barco ha sido bombardeado");
        } else {
            System.out.println("Bomba al agua");
        }
        return cont4;
    }

}
