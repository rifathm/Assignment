public class CscExample{

private int questionNo;
private String category;
private String text;


	public void setQuestionNo(int questionNo){
		this.questionNo=questionNo;
	}
	
	public void setCategory(String category){
		this.category=category;
	}

	public void setText(String text)
	{	
		this.text=text;
	}



        public int getQuestionNo(){
		return questionNo;
                }

        public String getCategory(){
		return category;
              }

        public String getText()
	{
		return text;

	}

	public void addQuestion(CscExample qu)
	{
	}

	public void removeQuestion(int quId)
	{
	}
	
	public void editQuestion(int quId)
	{
	}
	

}



