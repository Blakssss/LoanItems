package demo;


public class LoanItems {
  private String type;
  private String title;

  LoanItems(String type,String title){
    this.type = type;
    this.title = title;
  }
  public String toString(){
    return type + " " + title;
  }

}
