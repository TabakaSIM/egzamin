package arkadiusz.dabal.egzamin;

import java.util.Scanner;

public class TreeGUI {

    private static final TreeGUI instance = new TreeGUI();

    private TreeGUI() {
    }

    public int podajInt() {
        System.out.println("Podaj wartosc:");
        while(true){
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextInt()){
                return scan.nextInt();
            }else {
                System.out.println("Blad, podaj wartosc:");
            }
        }
    }

    public void valueError() {
        System.out.println("Podana wartosc juz znajduje sie w drzewie");
    }

    public void switchError() {
        System.out.println("Nie ma takiej komendy!");
    }

    public void tak(int value) {
        System.out.println("Wartosc: " + value + " istnieje!");
    }

    public void nie(int value) {
        System.out.println("Wartosc: " + value + " nie istnieje!");
    }

    public void min(int min) {
        System.out.println("Najmniejsza wartosc to: " + min);
    }

    public void max(int max) {
        System.out.println("Najwieksza wartosc to: " + max);
    }

    public static TreeGUI getInstance(){
        return instance;
    }
}
