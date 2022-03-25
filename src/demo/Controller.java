package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
  Scanner input = new Scanner(System.in);
  int numberOfItems;
  ArrayList<LoanItems> loanItems = new ArrayList<>();


  public void howManyItems(){
    System.out.print("How many loan items do you want to register?");
    numberOfItems = input.nextInt();
  }

  public void create(){
    for(int i = 0; i < numberOfItems; i++){
      System.out.print("Type (B or V): ");
      char typeInput= input.next().charAt(0);
      System.out.print("Title: ");
      String titleInput = input.next();

      if(typeInput == 'b'){
        loanItems.add(new Book("Book",titleInput));
        System.out.println(loanItems);
      } else if(typeInput == 'v'){
        loanItems.add(new Video("Video",titleInput));
      } else
        System.out.println("fejl");

    }
  }
  public void print(){
    System.out.println("""
        LIST OF LOAN ITEMS:
        -------------------
        ID  TYPE     TITLE""");
    for(int i = 0; i < loanItems.size(); i++){
      String printIt = loanItems.get(i).toString();
      System.out.println(printIt);
      }
  }

  public static void main(String[] args) {
    Controller controller = new Controller();
    controller.howManyItems();
    controller.create();
    controller.print();
  }
}
