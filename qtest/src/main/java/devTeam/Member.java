package devTeam;

public class Member {
    private String name;

    public String FullName(String first, String last) {
            String space = " ";
            return first + space + last;
    }

    public String printName() {
            System.out.println(name);
                    return name;
    }


}
