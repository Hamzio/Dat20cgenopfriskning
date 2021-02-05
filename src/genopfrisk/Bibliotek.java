package genopfrisk;

import java.util.ArrayList;

public class Bibliotek {
    private static ArrayList<Bog> bibliotek = new ArrayList<>();

    public static void main(String[] args) {
        Bog paranoia = new Bog(1234567011,"Paranoia",1999);
        Bog peterPedal = new Bog(1234567091,"Peter Pedal",1992);
        Bog pippiLangstrømpe = new Bog(1234591411,"Pippi på eventyr",1962);
        bibliotek.add(paranoia);
        bibliotek.add(peterPedal);
        bibliotek.add(pippiLangstrømpe);
        System.out.println(objektISBN(bibliotek, paranoia));
        System.out.println(objektISBN(bibliotek, peterPedal));
        System.out.println(objektISBN(bibliotek, pippiLangstrømpe));
    }

    public static boolean objektISBN(ArrayList<Bog> b, Bog bog){
        for (int i = 0; i < b.size(); i++) {
            if(bog.getISBNNummer() == b.get(i).getISBNNummer()){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
}
