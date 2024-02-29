import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(3, 7, 8, 6, 5, 2, 3));
        List<Integer> collect = new ArrayList<>();
        List<Integer> list1 = list.stream().sorted((x, y) -> Integer.compare(y, x)).collect(Collectors.toList());
        System.out.println(list1);
        list.sort((x,y)->Integer.compare(y,x));

        collect.addAll(list1);
        collect.addAll(list);
        System.out.println(collect);

        updateListElement();


        List<String> stringList = new ArrayList<>(List.of("blue", "blue", "green", "red", "red"));

        System.out.println(listDuplicateUsingSet(stringList));

        String str = "([((([])))])";
        System.out.println(checkBrackets(str));

        String text = "Salam";
        System.out.println(reverseString(text));


    }

    static void listMethodsAndParameters(Class<?> classReflection) {
        Arrays.stream(classReflection.getDeclaredMethods())
                .forEach(method -> {
                    System.out.println(method.getName());
                });

    }

    static void updateListElement() {
        List<String> list = new ArrayList<>(List.of("red", "blue", "green", "black"));
        String targetColor = "blue";
        int index = list.indexOf(targetColor);
        list.set(index, "brown");
        System.out.println(list);
    }

    static List<String> listDuplicateUsingSet(List<String> list) {
        Set<String> set = new HashSet<>();
        List<String> newList = new ArrayList<>();
        for (String value : list) {
            if (!set.add(value)) {
                newList.add(value);
            }
        }
        return newList;
    }

    static boolean checkBrackets(String s) {
        Stack<Character> characters = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                characters.push(s.charAt(i));
            } else  {
                if(characters.isEmpty()){
                    return false;
                }
                else {
                    char ch = characters.pop();
                    char c = s.charAt(i);
                    if (!((ch == '(' && c == ')') || (ch == '[' && c == ']') || (ch == '{' && c == '}'))) {
                        return false;
                    }
                }
            }
        }
        return characters.isEmpty();
    }

    static String reverseString(String text){
        Stack<Character> stack = new Stack<>();
        StringBuilder reverse = new StringBuilder();
        for(char ch : text.toCharArray()){
            stack.push(ch);
        }

        while(!stack.isEmpty()){
            reverse.append(stack.pop());
        }

        return reverse.toString();

    }
}
