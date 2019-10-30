/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
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

import java.util.Random;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        //Constanes
        final int CUENTA_INI = 0;
        final int CUENTA_FINAL = 6;
        final int NUM_MIN = 1;
        final int NUM_MAX = 49;
        //Variables
        int numero;
        //Bucle
        for (int i = CUENTA_INI; i < CUENTA_FINAL; i++) {
            //Random
            numero = RND.nextInt(NUM_MAX - NUM_MIN + 1) + NUM_MIN;
            
            //Mensaje
            System.out.printf("Número %d ...: %d%n", i + 1, numero);
        }
    }
}
