package samplePrograms;

import javax.sound.midi.Soundbank;

public class starPattern {

    public static void starFormation() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void inverseStarPattern() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void combinedPattern() {
        starFormation();
        inverseStarPattern();
    }

    public static void reverseLshapePattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void pyramidPattern(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        inverseStarPattern();
        starFormation();
        combinedPattern();
        reverseLshapePattern();
        pyramidPattern();

    }
}
