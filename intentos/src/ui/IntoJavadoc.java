/**
 * @author Simon Garcia
 * @since 2024-03-02
 */

package ui;



public class IntoJavadoc {
	public static void main(String[] args){
	
	/** 
	Comentario random a ver que pasa
	
	<b>Resaltadito a ver </b>
	
	<p> parrafito </p>
	@param algo?
	
	*/
	
	
	calcMinPrice(1,2,3,4,5);
	
	}
	

	/**
	* <p><b>calcMinPrice</b></p>
	* <b>Description: </b> The method calculates the minimum price based on the minimum amount of luggage that is required to cover the needs of the user's estimated baggage weight additional to the base fee provided.
	*	
	* <p><b>Preconditions:</b></p>
	* <ul>
	* 	<li> {@code basePrice} should be a double greater than 0. </li>
	*	<li>{@code minBag23} and {@code min10Bag} should be int greater than 0. </li>
	*	<li> {@code costPer23} and {@code costPer10} should be double greater than 0 less than 1. </li>
	* </ul>
	*
	* <p><b>Postconditions:</b></p>
	* <ul>
	* 	<li>The additional cost per bag of 23 kg and 10kg is added to the base price that is provided.  </li>
	* </ul>
	*
	* @param basePrice The base fee for the XS, S or M ticket.
	* @param min23Bag The minimum number of 23 kg bags needed to cover the baggage weight.
	* @param min10Bag The minimum number of 10 kg bags needed to cover the baggage weight.
	* @param costPer23 The unitary cost for every 23 kg bag.
	* @param costPer10 The unitary cost for every 10kg bag.
	* @return The calculated minimum price.
	*/
	public static double calcMinPrice(double basePrice, int min23Bag, int min10Bag, 
	double costPer23, double costPer10) {
		double minPrice = basePrice + (min23Bag * costPer23) + (min10Bag * costPer10);
		return minPrice;
	}
	
	/**
	* <p><b>baseRate</b></p>
	* <b>Description:</b> The method calculates the basic fee for the XS, S and M ticket using the XS fee as the base and adding the extra percentage for the fee
	*
	* <p><b>Preconditions:</b></p>
	* <ul>
	*	<li> {@code XsRate} should be a double greater than 0. </li>
	* 	<li> {@code sPercent} and {@code mPercent} should be double greater than 0 less than 1. </li>
	* </ul>
	*
	* <p><b>Postconditions:</b></p>
	* <ul>
	*	<li>The basic fee for XS, S and M is calculated and saved as a double in an array containing the three prices.  </li>
	* </ul>
	*
	* @param xsRate The minimum fee for the XS ticket
	* @param sPercent The additional percentage that costs the S ticket compared to the XS ticket
	* @param mPercent The additional percentage that costs the M ticket compared to the XS ticket
	* @return The most basic price for every ticket type
	*/

	public static double[] baseRate(double xsRate, double sPercent, double mPercent) {
		double sFee = xsRate * (1 + sPercent);
		double mFee = xsRate * (1 + mPercent);
		double[] baseFee = {xsRate, sFee, mFee};
		
		return baseFee;
	}

}