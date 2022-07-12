import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DoCertification {
	
	private Candidate candidate;
	private ServiceCertification serviceCertification;
	
	
	
	public DoCertification(Candidate candidate, ServiceCertification serviceCertification) {
		
		this.candidate = candidate;
		this.serviceCertification = serviceCertification;
		
		validateCertification();
	}



	private void validateCertification() {
		// TODO Auto-generated method stub
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		CertificationExam certificationExam =  candidate.getCertificationExam();
		float mark = getMark(candidate.getCertificationExam().getId(), candidate.getLastName());
		candidate.setExamMark(mark);
		
		if (candidate.getExamMark() > candidate.getCertificationExam().getSuccessMark()) {
			
			certificationExam.setSuccessMark(candidate.getCertificationExam().getSuccessMark());
			String grade;
			grade = getGrade(candidate.getExamMark());
			serviceCertification.serviceSuccess(grade);
			
			
		} else {
			int nbDaysToWait = certificationExam.getNbDaysWait();
			serviceCertification.serviceFaillure(nbDaysToWait);

		}
		
	}



	private String getGrade(float examMark) {
		// TODO Auto-generated method stub
		if (examMark >= 95) return "A+";
		if (examMark >= 90 && examMark < 95) return "A";
		if (examMark > 85 && examMark <= 90) return "B+";
		if (examMark >= 80 && examMark <= 85) return "B";
		if (examMark >= 75 && examMark <= 80) return "C+";
		if (examMark >=70 && examMark <= 75) return "C";
		if (examMark >= 65 && examMark <= 70) return "D+";
		if (examMark >= 60 && examMark <= 65) return "D";
		if (examMark < 60) return "F";
		
		return null;
	}



	private float getMark(String id, String name) {
		// TODO Auto-generated method stub
		
		File myFile = new File("marks.txt");
		
		try {
			Scanner data = new Scanner(myFile);
			
			while (data.hasNext()) {
				String line = data.next();
				StringTokenizer st = new StringTokenizer(line,",");
				String examId = st.nextToken();
				String firstName = st.nextToken();
				if (name.equals(firstName) && examId.endsWith(id)) {
					float mark =Float.parseFloat(st.nextToken());
					return mark;
				}
			}
			return -1f;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File NOT Found");
			return -1f;
		}
		
	}
	
	

}
