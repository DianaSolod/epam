public class StrongTrial extends Trial {
    private static final int MARK1_COEFF = 2;
    public StrongTrial() {
    }
    public StrongTrial(String account, int mark1, int mark2) {
        super(account, mark1, mark2);
    }

    protected int result() {
        return getMark1() / MARK1_COEFF + getMark2();
    }
}
