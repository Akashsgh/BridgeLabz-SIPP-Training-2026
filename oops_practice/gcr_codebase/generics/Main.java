package oops_practice.gcr_codebase.generics;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("Akash", 101);
        System.out.println(pair);

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.display();

        Integer[] numbers = {10, 50, 20, 40};

        System.out.println(GenericUtils.findMax(numbers));

        String[] names = {"Java", "Python", "C++"};

        System.out.println(GenericUtils.findMax(names));

        Repository<String> repository = new Repository<>();

        repository.add("Java");
        repository.add("Spring Boot");
        repository.add("DSA");

        System.out.println(repository.getAll());

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);

        List<String> list2 = Arrays.asList("A", "B", "C");

        GenericUtils.printList(list1);
        GenericUtils.printList(list2);
    }
}