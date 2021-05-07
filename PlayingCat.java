public class PlayingCat {

    //Creating a method
    public static boolean isCatPlaying(boolean summer, int temperature) {

        boolean playing = false;
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                playing = true;
            } else {
                playing = false;
            }
        } else {
            if (!summer) {
                if (temperature >= 25 && temperature <= 35) {
                    playing = true;
                }
            } else {
                playing = false;
            }
        }
        return playing;
    }
}
