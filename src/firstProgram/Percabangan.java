package firstProgram;

import java.util.Scanner;
public class Percabangan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter Password: ");
        String validPassword = "Password";

        if (password.equals(validPassword)){
            System.out.println("Selamat Datang!!");
        } else{
            System.out.println("Password Salah!!");
        }
    System.out.println("Terimakasih sudah menggunakan aplikasi kami");
}

    //fungsi prompt untuk membaca input dari pengguna
    public static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
}