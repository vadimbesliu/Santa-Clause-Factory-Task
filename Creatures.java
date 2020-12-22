package interview;
public class Creatures {
    private String creature;
    private Integer amount;

    Creatures(String creature, Integer amount) {
        this.amount = amount;
        this.creature = creature;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getCreatures() {
        return creature;
    }
}

