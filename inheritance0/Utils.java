public class Utils {
    public static void printTrials(Trial[] trials) {
        for (Trial trial : trials) {
            System.out.println(trial);
        }
    }

    public static void failedTrials(Trial[] trials){
        System.out.printf("Trials with average value of marks less then %s: %n",Trial.PASS_MARK/2);
        for (Trial trial : trials) {
            if (trial.average() < Trial.PASS_MARK / 2){
                System.out.println(trial);
                trial.clearMarks();
            }
        }
    }

    public static void lineArgumentTrials(String[]args, Trial[]trials){
        if (args.length > 0) {
            for (String arg : args) {
                System.out.printf("Trials of %s: %n", arg);
                for (Trial trial : trials) {
                    if (trial.getClass().equals(Trial.class) & trial.getName().equals(arg)) {
                        System.out.println(trial);
                    }
                }
            }
        }
    }
}
