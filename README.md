# ebebek-Java-QA-Practicum
package employee;

/**
 *
 * @author cihan
 */
public class root {
   public static String name;
   public static double salary;
   public static int workHours;
   public static int hireYear;
       
    public  void root(String isim,int maas, int calismaSaati,int yil)
    {
    this.name=isim;
    this.salary=maas;
    this.workHours=calismaSaati;
    this.hireYear=yil;
    
    }
      static  double tax()
    
    {   
        if(salary<1000)
        {
            return salary;
        }
        else
        {
            double vergi=salary*(0.03);
           
            return vergi ;
        }
        
    }
    static double  bonus()
    {
        int add=0;
        if(workHours<=40){
        return 0;
    }
        else
        {
            for (int i = 41; i <= workHours; i++)
            {
                add+=30;
            }
            
            return add;
        }
        
    }
    static double raiseSalary(){
        /*vergi ve bonuslarda çalışan maaşını sadece kontrol amaçlı 
        kulladığım için burda vergi ve mesai ücretini dikkate almadım.*/
    int year=2021-hireYear;
    double pay=salary;
    
    if(year<10)
    {
    pay=pay*(0.05);
   
    return pay;
    }
    if(10<=year&&year<20)
    {
       pay=pay*(0.1);  
      
       return pay;
        
    }
    if(20<=year)
    {
        pay=pay*(0.15);    
        
         return pay;
    
    }
 return 0;
    }
   public  String toString()
    {
        double total=salary+raiseSalary()+bonus()-tax();
   return " Calisan ismi: "+name+"\n"+" Calisanin mesai saati: "
           +workHours+"\n"+" Calisanin ise baslagic yili: "+hireYear+"\n"+" Calisan burut maasi: "+salary+
           "\n"+" vergi ucreti: "+tax()+"\n"+" mesai ucreti: "+bonus()+"\n" +" yillik zam: "+raiseSalary()+"\n"+"------------------"
           +"\n"+" total maas: "+total;
           }
}


