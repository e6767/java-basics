public class SunnyDays {
    public static void main(String[] args) {
        int N;
        char[] weather = {'P', 'S', 'P', 'S', 'S', 'P', 'P', 'S'};
        int maxConsecutive = maxConsecutiveSunnyDays(weather);
        for (int i = 0; i < weather.length; i++) {
            int newMax = 0;
            if (weather[i] == 'P') {
                if (i == 0) {
                    if (weather[i + 1] == 'S') {
                        weather[i] = 'S';
                        System.out.println(weather);
                        newMax = maxConsecutiveSunnyDays(weather);
                        if (newMax > maxConsecutive) {
                            maxConsecutive = newMax;
                        }
                        weather[i] = 'P';
                    }
                }
                if (i > 0) {
                    if (weather[i - 1] == 'S' || weather[i + 1] == 'S') {
                        weather[i] = 'S';
                        System.out.println(weather);
                        newMax = maxConsecutiveSunnyDays(weather);
                        if (newMax > maxConsecutive) {
                            maxConsecutive = newMax;
                        }
                        weather[i] = 'P';
                    }

                }
            }
        }
        System.out.println(weather);
        System.out.println(maxConsecutive);
    }

    public static int maxConsecutiveSunnyDays(char[] weather) {
        int max = 0;
        for (int i = 0; i < weather.length; i++) {
            int consecutive = 0;
            if (weather[i] == 'S') {
                consecutive++;
                if (consecutive > max) {
                    max = consecutive;
                }
                for (int j = i + 1; j < weather.length; j++) {
                    if (weather[j] == 'P') {
                        break;
                    }
                    consecutive++;
                    if (consecutive > max) {
                        max = consecutive;

                    }
                }
            }
        }
        return max;
    }
}
