
public class CertificationExam {
	
	private String id;
	private String title;
	private float successMark;
	private int nbDaysWait;
	
	
	public CertificationExam(String id, String title, float successMark, int nbDaysWait) {

		this.id = id;
		this.title = title;
		this.successMark = successMark;
		this.nbDaysWait = nbDaysWait;
	}


	public float getSuccessMark() {
		return successMark;
	}


	public void setSuccessMark(float successMark) {
		this.successMark = successMark;
	}


	public int getNbDaysWait() {
		return nbDaysWait;
	}


	public void setNbDaysWait(int nbDaysWait) {
		this.nbDaysWait = nbDaysWait;
	}


	public String getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	@Override
	public String toString() {
		return "ID: " + id + "\tTitle: " + title + "\tSuccess Mark: " + successMark + "\tNumber of Days to Wait: "
				+ nbDaysWait;
	}


	
	
	
	
	

}
