package week6.class_problems;

public class Place {

    String studentName;
    String company;
    double packageLpa;

    Place(
            String studentName,
            String company,
            double packageLpa) {

        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    void printRecord() {

        System.out.println(
                studentName +
                        " -> " +
                        company +
                        " @ " +
                        packageLpa +
                        " LPA"
        );
    }

    public static void main(String[] args) {

        Place[] records = {

                new Place(
                        "Ravi",
                        "TCS",
                        4.5),

                new Place(
                        "Anitha",
                        "Zoho",
                        6.2),

                new Place(
                        "Karthik",
                        "Infosys",
                        4.0)
        };

        for (Place record : records) {
            record.printRecord();
        }
    }
}