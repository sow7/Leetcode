/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pock;

/**
 *
 * @author SONGSONG
 */
public class SortColor {

    static class Color {

        int color;

        public Color(int color) {
            this.color = color;
        }
    }

    public static void sortColors(Color A[]) {
        int second = A.length - 1, zero = 0;
        for (int i = 0; i <= second; i++) {
            while (A[i].color == 2 && i < second) {
                int tmp = A[i].color;
                A[i].color = A[second].color;
                A[second--].color = tmp;
            }
            while (A[i].color == 0 && i > zero) {
                int tmp = A[i].color;
                A[i].color = A[zero].color;
                A[zero++].color = tmp;
            }
        }
    }

    public static void sortColors1(int A[]) {
        int second = A.length - 1, zero = 0;
        for (int i = 0; i <= second; i++) {
            while (A[i] == 2 && i < second) {
                int tmp = A[i];
                A[i] = A[second];
                A[second--] = tmp;
            }

            while (A[i] == 0 && i > zero) {
                int tmp = A[i];
                A[i] = A[zero];
                A[zero++] = tmp;
            }
        }
    }

    public static void main(String[] a) {
        int[] input1 = {0,1,2,0,1};
        Color[] input = new Color[5];
        input[0] = new Color(0);
        input[1] = new Color(1);
        input[2] = new Color(2);
        input[3] = new Color(0);
        input[4] = new Color(1);
        sortColors(input);
        sortColors1(input1);
        for (int i = 0; i < 5; i++) {
            System.out.print(input[i].color);
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print(input1[i]);
        }
        
    }
}
