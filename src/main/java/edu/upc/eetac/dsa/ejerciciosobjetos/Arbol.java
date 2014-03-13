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

public class Arbol {
	
	//Atributos//
	
	private int tamaño = 0;
	private String tipo = "Arbol Generico";

	//Constructor con 0 atributos de entrada//
	public Arbol(){
	}
	//Constructor con 1 atributos de entrada (Tipo)//
	public Arbol(String tipo1){
		this.tipo=tipo1;
	}
	//Constructor con 1 atributos de entrada (Tamaño)//
	public Arbol(int tamaño1){
		this.tamaño=tamaño1;
		this.tipo="Arbol";
	}
	//Constructor con 2 atributos de entrada//
	public Arbol(int tamaño1, String tipo1){
		this.tamaño=tamaño1;
		this.tipo=tipo1;
	}
	
	//Devolver tamaño//
	public int getTamaño(){
		return this.tamaño;
	}
	
	//Devolver tipo//
	public String getTipo(){
		return this.tipo;
	}
	
}
