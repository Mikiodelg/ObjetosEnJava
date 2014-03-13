/*
 * Copyright [2014] [Miquel Delgado]
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.upc.eetac.dsa.ejerciciosobjetos;

public class PruebaArboles {
	public static void main(String args[]) {
		Arbol arbol1 = new Arbol(4);
		System.out.println("Un "+ arbol1.getTipo() + " de " + arbol1.getTamaño() +" metros");
		Arbol arbol2 = new Arbol("Roble");
		System.out.println("Un "+ arbol2.getTipo());
		Arbol arbol3 = new Arbol();
		System.out.println("Un "+ arbol3.getTipo());
		Arbol arbol4 = new Arbol(5, "Pino");
		System.out.println("Un "+ arbol4.getTipo() + " de " + arbol4.getTamaño() +" metros");
	}
}
