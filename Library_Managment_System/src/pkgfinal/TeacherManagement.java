

package pkgfinal;
import java.io.*;

public class TeacherManagement {
    Teacher teachers[] = new Teacher[10];
    int size =0;
    void insertTeacher(Teacher t) throws IOException{
        teachers[size] = t;
        size++;
        try{
            FileReader fr = new FileReader("teachers.txt");
        }
        catch(Exception e){
            PrintWriter pw = new PrintWriter("teachers.txt");
            pw.close();
        }
        FileWriter fw = new FileWriter("teachers.txt", true);
        fw.write("Name: "+t.getName()+"\n");
        fw.write("Id: "+t.getTeacherId()+"\n");
        fw.close();
    }
    Teacher getTeacher(int teacherId){
        String tId = teacherId+"";
        for(int i=0;i<size;i++){
            if(teachers[i].getTeacherId().equals(null))
                continue;
            if(teachers[i].getTeacherId().equals(tId))
                return teachers[i];
        }
        System.out.println("Teacher does not exists");
        return null;
    }
    void showAllTeachers(){
        for(int i=0;i<size;i++){
            if(teachers[i].equals(null))
                continue;
            teachers[i].showInfo();
        }
    }
}