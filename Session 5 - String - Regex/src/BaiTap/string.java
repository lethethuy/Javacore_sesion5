package BaiTap;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
//        Viết một chương trình Java nhận một chuỗi từ người dùng và tách các từ trong chuỗi đó.
//        Sau đó, in ra từng từ trên một dòng.
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap vao mot chuoi");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        for (String word : words) {
            System.out.println(word);

        }

//
    }
}
