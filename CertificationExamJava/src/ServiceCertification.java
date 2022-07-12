
public interface ServiceCertification {
	
	public static final CertificationExam EXAM_1Z0151 =  new CertificationExam("1z0-151", "SQL", 60, 30);
	public static final CertificationExam EXAM_1Z0147 =  new CertificationExam("1z0-147", "Java", 66, 35);
	
	public static final CertificationExam[] listOfCertificationExams = {EXAM_1Z0151, EXAM_1Z0147};
	
	public void serviceSuccess(String grade);
	public void serviceFaillure(int nbDays);

}
