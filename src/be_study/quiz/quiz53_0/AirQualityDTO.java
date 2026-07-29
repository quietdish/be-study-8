package be_study.quiz.quiz53_0;

public class AirQualityDTO {
	
	// 발표일
    private String presnatnDt;

    // 1일차 예보
    private String frcstOneDt;
    private String frcstOneCn;

    // 2일차 예보
    private String frcstTwoDt;
    private String frcstTwoCn;
    
	public AirQualityDTO() {
		super();		
	}

	public String getPresnatnDt() {
		return presnatnDt;
	}

	public void setPresnatnDt(String presnatnDt) {
		this.presnatnDt = presnatnDt;
	}

	public String getFrcstOneDt() {
		return frcstOneDt;
	}

	public void setFrcstOneDt(String frcstOneDt) {
		this.frcstOneDt = frcstOneDt;
	}

	public String getFrcstOneCn() {
		return frcstOneCn;
	}

	public void setFrcstOneCn(String frcstOneCn) {
		this.frcstOneCn = frcstOneCn;
	}

	public String getFrcstTwoDt() {
		return frcstTwoDt;
	}

	public void setFrcstTwoDt(String frcstTwoDt) {
		this.frcstTwoDt = frcstTwoDt;
	}

	public String getFrcstTwoCn() {
		return frcstTwoCn;
	}

	public void setFrcstTwoCn(String frcstTwoCn) {
		this.frcstTwoCn = frcstTwoCn;
	}

	@Override
	public String toString() {
		return "AirQualityDTO [presnatnDt=" + presnatnDt + ", frcstOneDt=" + frcstOneDt + ", frcstOneCn=" + frcstOneCn
				+ ", frcstTwoDt=" + frcstTwoDt + ", frcstTwoCn=" + frcstTwoCn + "]";
	}
	
	

}
