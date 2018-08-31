package com.hackerrank.solutions.FactoryPatternExample.creator;

import java.io.FileOutputStream;
import java.io.IOException;

import com.hackerrank.solutions.FactoryPatternExample.product.EncryptionAlgorithm;

//Creator Interface	-- fully depends on the product
public abstract class Encryptor {

	public void writeToDisk(String plaintext, String filename) {
		EncryptionAlgorithm encryptionAlgorithm = getEncryptionAlgorithm();
		String cyphertext = encryptionAlgorithm.encrypt(plaintext);

		try (FileOutputStream outputStream = new FileOutputStream(filename)) {
			outputStream.write(cyphertext.getBytes());
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	
	//returns an instance of the encryption algorithm.
	public abstract EncryptionAlgorithm getEncryptionAlgorithm();
}
