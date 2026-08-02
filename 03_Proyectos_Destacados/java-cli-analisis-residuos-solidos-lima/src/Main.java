
//joshua.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner (System.in);
        
        String[]menu = new String [6];
        String txt;
        
        int[]ndo = new int [10];
        int input;
        int i;
        int ya = 3;
        
        double num;
        double li, ls;
        
        //<editor-fold defaultstate="collapsed" desc="Declaracion">
        double [] Fecha_Corte      = new double [40];
        double [] N_Sec            = new double [40];
        double [] Ubigeo           = new double [40];
        String [] Reg_Nat          = new String [40];
        String [] Departamento     = new String [40];
        String [] Provincia        = new String [40];
        String [] Distrito         = new String [40];
        double [] Pob_Total        = new double [40];
        double [] Pob_Urbana       = new double [40];
        double [] Pob_Rural        = new double [40];
        double [] Gpc_Dom          = new double [40];
        double [] QResiduos_Dom    = new double [40];
        double [] QResiduos_No_Dom = new double [40];
        double [] QResiduos_Mun    = new double [40];
        int    [] Periodo          = new int    [40];
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Asignacion">
        //<editor-fold defaultstate="collapsed" desc="Fecha_Corte">
        i = 0;
        while (i != 40){
            Fecha_Corte[i] = 20230614;
            i = i + 1;
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="N_Sec">
        N_Sec[0]  = 1262;
        N_Sec[1]  = 1264;
        N_Sec[2]  = 1278;
        N_Sec[3]  = 1293;
        N_Sec[4]  = 1303;
        N_Sec[5]  = 3126;
        N_Sec[6]  = 3128;
        N_Sec[7]  = 3142;
        N_Sec[8]  = 3157;
        N_Sec[9]  = 3167;
        N_Sec[10] = 4999;
        N_Sec[11] = 5001;
        N_Sec[12] = 5015;
        N_Sec[13] = 5030;
        N_Sec[14] = 5040;
        N_Sec[15] = 6873;
        N_Sec[16] = 6875;
        N_Sec[17] = 6889;
        N_Sec[18] = 6904;
        N_Sec[19] = 6914;
        N_Sec[20] = 8747;
        N_Sec[21] = 8749;
        N_Sec[22] = 8763;
        N_Sec[23] = 8778;
        N_Sec[24] = 8788;
        N_Sec[25] = 10621;
        N_Sec[26] = 10623;
        N_Sec[27] = 10637;
        N_Sec[28] = 10652;
        N_Sec[29] = 10662;
        N_Sec[30] = 12495;
        N_Sec[31] = 12497;
        N_Sec[32] = 12511;
        N_Sec[33] = 12526;
        N_Sec[34] = 12536;
        N_Sec[35] = 14381;
        N_Sec[36] = 14383;
        N_Sec[37] = 14397;
        N_Sec[38] = 14412;
        N_Sec[39] = 14422;
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Ubigeo">
        Ubigeo[0]  = 150101;
        Ubigeo[1]  = 150103;
        Ubigeo[2]  = 150117;
        Ubigeo[3]  = 150132;
        Ubigeo[4]  = 150142;
        Ubigeo[5]  = 150101;
        Ubigeo[6]  = 150103;
        Ubigeo[7]  = 150117;
        Ubigeo[8]  = 150132;
        Ubigeo[9]  = 150142;
        Ubigeo[10] = 150101;
        Ubigeo[11] = 150103;
        Ubigeo[12] = 150117;
        Ubigeo[13] = 150132;
        Ubigeo[14] = 150142;
        Ubigeo[15] = 150101;
        Ubigeo[16] = 150103;
        Ubigeo[17] = 150117;
        Ubigeo[18] = 150132;
        Ubigeo[19] = 150142;
        Ubigeo[20] = 150101;
        Ubigeo[21] = 150103;
        Ubigeo[22] = 150117;
        Ubigeo[23] = 150132;
        Ubigeo[24] = 150142;
        Ubigeo[25] = 150101;
        Ubigeo[26] = 150103;
        Ubigeo[27] = 150117;
        Ubigeo[28] = 150132;
        Ubigeo[29] = 150142;
        Ubigeo[30] = 150101;
        Ubigeo[31] = 150103;
        Ubigeo[32] = 150117;
        Ubigeo[33] = 150132;
        Ubigeo[34] = 150142;
        Ubigeo[35] = 150101;
        Ubigeo[36] = 150103;
        Ubigeo[37] = 150117;
        Ubigeo[38] = 150132;
        Ubigeo[39] = 150142;
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Reg_Nat">
        i = 0;
        while (i != 40){
            Reg_Nat[i] = "Costa";
            i = i + 1;
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Departamento">
        i = 0;
        while (i != 40){
            Departamento[i] = "Lima";
            i = i + 1;
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Provincia">
        i = 0;
        while (i != 40){
            Provincia[i] = "Lima";
            i = i + 1;
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Distrito">
        Distrito[0]  = "Lima";
        Distrito[1]  = "Ate";
        Distrito[2]  = "Los Olivos";
        Distrito[3]  = "San Juan De Lurigancho";
        Distrito[4]  = "Villa El Salvador";
        Distrito[5]  = "Lima";
        Distrito[6]  = "Ate";
        Distrito[7]  = "Los Olivos";
        Distrito[8]  = "San Juan De Lurigancho";
        Distrito[9]  = "Villa El Salvador";
        Distrito[10] = "Lima";
        Distrito[11] = "Ate";
        Distrito[12] = "Los Olivos";
        Distrito[13] = "San Juan De Lurigancho";
        Distrito[14] = "Villa El Salvador";
        Distrito[15] = "Lima";
        Distrito[16] = "Ate";
        Distrito[17] = "Los Olivos";
        Distrito[18] = "San Juan De Lurigancho";
        Distrito[19] = "Villa El Salvador";
        Distrito[20] = "Lima";
        Distrito[21] = "Ate";
        Distrito[22] = "Los Olivos";
        Distrito[23] = "San Juan De Lurigancho";
        Distrito[24] = "Villa El Salvador";
        Distrito[25] = "Lima";
        Distrito[26] = "Ate";
        Distrito[27] = "Los Olivos";
        Distrito[28] = "San Juan De Lurigancho";
        Distrito[29] = "Villa El Salvador";
        Distrito[30] = "Lima";
        Distrito[31] = "Ate";
        Distrito[32] = "Los Olivos";
        Distrito[33] = "San Juan De Lurigancho";
        Distrito[34] = "Villa El Salvador";
        Distrito[35] = "Lima";
        Distrito[36] = "Ate";
        Distrito[37] = "Los Olivos";
        Distrito[38] = "San Juan De Lurigancho";
        Distrito[39] = "Villa El Salvador";
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Pob_Total">
        Pob_Total[0]  = 276857;
        Pob_Total[1]  = 611082;
        Pob_Total[2]  = 365921;
        Pob_Total[3]  = 1069566;
        Pob_Total[4]  = 454114;
        Pob_Total[5]  = 271814;
        Pob_Total[6]  = 630086;
        Pob_Total[7]  = 371229;
        Pob_Total[8]  = 1091303;
        Pob_Total[9]  = 463014;
        Pob_Total[10] = 268777;
        Pob_Total[11] = 645803;
        Pob_Total[12] = 377915;
        Pob_Total[13] = 1114686;
        Pob_Total[14] = 472442;
        Pob_Total[15] = 265693;
        Pob_Total[16] = 661786;
        Pob_Total[17] = 384711;
        Pob_Total[18] = 1138453;
        Pob_Total[19] = 482027;
        Pob_Total[20] = 270249;
        Pob_Total[21] = 640087;
        Pob_Total[22] = 346064;
        Pob_Total[23] = 1136931;
        Pob_Total[24] = 416766;
        Pob_Total[25] = 269769;
        Pob_Total[26] = 652900;
        Pob_Total[27] = 349100;
        Pob_Total[28] = 1152258;
        Pob_Total[29] = 420278;
        Pob_Total[30] = 267379;
        Pob_Total[31] = 670818;
        Pob_Total[32] = 351983;
        Pob_Total[33] = 1177629;
        Pob_Total[34] = 423887;
        Pob_Total[35] = 267199;
        Pob_Total[36] = 687615;
        Pob_Total[37] = 355528;
        Pob_Total[38] = 1203125;
        Pob_Total[39] = 428276;
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Pob_Urbana">
        Pob_Urbana[0]  = 276857;
        Pob_Urbana[1]  = 611082;
        Pob_Urbana[2]  = 365921;
        Pob_Urbana[3]  = 1069566;
        Pob_Urbana[4]  = 454114;
        Pob_Urbana[5]  = 271814;
        Pob_Urbana[6]  = 630086;
        Pob_Urbana[7]  = 371229;
        Pob_Urbana[8]  = 1091303;
        Pob_Urbana[9]  = 463014;
        Pob_Urbana[10] = 268777;
        Pob_Urbana[11] = 645803;
        Pob_Urbana[12] = 377915;
        Pob_Urbana[13] = 1114686;
        Pob_Urbana[14] = 472442;
        Pob_Urbana[15] = 265693;
        Pob_Urbana[16] = 661786;
        Pob_Urbana[17] = 384711;
        Pob_Urbana[18] = 1138453;
        Pob_Urbana[19] = 482027;
        Pob_Urbana[20] = 270249;
        Pob_Urbana[21] = 640087;
        Pob_Urbana[22] = 346064;
        Pob_Urbana[23] = 1136931;
        Pob_Urbana[24] = 416766;
        Pob_Urbana[25] = 269769;
        Pob_Urbana[26] = 652900;
        Pob_Urbana[27] = 349100;
        Pob_Urbana[28] = 1152258;
        Pob_Urbana[29] = 420278;
        Pob_Urbana[30] = 267379;
        Pob_Urbana[31] = 670818;
        Pob_Urbana[32] = 351983;
        Pob_Urbana[33] = 1177629;
        Pob_Urbana[34] = 423887;
        Pob_Urbana[35] = 267199;
        Pob_Urbana[36] = 687615;
        Pob_Urbana[37] = 355528;
        Pob_Urbana[38] = 1203125;
        Pob_Urbana[39] = 428276;
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Pob_Rural">
        i = 0;
        while (i != 40){
            Pob_Rural[i] = 0;
            i = i + 1;
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Gpc_Dom">
        Gpc_Dom[0]  = 1.59;
        Gpc_Dom[1]  = 0.57;
        Gpc_Dom[2]  = 0.54;
        Gpc_Dom[3]  = 0.47;
        Gpc_Dom[4]  = 0.47;
        Gpc_Dom[5]  = 0.71;
        Gpc_Dom[6]  = 0.66;
        Gpc_Dom[7]  = 0.74;
        Gpc_Dom[8]  = 0.54;
        Gpc_Dom[9]  = 0.63;
        Gpc_Dom[10] = 0.71;
        Gpc_Dom[11] = 0.62;
        Gpc_Dom[12] = 0.74;
        Gpc_Dom[13] = 0.54;
        Gpc_Dom[14] = 0.63;
        Gpc_Dom[15] = 0.71;
        Gpc_Dom[16] = 0.62;
        Gpc_Dom[17] = 0.65;
        Gpc_Dom[18] = 0.59;
        Gpc_Dom[19] = 0.46;
        Gpc_Dom[20] = 0.71;
        Gpc_Dom[21] = 0.62;
        Gpc_Dom[22] = 0.65;
        Gpc_Dom[23] = 0.59;
        Gpc_Dom[24] = 0.46;
        Gpc_Dom[25] = 0.74;
        Gpc_Dom[26] = 0.69;
        Gpc_Dom[27] = 0.68;
        Gpc_Dom[28] = 0.62;
        Gpc_Dom[29] = 0.67;
        Gpc_Dom[30] = 0.74;
        Gpc_Dom[31] = 0.69;
        Gpc_Dom[32] = 0.68;
        Gpc_Dom[33] = 0.62;
        Gpc_Dom[34] = 0.67;
        Gpc_Dom[35] = 0.69;
        Gpc_Dom[36] = 0.69;
        Gpc_Dom[37] = 0.67;
        Gpc_Dom[38] = 0.61;
        Gpc_Dom[39] = 0.67;
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="QResiduos_Dom">
        QResiduos_Dom[0]  = 161045.5;
        QResiduos_Dom[1]  = 127750;
        QResiduos_Dom[2]  = 72611;
        QResiduos_Dom[3]  = 181874;
        QResiduos_Dom[4]  = 77642.6;
        QResiduos_Dom[5]  = 70539.81;
        QResiduos_Dom[6]  = 151787.72;
        QResiduos_Dom[7]  = 100268.95;
        QResiduos_Dom[8]  = 215095.82;
        QResiduos_Dom[9]  = 106470.07;
        QResiduos_Dom[10] = 69751.66;
        QResiduos_Dom[11] = 146616.66;
        QResiduos_Dom[12] = 102074.84;
        QResiduos_Dom[13] = 217670.31;
        QResiduos_Dom[14] = 108982.92;
        QResiduos_Dom[15] = 68951.32;
        QResiduos_Dom[16] = 150245.28;
        QResiduos_Dom[17] = 91272.68;
        QResiduos_Dom[18] = 246412.46;
        QResiduos_Dom[19] = 80932.33;
        QResiduos_Dom[20] = 70133.74;
        QResiduos_Dom[21] = 145318.87;
        QResiduos_Dom[22] = 82103.74;
        QResiduos_Dom[23] = 246082.95;
        QResiduos_Dom[24] = 69974.95;
        QResiduos_Dom[25] = 72864.61;
        QResiduos_Dom[26] = 164432.87;
        QResiduos_Dom[27] = 86646.62;
        QResiduos_Dom[28] = 260755.99;
        QResiduos_Dom[29] = 102778.98;
        QResiduos_Dom[30] = 72219.07;
        QResiduos_Dom[31] = 168945.51;
        QResiduos_Dom[32] = 87362.18;
        QResiduos_Dom[33] = 266497.44;
        QResiduos_Dom[34] = 103661.57;
        QResiduos_Dom[35] = 67294.07;
        QResiduos_Dom[36] = 173175.84;
        QResiduos_Dom[37] = 86944.37;
        QResiduos_Dom[38] = 267875.78;
        QResiduos_Dom[39] = 104734.9;
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="QResiduos_No_Dom">
        QResiduos_No_Dom[0]  = 69019.5;
        QResiduos_No_Dom[1]  = 54750;
        QResiduos_No_Dom[2]  = 31119;
        QResiduos_No_Dom[3]  = 77946;
        QResiduos_No_Dom[4]  = 33275.4;
        QResiduos_No_Dom[5]  = 30231.35;
        QResiduos_No_Dom[6]  = 65051.88;
        QResiduos_No_Dom[7]  = 42972.41;
        QResiduos_No_Dom[8]  = 92183.92;
        QResiduos_No_Dom[9]  = 45630.03;
        QResiduos_No_Dom[10] = 29893.57;
        QResiduos_No_Dom[11] = 62835.71;
        QResiduos_No_Dom[12] = 43746.36;
        QResiduos_No_Dom[13] = 93287.28;
        QResiduos_No_Dom[14] = 46706.97;
        QResiduos_No_Dom[15] = 29550.57;
        QResiduos_No_Dom[16] = 64390.83;
        QResiduos_No_Dom[17] = 39116.86;
        QResiduos_No_Dom[18] = 105605.34;
        QResiduos_No_Dom[19] = 34685.29;
        QResiduos_No_Dom[20] = 30057.32;
        QResiduos_No_Dom[21] = 62279.51;
        QResiduos_No_Dom[22] = 35187.32;
        QResiduos_No_Dom[23] = 105464.12;
        QResiduos_No_Dom[24] = 29989.26;
        QResiduos_No_Dom[25] = 31227.69;
        QResiduos_No_Dom[26] = 70471.23;
        QResiduos_No_Dom[27] = 37134.27;
        QResiduos_No_Dom[28] = 111752.57;
        QResiduos_No_Dom[29] = 44048.14;
        QResiduos_No_Dom[30] = 30951.03;
        QResiduos_No_Dom[31] = 72405.22;
        QResiduos_No_Dom[32] = 37440.93;
        QResiduos_No_Dom[33] = 114213.19;
        QResiduos_No_Dom[34] = 44426.39;
        QResiduos_No_Dom[35] = 28840.31;
        QResiduos_No_Dom[36] = 74218.22;
        QResiduos_No_Dom[37] = 37261.87;
        QResiduos_No_Dom[38] = 114803.91;
        QResiduos_No_Dom[39] = 44886.38;
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="QResiduos_Mun">
        QResiduos_Mun[0]  = 230065;
        QResiduos_Mun[1]  = 182500;
        QResiduos_Mun[2]  = 103730;
        QResiduos_Mun[3]  = 259820;
        QResiduos_Mun[4]  = 110918;
        QResiduos_Mun[5]  = 100771.16;
        QResiduos_Mun[6]  = 216839.6;
        QResiduos_Mun[7]  = 143241.36;
        QResiduos_Mun[8]  = 307279.74;
        QResiduos_Mun[9]  = 152100.1;
        QResiduos_Mun[10] = 99645.23;
        QResiduos_Mun[11] = 209452.36;
        QResiduos_Mun[12] = 145821.2;
        QResiduos_Mun[13] = 310957.58;
        QResiduos_Mun[14] = 155689.89;
        QResiduos_Mun[15] = 98501.88;
        QResiduos_Mun[16] = 214636.11;
        QResiduos_Mun[17] = 130389.55;
        QResiduos_Mun[18] = 352017.8;
        QResiduos_Mun[19] = 115617.62;
        QResiduos_Mun[20] = 100191.06;
        QResiduos_Mun[21] = 207598.38;
        QResiduos_Mun[22] = 117291.06;
        QResiduos_Mun[23] = 351547.07;
        QResiduos_Mun[24] = 99964.22;
        QResiduos_Mun[25] = 104092.3;
        QResiduos_Mun[26] = 234904.09;
        QResiduos_Mun[27] = 123780.89;
        QResiduos_Mun[28] = 372508.55;
        QResiduos_Mun[29] = 146827.12;
        QResiduos_Mun[30] = 103170.1;
        QResiduos_Mun[31] = 241350.73;
        QResiduos_Mun[32] = 124803.12;
        QResiduos_Mun[33] = 380710.63;
        QResiduos_Mun[34] = 148087.95;
        QResiduos_Mun[35] = 96134.38;
        QResiduos_Mun[36] = 247394.05;
        QResiduos_Mun[37] = 124206.25;
        QResiduos_Mun[38] = 382679.69;
        QResiduos_Mun[39] = 149621.28;
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Periodo">
        Periodo[0]  = 2014;
        Periodo[1]  = 2014;
        Periodo[2]  = 2014;
        Periodo[3]  = 2014;
        Periodo[4]  = 2014;
        Periodo[5]  = 2015;
        Periodo[6]  = 2015;
        Periodo[7]  = 2015;
        Periodo[8]  = 2015;
        Periodo[9]  = 2015;
        Periodo[10] = 2016;
        Periodo[11] = 2016;
        Periodo[12] = 2016;
        Periodo[13] = 2016;
        Periodo[14] = 2016;
        Periodo[15] = 2017;
        Periodo[16] = 2017;
        Periodo[17] = 2017;
        Periodo[18] = 2017;
        Periodo[19] = 2017;
        Periodo[20] = 2018;
        Periodo[21] = 2018;
        Periodo[22] = 2018;
        Periodo[23] = 2018;
        Periodo[24] = 2018;
        Periodo[25] = 2019;
        Periodo[26] = 2019;
        Periodo[27] = 2019;
        Periodo[28] = 2019;
        Periodo[29] = 2019;
        Periodo[30] = 2020;
        Periodo[31] = 2020;
        Periodo[32] = 2020;
        Periodo[33] = 2020;
        Periodo[34] = 2020;
        Periodo[35] = 2021;
        Periodo[36] = 2021;
        Periodo[37] = 2021;
        Periodo[38] = 2021;
        Periodo[39] = 2021;
        //</editor-fold>
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Menus">
        menu[0] = """
                  ***********************************
                  *                                 *
                  *   [0] Salir                     *
                  *   [1] Diccionario de terminos   *
                  *   [2] Elegir dato               *
                  *   [3] Mostrar todos los datos   *
                  *                                 *
                  ***********************************
                  """;
        
        menu[1] = """
                  *****************************
                  *                           *
                  *   [ 0] Atras              *
                  *   [ 1] Fecha_Corte        *
                  *   [ 2] N_Sec              *
                  *   [ 3] Ubigeo             *
                  *   [ 4] Reg_Nat            *
                  *   [ 5] Departamento       *
                  *   [ 6] Provincia          *
                  *   [ 7] Distrito           *
                  *   [ 8] Pob_Total          *
                  *   [ 9] Pob_Urbana         *
                  *   [10] Pob_Rural          *
                  *   [11] GPC_Dom            *
                  *   [12] QResiduos_Dom      *
                  *   [13] QResiduos_No_Dom   *
                  *   [14] QResiduos_Mun      *
                  *   [15] Periodo            *
                  *                           *
                  *****************************
                  """;
        
        menu[2] = """
                  ***********************************
                  *                                 *
                  *   [0] Atras                     *
                  *   [1] Filtrar segun numero      *
                  *   [2] Filtrar segun un rango    *
                  *   [3] Mostrar todos los datos   *
                  *                                 *
                  ***********************************
                  """;
        
        menu[3] = """
                  *********************************************************
                  *                                                       *
                  *   [0] Atras                                           *
                  *   [1] Mostrar datos menores que el numero ingresado   *
                  *   [2] Mostrar datos iguales que el numero ingresado   *
                  *   [3] Mostrar datos mayores que el numero ingresado   *
                  *                                                       *
                  *********************************************************
                  """;
        
        menu[4] = """
                  ***********************************
                  *                                 *
                  *   [0] Atras                     *
                  *   [1] Filtrar segun texto       *
                  *   [2] Mostrar todos los datos   *
                  *                                 *
                  ***********************************
                  """;
        menu[5] = """
                  [  ] [FECHA_CORTE] [N_SEC] [UBIGEO] [REG_NAT] [DEPARTAMENTO] [PROVINCIA] [DISTRITO              ] [POB_TOTAL] [POB_URBANA] [POB_RURAL] [GPC_DOM] [QRESIDUOS_DOM] [QRESIDUOS_NO_DOM] [QRESIDUOS_MUN] [PERIODO]
                  [ 1] [20230614   ] [1262 ] [150101] [COSTA  ] [LIMA        ] [LIMA     ] [LIMA                  ] [276857   ] [276857    ] [    0    ] [1.59   ] [161045.5     ] [69019.5         ] [230065       ] [2014   ]
                  [ 2] [20230614   ] [1264 ] [150103] [COSTA  ] [LIMA        ] [LIMA     ] [ATE                   ] [611082   ] [611082    ] [    0    ] [0.57   ] [127750       ] [54750           ] [182500       ] [2014   ]
                  [ 3] [20230614   ] [1278 ] [150117] [COSTA  ] [LIMA        ] [LIMA     ] [LOS OLIVOS            ] [365921   ] [365921    ] [    0    ] [0.54   ] [72611        ] [31119           ] [103730       ] [2014   ]
                  [ 4] [20230614   ] [1293 ] [150132] [COSTA  ] [LIMA        ] [LIMA     ] [SAN JUAN DE LURIGANCHO] [1069566  ] [1069566   ] [    0    ] [0.47   ] [181874       ] [77946           ] [259820       ] [2014   ]
                  [ 5] [20230614   ] [1303 ] [150142] [COSTA  ] [LIMA        ] [LIMA     ] [VILLA EL SALVADOR     ] [454114   ] [454114    ] [    0    ] [0.47   ] [77642.6      ] [33275.4         ] [110918       ] [2014   ]
                  [ 6] [20230614   ] [3126 ] [150101] [COSTA  ] [LIMA        ] [LIMA     ] [LIMA                  ] [271814   ] [271814    ] [    0    ] [0.71   ] [70539.81     ] [30231.35        ] [100771.16    ] [2015   ]
                  [ 7] [20230614   ] [3128 ] [150103] [COSTA  ] [LIMA        ] [LIMA     ] [ATE                   ] [630086   ] [630086    ] [    0    ] [0.66   ] [151787.72    ] [65051.88        ] [216839.6     ] [2015   ]
                  [ 8] [20230614   ] [3142 ] [150117] [COSTA  ] [LIMA        ] [LIMA     ] [LOS OLIVOS            ] [371229   ] [371229    ] [    0    ] [0.74   ] [100268.95    ] [42972.41        ] [143241.36    ] [2015   ]
                  [ 9] [20230614   ] [3157 ] [150132] [COSTA  ] [LIMA        ] [LIMA     ] [SAN JUAN DE LURIGANCHO] [1091303  ] [1091303   ] [    0    ] [0.54   ] [215095.82    ] [92183.92        ] [307279.74    ] [2015   ]
                  [10] [20230614   ] [3167 ] [150142] [COSTA  ] [LIMA        ] [LIMA     ] [VILLA EL SALVADOR     ] [463014   ] [463014    ] [    0    ] [0.63   ] [106470.07    ] [45630.03        ] [152100.1     ] [2015   ]
                  [11] [20230614   ] [4999 ] [150101] [COSTA  ] [LIMA        ] [LIMA     ] [LIMA                  ] [268777   ] [268777    ] [    0    ] [0.71   ] [69751.66     ] [29893.57        ] [99645.23     ] [2016   ]
                  [12] [20230614   ] [5001 ] [150103] [COSTA  ] [LIMA        ] [LIMA     ] [ATE                   ] [645803   ] [645803    ] [    0    ] [0.62   ] [146616.66    ] [62835.71        ] [209452.36    ] [2016   ]
                  [13] [20230614   ] [5015 ] [150117] [COSTA  ] [LIMA        ] [LIMA     ] [LOS OLIVOS            ] [377915   ] [377915    ] [    0    ] [0.74   ] [102074.84    ] [43746.36        ] [145821.2     ] [2016   ]
                  [14] [20230614   ] [5030 ] [150132] [COSTA  ] [LIMA        ] [LIMA     ] [SAN JUAN DE LURIGANCHO] [1114686  ] [1114686   ] [    0    ] [0.54   ] [217670.31    ] [93287.28        ] [310957.58    ] [2016   ]
                  [15] [20230614   ] [5040 ] [150142] [COSTA  ] [LIMA        ] [LIMA     ] [VILLA EL SALVADOR     ] [472442   ] [472442    ] [    0    ] [0.63   ] [108982.92    ] [46706.97        ] [155689.89    ] [2016   ]
                  [16] [20230614   ] [6873 ] [150101] [COSTA  ] [LIMA        ] [LIMA     ] [LIMA                  ] [265693   ] [265693    ] [    0    ] [0.71   ] [68951.32     ] [29550.57        ] [98501.88     ] [2017   ]
                  [17] [20230614   ] [6875 ] [150103] [COSTA  ] [LIMA        ] [LIMA     ] [ATE                   ] [661786   ] [661786    ] [    0    ] [0.62   ] [150245.28    ] [64390.83        ] [214636.11    ] [2017   ]
                  [18] [20230614   ] [6889 ] [150117] [COSTA  ] [LIMA        ] [LIMA     ] [LOS OLIVOS            ] [384711   ] [384711    ] [    0    ] [0.65   ] [91272.68     ] [39116.86        ] [130389.55    ] [2017   ]
                  [19] [20230614   ] [6904 ] [150132] [COSTA  ] [LIMA        ] [LIMA     ] [SAN JUAN DE LURIGANCHO] [1138453  ] [1138453   ] [    0    ] [0.59   ] [246412.46    ] [105605.34       ] [352017.8     ] [2017   ]
                  [20] [20230614   ] [6914 ] [150142] [COSTA  ] [LIMA        ] [LIMA     ] [VILLA EL SALVADOR     ] [482027   ] [482027    ] [    0    ] [0.46   ] [80932.33     ] [34685.29        ] [115617.62    ] [2017   ]
                  [21] [20230614   ] [8747 ] [150101] [COSTA  ] [LIMA        ] [LIMA     ] [LIMA                  ] [270249   ] [270249    ] [    0    ] [0.71   ] [70133.74     ] [30057.32        ] [100191.06    ] [2018   ]
                  [22] [20230614   ] [8749 ] [150103] [COSTA  ] [LIMA        ] [LIMA     ] [ATE                   ] [640087   ] [640087    ] [    0    ] [0.62   ] [145318.87    ] [62279.51        ] [207598.38    ] [2018   ]
                  [23] [20230614   ] [8763 ] [150117] [COSTA  ] [LIMA        ] [LIMA     ] [LOS OLIVOS            ] [346064   ] [346064    ] [    0    ] [0.65   ] [82103.74     ] [35187.32        ] [117291.06    ] [2018   ]
                  [24] [20230614   ] [8778 ] [150132] [COSTA  ] [LIMA        ] [LIMA     ] [SAN JUAN DE LURIGANCHO] [1136931  ] [1136931   ] [    0    ] [0.59   ] [246082.95    ] [105464.12       ] [351547.07    ] [2018   ]
                  [25] [20230614   ] [8788 ] [150142] [COSTA  ] [LIMA        ] [LIMA     ] [VILLA EL SALVADOR     ] [416766   ] [416766    ] [    0    ] [0.46   ] [69974.95     ] [29989.26        ] [99964.22     ] [2018   ]
                  [26] [20230614   ] [10621] [150101] [COSTA  ] [LIMA        ] [LIMA     ] [LIMA                  ] [269769   ] [269769    ] [    0    ] [0.74   ] [72864.61     ] [31227.69        ] [104092.3     ] [2019   ]
                  [27] [20230614   ] [10623] [150103] [COSTA  ] [LIMA        ] [LIMA     ] [ATE                   ] [652900   ] [652900    ] [    0    ] [0.69   ] [164432.87    ] [70471.23        ] [234904.09    ] [2019   ]
                  [28] [20230614   ] [10637] [150117] [COSTA  ] [LIMA        ] [LIMA     ] [LOS OLIVOS            ] [349100   ] [349100    ] [    0    ] [0.68   ] [86646.62     ] [37134.27        ] [123780.89    ] [2019   ]
                  [29] [20230614   ] [10652] [150132] [COSTA  ] [LIMA        ] [LIMA     ] [SAN JUAN DE LURIGANCHO] [1152258  ] [1152258   ] [    0    ] [0.62   ] [260755.99    ] [111752.57       ] [372508.55    ] [2019   ]
                  [30] [20230614   ] [10662] [150142] [COSTA  ] [LIMA        ] [LIMA     ] [VILLA EL SALVADOR     ] [420278   ] [420278    ] [    0    ] [0.67   ] [102778.98    ] [44048.14        ] [146827.12    ] [2019   ]
                  [31] [20230614   ] [12495] [150101] [COSTA  ] [LIMA        ] [LIMA     ] [LIMA                  ] [267379   ] [267379    ] [    0    ] [0.74   ] [72219.07     ] [30951.03        ] [103170.1     ] [2020   ]
                  [32] [20230614   ] [12497] [150103] [COSTA  ] [LIMA        ] [LIMA     ] [ATE                   ] [670818   ] [670818    ] [    0    ] [0.69   ] [168945.51    ] [72405.22        ] [241350.73    ] [2020   ]
                  [33] [20230614   ] [12511] [150117] [COSTA  ] [LIMA        ] [LIMA     ] [LOS OLIVOS            ] [351983   ] [351983    ] [    0    ] [0.68   ] [87362.18     ] [37440.93        ] [124803.12    ] [2020   ]
                  [34] [20230614   ] [12526] [150132] [COSTA  ] [LIMA        ] [LIMA     ] [SAN JUAN DE LURIGANCHO] [1177629  ] [1177629   ] [    0    ] [0.62   ] [266497.44    ] [114213.19       ] [380710.63    ] [2020   ]
                  [35] [20230614   ] [12536] [150142] [COSTA  ] [LIMA        ] [LIMA     ] [VILLA EL SALVADOR     ] [423887   ] [423887    ] [    0    ] [0.67   ] [103661.57    ] [44426.39        ] [148087.95    ] [2020   ]
                  [36] [20230614   ] [14381] [150101] [COSTA  ] [LIMA        ] [LIMA     ] [LIMA                  ] [267199   ] [267199    ] [    0    ] [0.69   ] [67294.07     ] [28840.31        ] [96134.38     ] [2021   ]
                  [37] [20230614   ] [14383] [150103] [COSTA  ] [LIMA        ] [LIMA     ] [ATE                   ] [687615   ] [687615    ] [    0    ] [0.69   ] [173175.84    ] [74218.22        ] [247394.05    ] [2021   ]
                  [38] [20230614   ] [14397] [150117] [COSTA  ] [LIMA        ] [LIMA     ] [LOS OLIVOS            ] [355528   ] [355528    ] [    0    ] [0.67   ] [86944.37     ] [37261.87        ] [124206.25    ] [2021   ]
                  [39] [20230614   ] [14412] [150132] [COSTA  ] [LIMA        ] [LIMA     ] [SAN JUAN DE LURIGANCHO] [1203125  ] [1203125   ] [    0    ] [0.61   ] [267875.78    ] [114803.91       ] [382679.69    ] [2021   ]
                  [40] [20230614   ] [14422] [150142] [COSTA  ] [LIMA        ] [LIMA     ] [VILLA EL SALVADOR     ] [428276   ] [428276    ] [    0    ] [0.67   ] [104734.9     ] [44886.38        ] [149621.28    ] [2021   ]
                  """;
        //</editor-fold>
        
        do{
            System.out.println("Ingrese su nombre de usuario:");
            txt = sc.nextLine();
            System.out.println("");
            String user = Files.readAllLines(Paths.get("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_Final\\src\\Usuarios.txt")).get(1);
            String pass = Files.readAllLines(Paths.get("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_Final\\src\\Usuarios.txt")).get(4);
            if (user.equals(txt)){
                System.out.println("Ingrese su contraseña:");
                txt = sc.nextLine();
                System.out.println("");
                if (pass.equals(txt)){
                    ya = -5;
                    do{
                        ndo[0] = 1;
                        System.out.println(menu[0]);
                        input = sc.nextInt();
                        System.out.println("");
                        switch(input){
                            case 0:
                                ndo[0] = 0;
                                break;
                            case 1:
                                do{
                        ndo[1] = 1;
                        System.out.println(menu[1]);
                        input = sc.nextInt();
                        System.out.println("");
                        //<editor-fold defaultstate="collapsed" desc="Switch | Mostrar significado de los terminos">
                        switch(input){
                            case 0:
                                ndo[1] = 0;
                                break;
                            case 1:
                                System.out.println("Fecha_Corte: ");
                                System.out.println("Dia en que se genero el set de datos");
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("N_Sec: ");
                                System.out.println("Numero identificador de la informacion");
                                System.out.println("");
                                break;
                            case 3:
                                System.out.println("Ubigeo: ");
                                System.out.println("Codigo de ubicacion geografica donde se");
                                System.out.println("generan los residuos solidos");
                                System.out.println("");
                                break;
                            case 4:
                                System.out.println("Reg_Nat: ");
                                System.out.println("Region natural donde se generan los");
                                System.out.println("residuos solidos");
                                System.out.println("");
                                break;
                            case 5:
                                System.out.println("Departamento: ");
                                System.out.println("Departamento donde se generan los");
                                System.out.println("residuos solidos");
                                System.out.println("");
                                break;
                            case 6:
                                System.out.println("Provincia: ");
                                System.out.println("Provincia donde se generan los residuos");
                                System.out.println("solidos");
                                System.out.println("");
                                break;
                            case 7:
                                System.out.println("Distrito: ");
                                System.out.println("Distrito donde se generan los residuos");
                                System.out.println("solidos");
                                System.out.println("");
                                break;
                            case 8:
                                System.out.println("Pob_Total: ");
                                System.out.println("Es la totalidad de la poblacion urbana");
                                System.out.println("y poblacion rural del distrito donde se");
                                System.out.println("generaron los residuos solidos");
                                System.out.println("");
                                break;
                            case 9:
                                System.out.println("Pob_Urbana: ");
                                System.out.println("Cantidad de personas en zona urbana del");
                                System.out.println("distrito donde se generaron los residuos");
                                System.out.println("solidos");
                                System.out.println("");
                                break;
                            case 10:
                                System.out.println("Pob_Rural: ");
                                System.out.println("Cantidad de personas en zona rural del");
                                System.out.println("distrito donde se generaron los residuos");
                                System.out.println("solidos");
                                System.out.println("");
                                break;
                            case 11:
                                System.out.println("GPC_Dom: ");
                                System.out.println("Es la generacion unitaria de residuos solidos");
                                System.out.println("domiciliarios por persona dia");
                                System.out.println("");
                                break;
                            case 12:
                                System.out.println("QResiduos_Dom: ");
                                System.out.println("Cantidad de residuos de origen domiciliario");
                                System.out.println("que se generaron en el distrito, asociada a la");
                                System.out.println("poblacion urbana de la zona");
                                System.out.println("");
                                break;
                            case 13:
                                System.out.println("QResiduos_No_Dom: ");
                                System.out.println("Cantidad de residuos de origen no domiciliario");
                                System.out.println("que se generaron en el distrito, asociada a la");
                                System.out.println("poblacion urbana de la zona");
                                System.out.println("");
                                break;
                            case 14:
                                System.out.println("QResiduos_Mun: ");
                                System.out.println("Cantidad de residuos de origen municipal que");
                                System.out.println("se generaron en el distrito, asociada a la");
                                System.out.println("poblacion urbana de la zona");
                                System.out.println("");
                                break;
                            case 15:
                                System.out.println("Periodo: ");
                                System.out.println("Año en el que se generaron los residuos solidos");
                                System.out.println("");
                                break;
                            default:
                                break;
                        }
                        //</editor-fold>
                    }while(ndo[1] == 1);
                                break;
                            case 2:
                                do{
                        ndo[2] = 1;
                        System.out.println(menu[1]);
                        input = sc.nextInt();
                        System.out.println("");
                        //<editor-fold defaultstate="collapsed" desc="Switch | Seleccionar dato">
                        switch(input){
                            case 0:
                                ndo[2] = 0;
                                break;
                            case 1:
                                do{
                                    ndo[3] = 1;
                                    System.out.println(menu[2]);
                                    input = sc.nextInt();
                                    System.out.println("");
                                    switch(input){
                                        case 0:
                                            ndo[3] = 0;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                            System.out.println("");
                                            num = sc.nextDouble();
                                            System.out.println("");
                                            while(num <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                                System.out.println("");
                                                num = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            do{
                                                ndo[4] = 1;
                                                System.out.println(menu[3]);
                                                input = sc.nextInt();
                                                System.out.println("");
                                                //<editor-fold defaultstate="collapsed" desc="Switch | Mostrar datos segun numero">
                                                switch(input){
                                                    case 0 -> ndo[4] = 0;
                                                    case 1 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Fecha_Corte[k] < num){
                                                                System.out.print("Fecha_Corte N°"+(k+1)+": ");
                                                                System.out.println(Fecha_Corte[k]);
                                                            }
                                                        }
                                                    }
                                                    case 2 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Fecha_Corte[k] == num){
                                                                System.out.print("Fecha_Corte N°"+(k+1)+": ");
                                                                System.out.println(Fecha_Corte[k]);
                                                            }
                                                        }
                                                    }
                                                    case 3 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Fecha_Corte[k] > num){
                                                                System.out.print("Fecha_Corte N°"+(k+1)+": ");
                                                                System.out.println(Fecha_Corte[k]);
                                                            }
                                                        }
                                                    }
                                                }
                                                //</editor-fold>
                                                System.out.println("");
                                            }while (ndo[4] == 1);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el numero que sera el limite inferior:");
                                            System.out.println("");
                                            li = sc.nextDouble();
                                            System.out.println("");
                                            while(li <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite inferior:");
                                                System.out.println("");
                                                li = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Ingrese el numero que sera el limite superior:");
                                            System.out.println("");
                                            ls = sc.nextDouble();
                                            System.out.println("");
                                            while(ls <= li){
                                                System.out.println("ERROR");
                                                System.out.println("El limite superior no puede ser menor al limite inferior");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite superior:");
                                                System.out.println("");
                                                ls = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Datos que coinciden:");
                                            for (int k = 0; k < 40; k++) {
                                                if(Fecha_Corte[k] <= ls && Fecha_Corte[k] >= li){
                                                    System.out.print("Fecha_Corte N°"+(k+1)+": ");
                                                    System.out.println(Fecha_Corte[k]);
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 3:
                                            System.out.println("[  ] [Fecha_Corte]");
                                            for (int k = 0; k < 40; k++) {
                                                if (k <= 8) {
                                                    System.out.print("[ "+(k+1)+"] [");
                                                    System.out.println(Fecha_Corte[k]+"]");
                                                }else{
                                                    System.out.print("["+(k+1)+"] [");
                                                    System.out.println(Fecha_Corte[k]+"]");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(ndo[3] == 1);
                                break;
                            case 2:
                                do{
                                    ndo[3] = 1;
                                    System.out.println(menu[2]);
                                    input = sc.nextInt();
                                    System.out.println("");
                                    switch(input){
                                        case 0:
                                            ndo[3] = 0;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                            System.out.println("");
                                            num = sc.nextDouble();
                                            System.out.println("");
                                            while(num <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                                System.out.println("");
                                                num = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            do{
                                                ndo[4] = 1;
                                                System.out.println(menu[3]);
                                                input = sc.nextInt();
                                                System.out.println("");
                                                //<editor-fold defaultstate="collapsed" desc="Switch | Mostrar datos segun numero">
                                                switch(input){
                                                    case 0 -> ndo[4] = 0;
                                                    case 1 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(N_Sec[k] < num){
                                                                System.out.print("N_Sec N°"+(k+1)+": ");
                                                                System.out.println(N_Sec[k]);
                                                            }
                                                        }
                                                    }
                                                    case 2 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(N_Sec[k] == num){
                                                                System.out.print("N_Sec N°"+(k+1)+": ");
                                                                System.out.println(N_Sec[k]);
                                                            }
                                                        }
                                                    }
                                                    case 3 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(N_Sec[k] > num){
                                                                System.out.print("N_Sec N°"+(k+1)+": ");
                                                                System.out.println(N_Sec[k]);
                                                            }
                                                        }
                                                    }
                                                }
                                                //</editor-fold>
                                                System.out.println("");
                                            }while (ndo[4] == 1);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el numero que sera el limite inferior:");
                                            System.out.println("");
                                            li = sc.nextDouble();
                                            System.out.println("");
                                            while(li <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite inferior:");
                                                System.out.println("");
                                                li = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Ingrese el numero que sera el limite superior:");
                                            System.out.println("");
                                            ls = sc.nextDouble();
                                            System.out.println("");
                                            while(ls <= li){
                                                System.out.println("ERROR");
                                                System.out.println("El limite superior no puede ser menor al limite inferior");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite superior:");
                                                System.out.println("");
                                                ls = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Datos que coinciden:");
                                            for (int k = 0; k < 40; k++) {
                                                if(N_Sec[k] <= ls && N_Sec[k] >= li){
                                                    System.out.print("N_Sec N°"+(k+1)+": ");
                                                    System.out.println(N_Sec[k]);
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 3:
                                            System.out.println("[  ] [N_Sec]");
                                            for (int k = 0; k < 40; k++) {
                                                if (k <= 8) {
                                                    System.out.print("[ "+(k+1)+"] [");
                                                    System.out.println(N_Sec[k]+"]");
                                                }else{
                                                    System.out.print("["+(k+1)+"] [");
                                                    System.out.println(N_Sec[k]+"]");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(ndo[3] == 1);
                                break;
                            case 3:
                                do{
                                    ndo[3] = 1;
                                    System.out.println(menu[2]);
                                    input = sc.nextInt();
                                    System.out.println("");
                                    switch(input){
                                        case 0:
                                            ndo[3] = 0;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                            System.out.println("");
                                            num = sc.nextDouble();
                                            System.out.println("");
                                            while(num <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                                System.out.println("");
                                                num = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            do{
                                                ndo[4] = 1;
                                                System.out.println(menu[3]);
                                                input = sc.nextInt();
                                                System.out.println("");
                                                //<editor-fold defaultstate="collapsed" desc="Switch | Mostrar datos segun numero">
                                                switch(input){
                                                    case 0 -> ndo[4] = 0;
                                                    case 1 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Ubigeo[k] < num){
                                                                System.out.print("Ubigeo N°"+(k+1)+": ");
                                                                System.out.println(Ubigeo[k]);
                                                            }
                                                        }
                                                    }
                                                    case 2 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Ubigeo[k] == num){
                                                                System.out.print("Ubigeo N°"+(k+1)+": ");
                                                                System.out.println(Ubigeo[k]);
                                                            }
                                                        }
                                                    }
                                                    case 3 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Ubigeo[k] > num){
                                                                System.out.print("Ubigeo N°"+(k+1)+": ");
                                                                System.out.println(Ubigeo[k]);
                                                            }
                                                        }
                                                    }
                                                }
                                                //</editor-fold>
                                                System.out.println("");
                                            }while (ndo[4] == 1);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el numero que sera el limite inferior:");
                                            System.out.println("");
                                            li = sc.nextDouble();
                                            System.out.println("");
                                            while(li <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite inferior:");
                                                System.out.println("");
                                                li = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Ingrese el numero que sera el limite superior:");
                                            System.out.println("");
                                            ls = sc.nextDouble();
                                            System.out.println("");
                                            while(ls <= li){
                                                System.out.println("ERROR");
                                                System.out.println("El limite superior no puede ser menor al limite inferior");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite superior:");
                                                System.out.println("");
                                                ls = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Datos que coinciden:");
                                            for (int k = 0; k < 40; k++) {
                                                if(Ubigeo[k] <= ls && Ubigeo[k] >= li){
                                                    System.out.print("Ubigeo N°"+(k+1)+": ");
                                                    System.out.println(Ubigeo[k]);
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 3:
                                            System.out.println("[  ] [Ubigeo]");
                                            for (int k = 0; k < 40; k++) {
                                                if (k <= 8) {
                                                    System.out.print("[ "+(k+1)+"] [");
                                                    System.out.println(Ubigeo[k]+"]");
                                                }else{
                                                    System.out.print("["+(k+1)+"] [");
                                                    System.out.println(Ubigeo[k]+"]");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(ndo[3] == 1);
                                break;
                            case 4:
                                do{
                                    ndo[3] = 1;
                                    System.out.println(menu[4]);
                                    input = sc.nextInt();
                                    System.out.println("");
                                    switch(input){
                                        case 0:
                                            ndo[3] = 0;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese la region natural segun la que se va a filtrar:");
                                            System.out.println("");
                                            txt = sc.nextLine();
                                            txt = sc.nextLine();
                                            System.out.println("");
                                            txt = txt.toLowerCase();
                                            System.out.println("Las regiones naturales que coinciden son: ");
                                            for (int k = 0; k < 40; k++) {
                                                Reg_Nat[k] = Reg_Nat[k].toLowerCase();
                                                Reg_Nat[k] = Reg_Nat[k].toLowerCase();
                                                if (Reg_Nat[k].equals(txt)) {
                                                    System.out.print("Reg_Nat N°"+(k+1)+": ");
                                                    System.out.println(Reg_Nat[k]);
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("[  ] [Reg_Nat]");
                                            for (int k = 0; k < 40; k++) {
                                                if (k <= 8) {
                                                    System.out.print("[ "+(k+1)+"] [");
                                                    System.out.println(Reg_Nat[k]+"]");
                                                }else{
                                                    System.out.print("["+(k+1)+"] [");
                                                    System.out.println(Reg_Nat[k]+"]");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(ndo[3] == 1);
                                break;
                            case 5:
                                do{
                                    ndo[3] = 1;
                                    System.out.println(menu[4]);
                                    input = sc.nextInt();
                                    System.out.println("");
                                    switch(input){
                                        case 0:
                                            ndo[3] = 0;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese la region natural segun la que se va a filtrar:");
                                            System.out.println("");
                                            txt = sc.nextLine();
                                            txt = sc.nextLine();
                                            System.out.println("");
                                            txt = txt.toLowerCase();
                                            System.out.println("Los departamentos que coinciden son: ");
                                            for (int k = 0; k < 40; k++) {
                                                Departamento[k] = Departamento[k].toLowerCase();
                                                Departamento[k] = Departamento[k].toLowerCase();
                                                if (Departamento[k].equals(txt)) {
                                                    System.out.print("Departamento N°"+(k+1)+": ");
                                                    System.out.println(Departamento[k]);
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("[  ] [Departamento]");
                                            for (int k = 0; k < 40; k++) {
                                                if (k <= 8) {
                                                    System.out.print("[ "+(k+1)+"] [");
                                                    System.out.println(Departamento[k]+"]");
                                                }else{
                                                    System.out.print("["+(k+1)+"] [");
                                                    System.out.println(Departamento[k]+"]");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(ndo[3] == 1);
                                break;
                            case 6:
                                do{
                                    ndo[3] = 1;
                                    System.out.println(menu[4]);
                                    input = sc.nextInt();
                                    System.out.println("");
                                    switch(input){
                                        case 0:
                                            ndo[3] = 0;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese la region natural segun la que se va a filtrar:");
                                            System.out.println("");
                                            txt = sc.nextLine();
                                            txt = sc.nextLine();
                                            System.out.println("");
                                            txt = txt.toLowerCase();
                                            System.out.println("Las Provincias que coinciden son: ");
                                            for (int k = 0; k < 40; k++) {
                                                Provincia[k] = Provincia[k].toLowerCase();
                                                Provincia[k] = Provincia[k].toLowerCase();
                                                if (Provincia[k].equals(txt)) {
                                                    System.out.print("Provincia N°"+(k+1)+": ");
                                                    System.out.println(Provincia[k]);
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("[  ] [Provincia]");
                                            for (int k = 0; k < 40; k++) {
                                                if (k <= 8) {
                                                    System.out.print("[ "+(k+1)+"] [");
                                                    System.out.println(Provincia[k]+"]");
                                                }else{
                                                    System.out.print("["+(k+1)+"] [");
                                                    System.out.println(Provincia[k]+"]");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(ndo[3] == 1);
                                break;
                            case 7:
                                do{
                                    ndo[3] = 1;
                                    System.out.println(menu[4]);
                                    input = sc.nextInt();
                                    System.out.println("");
                                    switch(input){
                                        case 0:
                                            ndo[3] = 0;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese la region natural segun la que se va a filtrar:");
                                            System.out.println("");
                                            txt = sc.nextLine();
                                            txt = sc.nextLine();
                                            System.out.println("");
                                            txt = txt.toLowerCase();
                                            System.out.println("Las Distritos que coinciden son: ");
                                            for (int k = 0; k < 40; k++) {
                                                Distrito[k] = Distrito[k].toLowerCase();
                                                Distrito[k] = Distrito[k].toLowerCase();
                                                if (Distrito[k].equals(txt)) {
                                                    System.out.print("Distrito N°"+(k+1)+": ");
                                                    System.out.println(Distrito[k]);
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("[  ] [Distrito]");
                                            for (int k = 0; k < 40; k++) {
                                                if (k <= 8) {
                                                    System.out.print("[ "+(k+1)+"] [");
                                                    System.out.println(Distrito[k]+"]");
                                                }else{
                                                    System.out.print("["+(k+1)+"] [");
                                                    System.out.println(Distrito[k]+"]");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(ndo[3] == 1);
                                break;
                            case 8:
                                do{
                                    ndo[3] = 1;
                                    System.out.println(menu[2]);
                                    input = sc.nextInt();
                                    System.out.println("");
                                    switch(input){
                                        case 0:
                                            ndo[3] = 0;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                            System.out.println("");
                                            num = sc.nextDouble();
                                            System.out.println("");
                                            while(num <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                                System.out.println("");
                                                num = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            do{
                                                ndo[4] = 1;
                                                System.out.println(menu[3]);
                                                input = sc.nextInt();
                                                System.out.println("");
                                                //<editor-fold defaultstate="collapsed" desc="Switch | Mostrar datos segun numero">
                                                switch(input){
                                                    case 0 -> ndo[4] = 0;
                                                    case 1 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Pob_Total[k] < num){
                                                                System.out.print("Pob_Total N°"+(k+1)+": ");
                                                                System.out.println(Pob_Total[k]);
                                                            }
                                                        }
                                                    }
                                                    case 2 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Pob_Total[k] == num){
                                                                System.out.print("Pob_Total N°"+(k+1)+": ");
                                                                System.out.println(Pob_Total[k]);
                                                            }
                                                        }
                                                    }
                                                    case 3 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Pob_Total[k] > num){
                                                                System.out.print("Pob_Total N°"+(k+1)+": ");
                                                                System.out.println(Pob_Total[k]);
                                                            }
                                                        }
                                                    }
                                                }
                                                //</editor-fold>
                                                System.out.println("");
                                            }while (ndo[4] == 1);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el numero que sera el limite inferior:");
                                            System.out.println("");
                                            li = sc.nextDouble();
                                            System.out.println("");
                                            while(li <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite inferior:");
                                                System.out.println("");
                                                li = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Ingrese el numero que sera el limite superior:");
                                            System.out.println("");
                                            ls = sc.nextDouble();
                                            System.out.println("");
                                            while(ls <= li){
                                                System.out.println("ERROR");
                                                System.out.println("El limite superior no puede ser menor al limite inferior");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite superior:");
                                                System.out.println("");
                                                ls = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Datos que coinciden:");
                                            for (int k = 0; k < 40; k++) {
                                                if(Pob_Total[k] <= ls && Pob_Total[k] >= li){
                                                    System.out.print("Pob_Total N°"+(k+1)+": ");
                                                    System.out.println(Pob_Total[k]);
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 3:
                                            System.out.println("[  ] [Pob_Total]");
                                            for (int k = 0; k < 40; k++) {
                                                if (k <= 8) {
                                                    System.out.print("[ "+(k+1)+"] [");
                                                    System.out.println(Pob_Total[k]+"]");
                                                }else{
                                                    System.out.print("["+(k+1)+"] [");
                                                    System.out.println(Pob_Total[k]+"]");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(ndo[3] == 1);
                                break;
                            case 9:
                                do{
                                    ndo[3] = 1;
                                    System.out.println(menu[2]);
                                    input = sc.nextInt();
                                    System.out.println("");
                                    switch(input){
                                        case 0:
                                            ndo[3] = 0;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                            System.out.println("");
                                            num = sc.nextDouble();
                                            System.out.println("");
                                            while(num <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                                System.out.println("");
                                                num = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            do{
                                                ndo[4] = 1;
                                                System.out.println(menu[3]);
                                                input = sc.nextInt();
                                                System.out.println("");
                                                //<editor-fold defaultstate="collapsed" desc="Switch | Mostrar datos segun numero">
                                                switch(input){
                                                    case 0 -> ndo[4] = 0;
                                                    case 1 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Pob_Urbana[k] < num){
                                                                System.out.print("Pob_Urbana N°"+(k+1)+": ");
                                                                System.out.println(Pob_Urbana[k]);
                                                            }
                                                        }
                                                    }
                                                    case 2 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Pob_Urbana[k] == num){
                                                                System.out.print("Pob_Urbana N°"+(k+1)+": ");
                                                                System.out.println(Pob_Urbana[k]);
                                                            }
                                                        }
                                                    }
                                                    case 3 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Pob_Urbana[k] > num){
                                                                System.out.print("Pob_Urbana N°"+(k+1)+": ");
                                                                System.out.println(Pob_Urbana[k]);
                                                            }
                                                        }
                                                    }
                                                }
                                                //</editor-fold>
                                                System.out.println("");
                                            }while (ndo[4] == 1);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el numero que sera el limite inferior:");
                                            System.out.println("");
                                            li = sc.nextDouble();
                                            System.out.println("");
                                            while(li <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite inferior:");
                                                System.out.println("");
                                                li = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Ingrese el numero que sera el limite superior:");
                                            System.out.println("");
                                            ls = sc.nextDouble();
                                            System.out.println("");
                                            while(ls <= li){
                                                System.out.println("ERROR");
                                                System.out.println("El limite superior no puede ser menor al limite inferior");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite superior:");
                                                System.out.println("");
                                                ls = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Datos que coinciden:");
                                            for (int k = 0; k < 40; k++) {
                                                if(Pob_Urbana[k] <= ls && Pob_Urbana[k] >= li){
                                                    System.out.print("Pob_Urbana N°"+(k+1)+": ");
                                                    System.out.println(Pob_Urbana[k]);
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 3:
                                            System.out.println("[  ] [Pob_Urbana]");
                                            for (int k = 0; k < 40; k++) {
                                                if (k <= 8) {
                                                    System.out.print("[ "+(k+1)+"] [");
                                                    System.out.println(Pob_Urbana[k]+"]");
                                                }else{
                                                    System.out.print("["+(k+1)+"] [");
                                                    System.out.println(Pob_Urbana[k]+"]");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(ndo[3] == 1);
                                break;
                            case 10:
                                do{
                                    ndo[3] = 1;
                                    System.out.println(menu[2]);
                                    input = sc.nextInt();
                                    System.out.println("");
                                    switch(input){
                                        case 0:
                                            ndo[3] = 0;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                            System.out.println("");
                                            num = sc.nextDouble();
                                            System.out.println("");
                                            while(num <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                                System.out.println("");
                                                num = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            do{
                                                ndo[4] = 1;
                                                System.out.println(menu[3]);
                                                input = sc.nextInt();
                                                System.out.println("");
                                                //<editor-fold defaultstate="collapsed" desc="Switch | Mostrar datos segun numero">
                                                switch(input){
                                                    case 0 -> ndo[4] = 0;
                                                    case 1 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Pob_Rural[k] < num){
                                                                System.out.print("Pob_Rural N°"+(k+1)+": ");
                                                                System.out.println(Pob_Rural[k]);
                                                            }
                                                        }
                                                    }
                                                    case 2 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Pob_Rural[k] == num){
                                                                System.out.print("Pob_Rural N°"+(k+1)+": ");
                                                                System.out.println(Pob_Rural[k]);
                                                            }
                                                        }
                                                    }
                                                    case 3 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Pob_Rural[k] > num){
                                                                System.out.print("Pob_Rural N°"+(k+1)+": ");
                                                                System.out.println(Pob_Rural[k]);
                                                            }
                                                        }
                                                    }
                                                }
                                                //</editor-fold>
                                                System.out.println("");
                                            }while (ndo[4] == 1);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el numero que sera el limite inferior:");
                                            System.out.println("");
                                            li = sc.nextDouble();
                                            System.out.println("");
                                            while(li <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite inferior:");
                                                System.out.println("");
                                                li = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Ingrese el numero que sera el limite superior:");
                                            System.out.println("");
                                            ls = sc.nextDouble();
                                            System.out.println("");
                                            while(ls <= li){
                                                System.out.println("ERROR");
                                                System.out.println("El limite superior no puede ser menor al limite inferior");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite superior:");
                                                System.out.println("");
                                                ls = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Datos que coinciden:");
                                            for (int k = 0; k < 40; k++) {
                                                if(Pob_Rural[k] <= ls && Pob_Rural[k] >= li){
                                                    System.out.print("Pob_Rural N°"+(k+1)+": ");
                                                    System.out.println(Pob_Rural[k]);
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 3:
                                            System.out.println("[  ] [Pob_Rural]");
                                            for (int k = 0; k < 40; k++) {
                                                if (k <= 8) {
                                                    System.out.print("[ "+(k+1)+"] [");
                                                    System.out.println(Pob_Rural[k]+"]");
                                                }else{
                                                    System.out.print("["+(k+1)+"] [");
                                                    System.out.println(Pob_Rural[k]+"]");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(ndo[3] == 1);
                                break;
                            case 11:
                                do{
                                    ndo[3] = 1;
                                    System.out.println(menu[2]);
                                    input = sc.nextInt();
                                    System.out.println("");
                                    switch(input){
                                        case 0:
                                            ndo[3] = 0;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                            System.out.println("");
                                            num = sc.nextDouble();
                                            System.out.println("");
                                            while(num <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                                System.out.println("");
                                                num = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            do{
                                                ndo[4] = 1;
                                                System.out.println(menu[3]);
                                                input = sc.nextInt();
                                                System.out.println("");
                                                //<editor-fold defaultstate="collapsed" desc="Switch | Mostrar datos segun numero">
                                                switch(input){
                                                    case 0 -> ndo[4] = 0;
                                                    case 1 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Gpc_Dom[k] < num){
                                                                System.out.print("Gpc_Dom N°"+(k+1)+": ");
                                                                System.out.println(Gpc_Dom[k]);
                                                            }
                                                        }
                                                    }
                                                    case 2 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Gpc_Dom[k] == num){
                                                                System.out.print("Gpc_Dom N°"+(k+1)+": ");
                                                                System.out.println(Gpc_Dom[k]);
                                                            }
                                                        }
                                                    }
                                                    case 3 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Gpc_Dom[k] > num){
                                                                System.out.print("Gpc_Dom N°"+(k+1)+": ");
                                                                System.out.println(Gpc_Dom[k]);
                                                            }
                                                        }
                                                    }
                                                }
                                                //</editor-fold>
                                                System.out.println("");
                                            }while (ndo[4] == 1);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el numero que sera el limite inferior:");
                                            System.out.println("");
                                            li = sc.nextDouble();
                                            System.out.println("");
                                            while(li <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite inferior:");
                                                System.out.println("");
                                                li = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Ingrese el numero que sera el limite superior:");
                                            System.out.println("");
                                            ls = sc.nextDouble();
                                            System.out.println("");
                                            while(ls <= li){
                                                System.out.println("ERROR");
                                                System.out.println("El limite superior no puede ser menor al limite inferior");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite superior:");
                                                System.out.println("");
                                                ls = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Datos que coinciden:");
                                            for (int k = 0; k < 40; k++) {
                                                if(Gpc_Dom[k] <= ls && Gpc_Dom[k] >= li){
                                                    System.out.print("Gpc_Dom N°"+(k+1)+": ");
                                                    System.out.println(Gpc_Dom[k]);
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 3:
                                            System.out.println("[  ] [Gpc_Dom]");
                                            for (int k = 0; k < 40; k++) {
                                                if (k <= 8) {
                                                    System.out.print("[ "+(k+1)+"] [");
                                                    System.out.println(Gpc_Dom[k]+"]");
                                                }else{
                                                    System.out.print("["+(k+1)+"] [");
                                                    System.out.println(Gpc_Dom[k]+"]");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(ndo[3] == 1);
                                break;
                            case 12:
                                do{
                                    ndo[3] = 1;
                                    System.out.println(menu[2]);
                                    input = sc.nextInt();
                                    System.out.println("");
                                    switch(input){
                                        case 0:
                                            ndo[3] = 0;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                            System.out.println("");
                                            num = sc.nextDouble();
                                            System.out.println("");
                                            while(num <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                                System.out.println("");
                                                num = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            do{
                                                ndo[4] = 1;
                                                System.out.println(menu[3]);
                                                input = sc.nextInt();
                                                System.out.println("");
                                                //<editor-fold defaultstate="collapsed" desc="Switch | Mostrar datos segun numero">
                                                switch(input){
                                                    case 0 -> ndo[4] = 0;
                                                    case 1 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(QResiduos_Dom[k] < num){
                                                                System.out.print("QResiduos_Dom N°"+(k+1)+": ");
                                                                System.out.println(QResiduos_Dom[k]);
                                                            }
                                                        }
                                                    }
                                                    case 2 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(QResiduos_Dom[k] == num){
                                                                System.out.print("QResiduos_Dom N°"+(k+1)+": ");
                                                                System.out.println(QResiduos_Dom[k]);
                                                            }
                                                        }
                                                    }
                                                    case 3 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(QResiduos_Dom[k] > num){
                                                                System.out.print("QResiduos_Dom N°"+(k+1)+": ");
                                                                System.out.println(QResiduos_Dom[k]);
                                                            }
                                                        }
                                                    }
                                                }
                                                //</editor-fold>
                                                System.out.println("");
                                            }while (ndo[4] == 1);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el numero que sera el limite inferior:");
                                            System.out.println("");
                                            li = sc.nextDouble();
                                            System.out.println("");
                                            while(li <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite inferior:");
                                                System.out.println("");
                                                li = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Ingrese el numero que sera el limite superior:");
                                            System.out.println("");
                                            ls = sc.nextDouble();
                                            System.out.println("");
                                            while(ls <= li){
                                                System.out.println("ERROR");
                                                System.out.println("El limite superior no puede ser menor al limite inferior");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite superior:");
                                                System.out.println("");
                                                ls = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Datos que coinciden:");
                                            for (int k = 0; k < 40; k++) {
                                                if(QResiduos_Dom[k] <= ls && QResiduos_Dom[k] >= li){
                                                    System.out.print("QResiduos_Dom N°"+(k+1)+": ");
                                                    System.out.println(QResiduos_Dom[k]);
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 3:
                                            System.out.println("[  ] [QResiduos_Dom]");
                                            for (int k = 0; k < 40; k++) {
                                                if (k <= 8) {
                                                    System.out.print("[ "+(k+1)+"] [");
                                                    System.out.println(QResiduos_Dom[k]+"]");
                                                }else{
                                                    System.out.print("["+(k+1)+"] [");
                                                    System.out.println(QResiduos_Dom[k]+"]");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(ndo[3] == 1);
                                break;
                            case 13:
                                do{
                                    ndo[3] = 1;
                                    System.out.println(menu[2]);
                                    input = sc.nextInt();
                                    System.out.println("");
                                    switch(input){
                                        case 0:
                                            ndo[3] = 0;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                            System.out.println("");
                                            num = sc.nextDouble();
                                            System.out.println("");
                                            while(num <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                                System.out.println("");
                                                num = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            do{
                                                ndo[4] = 1;
                                                System.out.println(menu[3]);
                                                input = sc.nextInt();
                                                System.out.println("");
                                                //<editor-fold defaultstate="collapsed" desc="Switch | Mostrar datos segun numero">
                                                switch(input){
                                                    case 0 -> ndo[4] = 0;
                                                    case 1 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(QResiduos_No_Dom[k] < num){
                                                                System.out.print("QResiduos_No_Dom N°"+(k+1)+": ");
                                                                System.out.println(QResiduos_No_Dom[k]);
                                                            }
                                                        }
                                                    }
                                                    case 2 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(QResiduos_No_Dom[k] == num){
                                                                System.out.print("QResiduos_No_Dom N°"+(k+1)+": ");
                                                                System.out.println(QResiduos_No_Dom[k]);
                                                            }
                                                        }
                                                    }
                                                    case 3 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(QResiduos_No_Dom[k] > num){
                                                                System.out.print("QResiduos_No_Dom N°"+(k+1)+": ");
                                                                System.out.println(QResiduos_No_Dom[k]);
                                                            }
                                                        }
                                                    }
                                                }
                                                //</editor-fold>
                                                System.out.println("");
                                            }while (ndo[4] == 1);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el numero que sera el limite inferior:");
                                            System.out.println("");
                                            li = sc.nextDouble();
                                            System.out.println("");
                                            while(li <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite inferior:");
                                                System.out.println("");
                                                li = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Ingrese el numero que sera el limite superior:");
                                            System.out.println("");
                                            ls = sc.nextDouble();
                                            System.out.println("");
                                            while(ls <= li){
                                                System.out.println("ERROR");
                                                System.out.println("El limite superior no puede ser menor al limite inferior");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite superior:");
                                                System.out.println("");
                                                ls = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Datos que coinciden:");
                                            for (int k = 0; k < 40; k++) {
                                                if(QResiduos_No_Dom[k] <= ls && QResiduos_No_Dom[k] >= li){
                                                    System.out.print("QResiduos_No_Dom N°"+(k+1)+": ");
                                                    System.out.println(QResiduos_No_Dom[k]);
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 3:
                                            System.out.println("[  ] [QResiduos_No_Dom]");
                                            for (int k = 0; k < 40; k++) {
                                                if (k <= 8) {
                                                    System.out.print("[ "+(k+1)+"] [");
                                                    System.out.println(QResiduos_No_Dom[k]+"]");
                                                }else{
                                                    System.out.print("["+(k+1)+"] [");
                                                    System.out.println(QResiduos_No_Dom[k]+"]");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(ndo[3] == 1);
                                break;
                            case 14:
                                do{
                                    ndo[3] = 1;
                                    System.out.println(menu[2]);
                                    input = sc.nextInt();
                                    System.out.println("");
                                    switch(input){
                                        case 0:
                                            ndo[3] = 0;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                            System.out.println("");
                                            num = sc.nextDouble();
                                            System.out.println("");
                                            while(num <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                                System.out.println("");
                                                num = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            do{
                                                ndo[4] = 1;
                                                System.out.println(menu[3]);
                                                input = sc.nextInt();
                                                System.out.println("");
                                                //<editor-fold defaultstate="collapsed" desc="Switch | Mostrar datos segun numero">
                                                switch(input){
                                                    case 0 -> ndo[4] = 0;
                                                    case 1 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(QResiduos_Mun[k] < num){
                                                                System.out.print("QResiduos_Mun N°"+(k+1)+": ");
                                                                System.out.println(QResiduos_Mun[k]);
                                                            }
                                                        }
                                                    }
                                                    case 2 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(QResiduos_Mun[k] == num){
                                                                System.out.print("QResiduos_Mun N°"+(k+1)+": ");
                                                                System.out.println(QResiduos_Mun[k]);
                                                            }
                                                        }
                                                    }
                                                    case 3 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(QResiduos_Mun[k] > num){
                                                                System.out.print("QResiduos_Mun N°"+(k+1)+": ");
                                                                System.out.println(QResiduos_Mun[k]);
                                                            }
                                                        }
                                                    }
                                                }
                                                //</editor-fold>
                                                System.out.println("");
                                            }while (ndo[4] == 1);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el numero que sera el limite inferior:");
                                            System.out.println("");
                                            li = sc.nextDouble();
                                            System.out.println("");
                                            while(li <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite inferior:");
                                                System.out.println("");
                                                li = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Ingrese el numero que sera el limite superior:");
                                            System.out.println("");
                                            ls = sc.nextDouble();
                                            System.out.println("");
                                            while(ls <= li){
                                                System.out.println("ERROR");
                                                System.out.println("El limite superior no puede ser menor al limite inferior");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite superior:");
                                                System.out.println("");
                                                ls = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Datos que coinciden:");
                                            for (int k = 0; k < 40; k++) {
                                                if(QResiduos_Mun[k] <= ls && QResiduos_Mun[k] >= li){
                                                    System.out.print("QResiduos_Mun N°"+(k+1)+": ");
                                                    System.out.println(QResiduos_Mun[k]);
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 3:
                                            System.out.println("[  ] [QResiduos_Mun]");
                                            for (int k = 0; k < 40; k++) {
                                                if (k <= 8) {
                                                    System.out.print("[ "+(k+1)+"] [");
                                                    System.out.println(QResiduos_Mun[k]+"]");
                                                }else{
                                                    System.out.print("["+(k+1)+"] [");
                                                    System.out.println(QResiduos_Mun[k]+"]");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(ndo[3] == 1);
                                break;
                            case 15:
                                do{
                                    ndo[3] = 1;
                                    System.out.println(menu[2]);
                                    input = sc.nextInt();
                                    System.out.println("");
                                    switch(input){
                                        case 0:
                                            ndo[3] = 0;
                                            break;
                                        case 1:
                                            System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                            System.out.println("");
                                            num = sc.nextDouble();
                                            System.out.println("");
                                            while(num <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero segun el que se va a filtrar:");
                                                System.out.println("");
                                                num = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            do{
                                                ndo[4] = 1;
                                                System.out.println(menu[3]);
                                                input = sc.nextInt();
                                                System.out.println("");
                                                //<editor-fold defaultstate="collapsed" desc="Switch | Mostrar datos segun numero">
                                                switch(input){
                                                    case 0 -> ndo[4] = 0;
                                                    case 1 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Periodo[k] < num){
                                                                System.out.print("Periodo N°"+(k+1)+": ");
                                                                System.out.println(Periodo[k]);
                                                            }
                                                        }
                                                    }
                                                    case 2 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Periodo[k] == num){
                                                                System.out.print("Periodo N°"+(k+1)+": ");
                                                                System.out.println(Periodo[k]);
                                                            }
                                                        }
                                                    }
                                                    case 3 -> {
                                                        System.out.println("Datos que coinciden:");
                                                        for (int k = 0; k < 40; k++) {
                                                            if(Periodo[k] > num){
                                                                System.out.print("Periodo N°"+(k+1)+": ");
                                                                System.out.println(Periodo[k]);
                                                            }
                                                        }
                                                    }
                                                }
                                                //</editor-fold>
                                                System.out.println("");
                                            }while (ndo[4] == 1);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el numero que sera el limite inferior:");
                                            System.out.println("");
                                            li = sc.nextDouble();
                                            System.out.println("");
                                            while(li <= -1){
                                                System.out.println("ERROR");
                                                System.out.println("No ingresar numeros negativos");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite inferior:");
                                                System.out.println("");
                                                li = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Ingrese el numero que sera el limite superior:");
                                            System.out.println("");
                                            ls = sc.nextDouble();
                                            System.out.println("");
                                            while(ls <= li){
                                                System.out.println("ERROR");
                                                System.out.println("El limite superior no puede ser menor al limite inferior");
                                                System.out.println("");
                                                System.out.println("Ingrese el numero que sera el limite superior:");
                                                System.out.println("");
                                                ls = sc.nextDouble();
                                                System.out.println("");
                                            }
                                            System.out.println("Datos que coinciden:");
                                            for (int k = 0; k < 40; k++) {
                                                if(Periodo[k] <= ls && Periodo[k] >= li){
                                                    System.out.print("Periodo N°"+(k+1)+": ");
                                                    System.out.println(Periodo[k]);
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        case 3:
                                            System.out.println("[  ] [Periodo]");
                                            for (int k = 0; k < 40; k++) {
                                                if (k <= 8) {
                                                    System.out.print("[ "+(k+1)+"] [");
                                                    System.out.println(Periodo[k]+"]");
                                                }else{
                                                    System.out.print("["+(k+1)+"] [");
                                                    System.out.println(Periodo[k]+"]");
                                                }
                                            }
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(ndo[3] == 1);
                                break;
                            default:
                                break;
                        }
                        //</editor-fold>
                    }while(ndo[2] == 1);
                                break;
                            case 3:
                                System.out.println(menu[5]);
                                break;
                            default:
                                break;
                        }
                    }while(ndo[0] == 1);
                }else{
                    System.out.println("ERROR");
                    System.out.println("Contraseña incorrecta");
                    System.out.println("");
                }
            }else{
                System.out.println("ERROR");
                System.out.println("Usuario incorrecto");
                System.out.println("");
            }
            ya = ya - 1;
        }while(ya > 0);
        
        if (ya == 0){
            System.out.println("Usted se quedo sin intentos");
        }
        
    }
}