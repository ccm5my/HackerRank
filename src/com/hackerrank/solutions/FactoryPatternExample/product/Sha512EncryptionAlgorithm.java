package com.hackerrank.solutions.FactoryPatternExample.product;

public class Sha512EncryptionAlgorithm implements EncryptionAlgorithm {

	@Override
	public String encrypt(String plaintext) {
		return plaintext + " is encypted with Sha512 encryption algorithm";
	}

}
