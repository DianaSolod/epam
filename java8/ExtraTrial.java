public class ExtraTrial extends Trial{
    private static final int PASS_MARK3 = 40;
    private int mark3;

    public int getMark3(){
        return mark3;
    }

    public ExtraTrial(String account, int mark1, int mark2, int mark3){
        super(account, mark1, mark2);
        this.mark3 = mark3;
    }
    
    public boolean isPassed() {
        return super.isPassed() & mark3 >= PASS_MARK3 ;
    }

    public double average(){
        return (getMark1() + getMark2() + mark3) / 3.0;
    }

    public void clearMarks(){
        super.clearMarks();
        mark3 = 0;
    }

    @Override
    public String toString() {
        return String.format("%s;%d;%d;%d;%b",
                getAccount(), getMark1(), getMark2(), getMark3(), isPassed());
    }
}
