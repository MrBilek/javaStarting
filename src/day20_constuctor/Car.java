package day20_constuctor;

public class Car {


    /* Bir class dan olusturulabilecek objelerin variable ya da methodlarla belirleyebiliriz

    */



    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis ";
    int yil=1900;
    int km;
    String renk = "Renk secilmedi";

   public Car (String mrk,String mdl, int yl, int kmetre,String rnk){


   }


    public Car(){



    }

















    @Override
    public String toString() {
        return  " Car{" +
                "\n, marka='" + marka + '\'' +
                ",\n, model='" + model + '\'' +
                ",\n, yil=" + yil +
                ",\n, km=" + km +
                ",\n, renk='" + renk + '\'' +
                '}';
    }

    public static void hareket (){

         System.out.println("Tum arabalar hareket eder");


     }

}
