package com.hackerrank.solutions.FactoryPatternExample.product;

public class Sha256EncryptionAlgorithm implements EncryptionAlgorithm{

	@Override
	public String encrypt(String plaintext) {
		return plaintext + " is encrypted with Sha256EncryptionAlgorithm";
	}

}
