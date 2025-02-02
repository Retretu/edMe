import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String result = calc(sc.nextLine());
            System.out.println(result);
            if(result.equals("throw Exception")){
                break;
            }
        }
    }

    public static String calc(String input){
        String output = "";
        try{
            String[] arr = input.split(" ");
            check(Integer.parseInt(arr[0]));
            check(Integer.parseInt(arr[2]));
            switch (arr[1]) {
                case "+":
                    output = String.valueOf(Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]));
                    break;
                case "-":
                    output = String.valueOf(Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]));
                    break;
                case "*":
                    output = String.valueOf(Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]));
                    break;
                case "/":
                    output = String.valueOf(Integer.parseInt(arr[0]) / Integer.parseInt(arr[2]));
                    break;
                }
        }catch (Exception e){
            output = "throw Exception";
        }
        return output;
    }

    public static void check(int num){
        if(num < 1 || num > 10){throw new IllegalArgumentException();}
    }
}


