
public class TestCandidate {

	public static void main(String[] args) {
	
		CertificationExam exam1z0151=ServiceCertification.EXAM_1Z0151,
				          exam1z0147=ServiceCertification.EXAM_1Z0147; 
		
		Candidate c1 = new Candidate("David","David","5148901240",exam1z0151,"12-apr-2021");
		System.out.println(c1);
		Candidate c2 = new Candidate("Anna","Anna","4502901123",exam1z0147,"14-jan-2021");
		System.out.println(c2);
	}
}
