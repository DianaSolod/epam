class Runner {
    public static void main(String[] args) {
        Trial[] trials = {
                new Trial("Sakovich", 45, 93),
                new Trial("Sergeev", 55, 50),
                new Trial("Stepanenko", 60, 90),
                new LiteTrial("Sergeev", 29, 95),
                new LiteTrial("Lis", 35, 68),
                new StrongTrial("Sakovich", 90, 90),
                new StrongTrial("Sergeev", 70, 57),
                new ExtraTrial("Stepanenko", 40, 50, 60),
                new ExtraTrial("Sakovich", 70, 51, 80)
        };
        Utils.printTrials(trials);
        System.out.println();
        Utils.badTrials(trials);
        System.out.println();
        Utils.printTrials(trials);
        System.out.println();
        Utils.lineArgumentTrials(args, trials);
    }
}
