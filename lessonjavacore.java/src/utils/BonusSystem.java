package utils;

public interface BonusSystem {

    void getBonus();

    default double getBonusBeforeNY() {
        return 15000;
    }

}
