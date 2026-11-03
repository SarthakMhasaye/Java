
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class Resume {

    public static void main(String[] args) {

        String inputDirectory = "resumes";
        String outputFile = "cleaned_resumes.txt";

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(outputFile))) {

            File folder = new File(inputDirectory);

            File[] files = folder.listFiles(
                    (dir, name) -> name.endsWith(".txt"));

            if (files == null || files.length == 0) {
                System.out.println("No resume files found.");
                return;
            }

            for (File file : files) {

                String content = Files.readString(file.toPath());

                // Extract Email
                Pattern emailPattern = Pattern.compile(
                        "[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}");
                Matcher emailMatcher = emailPattern.matcher(content);

                String email = emailMatcher.find()
                        ? emailMatcher.group()
                        : "Not Found";

                String name = "Not Found";
                for (String line : content.split("\\R")) {
                    if (!line.trim().isEmpty()) {
                        name = line.trim();
                        break;
                    }
                }
                List<String> skillKeywords = Arrays.asList(
                        "Java", "Python", "C++", "SQL",
                        "HTML", "CSS", "JavaScript", "Machine Learning"
                );

                List<String> skills = new ArrayList<>();

                for (String skill : skillKeywords) {
                    if (content.toLowerCase().contains(
                            skill.toLowerCase())) {
                        skills.add(skill);
                    }
                }

                String formattedResume =
                        "Name   : " + name + "\n" +
                        "Email  : " + email + "\n" +
                        "Skills : " + String.join(", ", skills) + "\n" +
                        "Source : " + file.getName() + "\n\n";

                writer.write(formattedResume);
            }

            System.out.println("Resumes processed successfully!");
            System.out.println("Output file: " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
