
public class Candidate extends Preson implements ServiceCertification {
	
	private CertificationExam certificationExam;
	private String examDate;
	private float examMark;
	
	String grade = null;
	int nbDaysToWait = 0;

	public Candidate(String lastName, String firstName, String phone, CertificationExam certificationExam,
			String examDate) {
		super(lastName, firstName, phone);
		// TODO Auto-generated constructor stub
		this.certificationExam = certificationExam;
		this.examDate = examDate;
		
		DoCertification doCertification = new DoCertification(this, this);
	}
	
	
	// Getters and Setters

	public CertificationExam getCertificationExam() {
		return certificationExam;
	}


	public void setCertificationExam(CertificationExam certificationExam) {
		this.certificationExam = certificationExam;
	}

	public String getExamDate() {
		return examDate;
	}

	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}

	public float getExamMark() {
		return examMark;
	}

	public void setExamMark(float examMark) {
		this.examMark = examMark;
	}

	@Override
	public void serviceSuccess(String grade) {
		// TODO Auto-generated method stub
		this.grade = grade;
		
	}

	@Override
	public void serviceFaillure(int nbDays) {
		// TODO Auto-generated method stub
		this.nbDaysToWait = nbDays;
		
	}


	@Override
	public String toString() {
		
		String str = super.toString();
		
		if (grade != null) {
			str = str +  "Pass Certification Exam ==> \n" + "ID: " + certificationExam.getId() + "\tTitle: " + certificationExam.getTitle() + 
					"\tSuccess Mark: " + certificationExam.getSuccessMark() + "\n";
			
			str = str +  "Mark: " + examMark + "\tGrade: " + grade;
			
		} else {
			
			str = str + "Fails the certification Exam ==> \n" + certificationExam + "\n";
			str = str + "Mark: " + examMark + "\n";
			str = str + "Next Exam After " + nbDaysToWait + " days.";
			

		}
		
		return str;
	}
	
	

}
