package com.example.ServiceREST;

import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;



@Path("/etudiant/")
public class Etudiant {
    private String nom;
    private String prenom;




    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/creerEtudiant/{nom}/{prenom}")
    public String CreerEtudiant(@PathParam("nom") String nom, @PathParam("prenom") String prenom){
        Etudiant etu = new Etudiant();
        etu.nom = nom;
        etu.prenom = prenom;
        ListeEtudiant.getListeEtudiant().add(etu);
        return "l'etudiant " + ListeEtudiant.getListeEtudiant().get(0).nom +" " + ListeEtudiant.getListeEtudiant().get(0).prenom + "a ete ajoute a la liste etudiant";
    }

    @GET
    @Path("/{id}")
    public Etudiant GetEtudiant(@PathParam("id") int id){
        return ListeEtudiant.getListeEtudiant().get(id);
    }

    @GET
    @Path("/size")
    @Produces("text/plain")
    public int GetEtudiant(){
        return ListeEtudiant.getListeEtudiant().size() ;
    }


    @GET
    @Path("/liste")
    @Produces(MediaType.APPLICATION_JSON)
    public String getListeEtudiant() {
        return new Gson().toJson(ListeEtudiant.getListeEtudiant());
    }








}
