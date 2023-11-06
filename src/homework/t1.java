// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t1 {
    public static void main(String[] args) {
        boolean work = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(work){
            System.out.print("Введите дробное число: ");
            try{
                float fNumber = Float.parseFloat(reader.readLine());
                System.out.printf("Введенное число равно %f\n", fNumber);
                work = false;
            } catch (IOException|NumberFormatException e) {
                System.out.println("Неверный ввод. Введите дробное число!!!");
            }

        }
    }
}