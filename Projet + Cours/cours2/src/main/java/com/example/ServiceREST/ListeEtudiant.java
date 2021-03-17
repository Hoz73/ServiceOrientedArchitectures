package com.example.ServiceREST;

import java.util.ArrayList;

public  class ListeEtudiant {
    private static ArrayList<Etudiant> listeEtudiant = new ArrayList<Etudiant>();

    public static ArrayList<Etudiant> getListeEtudiant() {
        return listeEtudiant;
    }

}
