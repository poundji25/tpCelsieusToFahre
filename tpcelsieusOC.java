import java.util.Scanner;
public class tpcelsieusOC 
{

	public static void main(String[] args) 
	{
	System.out.println("PROGRAMME DE CONVERSION CELSUIS FAHRENHEIT\n");
	int r,choix;double d,a;
    Scanner sc= new Scanner(System.in);
	//� chaque it�ration l'utilisateur choisie un des modes de conversions propos�s puis va fournir les donn�es n�cessaire a la conversion
    do
    {
	  System.out.println("  ||Les modes de conversion|| \nnum�ro 1 : de Celsius � fahrenheit\nnum�ro 2 : de fahrenheit � celsius");	     
      System.out.println("  veuillez entrez le num�ro correspendant au mode de conversion voulu");
      choix = sc.nextInt();
      
      switch(choix)
      {
      case 1:
      
    	System.out.println(" veuillez entrez le nombre de degr�e ");
    	 d = sc.nextDouble();
         a=((d*9)/5)+32;
    	 a=arrondi(a,1);    	
    	 System.out.println("  "+d+" degr�e="+a+" fahrenheit");
        break;      
      
      case 2:
    	  
    	System.out.println(" veuillez entrez le nombre de fahrenheit");
    	d = sc.nextDouble();
    	a=((d-32)*5)/9;
    	a=arrondi(a,1);
    	System.out.println("  "+d+" fahrenheit="+a+" degr�e");
        break;
      
      default:
    	//si l'utilisateur entre un num�ro invalide
    	  System.out.println("   veuillez entrez des num�ros valides \n"); 
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
	//m�thode de calcul
	public static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
		}
}
