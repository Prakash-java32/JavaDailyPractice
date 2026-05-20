import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
class Employee{
    int id;
    String name;
    String dept;
    int salary;
    int age;

    public Employee(int id, String name,String dept, int salary, int age) {
        this.id = id;
        this.name = name;
        this.dept=dept;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //StreamApi ();
      // NumberReverse();
        //LeaderinArrry();
         //TwoSum();
        //Palidrom();
        //captilize();
        //sumofDiognal();
        //CharFrequency();
       // slidingwindow();
       // Primenumber();
        //StreamApi1();
        //ExampleStreamApi();
       // ExampleStreamApiFindmax();
        //Arraydupicate();
       // threesum();
        //movezeroAtlast();
       // togglecase();
        //countstream();
<<<<<<< HEAD
        //largestsalary();
        depthigestsalary();
    }

    public static void StreamApi() {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(1);
=======
            //largestsalary();
         //   depthigestsalary();
       // Longestsubstring();
        //addOrEvencountUsingStreamApi();
      // findBylengthUsingStream();
       // joiningusingStream();
        frequencyofCharUseingStream();

    }
    public static void frequencyofCharUseingStream()
    {
        String s="aabaa";
      Map<Character,Long> map=  s.chars().mapToObj(c->(char)c)
              .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(map);

    }
    public static void joiningusingStream()
    {
        List<String> List=Arrays.asList("a","b","c");
       String s= List.stream().collect(Collectors.joining("-"));
        System.out.println(s);
    }
    public static void findBylengthUsingStream(){
     List<String> list=Arrays.asList("Apple","banana");
     List<Integer> ab=list.stream().map(name->name.length()).collect(Collectors.toList());
        System.out.println(ab);
    }
    public  static void  addOrEvencountUsingStreamApi()
    {
        List<Integer> list=Arrays.asList(10,1,2,34,0,34);
        Map<String,Long> s=list.stream().
                collect(Collectors.groupingBy(n->n%2==0?"evnn":"odd",Collectors.counting()));
        System.out.println(s);
    }
    public static void Longestsubstring(){
        String s="accacba";
        HashSet <Character> s1=new HashSet<>();
        int left =0;
        int right=0;
        for(right=0;right<s.length();right++)
        {
            while(s1.contains(s.charAt(right)))
            {
                s1.remove(s.charAt(left));
                left++;
            }
            s1.add(s.charAt(right));
        }
        System.out.println(s1);
    }
    public static void StreamApi() {
        List<Integer> li =Arrays.asList(1,2,3,4,5,6);
>>>>>>> 97340fe (java practice in using stream API problems,collections and core java)
        List a = li.stream()
                .filter(s -> s % 2 == 0)
                .collect(Collectors.toList());
        System.out.print(a);
<<<<<<< HEAD

    }

=======
    }
>>>>>>> 97340fe (java practice in using stream API problems,collections and core java)
    public static void NumberReverse() {
        int n = 1234;
        int rem = 0;
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.print(rev);
<<<<<<< HEAD

    }

=======
    }
>>>>>>> 97340fe (java practice in using stream API problems,collections and core java)
    public static void LeaderinArrry() {
        int arr[] = {5, 3, 13, 7, 9, 11};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr.length < 0) {
                System.out.print("array is empty");
            } else if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.print(max);
    }

    public static void TwoSum() {
        int[] arr = {1, 2, 4, 6, 7, 8};
        int target = 10;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int current = arr[left] + arr[right];
            if (current == target) {
                System.out.print("indexes" + left + " " + right);
                return;
            } else if (current < target) {
                left++;
            } else {
                right++;
            }
        }

    }
    public static void Primenumber(){
        Scanner scan =new Scanner(System.in);
        System.out.println("type your numberlimit");
        int a=scan.nextInt();
        int count=0;
        for(int i=1;i<=a;i++)
        {
            if(i%1==0 && i%i==0)
            {
                count++;
            }
            if(count==2)
            {
                System.out.println(i);
            }
        }

    }

    public static void Palidrom() {
        String s = "wow";
        int left = 0;
        int right = s.length()- 1;
        boolean palindrom = true;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;

            } else {
                palindrom = false;
                break;
            }
        }
        if (palindrom) {
            System.out.print(s + " is a palindrome");
        }
    }

    public static void captilize() {
        String s = "prakash ravich s";
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
<<<<<<< HEAD

            char ch = s.charAt(i);


            if ((i == 0 || s.charAt(i - 1) == ' ')
                    && ch >= 'a' && ch <= 'z') {

                ch = (char) (ch - 32);
            }

            temp = temp + ch;
        }


=======
            char ch = s.charAt(i);
            if ((i == 0 || s.charAt(i - 1) == ' ')
                    && ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            temp = temp + ch;
        }
