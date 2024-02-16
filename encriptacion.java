//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        //Identificar todas la letras con un diccionario
        //Hacer un dicionario
        //char arroba = 'A';
        //int a = arroba;
        //System.out.println(a);
        String text = "ldfbbdaypcwrtehinaokmeoufd";
        int rule = 205;
        if(rule > 255){
            rule = rule - 256;
        }
        System.out.println(rule);
        String frase = "";

        for(int i = 0; i < text.length(); i++){
            //Convertimos el char a ascci
            int a = text.charAt(i);

            //Le ponemos la operacion (Le sumamos 3)
            a = a + rule;
            if (a > 255){
                a = a - 256;
            }
            //Convertimos ascii a char
            char con = (char) a;
            frase = frase + con;

        }
        System.out.println(frase);


        //Identificar las siguiente letra y poner las en un string


    }
}
