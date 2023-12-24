import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter maths grade: ");
        String a = scanner.next();
        System.out.print("Enter english grade: ");
        String b = scanner.next();
        System.out.print("Enter adp grade: ");
        String c = scanner.next();
        System.out.print("Enter pdsc grade: ");
        String d = scanner.next();
        System.out.print("Enter dpco grade: ");
        String e = scanner.next();
        System.out.print("Enter EG grade: ");
        String f = scanner.next();
        System.out.print("Enter aptitude grade: ");
        String g = scanner.next();

        int mark1, mark2, mark3, mark4, mark5, mark6, mark7;

        switch (a.toUpperCase()) {
            case "A+":
                mark1 = 9;
                break;
            case "A":
                mark1 = 8;
                break;
            case "B+":
                mark1 = 7;
                break;
            case "C":
                mark1 = 6;
                break;
            case "O":
                mark1 = 10;
                break;
            default:
                mark1 = 0;
        }

        switch (b.toUpperCase()) {
            case "A+":
                mark2 = 9;
                break;
            case "A":
                mark2 = 8;
                break;
            case "B+":
                mark2 = 7;
                break;
            case "C":
                mark2 = 6;
                break;
            case "O":
                mark2 = 10;
                break;
            default:
                mark2 = 0;
        }

        switch (c.toUpperCase()) {
            case "A+":
                mark3 = 9;
                break;
            case "A":
                mark3 = 8;
                break;
            case "B+":
                mark3 = 7;
                break;
            case "C":
                mark3 = 6;
                break;
            case "O":
                mark3 = 10;
                break;
            default:
                mark3 = 0;
        }

        switch (d.toUpperCase()) {
            case "A+":
                mark4 = 9;
                break;
            case "A":
                mark4 = 8;
                break;
            case "B+":
                mark4 = 7;
                break;
            case "C":
                mark4 = 6;
                break;
            case "O":
                mark4 = 10;
                break;
            default:
                mark4 = 0;
        }

        switch (e.toUpperCase()) {
            case "A+":
                mark5 = 9;
                break;
            case "A":
                mark5 = 8;
                break;
            case "B+":
                mark5 = 7;
                break;
            case "C":
                mark5 = 6;
                break;
            case "O":
                mark5 = 10;
                break;
            default:
                mark5 = 0;
        }

        switch (f.toUpperCase()) {
            case "A+":
                mark6 = 9;
                break;
            case "A":
                mark6 = 8;
                break;
            case "B+":
                mark6 = 7;
                break;
            case "C":
                mark6 = 6;
                break;
            case "O":
                mark6 = 10;
                break;
            default:
                mark6 = 0;
        }

        switch (g.toUpperCase()) {
            case "A+":
                mark7 = 9;
                break;
            case "A":
                mark7 = 8;
                break;
            case "B+":
                mark7 = 7;
                break;
            case "C":
                mark7 = 6;
                break;
            case "O":
                mark7 = 10;
                break;
            default:
                mark7 = 0;
        }

        int mc = 4, ec = 3, adpc = 4, pdscc = 3, dpcoc = 3, egc = 2, aptc = 1;

        int park1 = mark1 * mc;
        int park2 = mark2 * ec;
        int park3 = mark3 * adpc;
        int park4 = mark4 * pdscc;
        int park5 = mark5 * dpcoc;
        int park6 = mark6 * egc;
        int park7 = mark7 * aptc;

        System.out.println(park1 + park2 + park3 + park4 + park5 + park6 + park7);
        double gpa = (park1 + park2 + park3 + park4 + park5 + park6 + park7) / 20.0;
        System.out.println("Gpa for second yr = " + gpa);

        System.out.print("Enter 1st sem gpa: ");
        double l = scanner.nextDouble();
        System.out.println("CGPA= " + ((l * 24) + (gpa * 20)) / 44.0);
    }
}
