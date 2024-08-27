package stud.model;

public class FeePayment {
		
		private String studId;
		private String studName;
		private String course;
		private String feeAmt;
		
		public FeePayment(String studId, String studName, String course, String feeAmt) {
			super();
			this.studId = studId;
			this.studName = studName;
			this.course = course;
			this.feeAmt = feeAmt;
		}

		public String getStudId() {
			return studId;
		}

		public void setStudId(String studId) {
			this.studId = studId;
		}

		public String getStudName() {
			return studName;
		}

		public void setStudName(String studName) {
			this.studName = studName;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public String getFeeAmt() {
			return feeAmt;
		}

		public void setFeeAmt(String feeAmt) {
			this.feeAmt = feeAmt;
		} 
		
		
		
		

}
