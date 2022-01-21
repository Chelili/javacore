public class Member {

    private String name;
    private int heightofJump;
    private boolean isWinner = false;

    public Member(String name, int heightofJump) {
        this.name = name;
        this.heightofJump = heightofJump;
    }

       @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", heightofJump=" + heightofJump +
                '}';
    }

    public String getName() {
        return name;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeightofJump() {
        return heightofJump;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }


    public void setHeightofJump(int heightofJump) {
        this.heightofJump = heightofJump;
    }

}
