package BaiTap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class KiemTraEmail {
    public static void main(String[] args) {
        // Viết một chương trình Java để kiểm tra xem một chuỗi có phải là một địa chỉ email hợp lệ hay không, sử dụng regex.
        // Một địa chỉ email hợp lệ có thể có dạng "username@OrganizationName. area symbol". Vd: rikeiacademy@rikkeisoft.com
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao mot email bat ki");
        String emailAddress = sc.nextLine();
        if (validateEmail(emailAddress)) {
            System.out.println("Email hop le");
        } else {
            System.out.println("Day khong phai email hop le");
        }
    }

    public static boolean validateEmail(String input) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return Pattern.matches(regex, input);

    }
}