import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String dept;
    int salary;
    int age;

    public Employee(int id, String name, String dept, int salary, int age) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + dept + " " + salary;
    }
}

public class Main {

    public static void main(String[] args) {

        numrev();
        System.out.println();

        LeaderinArrry();
        System.out.println();

        sumofDiognal();
        System.out.println();

        togglecase();
        System.out.println();

        largestsalary();
    }

    public static void numrev() {
        int n = 1234;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        System.out.println(rev);
    }

    public static void LeaderinArrry() {

        int arr[] = {5, 3, 13, 7, 9, 11};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }

    public static void TwoSum() {

        int[] arr = {1, 2, 4, 6, 7, 8};
        int target = 10;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int current = arr[left] + arr[right];

            if (current == target) {
                System.out.println(left + " " + right);
                return;
            } else if (current < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void Palidrom() {

        String s = "wow";

        int left = 0;
        int right = s.length() - 1;

        boolean palindrome = true;

        while (left < right) {

            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void captilize() {

        String s = "prakash ravich";
        String temp = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if ((i == 0 || s.charAt(i - 1) == ' ')
                    && ch >= 'a' && ch <= 'z') {

                ch = (char) (ch - 32);
            }

            temp = temp + ch;
        }

        System.out.println(temp);
    }

    public static void sumofDiognal() {

        int[][] arr = {
                {1, 2, 3},
                {2, 11, 4},
                {5, 6, 7}
        };

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (i == j) {
                    sum1 += arr[i][j];
                }

                if (j == arr.length - 1 - i) {
                    sum2 += arr[i][j];
                }
            }
        }

        System.out.println("Primary Diagonal = " + sum1);
        System.out.println("Secondary Diagonal = " + sum2);
    }

    public static void CharFrequency() {

        String text = "mathiyazhagan";

        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : text.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        System.out.println(freq);
    }

    public static void togglecase() {

        String s = "azwathIBRAHIM";
        String temp = "";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                temp += (char) (c + 32);
            } else {
                temp += (char) (c - 32);
            }
        }

        System.out.println(temp);
    }

    public static void countstream() {

        List<String> sam = Arrays.asList("Apple", "banana", "orange", "Apple");

        Map<String, Long> mp = sam.stream()
                .collect(Collectors.groupingBy(
                        name -> name,
                        Collectors.counting()
                ));

        System.out.println(mp);
    }

    public static void largestsalary() {

        List<Employee> l1 = Arrays.asList(
                new Employee(1, "sanjay", "CSE", 27000, 12),
                new Employee(2, "prakash", "ECE", 28030, 12),
                new Employee(3, "siva", "ECE", 27999, 12),
                new Employee(4, "manikandan", "MECH", 7000, 12)
        );

        Optional<Integer> secondLargest = l1.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst();

        System.out.println(secondLargest);
    }
}