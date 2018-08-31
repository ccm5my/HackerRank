package com.hackerrank.solutions.FactoryPatternExample.creator;

import com.hackerrank.solutions.FactoryPatternExample.product.EncryptionAlgorithm;
import com.hackerrank.solutions.FactoryPatternExample.product.Sha256EncryptionAlgorithm;

//this Sha256 encryptor makes use of the SHa256 encryption algorithm. 
public class Sha256Encryptor extends Encryptor{

	@Override
	public EncryptionAlgorithm getEncryptionAlgorithm() {
		return new Sha256EncryptionAlgorithm();
	}

	
}
