package arkadiusz.dabal.egzamin;

/*
Kucharz dostał na urodziny dwa kosze owoców. W pierwszym koszu jest J jabłek, w drugim P pomarańczy.
Kucharz lubi pomarańcze i jabłka tak samo bardzo dlatego chciałby mieć ich po równo. Każde jabłko i każda pomarańcza kosztuje 1 złotą monetę.
Kucharz ma Z monet. Napisz program, który na wejściu dostaje trzy liczby:
J P Z (ilość jabłek, ilość pomarańczy, ilość złotych monet).
Program ma wypisywać jaka jest minimalna możliwa różnica między ilością jabłek i pomarańczy po zakupie owoców.
Kucharz jest bardzo łakomy więc zawsze wydaje wszystkie monety na zakupach.

Przykłady:

Wejście: 1 3 1
Wyjście:
Minimalna różnica: 1
Ilość jabłek: 2
Ilość pomarańczy: 3

Wejście: 5 3 3
Wyjście:
Minimalna różnica: 1
Ilość jabłek: 6
Ilość pomarańczy: 5

Wejście: 1 10 20
Wyjście:
Minimalna różnica: 1
Ilość jabłek: 16
Ilość pomarańczy: 15
*/

public class Zadanie1 {
    public static void main(String[] args) {
        Licz(0, 5, 3);
        System.out.println();
        Licz(1, 3, 1);
        System.out.println();
        Licz(5, 3, 3);
        System.out.println();
        Licz(1, 10, 20);
    }

    private static void Licz(int j, int p, int z) {
        if(j<p & z>0){
            j++;
            z--;
            Licz(j,p,z);
            return;
        }
        if(j>p & z>0){
            p++;
            z--;
            Licz(j,p,z);
            return;
        }
        if(j==p & z>1){
            j++;
            p++;
            z-=2;
            Licz(j,p,z);
            return;
        }

        System.out.println("Minimalna roznica: " + (Math.abs(j-p)+z));
        System.out.println("Liczba jablek: " + j);
        System.out.println("Liczba pomaranczy: " + p);
        if(z==1){
            System.out.println("Kucharz moze kupic jedne dodatkowe jablko lucz pomarancze!");
        }
    }
}
