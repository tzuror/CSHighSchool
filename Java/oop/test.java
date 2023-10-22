package oop;
public class test {

    public static void main(String[] args) {
        Student or = new Student("or", 215963257, new Date(3, 1, 2007));
        System.out.println(or);
        Grade a = new Grade("a", 1);
        Grade b = new Grade("b", 2);
        Grade c = new Grade("c", 3);
        Grade d = new Grade("d", 4);
        Grade e = new Grade("e", 5);
        Grade f = new Grade("f", 6);
        Grade g = new Grade("g", 7);
        or.addGrade(a);
        or.addGrade(b);
        or.addGrade(c);
        or.addGrade(d);
        or.addGrade(e);
        or.addGrade(f);
        or.addGrade(g);
        or.addGrade("h", 8);
        or.delGrade("e");
        or.setGrade("g", 90);
        System.out.println(or.getAvarage());
        System.out.println(or);
    }
}
