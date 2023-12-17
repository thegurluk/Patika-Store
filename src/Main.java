import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isGo=true;
        BackSystem backSystem=new BackSystem();
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to Patika Store");
        backSystem.addNotebookList();
        backSystem.addPhonesList();
       while (isGo){
           System.out.println("          -------------------");
           System.out.println("                  MENU ");
           System.out.println("          -------------------");
           System.out.println("1-Phone transactions");
           System.out.println("2-Notebook transactions");
           System.out.println("3-Mark List");
           System.out.println("4-Add Phone");
           System.out.println("5-Add Notebook");
           System.out.println("6-Remove product");
           System.out.println("7-Find Product with ID number");
           System.out.println("8-go out");
           System.out.println("          -------------------");
           System.out.print("what do you want to do:");
           int a=input.nextInt();


           switch (a){
               case 1:
                   System.out.println("     ********PHONES********");
                   backSystem.seePhones();
                   break;
               case 2:
                   System.out.println("     ********NOTEBOOKS********");
                   backSystem.seeNotebook();
                   break;
               case 3:
                   System.out.println("     ********MARK LIST********");
                   System.out.println("-------------------------");
                   backSystem.seeMarks();
                   break;
               case 4:
                   backSystem.addPhone();

                   break;
               case 5:
                   backSystem.addNotebook();

                   break;
               case 6:

                   backSystem.seePhones();
                   backSystem.seeNotebook();
                   backSystem.productRemove();

                   break;
               case 7:

                   backSystem.findProductWithID();
                   break;
               case 8:
                   System.out.println("Have nice day");
                   isGo=false;
                   break;
               default:
                   System.out.println("wrong choice,Try Again");
                   break;
           }
       }



    }
}