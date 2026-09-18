package week5.assigment_problems;

import java.util.Arrays;

public class DraftRank implements Comparable<DraftRank> {

    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;

    public DraftRank(
            String name,
            int matchesPlayed,
            double battingAverage,
            boolean injured) {

        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    static boolean isDraftable(int matchesPlayed) {

        return matchesPlayed >= 10;
    }

    static boolean isDraftable(
            int matchesPlayed,
            boolean injured) {

        return matchesPlayed >= 5 && !injured;
    }

    @Override
    public int compareTo(DraftRank other) {

        return Double.compare(
                other.battingAverage,
                this.battingAverage
        );
    }

    static String draftAndRank(DraftRank[] players) {

        DraftRank[] temp = new DraftRank[players.length];

        int count = 0;

        for (DraftRank player : players) {

            if (isDraftable(player.matchesPlayed) ||
                    isDraftable(
                            player.matchesPlayed,
                            player.injured)) {

                temp[count] = player;
                count++;
            }
        }

        DraftRank[] draftable =
                Arrays.copyOf(temp, count);

        Arrays.sort(draftable);

        String result = "";

        for (int i = 0; i < draftable.length; i++) {

            result += (i + 1) + ". " +
                    draftable[i].name;

            if (i < draftable.length - 1) {
                result += " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        DraftRank[] players = {

                new DraftRank(
                        "Virat", 15, 48.0, false),

                new DraftRank(
                        "Rahul", 7, 55.0, false),

                new DraftRank(
                        "Sameer", 3, 60.0, false),

                new DraftRank(
                        "Dev", 12, 20.0, true)
        };

        System.out.println(
                draftAndRank(players)
        );
    }
}