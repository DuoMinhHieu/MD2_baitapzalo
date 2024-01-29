package studentmanager;

public class StudentManager {
    private Student[] students = new Student[100];
    private int count = 0;

    public StudentManager(){
        students[count++] = new Student(1, "haha", 18, "hahaaaa");
        students[count++] = new Student(2, "huhu", 19, "huhuuuu");
        students[count++] = new Student(3, "hihi", 20, "hihiiii");
        students[count++] = new Student(4, "hehe", 21, "heheeee");

    }
    public void addStudent(Student student){
        if (count < students.length){
            students[count] = student;
            count++;
        }
        else {
            System.out.println("qua so luong danh sach");
        }
    }

    public void displayStudent(){
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

    public void deleteStudent(int id){
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id){
                for (int j = i; j < count -1; j++) {
                  students[j] = students[i+1];
                }
                count--;
                System.out.println("da xoa thanh cong");
                return;
            }
        }
        System.out.println("khong tim duoc id");
    }

    public void updateStudent(int id, Student updateStudent){
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                students[i] = updateStudent;
                System.out.println("cap nhat thong tin thanh cong");
                return;
            }
        }
        System.out.println("id khong ton tai");
    }

    public void searchStudentbyname(String name){
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getName().equalsIgnoreCase(name)){
                System.out.println(students[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("khong tim thay: " + name);
    }
}
