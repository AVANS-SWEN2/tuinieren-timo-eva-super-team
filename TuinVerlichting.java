
public class TuinVerlichting {

	private Schakelaar slimmeschakelaar;
	private boolean daglicht;
	
	 public Boolean getDaglicht() {
	        return daglicht;
	    }
	 
	 public void setDaglicht(boolean daglicht) {
		 this.daglicht = daglicht;
	 }
	 
	 public void verlichtingState() {
		 if(daglicht) {

			 System.out.println("De verlichging staat aan");
		 }
		 else {

			 System.out.println("De verlichging staat uit");
		 }
	 }
}
