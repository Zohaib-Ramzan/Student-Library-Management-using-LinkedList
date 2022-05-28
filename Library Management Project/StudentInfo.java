
public class StudentInfo {
    String name,fname,reg_no,uid ;
    int sem ;
    
    public void setdata (String name, String fname, String reg_no,String uid,int sem)
    {
        this.name = name ;
        this.fname = fname ;
        this.reg_no = reg_no;
        this.uid = uid ;
        this.sem = sem;
        
    }
    
    public void getdata (){
        System.out.println("Student name : " +name) ;
        System.out.println("Father name : " +fname) ;
        System.out.println("Registiration No. : " +reg_no);
        System.out.println("User ID : " +uid) ;
        System.out.println("Semester No. : " +sem);
        
    }
}
