package Stack;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class StringInverter {

    String primaryString;
    MyStack <Character> stack;
    //private DataInputStream in;
    Scanner sc;

    public StringInverter(String primaryString) {
        sc = new Scanner(System.in);
        //in = new DataInputStream(System.in);
        //this.primaryString = sc.nextLine();
        stack = new MyStack<>();
        invert();
    }
    
    public void invert () {
        while (true) {
                primaryString = sc.nextLine();
                if (primaryString.equals("/end")){
                    System.out.println("Завершение программы");
                    return;
                } else {
                    String invertString = "";
                    for (Character character:primaryString.toCharArray()) {
                        stack.push(character);
                    }
                    System.out.println(stack.getActualCapacity());
                    while (!stack.isEmpty()) {
                        invertString += stack.pop();
                    }
                    System.out.println(invertString);
                }
        }
    }

    public void invert1 () {
        int actualLength = primaryString.length();
        for (int i = 0; i < actualLength;i++) {
            stack.push(primaryString.charAt(i));
        }
        String invertString = "";

        for (int j = 0; j < actualLength; j++) {
            invertString = invertString + stack.pop();
        }

        System.out.println(invertString);
    }
}
