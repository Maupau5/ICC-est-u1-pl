package controllers;

import java.util.Arrays;

import models.*;

public class SortingMethods {
    public void sortByNameWithBubble(Person[] arrPersons) {
        int n = arrPersons.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arrPersons[i].getName().compareTo(arrPersons[j].getName()) > 0) {
                    // Intercambio de elementos
                    Person temp = arrPersons[i];
                    arrPersons[i] = arrPersons[j];
                    arrPersons[j] = temp;
                }
            }
        }
    }

    public void sortByNameWithSelection(Person[] arrPersons) {
        for (int i = 0; i < arrPersons.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arrPersons.length; j++) {
                if (arrPersons[j].getName().compareTo(arrPersons[indiceMinimo].getName()) < 0) {
                    indiceMinimo = j;
                }
            }
            Person smallerPerson = arrPersons[indiceMinimo];
            arrPersons[indiceMinimo] = arrPersons[i];
            arrPersons[i] = smallerPerson;
        }
    }

    public void sortByAgeWithInsertion(Person[] arrPersons) {
        for (int j = 1; j < arrPersons.length; j++) {
            Person key = arrPersons[j];
            int i = j - 1;

            while (i >= 0 && arrPersons[i].getAge() > key.getAge()) {
                arrPersons[i + 1] = arrPersons[i];
                i--;
            }
            arrPersons[i + 1] = key;
        }
    }

    public void sortByNameWithInsertion(Person[] arrPersons) {
        for (int j = 1; j < arrPersons.length; j++) {
            Person key = arrPersons[j];
            int i = j - 1;

            while (i >= 0 && arrPersons[i].getName().compareTo(key.getName()) > 0) {
                arrPersons[i + 1] = arrPersons[i];
                i--;
            }
            arrPersons[i + 1] = key;
        }
    }
}