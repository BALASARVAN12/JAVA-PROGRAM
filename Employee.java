import java.util.Scanner;

public class Employee {
    String name;
    String Adreess;
    float salary;
    int yoj;
    public void getinfo(String name,String Adress,float salary,int yoj) {
        this.name=name;
        this.Adreess=Adress;
        this.salary=salary;
        this.yoj=yoj;
    }
    public void displayinfo() {
        System.out.println(name +"\t"+ Adreess +"\t"+ salary +"\t"+ yoj);

    }

    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        String name[]=new String[3];
        int yoj[]=new int[3];
        float salary[]=new float[3];
        String Adress[]=new String[3];
        for (int i=0;i<3;i++) {
            System.out.println("");
            System.out.println("ENTER THE NAME OF EMPLOYEE:");
            name[i]= input.nextLine();
            System.out.println("ENTER YEAR OF JOINING:");
            yoj[i]=input.nextInt();
            System.out.println("ENTER SALARY:");
            salary[i]=input.nextFloat();
            input.nextLine();
            System.out.println("ENTER ADRESS:");
            Adress[i]=input.nextLine();
        }
        Employee em1 = new Employee();
        em1.getinfo(name[0],Adress[0],salary[0], yoj[0]);
        Employee em2 = new Employee();
        em2.getinfo(name[1],Adress[1],salary[1], yoj[1]);
        Employee em3 = new Employee();
        em3.getinfo(name[2],Adress[2],salary[2], yoj[2]);
        System.out.println("Name \tAddress \tSalary  \tYear Of Joining");

        em1.displayinfo();
        em2.displayinfo();
        em3.displayinfo();
    }
}
