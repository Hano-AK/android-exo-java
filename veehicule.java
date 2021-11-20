

 abstract class Vehicule{
    public  String nom;
    public String marque;
     public Vehicule(String nom, String marque){
        this.nom =nom;
        this.marque=marque;

    }
    public String getNom(){
        return nom;
    }
     public String getMarque(){
        return marque;
    }

    public abstract void demarrer();

    
     
}


