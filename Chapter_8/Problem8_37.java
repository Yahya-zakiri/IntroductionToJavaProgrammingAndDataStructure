// Problem 8.37
// Guess the capitals (small demo list)
// Chapter_8

import java.util.Scanner;

public class Problem8_37 {
    public static void main(String[] args) {
        String[][] data = {
                { "Alabama", "Montgomery" }, { "Alaska", "Juneau" }, { "Arizona", "Phoenix" },
                { "Arkansas", "Little Rock" }, { "California", "Sacramento" }, { "Colorado", "Denver" },
                { "Connecticut", "Hartford" }, { "Delaware", "Dover" }, { "Florida", "Tallahassee" },
                { "Georgia", "Atlanta" }, { "Hawaii", "Honolulu" }, { "Idaho", "Boise" }, { "Illinois", "Springfield" },
                { "Indiana", "Indianapolis" }, { "Iowa", "Des Moines" }, { "Kansas", "Topeka" },
                { "Kentucky", "Frankfort" },
                { "Louisiana", "Baton Rouge" }, { "Maine", "Augusta" }, { "Maryland", "Annapolis" },
                { "Massachusetts", "Boston" },
                { "Michigan", "Lansing" }, { "Minnesota", "Saint Paul" }, { "Mississippi", "Jackson" },
                { "Missouri", "Jefferson City" },
                { "Montana", "Helena" }, { "Nebraska", "Lincoln" }, { "Nevada", "Carson City" },
                { "New Hampshire", "Concord" },
                { "New Jersey", "Trenton" }, { "New Mexico", "Santa Fe" }, { "New York", "Albany" },
                { "North Carolina", "Raleigh" },
                { "North Dakota", "Bismarck" }, { "Ohio", "Columbus" }, { "Oklahoma", "Oklahoma City" },
                { "Oregon", "Salem" },
                { "Pennsylvania", "Harrisburg" }, { "Rhode Island", "Providence" }, { "South Carolina", "Columbia" },
                { "South Dakota", "Pierre" },
                { "Tennessee", "Nashville" }, { "Texas", "Austin" }, { "Utah", "Salt Lake City" },
                { "Vermont", "Montpelier" },
                { "Virginia", "Richmond" }, { "Washington", "Olympia" }, { "West Virginia", "Charleston" },
                { "Wisconsin", "Madison" },
                { "Wyoming", "Cheyenne" }
        };
        Scanner in = new Scanner(System.in);
        int correct = 0;
        for (int i = 0; i < data.length; i++) {
            System.out.print("What is the capital of " + data[i][0] + "? ");
            String ans = in.nextLine().trim();
            if (ans.equalsIgnoreCase(data[i][1])) {
                System.out.println("Your answer is correct");
                correct++;
            } else
                System.out.println("The correct answer should be " + data[i][1]);
        }
        System.out.println("The correct count is " + correct);
        in.close();
    }
}
