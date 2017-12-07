import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        String str = "x+y*{(a+2*b)-(4x-b)/(a+y)}";

        System.out.println(checkPar(str));
    }

    public static boolean checkPar (String str) {

        Stack <Character> stack = new Stack<>();

        for (int i=0; i<str.length(); i++) {

            if ((str.charAt(i) == '(') || (str.charAt(i) == '{')) {
                stack.push(str.charAt(i));  // добавить в стэк любую правильную скобку
            }

            if ((str.charAt(i) == ')') || (str.charAt(i) == '}')) {
                if (stack.empty()) {
                    return false;           // проверяет пустой ли стэк
                }

                if ((stack.peek() == '(') || (stack.peek() == '{')) {
                    stack.pop();            // удаляет закрытую скобку если есть
                } else {
                    return false;
                }
            }
        }

        return stack.empty(); // тру или фалс в зависимотси если что
    }
}

