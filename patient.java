import java.util.Scanner;


abstract class staff{
    private String s_name;
    public int staff_id;
    private String dob;
    private String gender;
    private String address;
    private String phone_no;
    private String joined;
    private String education;
    public String blood_group;
    private int salary;
    public String designation;
    public String avail;
    staff(String a,String b,String c,String d,String e,String f,String g,String h,String i){
        s_name=a;
        dob=b;
        gender=c;
        designation=d;
        phone_no=e;
        address=f;
        joined=g;
        education=h;
        blood_group=i;
        setavail();
    }
    void setavail(){
        System.out.print("Enter the availability: ");
        Scanner s = new Scanner(System.in);
        avail=s.next();
    }
    void display(){
        System.out.println("Name: "+s_name);
        System.out.println("Phone No.: "+phone_no);
        System.out.println("Availability: "+avail);
    }
    int getid(){
        return staff_id;
    }
    void setsal(int sal){
        salary=sal;
    }
    String getavail(){
        return avail;
    }
    int chechavail(){
        if(getavail()=="Yes"){
            return 1;
        }
        else{
            return 0;
        }
    }
    void update(){
        System.out.println("Update ?");
        System.out.println("1.Name\n2.DOB\3.Gender\n4.Address\n5.Phone Number\n6.Date of joining\n7.Education\n8.Blood Group");
        System.out.print("Enter your choice to update data: ");
        Scanner s = new Scanner(System.in);
        int c=s.nextInt();
        switch(c){
            case 1:
                System.out.print("Enter Name:");
                String m=s.next();
                s_name=m;
                System.out.println("Name has been updated.");
                break;
            case 2:
                System.out.print("Enter DOB:");
                m=s.next();
                dob=m;
                System.out.println("DOB has been updated.");
                break;
            case 3:
                System.out.print("Enter Gender:");
                m=s.next();
                gender=m;
                System.out.println("Gender has been updated.");
                break;
            case 4:
                System.out.print("Enter Address:");
                m=s.next();
                address=m;
                System.out.println("Address has been updated.");
                break;
            case 5:
                System.out.print("Enter Phone number:");
                String x=s.next();
                phone_no=x;
                System.out.println("Phone number has been updated.");
                break;
            case 6:
                System.out.print("Enter Date of joining:");
                m=s.next();
                joined=m;
                System.out.println("Date of joining has been updated.");
                break;
            case 7:
                System.out.print("Enter Education:");
                m=s.next();
                education=m;
                System.out.println("Education has been updated.");
                break;
            case 8:
                System.out.print("Enter Blood group:");
                m=s.next();
                blood_group=m;
                System.out.println("Blood group has been updated.");
                break;
            default:
                System.out.println("Sorry invalid input.");
                break;
        }

    }
}
class doctor extends staff{
    public static int x=0;
    doctor(String a,String b,String c,String d,String e,String f,String g,String h,String i){
        super(a,b,c,d,e,f,g,h,i);
        designation="Doctor";
        setsal(95000);
        System.out.print("Enter ID:");
        Scanner s = new Scanner(System.in);
        staff_id=s.nextInt();
        x=x+1;
    }

}
class nurse extends staff{
    public static int x=0;
    nurse(String a,String b,String c,String d,String e,String f,String g,String h,String i){
        super(a,b,c,d,e,f,g,h,i);
        designation="Nurse";
        setsal(80000);
        System.out.print("Enter ID:");
        Scanner s = new Scanner(System.in);
        staff_id=s.nextInt();
        x=x+1;
    }

}
class surgeon extends staff{
    public static int x=0;
    surgeon(String a,String b,String c,String d,String e,String f,String g,String h,String i){
        super(a,b,c,d,e,f,g,h,i);
        designation="Surgeon";
        setsal(100000);
        System.out.print("Enter ID:");
        Scanner s = new Scanner(System.in);
        staff_id=s.nextInt();
        x=x+1;
    }

}
class receptionist extends staff{
    public static int x=0;
    receptionist(String a,String b,String c,String d,String e,String f,String g,String h,String i){
        super(a,b,c,d,e,f,g,h,i);
        designation="Receptionist";
        setsal(75000);
        System.out.print("Enter ID:");
        Scanner s = new Scanner(System.in);
        staff_id=s.nextInt();
        x=x+1;
    }

}
class pharmacist extends staff{
    public static int x=0;
    pharmacist(String a,String b,String c,String d,String e,String f,String g,String h,String i){
        super(a,b,c,d,e,f,g,h,i);
        designation="Pharmacist";
        setsal(80000);
        System.out.print("Enter ID:");
        Scanner s = new Scanner(System.in);
        staff_id=s.nextInt();
        x=x+1;
    }

}
class nonmed extends staff{
    public static int x=0;
    nonmed(String a,String b,String c,String d,String e,String f,String g,String h,String i){
        super(a,b,c,d,e,f,g,h,i);
        designation="Non-Medical";
        setsal(60000);
        System.out.print("Enter ID:");
        Scanner s = new Scanner(System.in);
        staff_id=s.nextInt();
        x=x+1;
    }

}


