package week4.Day26;

import java.util.*;

public class QuizApp {

    static class Question {
        String question;
        String[] options;
        int correctIndex;
        String explanation;

        Question(String question, String[] options, int correctIndex, String explanation) {
            this.question = question;
            this.options = options;
            this.correctIndex = correctIndex;
            this.explanation = explanation;
        }
    }

    static List<Question> questions = new ArrayList<>();
    static int score = 0;
    static int current = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadQuestions();
        showWelcome();
        runQuiz();
        showResult();
    }

    static void loadQuestions() {
        questions.add(new Question(
            "What does OOP stand for?",
            new String[]{"Open Output Protocol", "Object-Oriented Programming", "Operator Overload Process", "Optional Object Pattern"},
            1, "OOP = Object-Oriented Programming — a paradigm using objects and classes."
        ));
        questions.add(new Question(
            "Which data structure uses LIFO order?",
            new String[]{"Queue", "Heap", "Linked List", "Stack"},
            3, "A Stack follows Last In, First Out (LIFO) — like a stack of plates."
        ));
        questions.add(new Question(
            "What is the time complexity of binary search?",
            new String[]{"O(n)", "O(n^2)", "O(1)", "O(log n)"},
            3, "Binary search halves the search space each step, giving O(log n)."
        ));
        questions.add(new Question(
            "Which keyword is used to create a class in Java?",
            new String[]{"define", "struct", "class", "object"},
            2, "'class' is the keyword used to declare a class in Java."
        ));
        questions.add(new Question(
            "What does RAM stand for?",
            new String[]{"Read-Access Memory", "Random Access Memory", "Runtime Allocated Memory", "Register Array Module"},
            1, "RAM = Random Access Memory — the main working memory of a computer."
        ));
        questions.add(new Question(
            "Which of these is NOT a Python built-in data type?",
            new String[]{"list", "tuple", "array", "dict"},
            2, "'array' is not a built-in Python type. Lists, tuples, and dicts are built-in."
        ));
        questions.add(new Question(
            "Which sorting algorithm has best average-case time complexity?",
            new String[]{"Bubble Sort", "Selection Sort", "Merge Sort", "Insertion Sort"},
            2, "Merge Sort guarantees O(n log n) in all cases — the best among these."
        ));
        questions.add(new Question(
            "What does SQL stand for?",
            new String[]{"Standard Queue Logic", "Structured Query Language", "Simple Question Library", "System Query Layer"},
            1, "SQL = Structured Query Language, used to manage relational databases."
        ));
        questions.add(new Question(
            "Which HTTP method is used to send data to a server?",
            new String[]{"GET", "DELETE", "POST", "PUT"},
            2, "POST sends data to a server to create or update a resource."
        ));
        questions.add(new Question(
            "In Java, which keyword prevents a variable from being changed?",
            new String[]{"static", "final", "const", "immutable"},
            1, "'final' makes a variable a constant — it cannot be reassigned after initialization."
        ));

        Collections.shuffle(questions);
    }

    static void showWelcome() {
        printLine();
        System.out.println("          CS QUIZ APPLICATION          ");
        printLine();
        System.out.println("  Total Questions : " + questions.size());
        System.out.println("  Each correct ans: +1 point");
        System.out.println("  Type A, B, C, or D to answer");
        printLine();
        System.out.print("  Press ENTER to start...");
        scanner.nextLine();
        System.out.println();
    }

    static void runQuiz() {
        char[] labels = {'A', 'B', 'C', 'D'};

        for (current = 0; current < questions.size(); current++) {
            Question q = questions.get(current);

            printLine();
            System.out.printf("  Q%d of %d   |   Score: %d/%d%n",
                current + 1, questions.size(), score, current);
            printProgressBar(current, questions.size());
            printLine();
            System.out.println();
            System.out.println("  " + q.question);
            System.out.println();

            for (int i = 0; i < q.options.length; i++) {
                System.out.printf("    %c)  %s%n", labels[i], q.options[i]);
            }

            System.out.println();
            char answer = getAnswer();

            int chosen = answer - 'A';
            System.out.println();

            if (chosen == q.correctIndex) {
                score++;
                System.out.println("  ✔  CORRECT!");
            } else {
                System.out.printf("  ✘  WRONG! Correct answer: %c) %s%n",
                    labels[q.correctIndex], q.options[q.correctIndex]);
            }

            System.out.println("  " + q.explanation);
            System.out.println();

            if (current < questions.size() - 1) {
                System.out.print("  Press ENTER for next question...");
                scanner.nextLine();
            }
        }
    }

    static char getAnswer() {
        while (true) {
            System.out.print("  Your answer (A/B/C/D): ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.length() == 1 && input.charAt(0) >= 'A' && input.charAt(0) <= 'D') {
                return input.charAt(0);
            }
            System.out.println("  Invalid input. Please enter A, B, C, or D.");
        }
    }

    static void showResult() {
        int total = questions.size();
        int pct = (score * 100) / total;
        String grade, msg;

        if (pct >= 80) {
            grade = "EXCELLENT  🏆";
            msg   = "Outstanding! You really know your CS fundamentals.";
        } else if (pct >= 60) {
            grade = "GOOD JOB  👍";
            msg   = "Solid understanding — a few gaps to fill.";
        } else if (pct >= 40) {
            grade = "KEEP GOING  📚";
            msg   = "Review the concepts and try again.";
        } else {
            grade = "PRACTICE MORE  💪";
            msg   = "Don't give up — practice makes perfect!";
        }

        System.out.println();
        printLine();
        System.out.println("              QUIZ COMPLETE!            ");
        printLine();
        System.out.printf("  Final Score  :  %d / %d  (%d%%)%n", score, total, pct);
        System.out.printf("  Grade        :  %s%n", grade);
        System.out.println("  " + msg);
        printLine();
        System.out.print("\n  Play again? (Y/N): ");
        String again = scanner.nextLine().trim().toUpperCase();
        if (again.equals("Y")) {
            score = 0;
            Collections.shuffle(questions);
            System.out.println();
            runQuiz();
            showResult();
        } else {
            System.out.println("\n  Thanks for playing! Keep coding! 🚀\n");
        }
    }

    static void printProgressBar(int done, int total) {
        int barLen = 30;
        int filled = (done * barLen) / total;
        System.out.print("  [");
        for (int i = 0; i < barLen; i++)
            System.out.print(i < filled ? "█" : "░");
        System.out.printf("] %d%%%n", (done * 100) / total);
    }

    static void printLine() {
        System.out.println("  ========================================");
    }
}
