package week5.class_problems;

import java.util.Arrays;

public class PlaceRank implements Comparable<PlaceRank> {

    String name;
    double cgpa;
    int codingScore;

    public PlaceRank(
            String name,
            double cgpa,
            int codingScore) {

        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    static boolean isEligible(double cgpa) {

        return cgpa >= 8.0;
    }

    static boolean isEligible(
            double cgpa,
            int codingScore) {

        return cgpa >= 6.5 && codingScore >= 60;
    }

    double getCompositeScore() {

        return cgpa * 10 + codingScore * 0.5;
    }

    @Override
    public int compareTo(PlaceRank other) {

        return Double.compare(
                other.getCompositeScore(),
                this.getCompositeScore()
        );
    }

    static String shortlistAndRank(
            PlaceRank[] candidates) {

        PlaceRank[] temp =
                new PlaceRank[candidates.length];

        int count = 0;

        for (PlaceRank candidate : candidates) {

            if (isEligible(candidate.cgpa) ||
                    isEligible(
                            candidate.cgpa,
                            candidate.codingScore)) {

                temp[count] = candidate;
                count++;
            }
        }

        PlaceRank[] shortlisted =
                Arrays.copyOf(temp, count);

        Arrays.sort(shortlisted);

        String result = "";

        for (int i = 0; i < shortlisted.length; i++) {

            result += (i + 1) + ". " +
                    shortlisted[i].name +
                    " (" +
                    shortlisted[i].getCompositeScore() +
                    ")";

            if (i < shortlisted.length - 1) {
                result += " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        PlaceRank[] candidates = {

                new PlaceRank(
                        "Aisha", 8.2, 40),

                new PlaceRank(
                        "Rohit", 6.8, 65),

                new PlaceRank(
                        "Meena", 6.0, 90),

                new PlaceRank(
                        "Karan", 7.5, 20)
        };

        System.out.println(
                shortlistAndRank(candidates)
        );
    }
}