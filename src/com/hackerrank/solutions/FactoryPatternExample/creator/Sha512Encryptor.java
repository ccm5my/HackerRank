package com.hackerrank.solutions.FactoryPatternExample.creator;

import com.hackerrank.solutions.FactoryPatternExample.product.EncryptionAlgorithm;
import com.hackerrank.solutions.FactoryPatternExample.product.Sha512EncryptionAlgorithm;

// Sha512 encryption algo takes advantage of the Sha512 encryption algo.
public class Sha512Encryptor extends Encryptor {

	
	@Override
	public EncryptionAlgorithm getEncryptionAlgorithm() {
		return new Sha512EncryptionAlgorithm();
	}
	

}
