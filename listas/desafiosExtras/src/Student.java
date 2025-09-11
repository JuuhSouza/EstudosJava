public class Student {
    public String name;
    public double notice;

    public Student(String name, double notice) {
        this.name = name;
        this.notice = notice;
    }

    public double getNotice(){
        return notice / 3;
    }

    public String toString(){
        return "Nome " + name + " Nota " + notice;
    }

}
