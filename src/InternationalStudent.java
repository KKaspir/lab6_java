import java.util.List;

/* 1) Придумать для чего в вашем проекте нужен производный класс и создать его */
class InternationalStudent extends Student {
    private String country;

    public InternationalStudent(String firstName, String lastName, String dateOfBirth, String studentID, String email, List<Grade> grades, String country) {
        super(firstName, lastName, dateOfBirth, studentID, email, grades);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public void printStudent() {
        super.printStudent();
        System.out.println("Страна: " + country);
    }
}
