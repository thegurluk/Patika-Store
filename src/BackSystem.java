import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class BackSystem {
    boolean isNotGoOutRemove=true;
    boolean isNotCorrectProductId=true;

       Phone iphone14=new Phone(1245,"14 Pro max",12000,10,17,"Apple",64,7.2,8,"Black",3500,32);
       Phone p20lite=new Phone(2134,"P20 lite",24000,15,33,"Huawei",32,7.2,4,"White",7200,56);
       Phone mi8lite=new Phone(7564,"MI8 lite",13500,35,35,"Xiaomi",128,7.2,12,"Yellow",4200,12);
       Phone s3mini=new Phone(7314,"S3 mini",8500,20,20,"Samsung",16,7.2,2,"Pink",2250,17);
       Phone t20=new Phone(6578,"T20",11000,5,10,"Lenovo",512,7.2,32,"Purple",7895,23);

       Notebook macPro=new Notebook(21354,"Mac Pro",23000,20,10,"Apple",128,14.5,32,"Green","Q");
       Notebook z20=new Notebook(96427,"Z 20",3200,10,3,"Asus",256,17.5,64,"Purple","F");
       Notebook c500=new Notebook(63487,"Nirvana C500",27500,5,5,"Casper",13,14.5,16,"pink","Q");
       Notebook g9=new Notebook(63175,"G-9",15620,15,8,"HP",512,14.5,12,"Orange","F");
       Notebook s7=new Notebook(54655,"S7 ",13500,30,1,"Monster",64,17.4,24,"Black","Q");

       TreeSet<String> marks=new TreeSet<>();

       LinkedHashSet<Phone> phones=new LinkedHashSet<>();
       LinkedHashSet<Notebook> notebooks=new LinkedHashSet<>();


       public void seeMarks(){
           marks.add(iphone14.getMark());
           marks.add(p20lite.getMark());
           marks.add(mi8lite.getMark());
           marks.add(s3mini.getMark());
           marks.add(t20.getMark());
           marks.add(macPro.getMark());
           marks.add(z20.getMark());
           marks.add(c500.getMark());
           marks.add(g9.getMark());
           marks.add(s7.getMark());

           for (String str:marks){
               System.out.println(str);
           }
       }


       public void addPhonesList(){
           phones.add(iphone14);
           phones.add(p20lite);
           phones.add(mi8lite);
           phones.add(s3mini);
           phones.add(t20);

       }

       public void seePhones(){

           for (Phone phn:phones){
               System.out.format("ID:"+phn.getId()+" || NAME:"+phn.getName()+"  ||  PRİCE:"+phn.getPrice()+"TL  ||  MARK:"+phn.getMark()+"  ||  DİSCOUNT:"+phn.getDiscount()+"  ||  STOCK AMOUNT:"+phn.getStockAmount()+"  ||  MEMORY:"+phn.getMemory()+"  ||  SCREEN SİZE:"+phn.getScreenSize()+"  ||  RAM:"+phn.getRam()+"  ||  COLOR:"+phn.getColor());
               System.out.println("");
           }
       }


       public void addNotebookList(){
           notebooks.add(macPro);
           notebooks.add(z20);
           notebooks.add(c500);
           notebooks.add(g9);
           notebooks.add(s7);
       }
    public void seeNotebook(){


        for (Notebook noteB:notebooks){
                System.out.format("ID:"+noteB.getId()+" || NAME:"+noteB.getName()+"  ||  PRİCE:"+noteB.getPrice()+"TL  ||  MARK:"+noteB.getMark()+" ||  DİSCOUNT:"+noteB.getDiscount()+"  ||  STOCK AMOUNT:"+noteB.getStockAmount()+"  ||  MEMORY:"+noteB.getScreenSize()+"  ||  RAM:"+noteB.getRam()+"  ||  COLOR:"+noteB.getColor()+"  ||  KEYBOARD TYPE:"+noteB.getKeyboardType());
            System.out.println();
        }

    }

    public void addPhone(){
        Scanner inp=new Scanner(System.in);
        Scanner inpu=new Scanner(System.in);
        System.out.print("Enter ID:");
        int ID= inp.nextInt();

        System.out.print("Enter Name:");
        String name= inpu.nextLine();

        System.out.print("Enter price:");
        int price= inp.nextInt();

        System.out.print("Enter discount:");
        int discount= inp.nextInt();

        System.out.print("Enter Amount:");
        int amount= inp.nextInt();

        System.out.print("Enter Mark:");
        String mark= inpu.nextLine();

        System.out.print("Enter Memory:");
        int memory= inp.nextInt();

        System.out.print("Enter Screen size:");
        double screenSize= inp.nextDouble();

        System.out.print("Enter Ram:");
        int ram= inp.nextInt();

        System.out.print("Enter Color:");
        String color= inpu.nextLine();

        System.out.print("Enter Battery size:");
        int batterySize= inp.nextInt();

        System.out.print("Enter Camera:");
        int camera= inp.nextInt();
           phones.add(new Phone(ID,name,price,discount,amount,mark,memory,screenSize,ram,color,batterySize,camera));
    }

    public void addNotebook(){
        Scanner inp=new Scanner(System.in);
        Scanner inpu=new Scanner(System.in);
        System.out.print("Enter ID:");
        int ID= inp.nextInt();

        System.out.print("Enter Name:");
        String name= inpu.nextLine();

        System.out.print("Enter price:");
        int price= inp.nextInt();

        System.out.print("Enter discount:");
        int discount= inp.nextInt();

        System.out.print("Enter Amount:");
        int amount= inp.nextInt();

        System.out.print("Enter Mark:");
        String mark= inpu.nextLine();

        System.out.print("Enter Memory:");
        int memory= inp.nextInt();

        System.out.print("Enter Screen size:");
        double screenSize= inp.nextDouble();

        System.out.print("Enter Ram:");
        int ram= inp.nextInt();

        System.out.print("Enter Color:");
        String color= inpu.nextLine();

        System.out.println("Enter keyboard Type");
        String keyboardType=inpu.nextLine();
        notebooks.add(new Notebook(ID,name,price,discount,amount,mark,memory,screenSize,ram,color,keyboardType));
    }

    public void findProductWithID() {
           isNotGoOutRemove=true;
           while (isNotGoOutRemove){
               System.out.println("1-Find phone");
               System.out.println("2-Find Notebook");
               System.out.println("3-Go out");
               System.out.print("Your choice:");
               Scanner inp=new Scanner(System.in);
               Scanner inputt=new Scanner(System.in);

               int number= inp.nextInt();

               switch (number){
                   case 1:
                       System.out.print("Enter product ID:");
                       int phoneId=inputt.nextInt();
                       for (Phone id:phones){
                           if (id.getId()==phoneId){
                               System.out.println(id.getId()+" "+id.getName()+" "+id.getPrice()+" "+id.getMark()+" "+id.getDiscount());

                               isNotGoOutRemove=false;
                           }
                       }
                       if(isNotGoOutRemove){
                           System.out.println("ID is not correct");
                       }
                       break;
                   case 2:
                       System.out.print("Enter product ID:");
                       int notebookId=inputt.nextInt();
                       for (Notebook id:notebooks){
                           if (id.getId()==notebookId){
                               System.out.format(id.getId()+" "+id.getName()+" "+id.getPrice()+" "+id.getMark()+" "+id.getDiscount());

                               isNotGoOutRemove=false;
                           }
                       }
                       if(isNotGoOutRemove){
                           System.out.println("ID is not correct");
                       }
                       break;
                   case 3:
                       System.out.println("goood by");
                       isNotGoOutRemove=false;
                       break;
                   default:
                       System.out.println("wrong choice");
                       break;
               }



           }
    }

    public void productRemove(){
        System.out.println("1-Remove phone");
        System.out.println("2-Remove Notebook");
        System.out.println("3-Go out");
        System.out.print("Your choice:");
        Scanner inp=new Scanner(System.in);
        Scanner inputt=new Scanner(System.in);

        int number= inp.nextInt();

        switch (number){
            case 1:
                System.out.print("Enter product ID:");
                int phoneID=inp.nextInt();
                Iterator<Phone> itr=phones.iterator();
                while (itr.hasNext()){
                    Phone newID=itr.next();
                    if(newID.getId()==phoneID){
                        itr.remove();
                        isNotGoOutRemove=false;
                    }
                }
                if(isNotGoOutRemove){
                    System.out.println("ID is not correct");
                }

                break;
            case 2:
                System.out.print("Enter product ID:");
                int notebookID=inp.nextInt();
                Iterator<Notebook> itr1=notebooks.iterator();
                while (itr1.hasNext()){
                    Notebook newID=itr1.next();
                    if(newID.getId()==notebookID){
                        itr1.remove();
                        isNotGoOutRemove=false;
                    }
                }
                if(isNotGoOutRemove){
                    System.out.println("ID is not correct");
                }

                break;
            case 3:
                System.out.println("goood by");
                isNotGoOutRemove=false;
                break;
            default:
                System.out.println("wrong choice");
                break;
        }
    }




}
