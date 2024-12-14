import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JavaCodeForAssignment {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/SMVITM"; // Update with your database name
        String username = "root"; // Update with your MySQL username
        String password = "";     // Update with your MySQL password

        // Example data (replace with actual user inputs)
        String academicYear = "2023-2024";
        String department = "CSE";
        String activityName = "Coding Workshop";
        String targetAudience = "Students";
        String activityDate = "2024-11-30";
        String activityTime = "10:00 AM";
        String venue = "Seminar Hall";
        String resourcePerson = "John Doe";
        int expenditureItem1 = 5000;
        int expenditureItem2 = 2000;
        int expenditureItem3 = 1000;
        String sponsoredBy = "TechCorp";
        int amountRequired = 3000;

        // SQL query
        String insertQuery = "INSERT INTO activities (academic_year, department, activity_name, target_audience, activity_date, activity_time, venue, resource_person, expenditure_item1, expenditure_item2, expenditure_item3, sponsored_by, amount_required) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            // Set parameters
            preparedStatement.setString(1, academicYear);
            preparedStatement.setString(2, department);
            preparedStatement.setString(3, activityName);
            preparedStatement.setString(4, targetAudience);
            preparedStatement.setString(5, activityDate);
            preparedStatement.setString(6, activityTime);
            preparedStatement.setString(7, venue);
            preparedStatement.setString(8, resourcePerson);
            preparedStatement.setInt(9, expenditureItem1);
            preparedStatement.setInt(10, expenditureItem2);
            preparedStatement.setInt(11, expenditureItem3);
            preparedStatement.setString(12, sponsoredBy);
            preparedStatement.setInt(13, amountRequired);

            // Execute the query
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data successfully inserted into the database.");
            }

        } catch (SQLException e) {
            System.out.println("Error while connecting to the database or inserting data: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
