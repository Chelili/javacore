public class Main {
    public static void main(String[] args) {
        Member member1 = new Member ("Slava1",1245);
        Member member2 = new Member ("Slava2",150);
        Member member3 = new Member ("Slava3",180);
        Member member4 = new Member ("Slava4",30);

        Team team = new Team("Победа", member1, member2, member3, member4);
        Course course = new Course(10,155,180);

        course.doSport(team);
        team.info();
        System.out.println();
        team.winnersInfo();
    }
}
