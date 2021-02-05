package genopfrisk;

import java.util.ArrayList;


public class øvelse1 {

    ArrayList<String> names = new ArrayList<String>();

    public boolean doesArraylistContainString(ArrayList names, String navn) {

        if (names.contains(navn)) {
            System.out.println("\nThe string has been found");
        } else {
            System.out.println("\nThere was no person by the name of " + navn + "\nBut now " + navn + " is added to the list");
            names.add(navn);
            }
        return false;
    }

    public void printProblemDescription(){
        System.out.println("Problem description: Skriv en metode med navnet doesArraylistContainString, dermodtager 2parametrer: " +
                "\nenarraylisteog enstreng.Metoden returnerer en boolean:•Hvis strengen ikke findes iarraylistenindsættes strengen " +
                "\ni listen og metoden returnerer false•Hvis strengen findes i arraylisten returnerer metodentrue og printer " +
                "\n”The String has been found”");
    }

}