interface app{
    void ap();
}


class Patients {

Scanner s=new Scanner(System.in);
   String pname;
   int pid;
   String gender;
   int age;
   String sickness;
   String medicalhistory;
   String bloodgroup;

   
   int getid(){
    return pid;
   }
   
   void getdata(){
    System.out.print("Enter patient Name: ");
      pname=s.next();
      System.out.print("Enter patient ID: ");
      pid=s.nextInt();
      System.out.print("Enter gender: ");
      gender=s.next();
      
      updateage();
      updatesickness();
      updatemedicalhistory();
      System.out.print("Enter patient blood group: ");
      bloodgroup=s.next();
   }

   void display()
   {
    System.out.println("Patient Name: "+pname);
    System.out.println("Patient ID: "+pid);
    System.out.println("Gender: "+gender);
    System.out.println("Age: "+age);
    System.out.println("Sickness: "+sickness);
    System.out.println("Medical history: "+medicalhistory);
   }

   void updatesickness(){
    System.out.print("Enter patient sickness: ");
    sickness=s.next();
   }
   void updatemedicalhistory(){
    System.out.print("Enter patient medical history: ");
    medicalhistory=s.next();
   }
   void updateage(){
    System.out.print("Enter patient age: ");
    age=s.nextInt();
   }
}
class Admission extends Patients implements ward,app{
    String admissiondate;
    String timeOfAppointment;
    String appointmentdate;
    String dischargedate;
    int wardno;
    int docid;
    Scanner s = new Scanner(System.in);
    void getadd(){
        this.getdata();
        
        System.out.print("Enter patient admission: ");
        admissiondate=s.next();
        System.out.print("Enter patient discharge date: ");
        dischargedate=s.next();
        System.out.print("Enter patient ward number: ");
        wardno=s.nextInt();
    }

    void updateward(){
        System.out.print("Enter ward number: ");
        Scanner s = new Scanner(System.in);
        wardno=s.nextInt();
    }

    void updatedischarge(){
        System.out.print("Enter discharge date: ");
        Scanner s = new Scanner(System.in);
        dischargedate=s.next();
    }

   void getadmisreport(){
    System.out.println("Admission date: "+admissiondate);
    System.out.println("Discharge date: "+dischargedate);
    System.out.println("Ward No.: "+wardno);
   }
   void update(){
    System.out.println("Update ?");
    System.out.println("1.Age\n2.Medical History\n3.Sickness\n4.Discharge date\n5.Ward number");
    System.out.print("Enter your choice to update data: ");
    Scanner s = new Scanner(System.in);
    int c=s.nextInt();
    switch(c){
        case 1:
            System.out.print("Enter Age:");
            this.age=s.nextInt();
            System.out.println("Age has been updated.");
            break;
        case 2:
            System.out.print("Enter Medical history:");
            this.medicalhistory=s.next();
            System.out.println("Medical history has been updated.");
            break;
        case 3:
            System.out.print("Enter Sickness:");
            this.sickness=s.next();
            System.out.println("Sickness has been updated.");
            break;
        case 4:
            updatedischarge();
            System.out.println("Discharge date has been updated.");
            break;
        case 5:
            updateward();
            System.out.println("Ward number has been updated.");
            break;
        default:
            System.out.println("Sorry invalid input.");
            break;
    }

}

