
package pkgfinal;

import java.util.Scanner;

public class Start{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        TeacherManagement tm = new TeacherManagement();
        BookManagement bm = new BookManagement();
        while(true){
        System.out.println("Choose an option: ");
        System.out.println("1. Student Management");
        System.out.println("2. Teacher Management");
        System.out.println("3. Book Management");
        System.out.println("4. Book Borrow/Return/Lost Management");
        System.out.println("5. Exit");
        try{
            int n = sc.nextInt();
            if(n==5){
                System.out.println("Thank You!");
                break;
            }
            if(n==1){
                System.out.println("Choose an option: \n1. Insert new student\n2. Search by student ID\n3. Show all student");
                int n1 = sc.nextInt();
                if(n1==1){
                    System.out.println("Insert Name");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Insert Id");
                    String id = sc.next();
                    System.out.println("Insert Guardian Name");
                    sc.nextLine();
                    String gname = sc.nextLine();
                    System.out.println("Insert Guardian Contact No");
                    String gcn = sc.next();
                    Student s1 = new Student();
                    s1.setName(name);
                    s1.setStudentId(id);
                    s1.setGuardianName(gname);
                    s1.setGuardianContactNo(gcn);
                    sm.insertStudent(s1);
                    System.out.println("Student added successfully");
                }
                else if(n1==2){
                    System.out.println("Insert Id");
                    int id = sc.nextInt();
                    Student s1 = sm.getStudent(id);
                    s1.showInfo();
                }
                else if(n1 == 3){
                    sm.showAllStudents();
                }
            }
            else if(n==2){
                System.out.println("Choose an option: \n1. Insert new teacher\n2. Search by teacher ID\n3. Show all teacher");
                int n2 = sc.nextInt();
                if(n2==1){
                    System.out.println("Insert Name");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Insert teacher Id");
                    String id = sc.next();
                    Teacher t = new Teacher();
                    t.setName(name);
                    t.setTeacherId(id);
                    tm.insertTeacher(t);
                    System.out.println("Teacher added successfully");
                }
                else if(n2==2){
                    System.out.println("Insert Id");
                    int id = sc.nextInt();
                    Teacher t1 = tm.getTeacher(id);
                    t1.showInfo();
                }
                else if(n2 ==3){
                    tm.showAllTeachers();
                }
            }
            else if(n==3){
                System.out.println("Choose an option: \n1. Insert new book\n2. Search by book ID\n3. Show all books");
                int n3 = sc.nextInt();
                if(n3==1){
                    System.out.println("Insert book id");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insert title");
                    String title = sc.nextLine();
                    System.out.println("Insert subtitle");
                    String subtitle = sc.nextLine();
                    System.out.println("Insert author");
                    String author = sc.nextLine();
                    System.out.println("Insert publisher");
                    String publisher = sc.nextLine();
                    Book b = new Book();
                    b.setBookId(id);
                    b.setTitle(title);
                    b.setSubTitle(subtitle);
                    Author auth = new Author();
                    auth.setName(author);
                    Publisher pub = new Publisher();
                    pub.setName(publisher);
                    b.setAuthor(auth);
                    b.setPublisher(pub);
                    bm.insertBook(b);
                    System.out.println("Book added successfully");
                }
                else if(n3==2){
                    System.out.println("Insert Id");
                    int id = sc.nextInt();
                    Book b1 = bm.getBook(id);
                    b1.showInfo();
                }
                else if(n3==3){
                    bm.showAllBooks();
                }
            }
            else if(n==4){
                System.out.println("Choose an option: \n1. Borrow book\n2. Return Book\n3. Add fine");
                int n4 = sc.nextInt();
                if(n4==1){
                    System.out.println("Insert book id to borrow book. Choose from list of books");
                    bm.showAllBooks();
                    int bid = sc.nextInt();
                    Book b1 = bm.getBook(bid);
                    System.out.println("Are you 1. student or 2.teacher?");
                    int type = sc.nextInt();
                    System.out.println("Insert your id");
                    int id = sc.nextInt();
                    if(type == 1){
                        Student s1 = sm.getStudent(id);
                        Book b = bm.getBook(bid);
                        s1.borrow(s1, b);
                    }
                    else if(type ==2){
                        Teacher t1 = tm.getTeacher(id);
                        Book b = bm.getBook(bid);
                        t1.borrow(t1, b);
                    }
                    System.out.println("Book borrowed successfully");
                }
                else if(n4==2){
                    System.out.println("Insert id of book you want to return");
                    int id2 = sc.nextInt();
                    System.out.println("Thanks for returing book");
                }
                else if(n4 ==3){
                    System.out.println("Are you 1. student or 2.teacher?");
                    int type = sc.nextInt();
                    System.out.println("Insert your id");
                    int id = sc.nextInt();
                    System.out.println("Insert fine amount");
                    double f = sc.nextDouble();
                    if(type == 1){
                        Student s1 = sm.getStudent(id);
                        s1.fine(s1, f);
                    }
                    else if(type ==2){
                        Teacher t1 = tm.getTeacher(id);
                        t1.fine(t1, f);
                    }
                }
            }
            else System.out.println("Wrong input");
        }
        catch(Exception e){
            System.out.println("Wrong input");
            break;
        }
        }
    }
}