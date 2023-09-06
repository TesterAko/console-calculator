package de.qcademy.calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
//funktioniert !!!!!!!!!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // andere Operationen noch übrig -*/%
        Pattern operationPattern = Pattern.compile("\\s*(\\d+)\\s*([-+*/%])\\s*(\\d+)\\s*");

        //pattern erlaubt uns + operationen in Strings zu erkennen \\s leerzeichen  \\d  Zahlen \\+ operationen
        //im pattern muster kann man bestimmte Teile gruppieren mit klammer ()
        //Matcher ermöglicht uns Übereinstimmungen in Mustern aus den Eingaben zu  ermitteln

        Pattern quitPattern = Pattern.compile("^\\s*:q\\s*$");
        //pattern für die quit funktion implementieren
        //^ beginnt mit :q$ endet mit :q$
        boolean calculatorStopped = false;//wenn das Taschenrechner gestoppt wird wird die Variable true gesetzt
        while (!calculatorStopped) {//während das Taschenrechner nicht gestoppt ist sollte eine neue eingabe erfolgen

            //operatoren implementieren
            System.out.println("Ausdruck eingeben");
            String input = scanner.nextLine();
            Matcher OpMatcher = operationPattern.matcher(input);

            //matcher wird auf input aufgerufen
            Matcher quitMatcher = quitPattern.matcher(input);

            if (OpMatcher.matches()) {
                if (OpMatcher.group(3) != null) {//wenn der 3. gruppe nicht null ist wird Resultat von Gruppe 1 und 2 ausgegeben
                    double firstOperand = Double.parseDouble(OpMatcher.group(1));
                    String operator = OpMatcher.group(2);
                    double secondOperand = Double.parseDouble(OpMatcher.group(3));//wenn der 3. gruppe nicht null ist wird Resultat von Gruppe 1 und 2 ausgegeben
                    double result = 0;//resultat/ausgangswert der operationen wird 0 gesetzt
                    switch (operator) {//switch case für operator ist übersichtlicher und einfacher zu lesen
                        case "+":
                            result = firstOperand + secondOperand;
                            break;
                        case "-":
                            result = firstOperand - secondOperand;
                            break;
                        case "*":
                            result = firstOperand * secondOperand;
                            break;
                        case "/":
                            result = firstOperand / secondOperand;
                            break;
                        case "%":
                            result = firstOperand % secondOperand;
                            break;
                    }
                    System.out.println(input + " = " + result);
                }
            } else if (quitMatcher.matches()) {//eingabe :q Taschenrechner wird gestoppt
                System.out.println("Taschenrechner wird gestoppt");
                calculatorStopped = true;

            } else {//Ungültige eingabe wie bspw. 5-*/2, Operation nicht erkannt/ muss ausserhalb der if-else der operationen stehen
                System.err.println("Operation: " + input + " nicht erkannt!");
            }
        }
    }
}