>>>>>>> 97340fe (java practice in using stream API problems,collections and core java)
        System.out.println(temp);
    }

    public static void sumofDiognal(){
<<<<<<< HEAD
        int [][]arr={{1,2,3},
                    {2,11,4},
=======
       int [][]arr={{1,2,3},
                     {2,11,4},
>>>>>>> 97340fe (java practice in using stream API problems,collections and core java)
                    {5,6,7}};

        int sum=0;
        int sum2=0;
        for(int i=0;i< arr.length;i++)
            for(int j=0;j< arr.length;j++)
            {
                if(i==j){
                sum=sum+arr[i][j];
                }
                if(j==arr[i].length-1-i)
                    sum2=sum2+arr[i][j];
            }
        System.out.println(sum);
        System.out.println(sum2);
    }

    public static void CharFrequency() {

            String text = "mathiyazhagan";

            Map<Character, Integer> freq = new HashMap<>();

            for (char ch : text.toCharArray()) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }

            System.out.println(freq);
        }
    public static void slidingwindow() {
        int[] arr = {11, 4, 5, 6, 5, 2, 11};
        int k = 3;

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println(maxSum);
    } public static void StreamApi1(){
<<<<<<< HEAD
        List <String>names =Arrays.asList("sanjay","pravin","kannan","manju");
=======
        List <String>names = Arrays.asList("sanjay","pravin","kannan","manju");
>>>>>>> 97340fe (java practice in using stream API problems,collections and core java)
       List namewith= names.stream().filter(name->name.length()==5).map(name->name.toUpperCase()).
        collect(Collectors.toList());
        System.out.println(namewith);
    }
    public static void ExampleStreamApi(){
        List<Integer> a=Arrays.asList(2,1,95,2,11,7,9);
        a.stream().distinct().filter(num->num>=5).sorted().forEach(num-> System.out.print(num+" "));
    }
    public static void ExampleStreamApiFindmax(){
        List a=Arrays.asList(4,1,5,6,8,9);
       int  s=  a.stream().mapToInt(num->(int)num).sum();
        System.out.println(s);
    }
    public static void Arraydupicate(){
        int arr[]={1,1,1,1,1,1,1};
        int n=arr.length;
        if(n<=1){
            System.out.println("the array is not dupicate because array have a only one element");
            return;
        }
        int ind=1;
        for(int i=1;i<n;i++){
<<<<<<< HEAD
            if(arr[i]!=arr[i-1])
            arr[ind++]=arr[i];

=======
            if(arr[i]!=arr[i-1]) {
                arr[ind++] = arr[i];
            }
>>>>>>> 97340fe (java practice in using stream API problems,collections and core java)
        }
        for(int i=0;i<ind;i++){
            System.out.print(" "+arr[i]);
        }
    } public static void threesum(){
        int arr[]={2,3,4,5,6,1};            //1,2,3,4,5,6
        Arrays.sort(arr);
        int sum=0; int target=9;
        for(int i=0;i<arr.length-2;i++)
        {
            int left=i+1,right= arr.length-1;

            while(left<right)
            {
              sum= arr[i]+arr[left]+arr[right];
              if(sum==target){
                  System.out.println(i+" "+left+" "+right);
                  break;
              }

              else if (sum<target) {
                  left++;
              }else{
                  right--;
              }
            }
        }
    } public static void movezeroAtlast(){
        int arr[]={2,0,4,0,6,7,0,11,12,13,0,2};
        int numcount=0;
        for(int i=0;i< arr.length;i++) {
            if (arr[i] != 0) {
                arr[numcount] = arr[i];
                numcount++;
            }
        }
            for (int i=numcount;i< arr.length;i++){
                arr[numcount++]=0;
            }
        System.out.println(Arrays.toString(arr));
        }
        public static void togglecase(){
        String s="azwathIBRAHIM";
        String temp="";
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='A' &&c<='Z')
            {
                temp=temp+(char)((int)c+32);
            }
            else{
                temp=temp+(char)((int)c-32);
            }
        }
            System.out.println(temp);
        }
        public static void countstream(){
        List<String> sam=Arrays.asList("Apple","banana","orange","Apple");
       Map<String,Long> mp= sam.stream()
               .collect(Collectors.groupingBy(name->name,Collectors.counting()));
            System.out.println(mp);
        }
        public static void largestsalary(){
        List<Employee> l1=Arrays.asList(
                new Employee(1,"sanjay","CSE",27000,12),
                new Employee(2,"prakash","ECE",28030,12),
                new Employee(3,"siva","ECE",27999,12),
                new Employee(4,"manikandan","MECH",7000,12));
                   Optional<Integer> secndlargest=l1.stream()
                            .map(e->e.getSalary())
                           .distinct()
                           .sorted((n1,n2)->n2-n1)
                           .skip(1).findFirst();
                            System.out.println(secndlargest);
        }
        public static void depthigestsalary(){
                List<Employee> list=Arrays.asList(
                        new Employee(1,"sanjay","CSE",27000,12),
                        new Employee(2,"prakash","ECE",28030,12),
                        new Employee(3,"siva","ECE",27999,12),
                        new Employee(4,"manikandan","MECH",7000,12));
               Map<String, Optional<Employee>> map= list.stream().collect(Collectors
                        .groupingBy(Employee->Employee.getDept(),Collectors
                                .maxBy(Comparator.comparingInt((e1)-> e1.getSalary()))));
            System.out.println(map);
        }
<<<<<<< HEAD
=======

>>>>>>> 97340fe (java practice in using stream API problems,collections and core java)
}
