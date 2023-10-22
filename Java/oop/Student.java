package oop;

public class Student {
    private String name;
    private int id;
    private Date birthdate;
    private Grade[] Grades;
    public Student(String name, int id, Date birthdate){
        this.name = name;
        this.id = id;
        this.birthdate = birthdate;
        this.Grades = new Grade[50];
    }
    public Student(String name, int id, Date birthdate, int gradesAmunt){
        this.name = name;
        this.id = id;
        this.birthdate = birthdate;
        this.Grades = new Grade[gradesAmunt];
    }
    public void addGrade(String subject, int number){
        for(int i = 0; i<this.Grades.length; i++){
            if(this.Grades[i] == null){
                this.Grades[i] = new Grade(subject, number);
                break;
            }
        }
    }
    public void addGrade(Grade g){
        for(int i = 0; i<this.Grades.length; i++){
            if(this.Grades[i] == null){
                this.Grades[i] = g;
                break;
            }
        }
    }
    public void delGrade(String subject){
        for(int i = 0; i<this.Grades.length; i++){
            if(this.Grades[i] != null){
                if(this.Grades[i].getSubject().equals(subject)){
                    this.Grades[i] = null;
                }
            }
        } 
    }
    public void setGrade(String subject, int number){
        for(int i = 0; i<this.Grades.length; i++){
            if (this.Grades[i] != null){
                if(this.Grades[i].getSubject().equals(subject)){
                    this.Grades[i].setNum(number);
                }
            }
        }
    }
    public int getGradeNumber(String subject){
        for(int i = 0; i<this.Grades.length; i++){
            if (this.Grades[i] != null){
                if(this.Grades[i].getSubject().equals(subject)){
                    return this.Grades[i].getNum();
                }
            }
        }
        return 0;
    }
    public double getAvarage(){
        int sum = 0;
        int NumberOfGrades = 0;
        for(int i = 0; i<this.Grades.length; i++){
            if (this.Grades[i] != null){
                sum += this.Grades[i].getNum();
                NumberOfGrades += 1;
            }
        }
        return ((double)sum)/NumberOfGrades;
    }
    public String toString(){
        String str = "Name: " + this.name + "\nID: " + this.id + "\nBirthDate: " + this.birthdate + "\nGrades: \n";
        for(int i = 0; i<this.Grades.length; i++){
            if (this.Grades[i] != null){
                str = str + this.Grades[i] + "\n";
            }
        }
        return str;
    }
}   
