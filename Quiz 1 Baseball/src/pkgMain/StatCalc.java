package pkgMain;
import java.util.Scanner;
public class StatCalc {

	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  
		
		System.out.println("Player Name: ");
		String n = reader.next(); 
		
		System.out.println("Number of At Bats: ");
		int AtBats = reader.nextInt();
		
		System.out.println("Number of Hits: ");
		int Hits = reader.nextInt();
		
		System.out.println("Number of Doubles: ");
		int Dbl = reader.nextInt();
		
		System.out.println("Number of Triples: ");
		int Triples = reader.nextInt();
		
		System.out.println("Number of Home Runs: ");
		int HR = reader.nextInt();
		
		System.out.println("Number of Walks: ");
		int BB = reader.nextInt();
		
		reader.close();
	
		
		public double BA()
		{
					
			double ba = this.Hits/this.AtBats;
			
			return ba;
		}	
		
		public double OBP()
		{
					
			double obp = (this.Hits+this.BB)/(this.AtBats+this.BB);
			
			return obp;
		}
		
		public double SLG()
		{
			int singles = this.Hits - this.Dbl - this.Triples - this.HR;
						
			double slg = (singles + (2*this.Dbl) + (3*this.Triples) + (4*this.HR))/this.AtBats;
				
			return slg;
			}
		
		public double OBS()
		{
					
			double obs = obp + slg;
			
			return obs;
		}
		
		public double TB()
		{
					
			double tb = slg * this.AtBats;
			
			return tb;
		}
		
		System.out.println(n + ":");
		System.out.println("BA: " + BA);
		System.out.println("OBP: " + OBP);
		System.out.println("SLG: " + BA);
		System.out.println("OBS: " + BA);
		System.out.println("TB: " + BA);
		

	
	}
}

