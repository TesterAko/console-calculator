/*package de.qcademy.calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reserve {

    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // andere Operationen noch übrig -*/%
         /*   Pattern plusOppattern = Pattern.compile("\\s*(\\d+)\\s*\\+\\s*(\\d+)|\\s*\\+\\s*(\\d+)|\\s*\\s*(\\d+)");
            //pattern erlaubt uns + operationen zu erkennen \\s leerzeichen  \\d  Zahlen \\+ operationen
            //im pattern muster kann man bestimmte Teile gruppieren mit klammer ()

            Pattern quitPattern = Pattern.compile("^\\s*:q\\s*$");
            //pattern für die quit funktion implementieren
            //^ beginnt mit :q$ endet mit :q$
            boolean calculatorStopped = false;
            while (!calculatorStopped) {

                //operatoren implementieren
                System.out.println("Ausdruck eingeben");
                String input = scanner.nextLine();
                Matcher plusOpMatcher = plusOppattern.matcher(input);
                //matcher wird auf input aufgerufen
                Matcher quitMatcher = quitPattern.matcher(input);

                if (plusOpMatcher.matches()) {
                    if (plusOpMatcher.group(4) != null) {
                        //wenn wert gruppe 4 ist nicht null dann können wir die Werte berechnen
                        double result = Double.parseDouble(plusOpMatcher.group(4));
                        System.out.println(input + " = " + result);
                    } else if (plusOpMatcher.group(3) != null) {
                        double result = Double.parseDouble(plusOpMatcher.group(3));
                        System.out.println(input + " = " + result);
                        //erkennung von alternativgruppen
                    } else {
                        //wenn die alternativgruppen 3+4 nicht gefunden werden dann wird die alternativgruppe 1+2 ausgewertet
                        double firstOperand = Double.parseDouble(plusOpMatcher.group(1));
                        double secondOperand = Double.parseDouble(plusOpMatcher.group(2));
                        double resultplus = firstOperand + secondOperand;
                        System.out.println(input + " = " + resultplus);
                    }

                                } else if (quitMatcher.matches()) {
                                    System.out.println("Taschenrechner wird gestoppt");
                                    calculatorStopped = true;

                                } else {
                                    System.err.println("Operation: " + input + " nicht erkannt!");
                                }
                            }
                        }
                    }
                }

                /*package de.qcademy.calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /*Pattern Oppattern = Pattern.compile("\\s*(\\d+)\\s*([-+*//*%])\\s*(\\d+)\\s*");

        //pattern erlaubt uns + operationen zu erkennen \\s leerzeichen  \\d  Zahlen \\+ operationen
        //im pattern muster kann man bestimmte Teile gruppieren mit klammer ()

      /*  Pattern quitPattern = Pattern.compile("^\\s*:q\\s*$");
        //pattern für die quit funktion implementieren
        //^ beginnt mit :q$ endet mit :q$
        boolean calculatorStopped = false;
        while (!calculatorStopped) {
        System.out.println("Ausdruck eingeben");
        //operatoren implementieren
        String input = scanner.nextLine();
        Matcher OppatternMatcher = Oppattern.matcher(input);
        Matcher quitMatcher = quitPattern.matcher(":q");
        if (OppatternMatcher.matches()) {
        double firstOperand = Double.parseDouble(OppatternMatcher.group(1));
        String operator = OppatternMatcher.group(2);
        double secondOperand = Double.parseDouble(OppatternMatcher.group(3));
        double result = 0;
//für die Operatoren switch angewendet
        switch (operator) {
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
default:
        System.err.println("Operation nicht erkannt");
        break;
        }
        //warum kommt bei ungültigen Eingabe kein Text Operation nicht erkannt?
        // es kommt taschenrechner wird gestoppt - muss gelöst werden
        System.out.println("Das Ergebnis ist: " + result);

        } else {
        quitMatcher.matches();
        System.out.println("Taschenrechner wird gestoppt");
        }
        }
        }
        }
*/

