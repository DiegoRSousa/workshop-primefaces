package com.algaworks.erp.model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaTabelas {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("AlgaWorksPU");
		factory.close();
				
	}
}
