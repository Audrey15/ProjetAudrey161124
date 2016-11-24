package org.formation.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class VefificationImplTest {

	@Test
	public void test_taille_login() {
		Verification verif = new VefificationImpl();
		assertEquals(6, verif.taillelogin("audrey"));
		
	}

	
	@Test
	public void test_taille_login_superieur2() {
		Verification verif = new VefificationImpl();
		int taille = verif.taillelogin("audrey");
		boolean condition = taille > 2;
		assertTrue(condition);
		
	}
}
