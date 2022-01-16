public class Trial  implements Cloneable{
    public static final int PASS_MARK = 120;
    private String account;
    private int mark1;
    private int mark2;

    public Trial() {
    }

    public Trial(String account, int mark1, int mark2) {
        this.account = account;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public int getMark1() {
        return mark1;
    }
    public int getMark2() {
        return mark2;
    }
    public String getAccount() {
        return account;
    }
    public void clearMarks(){
        mark1 = 0;
        mark2 = 0;
    }

    protected int result() {
        return mark1 + mark2;
    }
    public boolean isPassed() {
        return result() >= PASS_MARK;
    }

    public double average(){
        return (double)(mark1 + mark2) / 2;
    }

    public final int getSum(){
        return mark1 + mark2;
    }

    @Override
    public String toString() {
        return String.format("%s;%d;%d;%b",
                account, mark1, mark2, isPassed());
    }

    @Override
    public Trial clone(){
        Trial clonedObject = null;
        try {
            clonedObject = (Trial) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupported");
        }
        return clonedObject;
    }
}
