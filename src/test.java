public class test {
	
	/** 
	 * 
	Giuseppe Pirrò: “REWOrD: Semantic Relatedness in the Web of Data”.
	Proceedings of the 26th AAAI Conference on Artificial Intelligence
	(AAAI2012).
	 */
	
	public static void main(String[] args){
		String s1 = "Federal agents said yesterday they are investigating the theft of 1,200 pounds of an explosive chemical from construction companies in Colorado and California in the past week";

		String s2 = "Federal investigators are looking for possible connections between the theft of 1,200 pounds of an explosive chemical from construction companies in Colorado and California in the past week.";

		System.out.println(Similarity.computeString(s1, s2));
		
		System.out.println(Similarity.computeWord("hi", "hello" ));
	}
	
	

}