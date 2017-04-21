/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsi;

/**
 *
 * @author Amalia
 */
public class CobaInvers {
    public static void main(String[] args) {
        double[][] invers = new double[6][6];
        System.out.println("Identitas");
        for (int k = 0; k < 6; k++) {
            for (int l = 0; l < 6; l++) {
                if (k == l) {
                    invers[k][l] = 1;
                } else {
                    invers[k][l] = 0;
                }
                System.out.print("  "+invers[k][l]);
            }
            System.out.println("");
        }
        System.out.println("");
        
        double[][] matriks={{5.415591209,5.451853002},
            {5.451853002,5.494671382}};
        double[][] matriks6={{0.013763,0.013465,0.012966,0.015403,0.012965,0.01323},
            {0.013212,0.013696,0.013681,0.012086,0.012151,0.01323},
            {0.013672,0.012038,0.0127,0.012275,0.013851,0.01323},
            {0.014084,0.012397,0.012686,0.011747,0.012322,0.01323},
            {0.014067,0.013785,0.012346,0.012177,0.013474,0.01323},
            {0.013005,0.013084,0.012841,0.012797,0.01353,0.01323}};
        System.out.println("Matriks yang akan di invers");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("  " + matriks6[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
        
        for (int k = 0; k < 6; k++) {
            double t = matriks6[k][k];
            for (int n = 0; n < 6; n++) {
                invers[k][n] = invers[k][n] / t;
                matriks6[k][n] = matriks6[k][n] / t;
            }
            for (int l = 0; l < 6; l++) {
                double c = matriks6[l][k];
                for (int m = 0; m < 6; m++) {
                    if (k != l) {
                        invers[l][m] = invers[l][m] - c * invers[k][m];
                        matriks6[l][m] = matriks6[l][m] - c * matriks6[k][m];
                    }
                }
            }
        }
        System.out.println("Hasil invers");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("  " + invers[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Matriks awal jadi matriks identitas");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("  " + matriks6[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
    }
}
