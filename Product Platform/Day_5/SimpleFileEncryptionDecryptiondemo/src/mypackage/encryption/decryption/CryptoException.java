package mypackage.encrytion.decryption;

/**
 * This class for handle CryptoException
 * 
 * @author TK
 *
 */
public class CryptoException extends Exception {
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = 5431879307245358512L;

	public CryptoException() {
    }
 
    public CryptoException(String message, Throwable throwable) {
        super(message, throwable);
    }
}