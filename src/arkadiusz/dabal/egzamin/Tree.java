package arkadiusz.dabal.egzamin;

import java.util.Random;
import java.util.Scanner;

/*
Stwórz drzewo binarne liczb w którym liczby większe są po prawej stronie, a mniejsze po lewej.
Należy stworzyć klasę Tree która posiada referencję do węzła będącego korzeniem.
Do reprezentacji węzła stwórz klasę Node. Klasa Tree powinna mieć metody

add(int value), która dodaje element do drzewa,

contains(int value), która sprawdza czy w drzewie znajduje się dana wartość,

max(), która zwraca największą liczbę w drzewie oraz

min(), która zwraca najmniejszą liczbę w drzewie.

Klasa Node może zawierać dowolne metody potrzebne do rozwiązania, można tworzyć dowolną ilość innych klas w ramach potrzeb.
*/
public class Tree {

    private TreeGUI gui = TreeGUI.getInstance();
    private Random rng = new Random();
    private Node firstNode = new Node(gui.podajInt());

    public static void main(String[] args) {
        new Tree();
    }

    private Tree() {
        System.out.println("Podaj wartosc pierwszego node'a");

        while(true){
            System.out.println("0. Dodaj, ale nie chce mi sie wpisywac. Wymysl cos programie!");
            System.out.println("1. Dodaj wartosc");
            System.out.println("2. Sprawdz czy istnieje wartosc");
            System.out.println("3. Wypisz max");
            System.out.println("4. Wypisz min");
            System.out.println("5. Exit");
            switch (new Scanner(System.in).nextLine()){
                case "0":
                    this.add(rng.nextInt(-20,50));
                    continue;
                case "1":
                    this.add(gui.podajInt());
                    continue;
                case "2":
                    this.contains(gui.podajInt());
                    continue;
                case "3":
                    this.max();
                    continue;
                case "4":
                    this.min();
                    continue;
                case "5":
                    System.out.println("Goodbye!");
                    return;
                default:
                    gui.switchError();
            }
        }
    }

    private void add(int value){
        firstNode.add(value);
    }

    private void contains(int value){
        if(firstNode.check(value)){
            gui.tak(value);
        }
        else{
            gui.nie(value);
        }
    }

    private void max(){
        gui.max(firstNode.max());
    }

    private void min(){
        gui.min(firstNode.min());
    }
}