    public void ap(){
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the hospital appointment system!");

        System.out.println("Please enter the reason for the appointment:");
        sickness = in.next();

        System.out.println("Please enter the date of your appointment (dd/mm/yyyy):");
        appointmentdate = in.next();

        System.out.println("Please enter the time of your appointment (hh:mm am/pm):");
        timeOfAppointment = in.next();

        System.out.println("Please enter the doctor's Id:");
        docid = in.nextInt();

        System.out.println("Your appointment has been booked.");
    }
    void showapp(){
        System.out.println("Your appointment details are:");
        System.out.println("Name: " + pname);
        System.out.println("Reason for Appointment: " + sickness);
        System.out.println("Date of Appointment: " + appointmentdate);
        System.out.println("Time of Appointment: " + timeOfAppointment);
        System.out.println("Doctor's ID: " + docid);

    }
}

interface ward{
    int [] ward = new int [5];
    int [] nurse = new  int [5];
}

class consulting extends Patients {
    String prescription;
    void prescribe(){
        System.out.print("Enter medicine name:");//prescription
    }
}


class oper
{
	int surgeon_id,p_id,s;
	String date,time;
	double cost;
	oper(int sid,int pid,String d,String t,int stat)
	{
		surgeon_id=sid;
		p_id=pid;
		date=d;
		time=t;
		s=stat;
	}
	int setsid()
	{
		return surgeon_id;
	}
	int setpid()
	{
		return p_id;
	}
	String setdate()
	{
		return date;
	}
	String settime()
	{
		return time;
	}
	double setcost()
	{
		return cost;
	}
	void display()
	{
		System.out.println("Surgeon id : "+setsid());
		System.out.println("Patient id : "+setpid());
		System.out.println("operation date : "+setdate());
		System.out.println("operation time : "+settime());
	}
	void status()
	{
		if(s==0)
		{
			System.out.println("Operation going on...");
		}
		else
		{
			System.out.println("Theatre is free..");
		}
	}
}

