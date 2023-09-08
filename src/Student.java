public class Student {
    String name;
    int age;
    double[] score;

    public Student(String name, int age, double[] score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double[] score) {
        this.score = score;
    }

    public double calcAvg() {
        double[] scores = this.score;
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Hieu", 18, new double[]{1, 5, 5.6});
        Student student2 = new Student("Trung", 69, new double[]{10, 9.8, 8.6});
        if (student1.calcAvg() > student2.calcAvg()) {
            System.out.println("Student1");
        } else System.out.println("Student2");
    }
}
