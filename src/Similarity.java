import it.gonzo.assessor.SentenceSimilarityAssessor;

/** 
 * 
Giuseppe Pirrò: “REWOrD: Semantic Relatedness in the Web of Data”.
Proceedings of the 26th AAAI Conference on Artificial Intelligence
(AAAI2012).
 */


import it.gonzo.assessor.WordNetAssessor;
import it.gonzo.similarity.utils.SimilarityConstants;

public class Similarity {
	public static double computeString( String s1 , String s2 ) {
		SentenceSimilarityAssessor s = new SentenceSimilarityAssessor();
		return s.getWordNetHungarianSentenceSimilarity(s1, s2, SimilarityConstants.BYPOS, SimilarityConstants.FAITH_MEASURE, SimilarityConstants.INTRINSIC_IC);
	}
	
	public static double computeWord( String s1 , String s2 ) {
		WordNetAssessor wn = new WordNetAssessor();
		return( wn.getWordNetNounSimilarityByIC( s1 , s2 , SimilarityConstants.FAITH_MEASURE, SimilarityConstants.INTRINSIC_IC) );
	}
}
