
  public class moto extends Vehicule implements actionVehicule {
    public moto (String nom,String marque ){
      super (nom,marque);}
    public void rouler(){
         System.out.println("la moto" +  ' '   + getNom()  +  ' '  +"roule ");
         }
    public void demarrer()
    {
         System.out.println("la moto " +  ' '  +getNom()  +    ' '  +    "est demarree");
         }
    
     public void freiner (){
         System.out.println("la moto" +  ' '  + getNom() +  ' '   +"freine");}
    public void passerVitesse
          (){
         System.out.println( "la moto" +  ' ' + getNom() +  ' ' +"passe une vitesse de ...");}
    
 }
 








