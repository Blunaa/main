/**
 * 
 */
package brain;

/**
 * @author dean.khayyeri
 *
 */
public class Cortex {
	
	private String point;
	
	/**
	 * 
	 */
	public String giveAnswer(){
		return point;
	}
	
	/**
	 * 
	 */
	public void setAnswer(String answer){
		this.point = answer;
	}

	/**
	 * @return the point
	 */
	public String getPoint() {
		return point;
	}

	/**
	 * @param point the point to set
	 */
	public void setPoint(String point) {
		this.point = point;
	}
	

}
