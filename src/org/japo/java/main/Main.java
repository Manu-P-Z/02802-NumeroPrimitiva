/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "ISO-8859-1")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //   try {
        try {

            int num;
            System.out.print("Número de la primitiva.....: ");
            num = SCN.nextInt();

            boolean val = num > 0 && num < 50;

            System.out.println(val == true ? num : "Número fuera de rango");

        } catch (Exception e) {
            System.out.println("Error, valor con formato incorrecto");
        } finally {
            SCN.nextLine();
            //   System.out.println((num > 0 && num < 50) ? "Número Primitiva ..:" num : "Error, número fuera de rango");

            //   num = (num > 0 & num < 50) ? num : num / 0;
            //   System.out.printf("%s %d%n", "Número Primitiva ..:", num);
            // } catch (Exception e) { System.out.println("Error");
            //    } finally { System.out.println("Done");
            //    }
            //  }
        }
    }
}
