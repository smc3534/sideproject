package hello.core.member;

public class Member {

    private Long id;
    private String name;
    private grade grade;

    public Member(Long id, String name, hello.core.member.grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public hello.core.member.grade getGrade() {
        return grade;
    }

    public void setGrade(hello.core.member.grade grade) {
        this.grade = grade;
    }
}

