import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        black negr = new black();
        System.out.println("Cегодня мы представляем вам уникальное шоу - битву негров.");
        System.out.println("Битва негров - это место для демонстрации таланта и мастерства.");
        System.out.println("Поехали!");
        Scanner vhod = new Scanner(System.in);
        System.out.print("Введи кол-во негров: ");
        int a = vhod.nextInt();
        vhod.close();
        negr.bitva(a);

    }
}