class functions{
    void patientmanage(){
        int p=0;
        Admission[] pat = new Admission[10];
        System.out.println("Patient Management System:");
        int ct=0;
        while(ct!=8){
            System.out.println("1.Enter new entry\n2.View patient details\n3.Display Admission report\n4.View all patients info\n5.Update Data\n6.Create Appointment\n7.Check operations\n8.Exit");
            System.out.print("Enter your choice: ");
            Scanner s = new Scanner(System.in);
            int l=s.nextInt();
            switch(l){
                case 1:
                    pat[p]=new Admission();
                    pat[p].getadd();
                    p+=1;
                    break;
                case 2:
                    int g=0;
                    System.out.print("Enter patient ID: ");
                    int y=s.nextInt();
                    for(int x=0;x<p;x++){
                        if(pat[x].getid()==y){
                            pat[x].display();
                            g=1;
                            break;
                        }
                    }
                    if(g==0){
                        System.out.println("Sorry this patient doesn't exist.");
                    }
                    break;
                case 3:
                    g=0;
                    System.out.print("Enter patient ID: ");
                    y=s.nextInt();
                    for(int x=0;x<p;x++){
                        if(pat[x].getid()==y){
                            pat[x].getadmisreport();
                            g=1;
                            break;
                        }
                    }
                    if(g==0){
                        System.out.println("Sorry this patient doesn't exist.");
                    }
                    break;
                case 4:
                    System.out.println("Patients:\n");
                    for(int x=0;x<p;x++){
                        pat[x].display();
                        System.out.println("\n");
                    }
                    break;
                case 5:
                    g=0;
                    System.out.print("Enter patient ID: ");
                    y=s.nextInt();
                    for(int x=0;x<p;x++){
                        if(pat[x].getid()==y){
                            pat[x].update();
                            g=1;
                            break;
                        }
                    }
                    if(g==0){
                        System.out.println("Sorry this patient doesn't exist.");
                    }
                    break;
                case 6:
                    g=0;
                    System.out.print("Enter patient ID: ");
                    y=s.nextInt();
                    for(int x=0;x<p;x++){
                        if(pat[x].getid()==y){
                            pat[x].ap();
                            pat[x].showapp();
                            g=1;
                            break;
                        }
                    }
                    if(g==0){
                        System.out.println("Sorry this patient doesn't exist.");
                    }
                    break;
                case 7:
                    oper[] o=new oper[3];
                    o[0]=new oper(1,1,"05-01-2023","18:00:00",0);
                    o[1]=new oper(1,2,"04-01-2023","19:00:00",1);
                    o[2]=new oper(2,1,"05-01-2023","18:00:00",0);
                    System.out.println("Surgeon_ID\tPatient_ID\tDate\tTime\tStatus");
                    for(int op=0;op<3;op++){
                        System.out.println(o[op].surgeon_id+"\t"+o[op].p_id+"\t"+o[op].date+"\t"+o[op].time+"\t"+o[op].s);
                    }
                    break;
                case 8:
                    System.out.println("Exiting...");
                    ct=8;
                    break;
                }
                    
            }
    }
    void staffmanage(){
        int dn=0,nn=0,sn=0,rn=0,pn=0,nmn=0;
        doctor[] doc = new doctor[10];
        nurse[] nur = new nurse[10];
        surgeon[] sur = new surgeon[10];
        receptionist[] rep = new receptionist[10];
        pharmacist[] pha = new pharmacist[10];
        nonmed[] nme = new nonmed[10];
        System.out.println("Staff Management System:");
        int ct=0;
        while(ct!=6){
            System.out.println("1.Enter new entry\n2.View entry\n3.View entries\n4.View all entries\n5.Update Data\n6.Exit");
            System.out.print("Enter your choice: ");
            Scanner s = new Scanner(System.in);
            int l=s.nextInt();
            switch(l){
                case 1:
                    System.out.print("Enter Name: ");
                    String a=s.next();
                    System.out.print("Enter DOB: ");
                    String b=s.next();
                    System.out.print("Enter Gender: ");
                    String c=s.next();
                    System.out.print("Enter Address: ");
                    String d=s.next();
                    System.out.print("Enter Phone number: ");
                    String e=s.next();
                    System.out.print("Enter Date of joining: ");
                    String f=s.next();
                    System.out.print("Enter Education: ");
                    String g=s.next();
                    System.out.print("Enter Blood group: ");
                    String h=s.next();
                    System.out.println("Designation ? ");
                    System.out.print("1.Doctor\n2.Nurse\n3.Surgeon\n4.Receptionist\n5.Pharmacist\n6.Non-medical\nEnter designation number: ");
                    int i = s.nextInt();
                    String j;
                    if(i==1){
                            j="Doctor";
                            doc[dn]=new doctor(a, b, c, d, e, f, g, h, j);
                            dn=dn+1;
                    }
                    else if(i==2){
                            j="Nurse";
                            nur[nn]=new nurse(a, b, c, d, e, f, g, h, j);
                            nn=nn+1;
                    }
                    else if(i==3){
                            j="Surgeon";
                            sur[sn]=new surgeon(a, b, c, d, e, f, g, h, j);
                            sn=sn+1;
                    }
                    else if(i==4){
                            j="Receptionist";
                            rep[rn]=new receptionist(a, b, c, d, e, f, g, h, j);
                            rn=rn+1;
                    }
                    else if(i==5){
                            j="Pharmacist";
                            pha[pn]=new pharmacist(a, b, c, d, e, f, g, h, j);
                            pn=pn+1;
                    }
                    else if(i==6){
                            j="Non-medical";
                            nme[nmn]=new nonmed(a, b, c, d, e, f, g, h, j);
                            nmn=nmn+1;
                    }
                    else{
                            System.out.println("Invalid entry. Try again next time.");
                    }
                    break;
                case 2:
                    int y=0;
                    System.out.print("1.Doctor\n2.Nurse\n3.Surgeon\n4.Receptionist\n5.Pharmacist\n6.Non-medical\nEnter the designation: ");
                    int desig;
                    desig=s.nextInt();
                    System.out.print("Enter the id: ");
                    int na=s.nextInt();
                    if(desig==1){
                            for(int x=0;x<dn;x++){
                                if(doc[x].getid()==na){
                                    doc[x].display();
                                    y=1;
                                    break;
                                }
                            }
                            if(y==0){
                                System.out.println("Sorry this doctor doesn't exist.");
                            }
                    }
                    else if(desig==2){
                            for(int x=0;x<nn;x++){
                                if(nur[x].getid()==na){
                                    nur[x].display();
                                    y=1;
                                }
                            }
                            if(y==0){
                                System.out.println("Sorry this nurse doesn't exist.");
                            }
                    }
                    else if(desig==3){
                            for(int x=0;x<sn;x++){
                                if(sur[x].getid()==na){
                                    sur[x].display();
                                    y=1;
                                }
                            }
                            if(y==0){
                                System.out.println("Sorry this surgeon doesn't exist.");
                            }
                    }
                    else if(desig==4){
                            for(int x=0;x<rn;x++){
                                if(rep[x].getid()==na){
                                    rep[x].display();
                                    y=1;
                                }
                            }
                            if(y==0){
                                System.out.println("Sorry this receptionist doesn't exist.");
                            }
                        }
                    else if(desig==5){
                            for(int x=0;x<pn;x++){
                                if(pha[x].getid()==na){
                                    pha[x].display();
                                    y=1;
                                }
                            }
                            if(y==0){
                                System.out.println("Sorry this pharmacist doesn't exist.");
                            }
                        }
                    else if(desig==6){
                            for(int x=0;x<nmn;x++){
                                if(nme[x].getid()==na){
                                    nme[x].display();
                                    y=1;
                                }
                            }
                            if(y==0){
                                System.out.println("Sorry this non-medical doesn't exist.");
                            }
                    }
                    break;
                case 3:
                    y=0;
                    System.out.print("1.Doctor\n2.Nurse\n3.Surgeon\n4.Receptionist\n5.Pharmacist\n6.Non-medical\nEnter the designation: ");
                    desig=s.nextInt();
                    if(desig==1){
                            for(int x=0;x<dn;x++){
                                    doc[x].display();
                                    y=1;
                                }
                            
                            if(y==0){
                                System.out.println("Sorry this doctor doesn't exist.");
                            }
                    }
                    else if(desig==2){
                            for(int x=0;x<nn;x++){
                                    nur[x].display();
                                    y=1;
                            }
                            if(y==0){
                                System.out.println("Sorry this nurse doesn't exist.");
                            }
                        }
                    else if(desig==3){
                            for(int x=0;x<sn;x++){
                                    sur[x].display();
                                    y=1;
                            }
                            if(y==0){
                                System.out.println("Sorry this surgeon doesn't exist.");
                            }
                        }
                    else if(desig==4){
                            for(int x=0;x<rn;x++){
                                    rep[x].display();
                                    y=1;
                            }
                            if(y==0){
                                System.out.println("Sorry this receptionist doesn't exist.");
                            }
                        }
                    else if(desig==5){
                            for(int x=0;x<pn;x++){
                                    pha[x].display();
                                    y=1;
                                
                            }
                            if(y==0){
                                System.out.println("Sorry this pharmacist doesn't exist.");
                            }
                        }
                    else if(desig==6){
                            for(int x=0;x<nmn;x++){
                                    nme[x].display();
                                    y=1;
                                
                            }
                            if(y==0){
                                System.out.println("Sorry this non-medical doesn't exist.");
                            }
                        }
                        break;
                case 4:
                    System.out.println("Doctors:");
                    for(int x=0;x<dn;x++){
                        doc[x].display();
                    }
                    System.out.println("Nurses:");
                    for(int x=0;x<nn;x++){
                        nur[x].display();
                    }
                    System.out.println("Surgeons:");
                    for(int x=0;x<sn;x++){
                        sur[x].display();
                    }
                    System.out.println("Receptionists:");
                    for(int x=0;x<rn;x++){
                        rep[x].display();
                    }
                    System.out.println("Pharmacists:");
                    for(int x=0;x<pn;x++){
                        pha[x].display();
                    }
                    System.out.println("Non-medical:");
                    for(int x=0;x<nmn;x++){
                        nme[x].display();
                    }
                    break;
                case 5:
                y=0;
                System.out.print("1.Doctor\n2.Nurse\n3.Surgeon\n4.Receptionist\n5.Pharmacist\n6.Non-medical\nEnter the designation: ");
                desig=s.nextInt();
                System.out.print("Enter the id: ");
                na=s.nextInt();
                if(desig==1){
                        for(int x=0;x<dn;x++){
                            if(doc[x].getid()==na){
                                doc[x].update();
                                y=1;
                            }
                        }
                        if(y==0){
                            System.out.println("Sorry this doctor doesn't exist.");
                        }
                }
                else if(desig==2){
                        for(int x=0;x<nn;x++){
                            if(nur[x].getid()==na){
                                nur[x].update();
                                y=1;
                            }
                        }
                        if(y==0){
                            System.out.println("Sorry this nurse doesn't exist.");
                        }
                }
                else if(desig==3){
                        for(int x=0;x<sn;x++){
                            if(sur[x].getid()==na){
                                sur[x].update();
                                y=1;
                            }
                        }
                        if(y==0){
                            System.out.println("Sorry this surgeon doesn't exist.");
                        }
                }
                else if(desig==4){
                        for(int x=0;x<rn;x++){
                            if(rep[x].getid()==na){
                                rep[x].update();
                                y=1;
                            }
                        }
                        if(y==0){
                            System.out.println("Sorry this receptionist doesn't exist.");
                        }
                    }
                else if(desig==5){
                        for(int x=0;x<pn;x++){
                            if(pha[x].getid()==na){
                                pha[x].update();
                                y=1;
                            }
                        }
                        if(y==0){
                            System.out.println("Sorry this pharmacist doesn't exist.");
                        }
                    }
                else if(desig==6){
                        for(int x=0;x<nmn;x++){
                            if(nme[x].getid()==na){
                                nme[x].update();
                                y=1;
                            }
                        }
                        if(y==0){
                            System.out.println("Sorry this non-medical doesn't exist.");
                        }
                }
                break;
                case 6:
                    System.out.println("Exiting...");
                    ct=6;
                    break;
                }
                    
            }
    }
}



public class patient{
    public static void main(String[] args) {
            functions f = new functions();
            int a=0;
            Scanner s = new Scanner(System.in);
            while(a!=3){
                System.out.println("**************************************************************\n");
                System.out.println("WELCOME TO HOSPITAL MANAGEMENT SYSTEM\n");
                System.out.println("**************************************************************\n");
                System.out.println("1. Patient Management\n2. Staff Management System\n3.Exit\nEnter choice:");
                a=s.nextInt();
                switch(a){
                    case 1:
                        f.patientmanage();
                        break;
                    case 2:
                        f.staffmanage();
                        break;
                    case 3:
                        System.out.println("\nThank you for using the HMS!\n");
                        a=3;
                        break;
                    default:
                        System.out.println("\nThank you for using the HMS!\n");
                        a=3;
                        break;
                }
            }
        }

    }
