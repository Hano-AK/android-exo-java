
 class voiture extends Vehicule {
    public voiture (String marque,String nom){
        super (marque,nom);}
    
     public void demarrer (){
            System.out.println( "la voiture de marque" + getMarque() + "et de nom" + getNom() + "est demarree");
     }
}