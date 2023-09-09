package mypackage.encryption.decryption;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class UsingRSAAlgorithm {
	private PrivateKey privateKey;
	private PublicKey publicKey;

	/**
	 * Data encryption and decryption using Rivest-Shamir-Adleman(RSA) Algorithm
	 * 
	 */
	public UsingRSAAlgorithm() {
		try {
			KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
			generator.initialize(1024);
			KeyPair pair = generator.generateKeyPair();
			privateKey = pair.getPrivate();
			publicKey = pair.getPublic();
		} catch (Exception ignored) {
		}
	}

	public String encrypt(String message) throws Exception {
		byte[] messageToBytes = message.getBytes();
		/* block - ESB and padding - PKCS1
		 * 
		 * Electronic Code Book mode(ECB) - used to process a sequence of message blocks
		 * 
		 * PKCS1 - padding assists RSA in defining the mathematical properties of the PGP key
		 */
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		// PGP use publicKey to encrypt the message and return the encrypted bytes
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		byte[] encryptedBytes = cipher.doFinal(messageToBytes);
		return encode(encryptedBytes);
	}

	private String encode(byte[] data) {
		// Base64 - Binary to text
		return Base64.getEncoder().encodeToString(data);
	}

	public String decrypt(String encryptedMessage) throws Exception {
		byte[] encryptedBytes = decode(encryptedMessage);
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		// PGP use privateKey to decrypt the message and return the decrypted array
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		byte[] decryptedMessage = cipher.doFinal(encryptedBytes);
		return new String(decryptedMessage, "UTF8");
	}

	private byte[] decode(String data) {
		return Base64.getDecoder().decode(data);
	}

	public static void main(String[] args) {
		UsingRSAAlgorithm rsa = new UsingRSAAlgorithm();
		try {
			String encryptedMessage = rsa.encrypt("This is a testing of PGP using RSA.");
			String decryptedMessage = rsa.decrypt(encryptedMessage);

			System.err.println("Encrypted byte code message:\n" + encryptedMessage);
			System.err.println("\nDecrypted message:\n" + decryptedMessage);
		} catch (Exception ignored) {
		}
	}
}