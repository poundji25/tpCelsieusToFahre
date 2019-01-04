import java.util.Scanner;
public class tpcelsieusOC 
{

	public static void main(String[] args) 
	{
	System.out.println("PROGRAMME DE CONVERSION CELSUIS FAHRENHEIT\n");
	int r,choix;double d,a;
    Scanner sc= new Scanner(System.in);
	//à chaque itération l'utilisateur choisie un des modes de conversions proposés puis va fournir les données nécessaire a la conversion
    do
    {
	  System.out.println("  ||Les modes de conversion|| \nnuméro 1 : de Celsius à fahrenheit\nnuméro 2 : de fahrenheit à celsius");	     
      System.out.println("  veuillez entrez le numéro correspendant au mode de conversion voulu");
      choix = sc.nextInt();
      
      switch(choix)
      {
      case 1:
      
    	System.out.println(" veuillez entrez le nombre de degrée ");
    	 d = sc.nextDouble();
         a=((d*9)/5)+32;
    	 a=arrondi(a,1);    	
    	 System.out.println("  "+d+" degrée="+a+" fahrenheit");
        break;      
      
      case 2:
    	  
    	System.out.println(" veuillez entrez le nombre de fahrenheit");
    	d = sc.nextDouble();
    	a=((d-32)*5)/9;
    	a=arrondi(a,1);
    	System.out.println("  "+d+" fahrenheit="+a+" degrée");
        break;
      
      default:
    	//si l'utilisateur entre un numéro invalide
    	  System.out.println("   veuillez entrez des numéros valides \n"); 
      } 
      do
      {
       System.out.println(" voulez vous faire une autre conversion ?\nSi oui tapez 1 sinon tapez 0");
       r = sc.nextInt();
      }
      while((r!=1)&&(r!=0));
    }
while(r==1);
    System.out.println("au revoir");
	
	}
	//méthode de calcul
	public static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
		}
}
