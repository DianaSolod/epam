public class Utils {
    public static void printTrials(Trial[] trials) {
        for (Trial trial : trials) {
            System.out.println(trial);
        }
    }

    public static void badTrials(Trial[] trials){
        System.out.printf("Trials with average value of marks less then %s: %n",Trial.PASS_MARK/2);
        for (Trial trial : trials) {
            if (trial.average() < Trial.PASS_MARK / 2){
                System.out.println(trial);
            }
        }
    }
    
    public static void clearFailedTrials(Trial[] trials){
        for (Trial trial : trials) {
            if(!trial.isPassed()){
                trial.clearMarks();
            }
        }
    }

    public static void lineArgumentTrials(String[]args, Trial[]trials){
        if (args.length >= 3) {
            Trial newTrial = new Trial(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            for (String arg : args) {
                System.out.printf("Trials of %s: %n", arg);
                for (Trial trial : trials) {
                    if (newTrial.equals(trial)) {
                        System.out.println(trial);
                    }
                }
            }
        }
    }
}
