/**
 * Projet MCP 2014-2015
 * @author ndizera
 *
 */
public class Cadran {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] cadran = {1, 2, 3, 4, 5, 6};
		int rotation = 10;
		
		rotation(cadran, rotation);
		
		for(int i = 0; i < cadran.length; i++){
			System.out.print(cadran[i]+ "  ");
		}
		
	}
	
	
	public static void rotation(int[] cadran, int rotation){
		int n = cadran.length;  //nombre de decalements restant à effectuer
		int depart = 0;		//indice de depart pour premier parcours
		
		while(n!=0){
			n = parcours(cadran, depart, rotation, n);
			depart++; // on change d'indice de depart
		}
	}
	
	
	public static int parcours(int[] cadran, int depart, int pas, int n){
		int i = depart + pas;	//indice de l'element actuel considere
		int temp = 0;	//variable temporaire pour stocker un element du cadran
		int deplacer = cadran[i%cadran.length]; //element du tableau a decaler
		
		cadran[i%cadran.length] = cadran[depart%cadran.length];
		n--;//decroit le nombre de decalements restant a faire 
		
		while((i % cadran.length) != depart){
			temp = cadran[(i+pas)%cadran.length];
			cadran[(i+pas)%cadran.length] = deplacer;
			deplacer = temp;
			i = i + pas;
			n--; //decroit le nombre de decalements restant a faire 
		}

		return n;
	}

}
